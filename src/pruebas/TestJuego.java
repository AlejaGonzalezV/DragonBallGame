package pruebas;
import mundo.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
/**
 * Clase TestJuego que extiende de TestCase
 */
public class TestJuego extends TestCase{
	
	Juego escenario1 = new Juego(new Jugador("Aleja", "Goku", null));
	
	/**
	 * metodo de prueba del metodo getRaiz de la clase Juego
	 */
	@Test
	public void testGetRaiz() {
		
		
		assertNull( escenario1.getRaiz());
		
	}
	
	/**
	 * metodo de prueba del metodo setRaiz de la clase Juego
	 */
	@Test
	public void testSetRaiz() {
		
		 
		 escenario1.setRaiz(new Puntajes("Aleja", 5));
		assertNotNull( escenario1.getRaiz());
		
	}

	/**
	 * metodo de prueba del metodo buscarPersonajes de la clase Juego
	 */
	@Test
	public void testBuscarPersonajes() {
		
		 
		assertNotNull( escenario1.buscarPersonaje("Vegeta"));
		assertNull( escenario1.buscarPersonaje("Aleja"));
		
	}
	
	/**
	 * metodo de prueba del metodo getJugador de la clase Juego
	 */
	@Test
	public void testGetJugador() {
		
		 
		assertNotNull( escenario1.getJugador());
		
		
	}
	
	/**
	 * metodo de prueba del metodo getHeroe de la clase Juego
	 */
	@Test
	public void testGetHeroe() {
		
		 
		assertNotNull( escenario1.getHeroe("Broly"));
		assertNull( escenario1.getHeroe("Aleja"));
		
	}
	
	/**
	 * metodo de prueba del metodo numeroEsferas de la clase Juego
	 */
	@Test
	public void testNumeroEsferas() {
		
		 
		assertTrue( escenario1.numeroEsferas() == 0);
		
	}

	/**
	 * metodo de prueba del metodo agregarEsfera de la clase Juego
	 */
	@Test
	public void testAgregarEsfera() {
		
		 
		 escenario1.agregarEsfera(1);
		assertTrue( escenario1.numeroEsferas() != 0);
		
	}
	
	/**
	 * metodo de prueba del metodo agregarElementos de la clase Juego
	 */
	@Test 
	public void testAgregarElementos() {
		
		 
		 escenario1.agregarElementos(new Puntajes("Aleja", 5));
		assertNotNull( escenario1.getRaiz());
		
	}
	
}
