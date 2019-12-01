package interfaz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * clase PanelInstrucciones que extiende de JDialog e implementa ActionListener
 */
public class PanelInstrucciones extends JDialog implements ActionListener{
	
	/**
	 * constante de tipo String que define la accion de un boton boton
	 */
	public static final String CONTINUAR = "Continuar";
	/**
	 * atributo de tipo JLabel
	 */
	private JLabel imagen;
	/**
	 * atributo de tipo JButton 
	 */
	private JButton continuar;
	/**
	 * atributo de tipo Ventana que representa la relacion con la clase Ventana
	 */
	private Ventana ven;
	
	/**
	 * Constructor de la clase PanelInstrucciones
	 * @param ven
	 */
	public PanelInstrucciones(Ventana ven) {
		
		this.ven = ven;
		
		//Aspecto de la ventana
		setSize(new Dimension(600,700));
		setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		
		//Inicializar Boton
		continuar = new JButton("Continuar");
		continuar.setActionCommand(CONTINUAR);
		continuar.addActionListener(this);
		continuar.setSize(new Dimension(600, 50));
		
		//Incializar Imagen
		ImageIcon icono = new ImageIcon("Datos/instrucciones.png");
		imagen = new JLabel(icono);
		imagen.setSize(new Dimension(600,650));
		
		//Añadir elementos
		add(imagen, BorderLayout.CENTER);
		add(continuar, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String evento = e.getActionCommand();
		
		if(evento.equals(CONTINUAR)) {
			
			ven.mostrarVentana();
			this.setVisible(false);
			
		}
		
	}
	
	

}
