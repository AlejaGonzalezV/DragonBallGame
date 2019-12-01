package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import mundo.Puntajes;

/**
 * clase puntajes que extiende de JDialog e implementa ListSelectionListener
 */
public class PanelPuntajes extends JDialog implements ListSelectionListener{
	
	/**
	 * atributo de tipo Ventana que representa la relacion con la clase Ventana
	 */
	private Ventana ventana;
	/**
	 * atributo de tipo JList donde se almacenan los puntajes de los usuarios
	 */
	private JList<Puntajes> listaPuntajes;
	/**
	 * atributo de tipo JScrollPane
	 */
	private JScrollPane scroll;
	/**
	 * atributo de tipo DefaultListModel
	 */
	private DefaultListModel<Puntajes> modelo;
	/**
	 * atributo de tipo JLabel
	 */
	private JLabel nombre;
	/**
	 * atributo de tipo JTextField
	 */
	private JTextField txNombre;
	/**
	 * atributo de tipo JLabel
	 */
	private JLabel numEsferas;
	/**
	 * atributo de tipo JTextField
	 */
	private JTextField txNumEsferas;
	
	/**
	 * constructor de la clase PanelPuntajes
	 * @param ventana
	 */
	public PanelPuntajes(Ventana ventana) {
		this.ventana = ventana;
		
		setVisible(false);
		setSize(new Dimension(500,200));
		setLayout(new BorderLayout());
		setTitle("Puntajes");
		
		nombre = new JLabel("Nombre: ");
		txNombre = new JTextField();
		txNombre.setEditable(false);
		numEsferas = new JLabel("Numero de esferas: ");
		txNumEsferas = new JTextField();
		txNumEsferas.setEditable(false);
		
		Panel auxiliar = new Panel(new GridLayout(2,2));
		auxiliar.add(nombre);
		auxiliar.add(txNombre);
		auxiliar.add(numEsferas);
		auxiliar.add(txNumEsferas);
		
		listaPuntajes = new JList<Puntajes>();
		modelo = new DefaultListModel<Puntajes>();
		listaPuntajes.setModel(modelo);
		listaPuntajes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaPuntajes.addListSelectionListener(this);
		scroll = new JScrollPane(listaPuntajes);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBorder(new CompoundBorder(new EmptyBorder(3,3,3,3), new LineBorder(Color.BLACK)));repaint();
		
		add(scroll, BorderLayout.CENTER);
		add(auxiliar, BorderLayout.WEST);
		pintarPuntajes();
		
		listaPuntajes.addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent evt) {
				jListPuntajesMouseReleased(evt);
				
			}
		});
		
		
	}
	
	/**
	 * metodo que toma la seleccion del usuario en la lista
	 * @param evt
	 */
	private void jListPuntajesMouseReleased(MouseEvent evt) {
	       
	Puntajes pun = listaPuntajes.getSelectedValue();
	txNombre.setText(pun.getNombre());
	txNumEsferas.setText(String.valueOf(pun.getEsferas()));
	this.validate();;
		
        
    }
	
	/**
	 * metodo que pone en la lista los puntajes de los usuarios
	 */
	public void pintarPuntajes() {
		Puntajes raiz = ventana.getJuego().getRaiz();
		modelo.removeAllElements();
		AyuPintarPuntajes(raiz);
		
	}
	
	/**
	 * metodo que pinta en preorden los elementos del arbol
	 * @param n
	 */
	public void AyuPintarPuntajes(Puntajes n) {
		
		if(n == null) {
			return;
		}
		
		modelo.addElement(n);
		AyuPintarPuntajes(n.getIzquierda());
		AyuPintarPuntajes(n.getDerecha());
	
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
