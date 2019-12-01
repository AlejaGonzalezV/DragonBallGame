package interfaz;

import java.awt.*;
import javax.swing.*;
import mundo.*;

/**
 * clase infoPersonaje que extiende de JDialog
 */
public class InfoPersonaje extends JDialog {
	
	/**
	 * atributos de tipo JLabel que representan las caracteristicas del personaje
	 */
	private JLabel nombre;
	private JLabel nombrePer;
	private JLabel ataque1;
	private JLabel ataque1Per;
	private JLabel ataque2;
	private JLabel ataque2Per;
	private JLabel ataque3;
	private JLabel ataque3Per;
	private JLabel ataqueEsp;
	private JLabel ataqueEspPer;
	private JLabel imgPer;
	
	/**
	 * constructor de la clase InfoPersonaje
	 */
	public InfoPersonaje() {
		
		setTitle("Info personajes");
		setPreferredSize(new Dimension(400,400));
		this.getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		
		nombre = new JLabel("Nombre: ");
		nombrePer = new JLabel("");
		
		ataque1 = new JLabel("Ataque 1: ");
		ataque1Per = new JLabel("");
		
		ataque2 = new JLabel("Ataque 2: ");
		ataque2Per = new JLabel("");
		
		ataque3 = new JLabel("Ataque 3: ");
		ataque3Per = new JLabel("");
		
		ataqueEsp = new JLabel("Ataque especial: ");
		ataqueEspPer = new JLabel("");
		
		
		imgPer = new JLabel(new ImageIcon(""));
		imgPer.setPreferredSize(new Dimension(400,230));
		
		
		Panel center = new Panel(new GridLayout(5,2));
		center.setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		
		add(imgPer, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		center.add(nombre);
		center.add(nombrePer);
		center.add(ataque1);
		center.add(ataque1Per);
		center.add(ataque2);
		center.add(ataque2Per);
		center.add(ataque3);
		center.add(ataque3Per);
		center.add(ataqueEsp);
		center.add(ataqueEspPer);
		pack();
		
		setVisible(false);	
		
	}
	
	/**
	 * metodo que edita la informacion de los personajes a mostrar
	 * @param nom: String que representa el nombre del personaje
	 * @param ataq1: String que representa el nombre del ataque1
	 * @param ataq2: String que representa el nombre del ataque2
	 * @param ataq3: String que representa el nombre del ataque3
	 * @param ataqE: String que representa el nombre del ataque especial
	 * @param rutaImg: String que representa la ruta de la imagen del personaje
	 */
	public void editarInfo(String nom, String ataq1, String ataq2, String ataq3, String ataqE, String rutaImg) {
		
		nombrePer.setText(nom);
		ataque1Per.setText(ataq1);
		ataque2Per.setText(ataq2);
		ataque3Per.setText(ataq3);
		ataqueEspPer.setText(ataqE);
		imgPer.setIcon(new ImageIcon(rutaImg));
		
	}
	
	

}
