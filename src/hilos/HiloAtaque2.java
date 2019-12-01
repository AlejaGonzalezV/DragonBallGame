package hilos;

import interfaz.PanelBatalla;
import mundo.Heroes;
/**
 * Clase HiloAtaque2 que extiende de Thread
 */
public class HiloAtaque2 extends Thread{

	/**
	 * Atributo de tipo PanelBatalla que representa la relacion con la clase PanelBatalla
	 */
	private PanelBatalla batalla;
	/**
	 *Atributo de tipo Heroes que representa la relacion con la clase Heroes
	 */
	private Heroes heroe;
	
	/**
	 * Constructor de la clase HiloAtaque2
	 * @param batalla
	 * @param heroe
	 */
	public HiloAtaque2(PanelBatalla batalla,  Heroes heroe) {
		
		this.batalla = batalla;
		this.heroe = heroe;
	}
	
	@Override
	public void run() {
		
		while(heroe.isTerminado()== false){
			
			if(heroe.getNombre().equals("Goku")) {
				heroe.GokuAtaque2();
			}else if(heroe.getNombre().equals("Vegeta")) {
				
				heroe.VegetaAtaque2();
			}else if(heroe.getNombre().equals("Roshi")) {
				heroe.RoshiAtaque2();
				
			}
			
		try {
			
			Thread.sleep(80);
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}
		
		batalla.actualizarfondo();
	}
	}
}
