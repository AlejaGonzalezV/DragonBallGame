package interfaz;

import mundo.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;
import excepciones.*;
import javax.swing.JPanel;

/**
 * Clase panelMundo que extiende de JPanel e implementa KeyListener
 */
public class PanelMundo extends JPanel implements KeyListener {
	
	/**
	 * constante que representa el movimiento hacia abajo del personaje
	 */
	public static final String DOWN = "1";
	
	/**
	 * constante que representa el movimiento hacia ariba del personaje
	 */
	public static final String UP = "4";
	/**
	 * constante que representa el movimiento a la derecha del personaje
	 */
	public static final String RIGHT = "7";
	/**
	 * constante que representa el movimientoa  la izquierda del personaje
	 */
	public static final String LEFT = "10";
	/**
	 * atributo que representa la relacion con la clase Ventana
	 */
	private Ventana ven;
	/**
	 * atributo de tipo Boolean que define si el usuario ya ha respondido a la pregunta 1
	 */
	private boolean pregunta1;
	/**
	 * atributo de tipo boolean que define si el usuario ya ha respondido a la pregunta 2
	 */
	private boolean pregunta2;
	/**
	 * atributo de tipo boolean que define si el usuario ya ha respondido a la pregunta 3
	 */
	private boolean pregunta3;
	/**
	 * atributo de tipo boolean que define si el usuario ya ha respondido a la pregunta 4
	 */
	private boolean pregunta4;
	/**
	 * atributo de tipo boolean que define si el usuario ya ha respondido a la pregunta 5
	 */
	private boolean pregunta5;
	/**
	 * atributo de tipo boolean que define si el usuario ya ha ganado la batalla con Freezer
	 */
	private boolean Freezer;
	/**
	 * atributo de tipo boolean que define si el usuario ya ha ganado la batalla con Broly
	 */
	private boolean Broly;
	/**
	 * atributo de tipo boolean que define si el usuario ya ha ganado la batalla con Cell
	 */
	private boolean Cell;
	/**
	 * atributo de tipo boolean que define si el usuario ya ha ganado la batalla con Majin boo
	 */
	private boolean MajinB;
	/**
	 * atributo de tipo String que representa el nombre del villano contra el que esta batallando el usuario
	 */
	private String villanoActual;
	
	/**
	 * constructor de la clase PanelMundo
	 * @param ventana
	 */
	public PanelMundo(Ventana ventana) {
		
		ven = ventana;
		setPreferredSize( new Dimension(1300,630));
		setBackground( Color.BLACK );
		this.addKeyListener(this);
		setFocusable(true);
		
		Freezer = false;
		Broly = false;
		Cell = false;
		MajinB = false;
		
	}
	

	/**
	 * metodo que devuelve el valor del atributo Freezer
	 * @return freezer
	 */
	public boolean isFreezer() {
		return Freezer;
	}

	/**
	 * metodo que modifica el valor del atributo Freezer
	 * @param freezer
	 */
	public void setFreezer(boolean freezer) {
		Freezer = freezer;
	}

	/**
	 * metodo que devuelve el valor del atributo Broly
	 * @return Broly
	 */
	public boolean isBroly() {
		return Broly;
	}

	/**
	 * metodo que modifica el valor del atributo Broly
	 * @param Broly
	 */
	public void setBroly(boolean broly) {
		Broly = broly;
	}

	/**
	 * metodo que devuelve el valor del atributo Cell
	 * @return Cell
	 */
	public boolean isCell() {
		return Cell;
	}

	/**
	 * metodo que modifica el valor del atributo Cell
	 * @param Cell
	 */
	public void setCell(boolean cell) {
		Cell = cell;
	}

	/**
	 * Metodo que devuelve el valor del atributo MajinB
	 * @return MajinB
	 */
	public boolean isMajinB() {
		return MajinB;
	}

	/**
	 * metodo que modifica el valor del atributo MajinB
	 * @param MajinB
	 */
	public void setMajinB(boolean majinB) {
		MajinB = majinB;
	}

	/**
	 * metodo que define la posicion de los elementos en el mapa y la accion a ejercer cuando el usuario se acerca
	 */
	public void elementosMapa() {
		
		Heroes heroe = (Heroes) ven.getHeroe();
		
		if(heroe.getPosX() >= 250 && heroe.getPosX() <= 302 && heroe.getPosY() >= 208 && heroe.getPosY() <= 255 && pregunta1 == false) {

			String respuesta = JOptionPane.showInputDialog(this, "¿Cuántas transformaciones sufre Freezer?" + "\n" + "a) 4" + "\n" + "b) 5" + "\n" + "c) 2");
			
			if(respuesta == null){
				
				try {
					throw new RespuestaNulaException();
				} catch (RespuestaNulaException e) {
				
					e.printStackTrace();
				}
				
			}
			
			else if(respuesta.equalsIgnoreCase("a")) {
				
				pregunta1 = true;
				JOptionPane.showMessageDialog(this, "La respuesta es correcta, acabas de ganar una nueva esfera :D");
				ven.modificarEsfera(2);
				ven.actualizarInfo();
				
			}
			
			else if(respuesta != "a") {
				
				JOptionPane.showMessageDialog(this, "La respuesta es incorrecta :(");
				heroe.setPosX(281); 
				heroe.setPosY(311);
				ven.actualizarMapa();
				
			}
		
		}
		
		else if(heroe.getPosX() >= 1148 && heroe.getPosX() <= 1202 && heroe.getPosY() >= 33 && heroe.getPosY() <= 84 && pregunta2 == false) {
			
			String respuesta = JOptionPane.showInputDialog(this, "¿Quién logró liberar la espada Z?" + "\n" + "a) Goten" + "\n" + "b) Goku" + "\n" + "c) Gohan");
			
			if(respuesta == null){
				
				try {
					throw new RespuestaNulaException();
				} catch (RespuestaNulaException e) {
				
					e.printStackTrace();
				}
				
			}
			
			else if(respuesta.equalsIgnoreCase("c")) {
				
				pregunta2 = true;
				JOptionPane.showMessageDialog(this, "La respuesta es correcta, acabas de ganar una nueva esfera");
				ven.modificarEsfera(4);
				ven.actualizarInfo();
				
			}
			
			else if(respuesta != "a") {
				
				JOptionPane.showMessageDialog(this, "La respuesta es incorrecta :(");
				heroe.setPosX(1280);
				heroe.setPosY(119);
				ven.actualizarMapa();
				
			}
			
		}
		
		else if(heroe.getPosX() >= 50 && heroe.getPosX() <= 103 && heroe.getPosY() >= 558 && heroe.getPosY() <= 607 && pregunta3 == false) {
			
			
			String respuesta = JOptionPane.showInputDialog(this, "¿Quién es hijo de Paragus?" + "\n" + "a) Bardock" + "\n" + "b) Broly" + "\n" + "c) Freezer");
			
			if(respuesta == null){
				
				try {
					throw new RespuestaNulaException();
				} catch (RespuestaNulaException e) {
				
					e.printStackTrace();
				}
				
			}
			
			else if(respuesta.equalsIgnoreCase("b")) {
				
				
				pregunta3 = true;
				JOptionPane.showMessageDialog(this, "La respuesta es correcta, acabas de ganar una nueva esfera :D");
				ven.modificarEsfera(6);
				ven.actualizarInfo();
				
			}
			
			else if(respuesta != "b") {
				
				JOptionPane.showMessageDialog(this, "La respuesta es incorrecta :(");
				heroe.setPosX(135);
				heroe.setPosY(593);
				ven.actualizarMapa();
				
			}
			
		}
		
		
		else if(heroe.getPosX() >= 70 && heroe.getPosX() <= 130 && heroe.getPosY() >= 1 && heroe.getPosY() <= 55 && pregunta4 == false) {

			String respuesta = JOptionPane.showInputDialog(this, "¿Quién se convirtío primero en SSJ2?" + "\n" + "a) Goku" + "\n" + "b) Trunks" + "\n" + "c) Gohan");
			
			if(respuesta == null){
				
				try {
					throw new RespuestaNulaException();
				} catch (RespuestaNulaException e) {
				
					e.printStackTrace();
				}
				
			}
			
			else if(respuesta.equalsIgnoreCase("c")) {
				
				pregunta4 = true;
				JOptionPane.showMessageDialog(this, "La respuesta es correcta, has aumentado el poder de tus ataques :D");
				heroe.setAtaque1(20);
				heroe.setAtaque2(20);
				heroe.setAtaque3(20);
				heroe.setAtaqueEspecial(20);
			}
			
			else if(respuesta != "c") {
				
				JOptionPane.showMessageDialog(this, "La respuesta es incorrecta :(");
				heroe.setPosX(208); 
				heroe.setPosY(47);
				ven.actualizarMapa();
				
			}
		
		}
		
	
		else if(heroe.getPosX() >= 585 && heroe.getPosX() <= 640 && heroe.getPosY() >= 258 && heroe.getPosY() <= 310 && pregunta5 == false) {

			String respuesta = JOptionPane.showInputDialog(this, "¿Quién mantuvo su cola hasta la muerte?" + "\n" + "a) Vegeta" + "\n" + "b) Bardock" + "\n" + "c) Gohan");
			
			if(respuesta == null){
				
				try {
					throw new RespuestaNulaException();
				} catch (RespuestaNulaException e) {
				
					e.printStackTrace();
				}
				
			}
			
			else if(respuesta.equalsIgnoreCase("b")) {
				
				pregunta5 = true;
				JOptionPane.showMessageDialog(this, "La respuesta es correcta, has aumentado el poder de tus ataques :D");
				heroe.setAtaque1(20);
				heroe.setAtaque2(20);
				heroe.setAtaque3(20);
				heroe.setAtaqueEspecial(20);
			}
			
			else if(respuesta != "b") {
				
				JOptionPane.showMessageDialog(this, "La respuesta es incorrecta :(");
				heroe.setPosX(577); 
				heroe.setPosY(356);
				ven.actualizarMapa();
				
			}
		
		}
		
		else if(heroe.getPosX() >= 396 && heroe.getPosX() <= 444 && heroe.getPosY() >= 230 && heroe.getPosY()<= 300 && Broly == false) {
			
			Villanos villano = (Villanos) ven.getJuego().getHeroe("Broly");
			villanoActual = "Broly";
			
			int resp = JOptionPane.showConfirmDialog(null,"Broly: " + villano.getFrasePelea() + "\n" + "\n" + "¿Desea pelear para ganar una esfera?" , "Batallar", JOptionPane.YES_NO_OPTION);

			if(resp == JOptionPane.YES_OPTION) {

				ven.getBatalla().getFondo().setImagenRuta("Datos/Fondos/FondoBatalla3.jpg");
				heroe.setVida(500);
				villano.setVida(500);
				ven.visualizarBatalla();
				heroe.setPosX(414);
				heroe.setPosY(352);
				ven.actualizarMapa();
				
			}else if(resp == JOptionPane.NO_OPTION) {
				
				JOptionPane.showMessageDialog(this, "Debes pelear para ganar una esfera :(");
				heroe.setPosX(414);
				heroe.setPosY(352);
				ven.actualizarMapa();
				
			}
		}
		
		else if(heroe.getPosX() >= 1235 && heroe.getPosX() <= 1295   && heroe.getPosY() >= 290   && heroe.getPosY() <= 360 && Freezer == false) {
			Villanos villano = (Villanos) ven.getJuego().getHeroe("Freezer");
			villanoActual = "Freezer";
			
			int resp = JOptionPane.showConfirmDialog(null,"Freezer: " + villano.getFrasePelea() + "\n" + "\n" + "¿Desea pelear para ganar una esfera?" , "Batallar", JOptionPane.YES_NO_OPTION);
			
			if(resp == JOptionPane.YES_OPTION) {

				ven.getBatalla().getFondo().setImagenRuta("Datos/Fondos/FondoBatalla2.png");
				heroe.setVida(500);
				villano.setVida(500);
				ven.visualizarBatalla();
				heroe.setPosX(1279);
				heroe.setPosY(229);
				ven.actualizarMapa();
				
			}else if(resp == JOptionPane.NO_OPTION) {
				
				JOptionPane.showMessageDialog(this, "Debes pelear para ganar una esfera :(");
				heroe.setPosX(1279);
				heroe.setPosY(229);
				ven.actualizarMapa();
				
			}
			
		}
		
		else if(heroe.getPosX() >= 1015 && heroe.getPosX() <= 1067  && heroe.getPosY() >= 7  && heroe.getPosY() <= 57 && MajinB == false) {
			Villanos villano = (Villanos) ven.getJuego().getHeroe("Majin boo");
			villanoActual = "Majin boo";
			
			int resp = JOptionPane.showConfirmDialog(null,"Majin boo: " + villano.getFrasePelea() + "\n" + "\n" + "¿Desea pelear para ganar una esfera?" , "Batallar", JOptionPane.YES_NO_OPTION);
			
			if(resp == JOptionPane.YES_OPTION) {

				ven.getBatalla().getFondo().setImagenRuta("Datos/Fondos/FondoBatalla4.jpg");
				heroe.setVida(500);
				villano.setVida(500);
				ven.visualizarBatalla();
				heroe.setPosX(1020);
				heroe.setPosY(106);
				ven.actualizarMapa();
				
			}else if(resp == JOptionPane.NO_OPTION) {
				
				JOptionPane.showMessageDialog(this, "Debes pelear para ganar una esfera :(");
				heroe.setPosX(1020);
				heroe.setPosY(106);
				ven.actualizarMapa();
				
			}
			
			
		}else if(heroe.getPosX() >= 222 && heroe.getPosX() <= 294   && heroe.getPosY() >=  480 && heroe.getPosY() <= 560  && Cell == false) {
			Villanos villano = (Villanos) ven.getJuego().getHeroe("Cell");
			villanoActual = "Cell";
			
			int resp = JOptionPane.showConfirmDialog(null,"Cell: " + villano.getFrasePelea() + "\n" + "\n" + "¿Desea pelear para ganar una esfera?" , "Batallar", JOptionPane.YES_NO_OPTION);
			
			if(resp == JOptionPane.YES_OPTION) {

				ven.getBatalla().getFondo().setImagenRuta("Datos/Fondos/FondoBatalla.jpg");
				heroe.setVida(500);
				villano.setVida(500);
				ven.visualizarBatalla();
				heroe.setPosX(364);
				heroe.setPosY(583);
				ven.actualizarMapa();
				
			}else if(resp == JOptionPane.NO_OPTION) {
				
				JOptionPane.showMessageDialog(this, "Debes pelear para ganar una esfera :(");
				heroe.setPosX(364);
				heroe.setPosY(583);
				ven.actualizarMapa();
				
			}
		
		}else if(heroe.getPosX() >= 900 && heroe.getPosX() <= 988 && heroe.getPosY() >= 314 && heroe.getPosY() <= 421) {
			
			heroe.setPosX(956);
			heroe.setPosY(484);
			
			String respuesta = JOptionPane.showInputDialog(this, "¿Qué deseas hacer " + ven.getNombreUsuario() + "?" + "\n" + "a) Guardar puntaje" + "\n" + "b) Ver información de los personajes" + "\n" + "c) Ver puntajes");
			if(respuesta.equalsIgnoreCase("a")) {
				
				ven.guardarPuntaje();
				
				
			}else if(respuesta.equalsIgnoreCase("c")){
				ven.cargarPuntajes();
				ven.visualizarPuntajes();
			}
			
			else if(respuesta.equalsIgnoreCase("b")) {
				
				String per = JOptionPane.showInputDialog(this, "¿De qué personaje deseas ver la información " + ven.getNombreUsuario() + "\n" + "a) Goku" + "\n" + "b) Roshi" + "\n" + "c) Vegeta" + "\n" + "d) Freezer" + "\n" + "e) Cell" + "\n" + "f) Majin boo" + "\n" + "g) Broly");
				
				if(per.equalsIgnoreCase("a")) {
					
					ven.mostrarInfoPersonajes("Goku");	
					
				}
				
				else if(per.equalsIgnoreCase("b")) {
					
					ven.mostrarInfoPersonajes("Roshi");
					
				}
				
				else if(per.equalsIgnoreCase("c")) {
					
					ven.mostrarInfoPersonajes("Vegeta");
					
				}
				
				else if(per.equalsIgnoreCase("d")) {
					
					ven.mostrarInfoPersonajes("Freezer");
					
				}
				
				else if(per.equalsIgnoreCase("e")) {
					
					ven.mostrarInfoPersonajes("Cell");
					
				}
				
				else if(per.equalsIgnoreCase("f")) {
					
					ven.mostrarInfoPersonajes("Majin boo");
					
				}
				
				else if(per.equalsIgnoreCase("g")) {
					
					ven.mostrarInfoPersonajes("Broly");
					
				}
				
			}else {
				try {
					throw new CaracterEquivocadoException();
				} catch (CaracterEquivocadoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			
		}
		
	}
		
		
	
	/**
	 * metodo paint que dibuja el fondo y el personaje
	 */
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
			Toolkit t = Toolkit.getDefaultToolkit ();
			
			Image imagen = t.getImage("Datos/fondos/Fondo2.png");
	        g.drawImage (imagen, 0, 0, this);
	        Heroes heroe = (Heroes) ven.getHeroe();
	        Image personajeImg = null;

	        if(heroe.getNombre().equalsIgnoreCase("Goku")) {
	        	
	        	personajeImg = t.getImage(heroe.getRutaCamina());
	        	
	        }
	        
	        else if(heroe.getNombre().equals("Roshi")) {
	        	
	        	personajeImg = t.getImage(heroe.getRutaCamina());
	        
	        	
	        }
	        
	        else if(heroe.getNombre().equals("Vegeta")) {
	        	
	        	personajeImg = t.getImage(heroe.getRutaCamina());
	        	
	        }
	        
	        
	        if(heroe.getPosX() >= 110 && heroe.getPosX() <=156 && heroe.getPosY() >= 89 && heroe.getPosY() <= 106) { 
        		
        		heroe.setPosX(957); 
        		heroe.setPosY(495);
        		g.drawImage(personajeImg, heroe.getPosX(), heroe.getPosY(), this);
        		
        	}
        	
        	else if(heroe.getPosX() >= 964 && heroe.getPosX() <= 1011 && heroe.getPosY() >= 446 && heroe.getPosY() <= 458) {
        		
        		heroe.setPosX(204);
        		heroe.setPosY(117);
        		g.drawImage(personajeImg, heroe.getPosX(), heroe.getPosY(), this);
        		
        	}
        	
        	else {
        	
        		g.drawImage(personajeImg, heroe.getPosX(), heroe.getPosY(), this);
        	
        	}
	        
	        
	}
	

	/**
	 * metodo que define la accion de los botones del teclado
	 */
	public void keyPressed(KeyEvent e) {
		
		Heroes heroe = (Heroes) ven.getHeroe();
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			
			heroe.moverse(UP);
			ven.actualizarMapa();
			elementosMapa(); 
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
		
			heroe.moverse(DOWN);
			ven.actualizarMapa();
			elementosMapa();
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			
			heroe.moverse(LEFT);
			ven.actualizarMapa();
			elementosMapa();
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			heroe.moverse(RIGHT);
			ven.actualizarMapa();
			elementosMapa();
			
			
		}
		
	}	
	
	/**
	 * metodo que devuelve el valor del atributo villanoActual
	 * @return villanoActual
	 */
	public String getVillanoActual() {
		return villanoActual;
	}


	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
