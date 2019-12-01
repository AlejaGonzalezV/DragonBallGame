package excepciones;

/**
 * clase CaracterEquivocadoException que extiende de la clase exception
 */
public class CaracterEquivocadoException  extends Exception{
	
	/**
	 * constructor de la clase CaracterEquivocadoException
	 */
	public CaracterEquivocadoException() {
		super("Ingresó un caracter equivocado");
	}

}
