package pruebas;

import mundo.*;
import junit.framework.TestCase;
/**
 * Clase TestJugador que extiende de la clase TestCase
 */
public class TestJugador extends TestCase{
	
	Jugador escenario1 = new Jugador("Aleja", "Goku", null);
	
	/**
	 * metodo de prueba del metodo getNumeroEsferas de la clase Jugador
	 */
	public void testGetNumeroEsferas() {  
		
		
		assertTrue( escenario1.getNumeroEsferas() == 0);
		
		
	}
	
	/**
	 * metodo de prueba del metodo setNumeroEsferas de la clase Jugador
	 */
	public void testSetNumeroEsferas() {
		
		 
		 escenario1.setNumeroEsferas(1);
		 escenario1.setNumeroEsferas(1);
		assertTrue( escenario1.getNumeroEsferas() == 2);
		
	}
	
	/**
	 * metodo de prueba del metodo getPrimero de la clase Jugador
	 */
	public void testGetPrimero() {
		
		assertTrue( escenario1.getPrimero() != null);
		
	}
	
	/**
	 * metodo de prueba del metodo setPrimero de la clase Jugador
	 */
	public void testSetPrimero() {
		
		 
		escenario1.setPrimero(new Heroes("Vegeta", 50, "Rafaga de Ki", 60, "Onda explosiva", 90, "Big bang", 120, "Golpe final" , "Datos/personajes/Vegeta/Batalla/mover.gif", "Datos/personajes/Vegeta/Caminar/1.png", 957, 495, 500, 1));
		assertNotNull( escenario1.getPrimero());
		
	}
	
	/**
	 * metodo de prueba del metodo getPersonajeEscogido de la clase Jugador
	 */
	public void testGetPersonajeEscogido() {
		
		 
		assertTrue( escenario1.getPersonajeEscogido().equals("Goku"));
		
	}
	
	/**
	 * metodo de prueba del metodo setPersonajeEscogido de la clase Jugador
	 */
	public void testSetPersonajeEscogido() {
		
		 
		 escenario1.setPersonajeEscogido("Vegeta");
		assertTrue( escenario1.getPersonajeEscogido().equals("Vegeta"));
		
	}
	
	/**
	 * metodo de prueba del metodo getNombre de la clase Jugador
	 */
	public void testGetNombre() {
		 
		 
		assertTrue( escenario1.getNombre().equals("Aleja"));
		
	}
	
	/**
	 * metodo de prueba del metodo setNombre de la clase Jugador
	 */
	public void testSetNombre() {
		
		 
		 escenario1.setNombre("Valentina");
		assertTrue( escenario1.getNombre().equals("Valentina"));
		
	}
	
	/**
	 * metodo de prueba del metodo getHeroe de la clase Jugador
	 */
	public void testGetHeroe() {
		
		 
		assertNotNull( escenario1.getHeroe("Broly"));
		
		
	}
	
	/**
	 * metodo de prueba del metodo ordenarPersonajes de la clase Jugador
	 */
	public void testOrdenarPersonajes() {
		
		 
		assertNotNull( escenario1.ordenarPersonajes());
		
	}
	
	/**
	 * metodo de prueba del metodo buscarBinario de la clase Jugador
	 */
	public void testBuscarBinario() {
		
		 
		assertNull( escenario1.buscarBinario("Aleja"));
		
	}
	
	/**
	 * metodo de prueba del metodo localizarUltimoPersonaje de la clase Jugador
	 */
	public void testLocalizarUltimoPersonaje() {
		
		 
		assertNotNull( escenario1.localizarUltimoPersonaje());
		
	}
	
	
	
	

}
