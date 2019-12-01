package mundo;

/**
 * clase Puntajes
 */
public class Puntajes {
	
	/**
	 * atributo de tipo String que representa el nombre del usuario
	 */
	private String nombre;
	/**
	 * atributo de tipo int que representa el numero de esferas obtenidas por el usuario
	 */
	private int esferas;
	/**
	 * atributo de tipo Puntajes que representa la relacion con la clase Puntajes
	 */
	private Puntajes derecha;
	/**
	 * atributo de tipo Puntajes que representa la relacion con la clase Puntajes
	 */
	private Puntajes izquierda;
	
	/**
	 * constructor de la clase Puntajes
	 * @param nombre: String que representa el nombre del usuario
	 * @param esferas: int que representa el numero de esferas obtenidas por el usuario
	 */
	public Puntajes(String nombre, int esferas) {
		
		this.nombre = nombre;
		this.esferas = esferas;
		
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
	 * metodo que devuelve el valor del atributo esferas
	 * @return esferas
	 */
	public int getEsferas() {
		return esferas;
	}

	/**
	 * metodo que modifica el valor del atributo esferas
	 * @param esferas
	 */
	public void setEsferas(int esferas) {
		this.esferas = esferas;
	}

	/**
	 * metodo que devuelve el valor de la relacion con la clase Puntajes
	 * @return derecha
	 */
	public Puntajes getDerecha() {
		return derecha;
	}

	/**
	 * metodo que modifica el valor de la relacion con la clase Puntajes
	 * @param derecha
	 */
	public void setDerecha(Puntajes derecha) {
		this.derecha = derecha;
	}

	/**
	 * metodo que devuelve el valor de la relacion con la clase Puntajes
	 * @return izquierda
	 */
	public Puntajes getIzquierda() {
		return izquierda;
	}

	/**
	 * metodo que modifica el valor de la relacion con la clase Puntajes
	 * @param izquierda
	 */
	public void setIzquierda(Puntajes izquierda) {
		this.izquierda = izquierda;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
	/**
	 * metodo que agrega un nuevo objeto de tipo Puntajes al arbol
	 * @param puntaje: objeto de tipo Puntajes
	 */
	public void agregar(Puntajes puntaje) {
		
		if(puntaje.getEsferas() < esferas) {
			
			if(izquierda == null) {
				
				izquierda = puntaje;
				
			}
			
			else {
				
				izquierda.agregar(puntaje);
				
			}
			
		}
		
		else {
			
			
			if(derecha == null) {
				
				derecha = puntaje;
				
			}
			
			else {
				
				derecha.agregar(puntaje);
				
			}
			
		}
	
	}
	
}
