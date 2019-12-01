package interfaz;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mundo.Heroes;
import mundo.Personajes;
import mundo.Villanos;
/**
 * clase PanelFondoB que extiende de JPanel
 */
public class PanelFondoB extends JPanel{
	
	/**
	 * atributo de tipo PanelBatalla que representa la relacion con la clase PanelBatalla
	 */
	private PanelBatalla ventana;
	/**
	 * atributo de tipo String que representa la ruta de la imagen de fondo
	 */
	private String imagenRuta;
	/**
	 * atributo de tipo String que representa la ruta donde se almacenan las imagenes del personaje
	 */
	private String imagenPer;
	
	/**
	 * constructor de la clase PanelBatalla
	 * @param ventana
	 */
	public PanelFondoB(PanelBatalla ventana) {
		this.ventana = ventana;
		
	}
	
	/**
	 * metodo que obtiene el villano contra el cual se va a pelear
	 * @param villano
	 * @return villano
	 */
	public Personajes obtenerVillano(String villano) {
		
		return ventana.getVentana().getJuego().getHeroe(villano);
	}
	
	/**
	 * metodo que pinta los elementos del panel
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Font font = new Font("Agency FB", Font.BOLD, 25);
		
		Heroes heroe = (Heroes)ventana.getVentana().getHeroe();
		
		Villanos villano = (Villanos)obtenerVillano(ventana.getVentana().getMundo().getVillanoActual());
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Image imagen = t.getImage(imagenRuta);
		g.drawImage(imagen, 0, 0, this);
		
	
		Image hero = t.getImage(heroe.getRutaBatalla());
		
		if(heroe.getNombre().equals("Vegeta")) {
			
			g.drawImage(hero, 60 , 200, this);
			
		}else {
			g.drawImage(hero, 60 , heroe.getPosYbatalla(), this);
		}
			
		Image vill = t.getImage(villano.getRutaBatalla());
		
		if(villano.getNombre().equals("Majin boo")) {
			
			g.drawImage(vill, 600 , villano.getPosYbatalla(), this);
		}else {
			g.drawImage(vill, villano.getPosXbatalla() , villano.getPosYbatalla(), this);
		}
		
		
		g.setFont(font);
		g.drawString("Vida", 60,60);
		g.drawString("Vida", 800,60);
		
		
		if(heroe.getVida()<=0) {
			g.drawString("0", 60, 100);

			
		}else if(heroe.getVida()>0) {
			g.drawString(String.valueOf(heroe.getVida()), 60, 100);
			
		}
		if(villano.getVida()<=0) {
			g.drawString("0", 800, 100);
			
		}else if(villano.getVida()>0) {
			g.drawString(String.valueOf(villano.getVida()), 800, 100);
		
	
		}
		
		
	}


	/**
	 * metodo que retorna la ruta de la imagen de fondo
	 * @return imagenRuta
	 */
	public String getImagenRuta() {
		return imagenRuta;
	}

	/**
	 * metodo que modifica la ruta de la imagen de fondo
	 * @param imagenRuta
	 */
	public void setImagenRuta(String imagenRuta) {
		this.imagenRuta = imagenRuta;
	}
	
	

}
