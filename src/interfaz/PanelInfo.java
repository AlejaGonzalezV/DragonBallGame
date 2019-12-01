package interfaz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Clase PanelInfo que extiende de JPanel
 */
public class PanelInfo extends JPanel {

	/**
	 * constante de tipo String que representa la accion de un boton
	 */
	public static final String PAUSAR = "Pausar";
	
	/**
	 * atributo de tipo JLabel que muestra el nombre del personaje escogido por el usuario
	 */
	private JLabel nombrePersonaje;
	/***
	 * atributo de tipo JLabel que muesta el nombre del jugador actual
	 */
	private JLabel nombreJugador;
	/**
	 * atributo de tipo JLabel que contiene la imagen de la esfera 1
	 */
	private JLabel esfera1;
	/**
	 * atributo de tipo JLabel que contiene la imagen de la esfera 2
	 */
	private JLabel esfera2;
	/**
	 * atributo de tipo JLabel que contiene la imagen de la esfera 3
	 */
	private JLabel esfera3;
	/**
	 * atributo de tipo JLabel que contiene la imagen de la esfera 4
	 */
	private JLabel esfera4;
	/**
	 * atributo de tipo JLabel que contiene la imagen de la esfera 5
	 */
	private JLabel esfera5;
	/**
	 * atributo de tipo JLabel que contiene la imagen de la esfera 6
	 */
	private JLabel esfera6;
	/**
	 * atributo de tipo JLabel que contiene la imagen de la esfera 7
	 */
	private JLabel esfera7;
	/**
	 * atributo de tipo Ventana que representa la relacion con la clase Ventana
	 */
	private Ventana ventana;
	
	public PanelInfo(Ventana ventana) {
		
		this.ventana = ventana;
		
		setPreferredSize(new Dimension(1300,70));
		setBackground(Color.WHITE);
		setLayout(new GridLayout(1,2));
		Font font = new Font("Agency FB", Font.BOLD, 40);
		
		nombrePersonaje = new JLabel("");
		nombrePersonaje.setFont(font);
		nombrePersonaje.setHorizontalAlignment(SwingConstants.CENTER);
		nombrePersonaje.setVerticalAlignment(SwingConstants.CENTER);
		nombrePersonaje.setSize(new Dimension(475, 70));
		
		nombreJugador = new JLabel("");
		nombreJugador.setFont(font);
		nombreJugador.setHorizontalAlignment(SwingConstants.CENTER);
		nombreJugador.setVerticalAlignment(SwingConstants.CENTER);
		nombreJugador.setSize(new Dimension(475, 70));
		
		esfera1 = new JLabel("");
		esfera1.setIcon(new ImageIcon("Datos/esferas/1n.png"));
		
		esfera2 = new JLabel("");
		esfera2.setIcon(new ImageIcon("Datos/esferas/2n.png"));
		
		esfera3 = new JLabel("");
		esfera3.setIcon(new ImageIcon("Datos/esferas/3n.png"));
		
		esfera4 = new JLabel("");
		esfera4.setIcon(new ImageIcon("Datos/esferas/4n.png"));
		
		esfera5 = new JLabel("");
		esfera5.setIcon(new ImageIcon("Datos/esferas/5n.png"));
		
		esfera6 = new JLabel("");
		esfera6.setIcon(new ImageIcon("Datos/esferas/6n.png"));
		
		esfera7 = new JLabel("");
		esfera7.setIcon(new ImageIcon("Datos/esferas/7n.png"));
		
		
		Panel centerPanel = new Panel(new GridLayout(1,7));
		centerPanel.setPreferredSize(new Dimension(350, 70));
		Panel panel2 = new Panel(new GridLayout(1,2));
		panel2.setPreferredSize(new Dimension(950,70));

		
		add(panel2);
		add(centerPanel);
		panel2.add(nombrePersonaje);
		panel2.add(nombreJugador);
		centerPanel.add(esfera1);
		centerPanel.add(esfera2);
		centerPanel.add(esfera3);
		centerPanel.add(esfera4);
		centerPanel.add(esfera5);
		centerPanel.add(esfera6);
		centerPanel.add(esfera7);

		
	}
	
	/**
	 * metodo que modifica los datos mostrados en el panel
	 */
	public void modificarDatos() {
		
		String nombre = ventana.getNombrePersonaje();
		String usuario = ventana.getNombreUsuario();
		nombrePersonaje.setText("Personaje: " + "\n" + nombre);
		nombreJugador.setText("Usuario: " + "\n" + usuario);
		
		
	}
	
	/**
	 * metodo que modifica las esferas obtenidas por el usuario
	 * @param numero
	 */
	public void modificarEsfera(int numero) {
		
		if(numero == 1) {
			
			esfera1.setIcon(new ImageIcon("Datos/esferas/1.png"));
			
		}
		
		else if(numero == 2) {
			
			esfera2.setIcon(new ImageIcon("Datos/esferas/2.png"));
			
		}
		
		else if(numero == 3) {
			
			esfera3.setIcon(new ImageIcon("Datos/esferas/3.png"));
			
		}
		
		else if(numero == 4) {
			
			esfera4.setIcon(new ImageIcon("Datos/esferas/4.png"));
			
		}
		
		else if(numero == 5) {
			
			esfera5.setIcon(new ImageIcon("Datos/esferas/5.png"));
			
		}
		
		else if(numero == 6) {
			
			esfera6.setIcon(new ImageIcon("Datos/esferas/6.png"));
			
		}
		
		else if(numero == 7) {
			
			esfera7.setIcon(new ImageIcon("Datos/esferas/7.png"));
			
		}
		
		
	}



	
}

