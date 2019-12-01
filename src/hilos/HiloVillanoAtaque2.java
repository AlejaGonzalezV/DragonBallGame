package hilos;

import interfaz.PanelBatalla;
import mundo.Villanos;
/**
 * Clase HiloVillanoAtaque2 que extiende de Thread
 */
public class HiloVillanoAtaque2 extends Thread {
	
	/**
	 * Atributo de tipo PanelBatalla que representa la relacion con la clase PanelBatalla
	 */
	private PanelBatalla batalla;
	/**
	 * Atributo de tipo Villanos que representa la relacion con la clase Villanos
	 */
	private Villanos villano;
	/**
	 * Atributo de tipo int que representa el tiempo de espera del hilo
	 */
	private int sleep;
	
	/**
	 * Constructor de la clase HIloVillanoAtaque2
	 * @param batalla
	 * @param villano
	 */
	public HiloVillanoAtaque2(PanelBatalla batalla, Villanos villano) {
		
		this.batalla = batalla;
		this.villano = villano;
		sleep = 60;
	}
	
	@Override
	public void run() {
		
		while(villano.isTerminado()== false) {
			
			if(villano.getNombre().equals("Cell")) {
				
				villano.CellAtaque2();
			}else if(villano.getNombre().equals("Freezer")) {
				
				villano.FreezerAtaque2();
			}else if(villano.getNombre().equals("Broly")) {
				villano.BrolyAtaque2();
				sleep = 120;
			}else if(villano.getNombre().equals("Majin boo")) {
				
					villano.MajinBAtaque2();
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
