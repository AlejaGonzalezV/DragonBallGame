package interfaz;

import javax.swing.*;

import excepciones.NombreNuloException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Clase PanelInicio que extiende de JDialog e implementa ActionListener
 */
public class PanelInicio extends JDialog implements ActionListener {
	
	/**
	 * constantes de tipo String que definen las acciones de los botones
	 */
	public static final String ROSHI = "Roshi";
	public static final String GOKU= "Goku";
	public static final String VEGETA = "Vegeta";
	public static final String EMPEZAR = "Empezar";
	public static final String CREDITOS = "Creditos";
	
	/**
	 * atributo de tipo String que almacena el nombre del personaje escogido por el usuario
	 */
	private String nombreEscogido;
	/**
	 * atributo de tipo JLabel
	 */
	private JLabel escogido;
	/**
	 * atributo de tipo JButton que representa la eleccion del personaje por parte del usuario
	 */
	private JButton bGoku;
	/**
	 * atributo de tipo JButton que representa la eleccion del personaje por parte del usuario
	 */
	private JButton bRoshi;
	/**
	 * atributo de tipo JButton que representa la eleccion del personaje por parte del usuario
	 */
	private JButton bVegeta;
	/**
	 * atributo de tipo JButton que inicia el juego
	 */
	private JButton iniciar;
	/**
	 * atributo de tipo JButton que hace visible la ventana de los creditos
	 */
	private JButton creditos;
	/**
	 * atributo de tipo JLabel
	 */
	private JLabel titulo;
	/**
	 * atributo de tipo JLabel
	 */
	private JLabel texto;
	/**
	 * atributo de tipo boolean que representa si el usuario ha escogido o no un personaje
	 */
	private boolean iniciado;
	/**
	 * atributo de tipo Ventana que representa la relacion con la clase Ventana
	 */
	private Ventana ven;
	/**
	 * atributo de tipo PanelCreditos que representa la relacion con la clase PanelCreditos
	 */
	private PanelCreditos cred;
	
	/**
	 * constructor de la clase PanelInicio
	 * @param ven
	 */
	public PanelInicio(Ventana ven) {
		
		this.ven = ven;
		
		
		//Aspecto de la ventana
		cred = new PanelCreditos(this);
		setLayout(new BorderLayout());
		setTitle("DragonBallZ");
		this.getContentPane().setBackground(Color.GRAY);
		setPreferredSize(new Dimension(1300,750));
		Panel centerPanel = new Panel(new GridLayout(1,3));
		Panel southPanel = new Panel(new GridLayout(1,3));
		Panel northPanel = new Panel(new BorderLayout());
		northPanel.setPreferredSize(new Dimension(1200,320));
		centerPanel.setPreferredSize(new Dimension(1200,280));
		southPanel.setPreferredSize(new Dimension(1200,100));
		Font font = new Font("Agency FB", Font.BOLD, 25);
		
		
		
		//Inicializar boton goku
		bGoku = new JButton("");
		bGoku.setIcon(new ImageIcon("Datos/personajes/Goku/gokuboton.png"));
		bGoku.setActionCommand(GOKU);
		bGoku.addActionListener(this);
		bGoku.setBackground(Color.GRAY);
		bGoku.setBorderPainted(false);
		bGoku.setFont(font);
		
		//Inicializar boton roshi
		bRoshi = new JButton("");
		bRoshi.setIcon(new ImageIcon("Datos/personajes/Roshi/roshiboton.png"));
		bRoshi.setActionCommand(ROSHI);
		bRoshi.addActionListener(this);
		bRoshi.setBackground(Color.GRAY);
		bRoshi.setBorderPainted(false);
		bRoshi.setFont(font);
		
		//Inicializar boton vegeta
		bVegeta = new JButton("");
		bVegeta.setIcon(new ImageIcon("Datos/personajes/Vegeta/vegetaboton.png"));
		bVegeta.setActionCommand(VEGETA);
		bVegeta.addActionListener(this);
		bVegeta.setBackground(Color.GRAY);
		bVegeta.setBorderPainted(false);
		bVegeta.setFont(font);
		
		//Inicializar boton iniciar
		iniciar = new JButton("Empezar");
		iniciar.setActionCommand(EMPEZAR);
		iniciar.addActionListener(this);
		iniciar.setBackground(Color.DARK_GRAY);
		iniciar.setForeground(Color.WHITE);
		iniciar.setFont(font);
		
		//Inicializar boton creditos
		creditos = new JButton("Creditos");
		creditos.setActionCommand(CREDITOS);
		creditos.addActionListener(this);
		creditos.setBackground(Color.DARK_GRAY);
		creditos.setForeground(Color.WHITE);
		creditos.setFont(font);
		
		
		//Inicializar label logo
		titulo = new JLabel(new ImageIcon("Datos/logoInicio.png"));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setVerticalAlignment(SwingConstants.CENTER);
		
		//Inicializar Label con texto
		texto = new JLabel("SELECCIONE UN PERSONAJE");
		texto.setFont(font);
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setVerticalAlignment(SwingConstants.CENTER);
		
		
		//Inicializar label con personaje
		escogido = new JLabel("");
		escogido.setForeground(Color.WHITE);
		escogido.setHorizontalAlignment(SwingConstants.CENTER);
		escogido.setVerticalAlignment(SwingConstants.CENTER);
		
		escogido.setFont(font);
		
		
		//Añadir elementos a los paneles
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		centerPanel.add(bGoku);
		centerPanel.add(bRoshi);
		centerPanel.add(bVegeta);
		southPanel.add(escogido);
		southPanel.add(iniciar);
		southPanel.add(creditos);
		northPanel.add(titulo, BorderLayout.CENTER);
		northPanel.add(texto, BorderLayout.SOUTH);
		pack();
		
	}
	
	/**
	 * Metodo que inicializa y muestra el nombre del personaje escogido por el usuario
	 */
	public void inicializarSegunPersonaje(String personaje) {
		
		escogido.setText(personaje);
		iniciado = true;
		
	}
	
	/**
	 * meotodo que define las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String evento = e.getActionCommand();
		
		if(evento.equals(EMPEZAR)) {
			
			if(iniciado == true) {
			
			String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
			
			if(nombreUsuario.equals("")) {
				
				try {
					throw new NombreNuloException();
				} catch (NombreNuloException e1) {
					
					e1.printStackTrace();
				}
				
				finally {

					JOptionPane.showMessageDialog(this, "Ingrese un nombre de usuario válido");
					
				}
			}
			
			else if(nombreUsuario != "") {
				
				ven.mostrarInstrucciones();
				this.setVisible(false);
				ven.setNombrePersonaje(nombreEscogido);
				ven.setNombreUsuario(nombreUsuario);
				ven.inicializarJugador();
			
			}
			
			}
			
			else {
				
				JOptionPane.showMessageDialog(this, "Escoja un personaje antes de iniciar", "Error", JOptionPane.WARNING_MESSAGE);
				
			}
			
		}
		
		else if(evento.equals(GOKU)) {
			
			nombreEscogido = GOKU;
			inicializarSegunPersonaje(nombreEscogido);
			
		}
		
		else if(evento.equals(ROSHI)) {
			
			nombreEscogido = ROSHI;
			inicializarSegunPersonaje(nombreEscogido);
			
		}
		
		else if(evento.equals(VEGETA)) {
			
			nombreEscogido = VEGETA;
			inicializarSegunPersonaje(nombreEscogido);
			
		}
		
		else if(evento.equals(CREDITOS)) {
			
			cred.setVisible(true);
			
		}
		
		
	}

}
