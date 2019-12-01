package interfaz;

import mundo.*;
import hilos.*;
import mundo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

/**
 * clase ventana que extiende de JFrame
 */
public class Ventana extends JFrame {
	
	/**
	 * Atributo de tipo PanelMundo que representa la relacion con la clase PanelMundo
	 */
	private PanelMundo mundo;
	/**
	 * atributo de tipo PanelInfo que representa la relacion con la clase PanelInfo
	 */
	private PanelInfo info;
	/**
	 * atributo de tipo PanelInicio que representa la relacion con la clase PanelInicio
	 */
	private PanelInicio inicio;
	/**
	 * atributo de tipo PanelBatalla que representa la relacion con la clase PanelBatalla
	 */
	private PanelBatalla batalla;
	/**
	 * atributo de tipo Juego que representa la reclasion con la clase Juego
	 */
	private Juego juego;
	/**
	 * atributo de tipo PanelInstrucciones que representa la relacion con la clase PanelInstrucciones
	 */
	private PanelInstrucciones instrucciones;
	/**
	 * atributo de tipo String que almacena el nombre del personaje escogido por el usuario
	 */
	private String nombrePersonaje;
	/**
	 * atributo de tipo String que almacena el nombre del usuario
	 */
	private String nombreUsuario;
	/**
	 * atributo de tipo InfoPersonajes que representa la relacion con la clase InfoPersonajes
	 */
	private InfoPersonaje infoPer;
	/**
	 * atributo de tipo PanelPuntajes que representa la relacion con la clase PanelPuntajes
	 */
	private PanelPuntajes puntajes;
	
	/**
	 * Constructor de la clase Ventana
	 */
	public Ventana() {
		
		
		mundo = new PanelMundo(this);
		info = new PanelInfo(this);
		inicio = new PanelInicio(this);
		batalla = new PanelBatalla(this);
		instrucciones = new PanelInstrucciones(this);
		juego = new Juego(null);
		infoPer = new InfoPersonaje();
		puntajes = new PanelPuntajes(this);
		
		addKeyListener(mundo);
		setTitle("Super DragonBall");
		setResizable(false);
		setSize(1300, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(mundo, BorderLayout.CENTER);
		add(info, BorderLayout.SOUTH);
		pack();
		setVisible(false);
		instrucciones.setVisible(false);
		mostrarPantallaPrincipal();
		
		Toolkit screem = Toolkit.getDefaultToolkit();
		Image imagen = screem.getImage("Datos/Icono.png");
		setIconImage(imagen);
		
	}
	
	/**
	 * metodo get de la relacion con la clase PanelBatalla
	 * @return batalla: elemento de tipo PanelBatalla
	 */
	public PanelBatalla getBatalla() {
		return batalla;
	}
	
	
	/**
	 * metodo que muestra el panel PanelBatalla
	 */
	public void visualizarBatalla() {
		batalla.inicializarBotones();
		batalla.getFondo().updateUI();
		batalla.setVisible(true);
	}
	
	/**
	 * metodo get de la relacion con la clase Juego
	 * @return
	 */
	public Juego getJuego() {
		return juego;
	}
	
	/**
	 * metodo get de la relacion con la clase PanelMundo
	 * @return
	 */
	public PanelMundo getMundo() {
		return mundo;
	}
	
	/**
	 * metodo que hace visible la ventana principal
	 */
	public void mostrarVentana() {
		
		this.setVisible(true);
		info.modificarDatos();
	    
	}
	
	/**
	 * metodo que inicializa la informacion de cada jugador
	 */
	public void inicializarJugador() {
		
	juego = new Juego(new Jugador(nombreUsuario, nombrePersonaje, null));	
		
	}
	
	/**
	 * metodo que devuelve el nombre del personaje escogido por el usuario
	 * @return
	 */
	public String getNombrePersonaje() {
		return nombrePersonaje;
	}

	/**
	 * metodo set del atributo nombrePersonaje
	 * @param nombrePersonaje
	 */
	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}

	/**
	 * metodo que devuelve el objeto tipo Heroe que fue escogido por el usuario
	 * @return
	 */
	public Personajes getHeroe() {
		
		return juego.getHeroe(nombrePersonaje);
		
	}
	
	/**
	 * metodo que hace visible la ventana de mostrar instrucciones
	 */
	public void mostrarInstrucciones() {
		
		instrucciones.setVisible(true);
		
	}
	
	/**
	 * metodo que devuelve el nombre ingresado por el usuario
	 * @return
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * metodo set que modifica el nombre escogido por el usuario
	 * @param nombreUsuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * metodo que hace visible la ventana inicial
	 */
	public void mostrarPantallaPrincipal() {
		
		inicio.setVisible(true);
		
	}
	
	/**
	 * metodo que muestra en una nueva ventana la informacion de un personaje solicitado por el usuario
	 * @param nombre del personaje solicitado
	 */
	public void mostrarInfoPersonajes(String nombre) {
		
		Personajes personaje = juego.buscarPersonaje(nombre);
		
		if(personaje instanceof Villanos) {
			
				infoPer.editarInfo(personaje.getNombre(), personaje.getNomAtaque1(), personaje.getNomAtaque2(), personaje.getNomAtaque3(), "No Aplica", personaje.getRutaBatalla());
				infoPer.setVisible(true);
		}	
			
			else {
				
				Heroes heroe = (Heroes) personaje;
				infoPer.editarInfo(heroe.getNombre(), heroe.getNomAtaque1(), heroe.getNomAtaque2(), heroe.getNomAtaque3(), heroe.getNomAtaqueEspecial(), "Datos/personajes/" + heroe.getNombre() + "/Batalla/mover.gif");
				infoPer.setVisible(true);
			}
			
	}
		
		
	/**
	 * metodo que guarda en un archivo de texto el puntaje obtenido por el usuario 
	 */
	public void guardarPuntaje() {
		juego.guardarTexto();
		juego.guardarDatos();
		
	}
	
	public void cargarPartida() {
		
		juego.cargarDatos();
		Jugador usuario = juego.getJugador();
		nombreUsuario = usuario.getNombre();
		
		
	}
	
	/**
	 * metodo que carga el archivo de texto con los puntajes guardados
	 */
	public void cargarPuntajes() {
		
		juego.recuperarTexto();
		
	}
	
	/**
	 * metodo que hace visible la ventana donde se muestran los puntajes
	 */
	public void visualizarPuntajes() {
		
		puntajes.pintarPuntajes();
		puntajes.setVisible(true);
	}
	
	/**
	 * metodo que actualiza la clase PanelMundo
	 */
	public void actualizarMapa() {
	
		mundo.updateUI();
		
	}
	
	/**
	 * metodo que retorna el atributo raiz de la clase juego
	 * @return Puntajes raiz
	 */
	public Puntajes darRaiz() {
		return juego.getRaiz();
	}
	
	/**
	 * metodo que modifica el numero de esferas obtenidas por el usuario
	 * @param numero
	 */
	public void modificarEsfera(int numero) {
		
		info.modificarEsfera(numero);
		juego.agregarEsfera(1);
		
	}
	
	/**
	 * Metodo que bloquea la interaccion con un villano al cual ya se le ha ganado la batalla
	 * @param nombre
	 */
	public void bloquearVillano(String nombre) {
		
		if(nombre.equals("Cell")) {
			mundo.setCell(true);
			
		}else if(nombre.equals("Majin boo")) {
			mundo.setMajinB(true);
			
		}else if(nombre.equals("Freezer")) {
			mundo.setFreezer(true);
			
		}else if(nombre.equals("Broly")) {
			mundo.setBroly(true);
			
		}
	}
	
	/**
	 * metodo que actualiza el panel PanelInfo
	 */
	public void actualizarInfo() {
		
		info.updateUI();
		
	}
	
	/**
	 * metodo que devuelve un ataque del villano de forma aleatoria
	 * @param vil: Objeto de tipo villano
	 * @return ataque del villano
	 */
	public int obtenerAtaqueAleatorio(Villanos vil) {	
		return vil.ataqueAleatorio();
	}
	
	/**
	 * metodo main de la clase Ventana
	 * @param args
	 */
	public static void main (String[] args) {
		
		Ventana ven = new Ventana();
		
		
		
		
	}


}
