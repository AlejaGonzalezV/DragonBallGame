package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import hilos.HiloAtaque1;
import hilos.HiloAtaque2;
import hilos.HiloVillanoAtaque1;
import hilos.HiloVillanoAtaque2;
import mundo.Heroes;
import mundo.Villanos;
/**
 * Clase PanelBatalla que extiende de JFrame
 */
public class PanelBatalla extends JFrame implements ActionListener{
	
	/**
	 * Constantes de tipo String que representan las acciones de los botones
	 */
	public static final String OPCION_1H = "opcion1h";
	public static final String OPCION_2H = "opcion2h";
	public static final String OPCION_3H = "opcion3h";
	public static final String OPCION_EH = "opcionEh";
	
	/**
	 * Atributo de tipo Ventana que representa la relacion con la clase Ventana
	 */
	private Ventana ventana;
	/**
	 * Atributo de tipo PanelFondoB que representa la relacion con la clase PanelFondoB
	 */
	private PanelFondoB fondo;
	/**
	 * atributo de tipo JButton que representa el boton que ejecuta el ataque1
	 */
	private JButton opcion1h;
	/**
	 * atributo de tipo JButton que representa el boton que ejecuta el ataque2
	 */
	private JButton opcion2h;
	/**
	 * atributo de tipo JButton que representa el boton que ejecuta el ataque3
	 */
	private JButton opcion3h;
	/**
	 * atributo de tipo JButton que representa el boton que ejecuta el ataque especial
	 */
	private JButton opcionEh;

	/**
	 * constructor de la clase PanelBatalla
	 * @param ventana
	 */
	public PanelBatalla(Ventana ventana) {
		
		this.ventana = ventana;
		setSize(new Dimension(1000,600));
		setTitle("Batalla");
		setResizable(false);
		setVisible(false);
		setLayout(new BorderLayout());
		
		opcion1h = new JButton();
		opcion1h.addActionListener(this);
		opcion1h.setActionCommand(OPCION_1H);
		
		opcion2h = new JButton();
		opcion2h.addActionListener(this);
		opcion2h.setActionCommand(OPCION_2H);
		
		opcion3h = new JButton();
		opcion3h.addActionListener(this);
		opcion3h.setActionCommand(OPCION_3H);
	
		opcionEh = new JButton();
		opcionEh.addActionListener(this);
		opcionEh.setActionCommand(OPCION_EH);
		
		Panel botones = new Panel(); 
		fondo = new PanelFondoB(this);
		botones.setPreferredSize(new Dimension(1000,100));
		
		
		botones.setLayout(new GridLayout(2,2));
		botones.add(opcion1h);
		botones.add(opcion2h);
		botones.add(opcion3h);
		botones.add(opcionEh);
		
		add(fondo, BorderLayout.CENTER);
		add(botones, BorderLayout.SOUTH);
		
		
		
	}
	
	/**
	 * metodo que inicializa los botones con el nombre de los ataques del personaje escogido por el usuario
	 */
	public void inicializarBotones() {
		
		Heroes heroe = (Heroes)ventana.getHeroe();
		
		opcion1h.setText(heroe.getNomAtaque1());
		opcion2h.setText(heroe.getNomAtaque2());
		opcion3h.setText(heroe.getNomAtaque3());
		opcionEh.setText(heroe.getNomAtaqueEspecial());
	}
	
	/*
	 *metodo que actualiza la clase PanelFondoB
	 */
	public void actualizarfondo() {
		fondo.updateUI();
	}

	/**
	 * Metodo que retorna la relacion con la clase Ventana
	 * @return the ventana
	 */
	public Ventana getVentana() {
		return ventana;
	}

	/**
	 * Metodo que retorna la relacion con la clase panelFondo
	 * @return the fondo
	 */
	public PanelFondoB getFondo() {
		return fondo;
	}
	
	/**
	 * metodo que inhabilita los botones de ataques mientras el villano realiza su ataque
	 */
	public void inhabilitarbotones() {
		
		opcion1h.setEnabled(false);
		opcion2h.setEnabled(false);
		opcion3h.setEnabled(false);
		opcionEh.setEnabled(false);
	}
	
	/**
	 * metodo que habilita los botones de ataques cuando el villano termina su ataque
	 */
	public void habilitarbotones() {
		
		opcion1h.setEnabled(true);
		opcion2h.setEnabled(true);
		opcion3h.setEnabled(true);
		opcionEh.setEnabled(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int ataque = 0;
		int daño = 0;
		Heroes heroe = (Heroes)ventana.getHeroe();
		
		String comando = e.getActionCommand();
		if(comando.equals(OPCION_1H)) {
			inhabilitarbotones();
		
			heroe.setTerminado(false);
			String villano = ventana.getMundo().getVillanoActual();
			Villanos vil = (Villanos)ventana.getJuego().getJugador().getHeroe(villano);
			vil.setTerminado(false);
			
			HiloAtaque1 HA1 = new HiloAtaque1(this, heroe);
			HA1.start();
			
			vil.setVida1(heroe.getAtaque1());
			
			ataque = ventana.obtenerAtaqueAleatorio(vil);

			if(ataque == 1) {
				daño = vil.getAtaque1();
				HiloVillanoAtaque1 HV1 = new HiloVillanoAtaque1(this, vil);
				HV1.start();	
			}else if(ataque == 2) {
				daño = vil.getAtaque2();
				HiloVillanoAtaque2 HVA2 = new HiloVillanoAtaque2(this, vil);
				HVA2.start();
				
			}else if(ataque == 3) {
				daño = vil.getAtaque3();
				HiloVillanoAtaque1 HV1 = new HiloVillanoAtaque1(this, vil);
				HV1.start();
				
			}
			heroe.setVida1(daño); 
			fondo.updateUI();
			
			vida(heroe, vil);
		}else if(comando.equals(OPCION_2H)) {
			inhabilitarbotones();
			
			heroe.setTerminado(false);
			String villano = ventana.getMundo().getVillanoActual();
			Villanos vil = (Villanos)ventana.getJuego().getJugador().getHeroe(villano);
			vil.setTerminado(false);
			
			HiloAtaque2 HA2 = new HiloAtaque2(this, heroe);
			HA2.start();
			
			vil.setVida1(heroe.getAtaque2());
			
			ataque = ventana.obtenerAtaqueAleatorio(vil);

			if(ataque == 1) {
				daño = vil.getAtaque1();
				HiloVillanoAtaque1 HV1 = new HiloVillanoAtaque1(this, vil);
				HV1.start();	
			}else if(ataque == 2) {
				daño = vil.getAtaque2();
				HiloVillanoAtaque2 HVA2 = new HiloVillanoAtaque2(this, vil);
				HVA2.start();
				
			}else if(ataque == 3) {
				daño = vil.getAtaque3();
				HiloVillanoAtaque1 HV1 = new HiloVillanoAtaque1(this, vil);
				HV1.start();	
				
			}
			
			heroe.setVida1(daño); //NUEVO
			fondo.updateUI();
			
			vida(heroe, vil);
		}else if(comando.equals(OPCION_3H)) {
			inhabilitarbotones();
			
			heroe.setTerminado(false);
			String villano = ventana.getMundo().getVillanoActual();
			Villanos vil = (Villanos)ventana.getJuego().getJugador().getHeroe(villano);
			vil.setTerminado(false);
			
			HiloAtaque1 HA1 = new HiloAtaque1(this, heroe);
			HA1.start();
	
			vil.setVida1(heroe.getAtaque3());
			
			ataque = ventana.obtenerAtaqueAleatorio(vil);

			if(ataque == 1) {
				daño = vil.getAtaque1();
				HiloVillanoAtaque1 HV1 = new HiloVillanoAtaque1(this, vil);
				HV1.start();	
			}else if(ataque == 2) {
				daño = vil.getAtaque2();
				HiloVillanoAtaque2 HVA2 = new HiloVillanoAtaque2(this, vil);
				HVA2.start();
				
			}else if(ataque == 3) {
				daño = vil.getAtaque3();
				HiloVillanoAtaque1 HV1 = new HiloVillanoAtaque1(this, vil);
				HV1.start();	
				
			}
			
			heroe.setVida1(daño); 
			fondo.updateUI();
			
			vida(heroe, vil);
			
		}else if(comando.equals(OPCION_EH)) {
			inhabilitarbotones();
			
			heroe.setTerminado(false);
			String villano = ventana.getMundo().getVillanoActual();
			Villanos vil = (Villanos)ventana.getJuego().getJugador().getHeroe(villano);
			vil.setTerminado(false);
			
			HiloAtaque2 HA2 = new HiloAtaque2(this, heroe);
			HA2.start();
			
			vil.setVida1(heroe.getAtaqueEspecial());
			
			ataque = ventana.obtenerAtaqueAleatorio(vil);

			if(ataque == 1) {
				daño = vil.getAtaque1();
				HiloVillanoAtaque1 HV1 = new HiloVillanoAtaque1(this, vil);
				HV1.start();	
			}else if(ataque == 2) {
				daño = vil.getAtaque2();
				HiloVillanoAtaque2 HVA2 = new HiloVillanoAtaque2(this, vil);
				HVA2.start();
				
			}else if(ataque == 3) {
				daño = vil.getAtaque3();
				HiloVillanoAtaque1 HV1 = new HiloVillanoAtaque1(this, vil);
				HV1.start();	
				
			}
			
			heroe.setVida1(daño); 
			fondo.updateUI();
			
			vida(heroe, vil);
			
		}
		
	}
	
	/**
	 * Metodo que informa al usuario el resultado de la batalla
	 * @param heroe
	 * @param villano
	 */
	public void vida(Heroes heroe, Villanos villano) {
		
		if(heroe.getVida() <= 0 && villano.getVida() <=0) {
		
			JOptionPane.showMessageDialog(this, "Empataste la batalla :(" + "\n" + "Debes ganar la batalla para poder obtener una esfera");
			this.setVisible(false);
		}else if(heroe.getVida() > 0 && villano.getVida() <=0) {
			
			JOptionPane.showMessageDialog(this, "Ganaste la batalla :)" + "\n" + "Acabas de obtener una esfera");
				
			ventana.bloquearVillano(villano.getNombre());
			ventana.modificarEsfera(villano.getEsferaEntrega());
			this.setVisible(false);
		}else if(heroe.getVida() <= 0 && villano.getVida() > 0) {
			
			JOptionPane.showMessageDialog(this, "Perdiste la batalla :(" + "\n" + "Debes ganar la batalla para poder obtener una esfera");
			this.setVisible(false);
		}
	}
	
	
	
	

}
