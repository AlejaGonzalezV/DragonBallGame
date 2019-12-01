package hilos;

import interfaz.PanelBatalla;
import mundo.Villanos;
/**
 * Clase HiloVillanoAtaque1 que extiende de Thread
 */
public class HiloVillanoAtaque1 extends Thread{
	
	/**
	 * Atributo de tipo PanelBatalla que representa la relacion con la clase PanelBatalla
	 */
	private PanelBatalla batalla;
	/**
	 * Atributo de tipo Villanos que representa la relacion con la clase Villanos
	 */
	private Villanos villano;
	/**
	 * Atributo de tipo int que representa el tiempo de pausa del hilo
	 */
	private int sleep;
	
	/**
	 * Constructor de la clase HiloVillanoAtaque1
	 * @param batalla
	 * @param villano
	 */
	public HiloVillanoAtaque1(PanelBatalla batalla, Villanos villano) {
		this.villano = villano;
		this.batalla = batalla;
		sleep = 60;
	}
	
	@Override
	public void run() {
		
		while(villano.isTerminado() == false) {
			
			if(villano.getNombre().equals("Cell")) {
				
				villano.CellAtaque1();
			}else if(villano.getNombre().equals("Freezer")) {
				
				villano.FreezerAtaque1();
			}else if(villano.getNombre().equals("Majin boo")) {
				
				villano.MajinBAtaque1();
			}else if(villano.getNombre().equals("Broly")) {
				sleep = 100;
				villano.BrolyAtaque1();
			}
			
			try {
				
				Thread.sleep(sleep);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			batalla.actualizarfondo();
		}
		
		batalla.habilitarbotones();
	}

}
