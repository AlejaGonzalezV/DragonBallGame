package pruebas;
import mundo.*;
import junit.framework.TestCase;
/**
 * Clase TestPersonajes que extiende de TestCase
 */
public class TestPersonajes extends TestCase{
	
	Personajes escenario1 = new Personajes("Goku",0, "Ataque1", 0, "Ataque2", 0, "Ataque3","Ruta", 0);
	Personajes escenario2 = new Personajes("Vegeta",0, "Ataque1", 0, "Ataque2", 0, "Ataque3","Ruta", 0);
	
	/**
	 * metodo de prueba del metodo getNombre de la clase Personajes
	 */
	public void testGetNombre() {
		
		assertTrue(escenario1.getNombre().equals("Goku"));
		
	}
	
	/**
	 * metodo de prueba del metodo setNombre de la clase Personajes
	 */
	public void testSetNombre() {
		
		escenario1.setNombre("Vegeta");
		assertTrue(escenario1.getNombre().equals("Vegeta"));
		
	}
	
	/**
	 * metodo de prueba del metodo getAtaque de la clase Personajes
	 */
	public void testGetAtaque1() {
		
		assertTrue(escenario1.getAtaque1() == 0);
		
	}
	
	/**
	 * metodo de prueba del metodo setAtaque1 de la clase Personajes
	 */
	public void testSetAtaque1() {
		
		escenario1.setAtaque1(10);
		assertTrue(escenario1.getAtaque1() == 10);
		
	}
	
	/**
	 * metodo de prueba del metodo getNomAtaque1 de la clase Personajes
	 */
	public void testGetNomAtaque1() {
		
		
		assertTrue(escenario1.getNomAtaque1().equals("Ataque1"));
		
	}
	
	/**
	 * metodo de prueba del metodo getAtaque2 de la clase Personajes
	 */
	public void testGetAtaque2() {
		
		assertTrue(escenario1.getAtaque2() == 0);
		
	}
	
	/**
	 * metodo de prueba del metodo setAtaque2 de la clase Personajes
	 */
	public void testSetAtaque2() {
		
		escenario1.setAtaque2(10);
		assertTrue(escenario1.getAtaque2() == 10);
		
	}
	
	/**
	 * metodo de prueba del metodo getNomAtaque2 de la clase Personajes
	 */
	public void testGetNomAtaque2() {
		
		
		assertTrue(escenario1.getNomAtaque2().equals("Ataque2"));
		
	}
	
	/**
	 * metodo de prueba del metodo getAtaque3 de la clase Personajes
	 */
	public void testGetAtaque3() {
		
		
		assertTrue(escenario1.getAtaque3() == 0);
		
	}
	
	/**
	 * metodo de prueba del metodo setAtaque3 de la clase Personajes
	 */
	public void testSetAtaque3() {
		
		escenario1.setAtaque3(10);
		assertTrue(escenario1.getAtaque3() == 10);
		
	}
	
	/**
	 * metodo de prueba del metodo getNomAtaque3 de la clase Personajes
	 */
	public void testGetNomAtaque3() {
		
		assertTrue(escenario1.getNomAtaque3().equals("Ataque3"));
		
	}
	
	/**
	 * metodo de prueba del metodo getRutaBatalla de la clase Personajes
	 */
	public void testGetRutaBatalla() {
		
		assertTrue(escenario1.getRutaBatalla().equals("Ruta"));
		
	}
	
	/**
	 * metodo de prueba del metodo setRutaBatalla de la clase Personajes
	 */
	public void testSetRutaBatalla() {
		
		
		escenario1.setRutaBatalla("Ruta1");
		assertTrue(escenario1.getRutaBatalla().equals("Ruta1"));
		
	}
	
	/**
	 * metodo de prueba del metodo getSiguiente de la clase Personajes
	 */
	public void testGetSiguiente() {
		
		
		assertNull(escenario1.getSiguiente());
		
	}
	
	/**
	 * metodo de prueba del metodo setSiguiente de la clase Personajes
	 */
	public void testSetSiguiente() {
		
		
		escenario1.setSiguiente(escenario2);
		assertNotNull(escenario1.getSiguiente());
		
	}

}
