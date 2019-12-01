package mundo;

import java.io.Serializable;

/**
 * clase Personajes
 */
public class Personajes implements Serializable{

	/*
	 * atributo de tipo String que representa el nombre del personaje
	 */
	protected String nombre;
	/**
	 * atributo de tipo int que representa el poder del ataque 1
	 */
	protected int ataque1;
	/**
	 * atributo de tipo String que representa el nombre del ataque 1 
	 */
	protected String nomAtaque1;
	/**
	 * atributo de tipo int que representa el poder del ataque 2
	 */
	protected int ataque2;
	/**
	 * atributo de tipo String que representa el nombre del ataque 2 
	 */
	protected String nomAtaque2;
	/**
	 * atributo de tipo int que representa el poder del ataque 3
	 */
	protected int ataque3;
	/**
	 * atributo de tipo String que representa el nombre del ataque 3
	 */
	protected String nomAtaque3;
	/**
	 * atributo de tupo String que representa parte de la ruta donde se encuentran las imagenes de batalla de los personajes
	 */
	protected String rutaBatalla;
	/**
	 * atributo de tipo int que representa la vida del personaje
	 */
	protected int vida;
	/**
	 * atributo de tipo Personajes que representa la relacion con la clase Personajes
	 */
	protected Personajes siguiente;

	/**
	 * constructor de la clase Personajes
	 * @param nombre: String que representa el nombre del personaje
	 * @param ataque1: int que representa el poder del ataque 1
	 * @param nomAtaque1: String que representa el nombre del ataque 1 
	 * @param ataque2: int que representa el poder del ataque 2
	 * @param nomAtaque2: String que representa el nombre del ataque 2
	 * @param ataque3: int que representa el poder del ataque 3
	 * @param nomAtaque3: String que representa el nombre del ataque 3 
	 * @param rutaBatalla: String que representa parte de la ruta donde se encuentran las imagenes de batalla de cada personaje
	 * @param vida: int que representa la vida del personaje
	 */
	public Personajes(String nombre, int ataque1, String nomAtaque1, int ataque2, String nomAtaque2, int ataque3, String nomAtaque3, String rutaBatalla, int vida) {
		
		this.nombre = nombre;
		this.ataque1 = ataque1;
		this.nomAtaque1 = nomAtaque1;
		this.ataque2 = ataque2;
		this.nomAtaque2 = nomAtaque2;
		this.ataque3 = ataque3;
		this.nomAtaque3 = nomAtaque3;
		this.rutaBatalla = rutaBatalla;
		this.vida = vida;

		
	}

	/**
	 * metodo que devuelve el valor del atributo nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * metodo que modifica el valor del atributo nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * metodo que devuelve el valor del atributo ataque1
	 * @return ataque1
	 */
	public int getAtaque1() {
		return ataque1;
	}

	/**
	 * metodo que modifica el valor del atributo ataque1
	 * @param ataque1
	 */
	public void setAtaque1(int ataque1) {
		this.ataque1 += ataque1;
	}

	/**
	 * metodo que devuelve el nombre del atributo nomAtaque1
	 * @return
	 */
	public String getNomAtaque1() {
		return nomAtaque1;
	}

	/**
	 * metodo que devuelve el valor del atributo ataque2
	 * @return ataque2
	 */
	public int getAtaque2() {
		return ataque2;
	}

	/**
	 * metodo que modifica el valor del atributo ataque2
	 * @param ataque2
	 */
	public void setAtaque2(int ataque2) {
		this.ataque2 += ataque2;
	}

	/**
	 * metodo que retorna el valor del atributo nomAtaque2
	 * @return
	 */
	public String getNomAtaque2() {
		return nomAtaque2;
	}

	/**
	 * metodo que devuelve el valor del atributo ataque3
	 * @return ataque3
	 */
	public int getAtaque3() {
		return ataque3;
	}

	/**
	 * metodo que modifica el valor del atributo ataque3
	 * @param ataque3
	 */
	public void setAtaque3(int ataque3) {
		this.ataque3 += ataque3;
	}

	/**
	 * metodo que devuelve el valor del atributo nomAtaque3
	 * @return
	 */
	public String getNomAtaque3() {
		return nomAtaque3;
	}

	/**
	 * metodo que devuelve el valor del atributo rutaBatalla
	 * @return rutaBatalla
	 */
	public String getRutaBatalla() {
		return rutaBatalla;
	}

	/**
	 * metodo que modifica el valor del atributo rutaBatalla
	 * @param rutaBatalla
	 */
	public void setRutaBatalla(String rutaBatalla) {
		this.rutaBatalla = rutaBatalla;
	}

	/**
	 * metodo que devuelve la relacion con la clase Personajes
	 * @return siguiente
	 */
	public Personajes getSiguiente() {
		return siguiente;
	}

	/**
	 * metodo que modifica la relacion con la clase personaje
	 * @param siguiente
	 */
	public void setSiguiente(Personajes siguiente) {
		this.siguiente = siguiente;
	}

	/**
	 * metodo que inserta un personaje después de otro
	 * @param personaje
	 */
	public void insertarDespues(Personajes personaje) {
		
		personaje.siguiente = siguiente;
		siguiente = personaje;
		
	}

	/**
	 * metodo que retorna el valor del atributo vida
	 * @return vida
	 */
	public int getVida() {
		return vida;
	}


	


	
	
	
	

}
