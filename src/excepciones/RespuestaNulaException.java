package excepciones;
/**
 * clase RespuestaNulaException que extiende de la clase Exception
 */
public class RespuestaNulaException extends Exception{
	
	public RespuestaNulaException() {
		super("Respuesta inv�lida. Por favor ingrese una respuesta");
		
	}

}
