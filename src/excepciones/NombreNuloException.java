package excepciones;
/**
 * Clase NombreNuloException que extiende de Exception
 */
public class NombreNuloException extends Exception {
	
	/**
	 * constructor de la clase nombreNuloException
	 */
	public NombreNuloException() {
		super("Nombre de usuario inválido"); 
	}

}
