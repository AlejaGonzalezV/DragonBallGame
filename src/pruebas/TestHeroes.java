package pruebas;

import junit.framework.TestCase;
import mundo.Heroes;
/**
 * Clase TestHeroes que extiende de TestCase
 */
public class TestHeroes extends TestCase{
	
	Heroes escenario1 = new Heroes("Roshi", 50 , "Mafuba", 60, "Bankoku Bikkuri Sho", 90, "Onda de Ki", 120, "Kame hame ha", "Datos/personajes/Roshi/Batalla/", "Datos/personajes/Roshi/Caminar/1.png", 957, 495, 500, 1);
	
	/**
	 * metodo de prueba del metodo getPosX de la clase Heroes
	 */
	public void testGetPosX() {
		
		assertTrue(escenario1.getPosX() == 957);
		
	}
	
	/**
	 * metodo de prueba del metodo setPosX de la clase Heroes
	 */
	public void testSetPosX() {
		
		escenario1.setPosX(10);
		assertTrue(escenario1.getPosX() == 10);
		
	}
	
	/**
	 * metodo de prueba del metodo getPosY de la clase Heroes
	 */
	public void testGetPosY() {
		
		assertTrue(escenario1.getPosY() == 495);
		
	}
	
	/**
	 * metodo de prueba del metodo setPosY de la clase Heroes
	 */
	public void testSetPosY() {
		
		escenario1.setPosY(10);
		assertTrue(escenario1.getPosY() == 10);
		
	}
	
	/**
	 * metodo de prueba del metodo getPosYbatalla de la clase Heroes
	 */
	public void testGetPosYbatalla() {
		
		assertTrue(escenario1.getPosYbatalla() == 250);
		
	}
	
	/**
	 * metodo de prueba del metodo getPosYbatalla de la clase Heroes
	 */
	public void testSetPosYbatalla() {
		
		escenario1.setPosYbatalla(10);
		assertTrue(escenario1.getPosYbatalla() == 10);
		
	}
	
	/**
	 * metodo de prueba del metodo getRutaBatalla de la clase Heroes
	 */
	public void testGetRutaCamina() {
		
		assertTrue(escenario1.getRutaCamina().equals("Datos/personajes/Roshi/Caminar/1.png"));
		
	}
	
	/**
	 * metodo de prueba del metodo setRutaBatalla de la clase Heroes
	 */
	public void testSetRutaCamina() {
		
		escenario1.setRutaCamina("Ruta");
		assertTrue(escenario1.getRutaCamina().equals("Ruta"));
		
	}
	
	/**
	 * metodo de prueba del metodo getAtaqueEspecial de la clase Heroes
	 */
	public void testGetAtaqueEspecual() {
		
		assertTrue(escenario1.getAtaqueEspecial() == 120);
		
	}
	
	/**
	 * metodo de prueba del metodo setAtaqueEspecial de la clase Heroes
	 */
	public void testSetAtaqueEspecial() {
		
		escenario1.setAtaqueEspecial(10);
		assertTrue(escenario1.getAtaqueEspecial() == 130);
		
	}
	
	/**
	 * metodo de prueba del metodo getNomAtaqueEspecial de la clase Heroes
	 */
	public void testGetNomAtaqueEspecial() {
		
		assertTrue(escenario1.getNomAtaqueEspecial().equals("Kame hame ha"));
		
	}
	
	/**
	 * metodo de prueba del metodo setNomAtaqueEspecial de la clase Heroes
	 */
	public void testSetNomAtaqueEspecial() {
		
		escenario1.setNomAtaqueEspecial("at");
		assertTrue(escenario1.getNomAtaqueEspecial().equals("at"));
		
	}
	
	/**
	 * metodo de prueba del metodo moverArribaMapa de la clase Heroes
	 */
	public void testMoverArribaMapa() {
		
		escenario1.moverArribaMapa();
		assertTrue(escenario1.getPosY() == 492);
		
	}
	
	/**
	 * metodo de prueba del metodo moverAbajoMapa de la clase Heroes
	 */
	public void testMoverAbajoMapa() {
		
		escenario1.moverAbajoMapa();
		assertTrue(escenario1.getPosY() == 498);
		
	}
	
	/**
	 * metodo de prueba del metodo moverDerechaMapa de la clase Heroes
	 */
	public void testMoverDerechaMapa() {
		
		escenario1.moverDerechaMapa();
		assertTrue(escenario1.getPosX() == 960);
		
	}
	
	/**
	 * metodo de prueba del metodo moverIzquierdaMapa de la clase Heroes
	 */
	public void testMoverIzquierdaMapa() {
		
		escenario1.moverIzquierdaMapa();
		assertTrue(escenario1.getPosX() == 954);
		
	}
	
	/**
	 * metodo de prueba del metodo limitesArriba de la clase Heroes
	 */
	public void testLimitesArriba() {
		
		escenario1.setPosX(100);
		escenario1.setPosY(70);
		assertTrue(escenario1.limitesArriba() == true);
		
	}
	
	/**
	 * metodo de prueba del metodo limitesAbajo de la clase Heroes
	 */
	public void testLimitesAbajo() {
		
		escenario1.setPosX(343);
		escenario1.setPosY(32);
		assertTrue(escenario1.limitesAbajo() == true);
		
	}

	/**
	 * metodo de prueba del metodo limitesDerecha de la clase Heroes
	 */
	public void testLimitesDerecha() {
		
		escenario1.setPosX(255);
		escenario1.setPosY(165);
		assertTrue(escenario1.limitesDerecha() == true);
		
	}
	
	/**
	 * metodo de prueba del metodo limitesIzquierda de la clase Heroes
	 */
	public void testLimitesIzquierda() {
		
		escenario1.setPosX(329);
		escenario1.setPosY(165);
		assertTrue(escenario1.limitesIzquierda() == true);
		
	}
	
	/**
	 * metodo de prueba del metodo atajos de la clase Heroes
	 */
	public void testAtajos() {
		
		escenario1.setPosX(110);
		escenario1.setPosY(89);
		escenario1.atajos();
		assertTrue(escenario1.getPosY() == 495 && escenario1.getPosX() == 957);
		
	}
	
	/**
	 * metodo de prueba del metodo isTerminado de la clase Heroes
	 */
	public void testIsTerminado() {
		
		assertTrue(escenario1.isTerminado() == false);
		
	}
	
	/**
	 * metodo de prueba del metodo setTerminado de la clase Heroes
	 */
	public void testSetTerminado() {
		
		escenario1.setTerminado(true);
		assertTrue(escenario1.isTerminado() == true);
		
	}
	
	/**
	 * metodo de prueba del metodo setVida de la clase Heroes
	 */
	public void testSetVida() {
		
		escenario1.setVida1(10);
		assertTrue(escenario1.getVida() == 490);
		
	}
	
	
	
}
