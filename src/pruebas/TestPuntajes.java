package pruebas;
import mundo.*;
import junit.framework.TestCase;
/**
 * Clase TestPuntajes que extiende de TestCase
 */
public class TestPuntajes extends TestCase{
	
	Puntajes escenario1 = new Puntajes("Aleja", 1);
	Puntajes escenario2 = new Puntajes("Valentina", 0);
	
	/**
	 * metodo de prueba del metodo getNombre de la clase Puntajes
	 */
	public void testGetNombre() {
		
		
		assertTrue(escenario1.getNombre().equals("Aleja"));
		
	}
	
	/**
	 * metodo de prueba del metodo setNombre de la clase Puntajes
	 */
	public void testSetNombre( ) {
	
		
		escenario1.setNombre("Valentina");
		assertTrue(escenario1.getNombre().equals("Valentina"));
		
	}
	
	/**
	 * metodo de prueba del metodo getEsferas de la clase Puntajes
	 */
	public void testGetEsferas() {

		assertTrue(escenario1.getEsferas() == 1);
		
	}
	
	/**
	 * metodo de prueba del metodo setEsferas de la clase Puntajes
	 */
	public void testSetEsferas() {
	
		escenario1.setEsferas(2);
		assertTrue(escenario1.getEsferas() != 1);
		
	}
	
	/**
	 * metodo de prueba del metodo getDerecha de la clase Puntajes
	 */
	public void testGetDerecha() {
		
		assertNull(escenario1.getDerecha());
		
	}
	
	/**
	 * metodo de prueba del metodo setDerecha de la clase Puntajes
	 */
	public void testSetDerecha() {
		
		escenario1.setDerecha(escenario2);
		assertNotNull(escenario1.getDerecha());
		
	}
	
	/**
	 * metodo de prueba del metodo getIzquierda de la clase Puntajes
	 */
	public void testGetIzquierda() {
		
		assertNull(escenario1.getDerecha());
		
	}
	
	/**
	 * metodo de prueba del metodo setIzquierda de la clase Puntajes
	 */
	public void testSetIzquierda() {
		
		escenario1.setIzquierda(escenario2);
		assertNotNull(escenario1.getIzquierda());
	}

}
