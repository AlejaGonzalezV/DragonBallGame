package interfaz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * Clase PanelCreditos que extiende de JDialog
 */
public class PanelCreditos extends JDialog{

		
		/**
		 * atributo de tipo JLabel
		 */
		private JLabel imagen;
		/**
		 * atributo de tipo Ventana que representa la relacion con la clase Ventana
		 */
		private PanelInicio ven;
		
		/**
		 * Constructor de la clase PanelCreditos
		 * @param ven
		 */
		public PanelCreditos(PanelInicio ven) {
			
			this.ven = ven;
			
			//Aspecto de la ventana
			setTitle("Creditos");
			setSize(new Dimension(600,700));
			setLayout(new BorderLayout());
			this.setLocationRelativeTo(null);
			
			//Incializar Imagen
			ImageIcon icono = new ImageIcon("Datos/creditos.png");
			imagen = new JLabel(icono);
			imagen.setSize(new Dimension(600,650));
			
			//Añadir elementos
			add(imagen, BorderLayout.CENTER);
			
			
		}

}
