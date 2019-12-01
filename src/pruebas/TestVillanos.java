package pruebas;

import junit.framework.TestCase;
import mundo.Villanos;
/**
 * Clase TestVillanos que extiende de TestCase
 */
public class TestVillanos extends TestCase{
	
	Villanos escenario1 = new Villanos("Cell", 100, "Fuego rápido", 120, "Cañón cósmico", 130, "Abrazo de oso", "Datos/personajes/Cell/mover.gif", 500, 5, "Datos/esferas/5.png", "¡Necio! ¿¡No te das cuenta que estás peleando contra el arma perfecta?!");

	/**
	 * metodo de prueba del metodo getEsferaEntrega de la clase Villanos
	 */
	public void testGetEsferaEntrega() {
		
		assertTrue(escenario1.getEsferaEntrega() == 5);
		
	}
	
	/**
	 * metodo de prueba del metodo setEsferaEntrega de la clase Villanos
	 */
	public void testSetEsferaEntrega() {
		
		escenario1.setEsferaEntrega(1);
		assertTrue(escenario1.getEsferaEntrega() == 1);
		
	}
	
	/**
	 * metodo de prueba del metodo getRutaEsfera de la clase Villanos
	 */
	public void testGetRutaEsfera() {
		
		assertTrue(escenario1.getRutaEsfera().equals("Datos/esferas/5.png"));	
	}
	
	/**
	 * metodo de prueba del metodo setRutaEsfera de la clase Villanos
	 */
	public void testSetRutaEsfera() {
		
		escenario1.setRutaEsfera("Ruta");
		assertTrue(escenario1.getRutaEsfera().equals("Ruta"));
		
	}
	
	/**
	 * metodo de prueba del metodo getFrasePelea de la clase Villanos
	 */
	public void testGetFrasePelea() {
		
		assertTrue(escenario1.getFrasePelea().equals("¡Necio! ¿¡No te das cuenta que estás peleando contra el arma perfecta?!"));
		
	}
	
	/**
	 * metodo de prueba del metodo setFrasePelea de la clase Villanos
	 */
	public void testSetFrasePelea() {
		
		escenario1.setFrasePelea("Hola");
		assertTrue(escenario1.getFrasePelea().equals("Hola"));
		
	}
	
	/**
	 * metodo de prueba del metodo isTerminado de la clase Villanos
	 */
	public void testIsTerminado() {
		
		assertTrue(escenario1.isTerminado() == false);
		
	}
	
	/**
	 * metodo de prueba del metodo setTerminado de la clase Villanos
	 */
	public void testSetTerminado() {
		
		escenario1.setTerminado(true);
		assertTrue(escenario1.isTerminado() == true);
		
	}
	
	/**
	 * metodo de prueba del metodo getPosYbatalla de la clase Villanos
	 */
	public void testGetPosYbatalla() {
		
		assertTrue(escenario1.getPosYbatalla() != 0);
		
	}
	
	/**
	 * metodo de prueba del metodo setPosYbatalla de la clase Villanos
	 */
	public void testSetPosYbatalla() {
		
		escenario1.setPosYbatalla(1);
		assertTrue(escenario1.getPosYbatalla() == 1);
		
	}
	
	/**
	 * metodo de prueba del metodo getPosXbatalla de la clase Villanos
	 */
	public void testGetPosXbatalla() {
		
		assertTrue(escenario1.getPosXbatalla() != 0);
		
	}
	
	/**
	 * metodo de prueba del metodo setPosXbatalla de la clase Villanos
	 */
	public void testSetPosXbatalla() {
		
		escenario1.setPosXbatalla(1);
		assertTrue(escenario1.getPosXbatalla() == 1);
		
	}
	
	/**
	 * metodo de prueba del metodo ataqueAleatorio de la clase Villanos
	 */
	public void testAtaqueAleatorio() {
		
		int numero = escenario1.ataqueAleatorio();
		assertTrue(numero < 4 && numero > 0);
		
	}
	
	/**
	 * metodo de prueba del metodo setVida1 de la clase Villanos
	 */
	public void testSetVida1() {
		
		escenario1.setVida1(10);
		assertTrue(escenario1.getVida() == 490);
		
	}
	
	/**
	 * metodo de prueba del metodo setVida de la clase Villanos
	 */
	public void testSetVida() {
		
		escenario1.setVida(70);
		assertTrue(escenario1.getVida() == 70);
		
	}
	
}
