package mundo;

import java.io.Serializable;

/**
 * clase Villanos
 */
public class Villanos extends Personajes implements Serializable{
	
	/**
	 * constante de tipo String que representa la extension de las imagenes usadas en los villanos
	 */
	public static final String EXT = ".png";
	/**
	 * constante de tipo String que representa parte de la ruta donde se guardan las imagenes de los villanos
	 */
	public static final String RUTA = "Datos/personajes/";
	
	/**
	 * atributo de tipo int que representa el numero de la esfera que el villano le entrega al usuario
	 */
	public int esferaEntrega;
	/**
	 * atributo de tipo String que representa la ruta donde se encuentra la imagen de la esfera que entrega el villano
	 */
	public String rutaEsfera;
	/**
	 * atributo de tipo String que representa la frase de pelea que tiene el villano
	 */
	public String frasePelea;
	/**
	 * atributo de tipo boolean que indica si el villano ya termino de pelear o no
	 */
	private boolean terminado;
	/**
	 * atributo de tipo int que representa la posicion en Y del villano en la batalla
	 */
	private int posYbatalla;
	/**
	 * atributo de tipo int que representa la posicion en X del villano en la batalla
	 */
	private int posXbatalla;
	
	/**
	 * constructor de la clase villano
	 * @param nombre: String que representa el nombre del villano
	 * @param ataque1: int que representa el poder del ataque 1
	 * @param nomAtaque1: String que representa el nombre del ataque 1
	 * @param ataque2: int que representa el poder del ataque 2
	 * @param nomAtaque2: String que representa el nombre del ataque 2
	 * @param ataque3: int que representa el poder del ataque 3
	 * @param nomAtaque3: String que representa el nombre del ataque 3
	 * @param rutaBatalla: String que representa la ruta donde se encuentran las imagenes de batalla del villano
	 * @param vida: int que representa la vida del villano
	 * @param esferaEntrega: int que representa la esfera que el villano le entrega al usuario
	 * @param rutaEsfera: String que representa la ruta de la esfera que entrega el villano
	 * @param frasePelea: String que representa la frase de pelea del villano
	 */
	public Villanos(String nombre, int ataque1, String nomAtaque1, int ataque2, String nomAtaque2, int ataque3,
			String nomAtaque3, String rutaBatalla, int vida, int esferaEntrega, String rutaEsfera, String frasePelea) {
		
		super(nombre, ataque1, nomAtaque1, ataque2, nomAtaque2, ataque3, nomAtaque3,rutaBatalla, vida);
		
		
		this.esferaEntrega = esferaEntrega;
		this.rutaEsfera = rutaEsfera;
		this.frasePelea = frasePelea;
		this.vida = vida;
		this.posYbatalla = 250;
		this.posXbatalla = 800;
		
	}

	/**
	 * metodo que devuelve el valor del atributo esferaEntrega
	 * @return esferaEntrega
	 */
	public int getEsferaEntrega() {
		return esferaEntrega;
	}

	/**
	 * metodo que modifica el valor del atributo esferaEntrega
	 * @param esferaEntrega
	 */
	public void setEsferaEntrega(int esferaEntrega) {
		this.esferaEntrega = esferaEntrega;
	}

	/**
	 * metodo que devuelve el valor del atributo rutaEsfera
	 * @return rutaEsfera
	 */
	public String getRutaEsfera() {
		return rutaEsfera;
	}

	/**
	 * metodo que modifica el valor del atributo rutaEsfera
	 * @param rutaEsfera
	 */
	public void setRutaEsfera(String rutaEsfera) {
		this.rutaEsfera = rutaEsfera;
	}
	
	/**
	 * metodo que devuelve el valor del atributo frasePelea
	 * @return frasePelea
	 */
	public String getFrasePelea() {
		return frasePelea;
	}

	/**
	 * metodo que modifica el valor del atributo frasePelea
	 * @param frasePelea
	 */
	public void setFrasePelea(String frasePelea) {
		this.frasePelea = frasePelea;
	}

	/**
	 * metodo que devuelve el valor del atributo terminado
	 * @return terminado
	 */
	public boolean isTerminado() {
		return terminado;
	}

	/**
	 * metodo que modifica el valor del atributo terminado
	 * @param terminado
	 */
	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}

	/**
	 * metodo que devuelve el valor del atributo posYbatalla
	 * @return posYbatalla
	 */
	public int getPosYbatalla() {
		return posYbatalla;
	}

	/**
	 * metodo que modifica el valor del atributo posYbatalla
	 * @param posYbatalla
	 */
	public void setPosYbatalla(int posYbatalla) {
		this.posYbatalla = posYbatalla;
	}
	
	

	/**
	 * metodo que devuelve el valor del atributo posXbatalla
	 * @return posXbatalla
	 */
	public int getPosXbatalla() {
		return posXbatalla;
	}

	/**
	 * metodo que modifica el valor del atributo posXbatalla
	 * @param posXbatalla 
	 */
	public void setPosXbatalla(int posXbatalla) {
		this.posXbatalla = posXbatalla;
	}

	/**
	 * metodo que escoge un numero aleatorio para ejecutar un ataque
	 * @return aleatorio: int que representa el numero generado aleatoriamente
	 */
	public int ataqueAleatorio() {		
		int aleatorio =  (int) (Math.random() * 3) + 1;
		return aleatorio;
	}
	
	/**
	 * metodo que ejecuta el ataque1 del personaje Cell
	 */
	public void CellAtaque1() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/mover.gif")) {
			
			posXbatalla = 700;
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 14 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 15 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 15 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 16 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 16 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 17 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 17 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 18 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 18 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 19 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 19 + EXT)) {
			
			terminado = true;
			posXbatalla = 800;
			setRutaBatalla(RUTA + nombre + "/mover.gif");	
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque 2 del personaje Cell
	 */
	public void CellAtaque2() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/mover.gif")) {
			
			posXbatalla = 700;
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 14 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 15 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 15 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 16 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 16 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 17 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 17 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 18 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 18 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 19 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 19 + EXT)) {
			
			terminado = true;
			posXbatalla = 800;
			setRutaBatalla(RUTA + nombre + "/mover.gif");	
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque1 del personaje Freezer
	 */
	public void FreezerAtaque1() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/mover.gif")) {
			
			posXbatalla = 600;
			posYbatalla = 150;
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 14 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 15 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 15 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 16 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 16 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 17 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 17 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 18 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 18 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 19 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 19 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 20 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 20 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 21 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 21 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 22 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 22 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 23 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 23 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 24 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 24 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 25 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 25 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 26 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 26 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 27 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 27 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 28 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 28 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 29 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 29 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 30 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 30 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 31 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 31 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 32 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 32 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 33 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 33 + EXT)) {

			terminado = true;
			posXbatalla = 800;
			posYbatalla = 250;
			setRutaBatalla(RUTA + nombre + "/mover.gif");	
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque 2 del personaje Freezer
	 */
	public void FreezerAtaque2() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/mover.gif")) {
			
			posXbatalla = 600;
			posYbatalla = 150;
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 14 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 15 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 15 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 16 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 16 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 17 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 17 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 18 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 18 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 19 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 19 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 20 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 20 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 21 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 21 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 22 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 22 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 23 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 23 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 24 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 24 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 25 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 25 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 26 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 26 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 27 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 27 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 28 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 28 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 29 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 29 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 30 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 30 + EXT)) {

			terminado = true;
			posXbatalla = 800;
			posYbatalla = 250;
			setRutaBatalla(RUTA + nombre + "/mover.gif");	
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque1 del personaje Majin boo
	 */
	public void MajinBAtaque1() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/mover.gif")) {
			
			posXbatalla = 700;

			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 14 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 15 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 15 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 16 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 16 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 17 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 17 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 18 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 18 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 19 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 19 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 20 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 20 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 21 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 21 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 22 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 22 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 23 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 23 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 24 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 24 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 25 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 25 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 26 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 26 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 27 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 27 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 28 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 28 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 29 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 29 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 30 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 30 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 31 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 31 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 32 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 32 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 33 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 33 + EXT)) {

			terminado = true;
			posXbatalla = 800;

			setRutaBatalla(RUTA + nombre + "/mover.gif");	
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque 2 del personaje Majin boo
	 */
	public void MajinBAtaque2() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/mover.gif")) {
			
		

			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 14 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 15 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 15 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 16 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 16 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 17 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 17 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 18 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 18 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 19 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 19 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 20 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 20 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 21 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 21 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 22 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 22 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 23 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 23 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 24 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 24 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 25 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 25 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 26 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 26 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 27 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 27 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 28 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 28 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 29 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 29 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 30 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 30 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 31 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 31 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 32 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 32 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 33 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 33 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 34 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 34 + EXT)) {

			terminado = true;

			setRutaBatalla(RUTA + nombre + "/mover.gif");	
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque1 del personaje Broly
	 */
	public void BrolyAtaque1() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/mover.gif")) {
			
			posXbatalla = 650;
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque1/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque1/" + 5 + EXT)) {
				
			terminado = true;
			posXbatalla = 800;
			setRutaBatalla(RUTA + nombre + "/mover.gif");	
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque2 del personaje Broly
	 */
	public void BrolyAtaque2() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/mover.gif")) {
			
			posXbatalla = 650;
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Ataque2/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Ataque2/" + 6 + EXT)) {
				
			terminado = true;
			posXbatalla = 800;
			setRutaBatalla(RUTA + nombre + "/mover.gif");	
		}
		
	}
	
	
	/**
	 * metodo que modifica el valor del atributo vida
	 * @param vida
	 */
	public void setVida1(int vida) {
		this.vida -= vida;
	}
	
	/**
	 * metodo que modifica el valor del atributo vida
	 * @param vida
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}
	

	


	
	
	
	

}
