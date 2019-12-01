package mundo;

/**
 * clase Heroes
 */
public class Heroes extends Personajes{
	
	/**
	 * Constante de tipo String que representa la extencion de las imagenes del personaje
	 */
	public static final String EXT = ".png";
	/**
	 * constante de tipo String que representa parte de la ruta donde se encuentran las imagenes del personaje
	 */
	public static final String RUTA = "Datos/personajes/";
	/**
	 * Constante de tipo String que representa el movimiento hacia abajo del personaje
	 */
	public static final String DOWN = "1";
	/**
	 * constante de tipo String que representa el movimiento hacia arriba del personaje
	 */
	public static final String UP = "4";
	/**
	 * constante de tipo String que representa el movimiento hacia la derecha del personaje
	 */
	public static final String RIGHT = "7";
	/**
	 * constante de tipo String que representa el movimiento hacia la izquierda del personaje
	 */
	public static final String LEFT = "10";
	/**
	 * atributo de tipo int que representa el valor del ataque Especial del personaje
	 */
	private int ataqueEspecial;
	/**
	 * atributo de tipo String que representa el nombre del ataque especial del personaje
	 */
	private String nomAtaqueEspecial;
	/**
	 * atributo de tipo String que representa la ruta donde se encuentran las imagenes del movimiento del personaje en el mapa
	 */
	private String rutaCamina;
	/**
	 * atributo de tipo int que representa la imagen actual del personaje en el mapa
	 */
	private int imagenActual;
	/**
	 * atributo de tipo int que representa la posicion en X del personaje en el mapa
	 */
	private int posX;
	/**
	 * atributo de tipo int que representa la posicion en Y del personaje en el mapa
	 */
	private int posY;
	/**
	 * atributo de tipo boolean que representa si el usuario ha terminado o no la batalla con un villano
	 */
	private boolean terminado;
	/**
	 * atributo de tipo int que representa la posicion en Y del personaje en el campo de batalla  
	 */
	private int posYbatalla;
	
	/**
	 * Constructor de la clase Heroe
	 * @param nombre: String que representa el nombre del personaje
	 * @param ataque1: int que representa el poder del ataque1
	 * @param nomAtaque1: String que representa el nombre del ataque1
	 * @param ataque2: int que representa el poder del ataque2
	 * @param nomAtaque2: String que representa el nombre del ataque2
	 * @param ataque3: int que representa el poder del ataque3
	 * @param nomAtaque3: String que representa el nombre del ataque3
	 * @param ataqueEspecial: int que representa el poder del ataque especial
	 * @param nomAtaqueEspecial: String que representa el nombre del ataque especial
	 * @param rutaBatalla: String que representa la ruta donde se encuentran las imagenes de batalla del personaje
	 * @param rutaCamina: String que representa la ruta donde se encuentran las imagenes de batalla del personaje
	 * @param posX: int que representa la posicion en X del personaje en el mapa
	 * @param posY: int que representa la posicion en Y del personaje en el mapa
	 * @param vida: int que representa la vida del personaje en una batalla
	 * @param imagenActual: int que representa la imagen actual del personaje en el mapa
	 */
	public Heroes(String nombre, int ataque1, String nomAtaque1, int ataque2, String nomAtaque2, int ataque3, String nomAtaque3, int ataqueEspecial, String nomAtaqueEspecial, String rutaBatalla, String rutaCamina, int posX, int posY, int vida, int imagenActual) {
		
		super(nombre, ataque1, nomAtaque1, ataque2, nomAtaque2, ataque3, nomAtaque3, rutaBatalla, vida);
		
		this.ataqueEspecial = ataqueEspecial;
		this.nomAtaqueEspecial = nomAtaqueEspecial;
		this.rutaCamina = rutaCamina;
		this.posX = posX;
		this.posY = posY;
		this.imagenActual = imagenActual;
		this.posYbatalla = 250;
		
		
	}
	
	/**
	 * metodo que devuelve el valor del atributo posX
	 * @return posX
	 */
	public int getPosX() {
		return posX;
	}


	/**
	 * metodo que modifica el valor del atributo posX
	 * @param posX
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}


	/**
	 * metodo que devuelve el valor del atributo posY
	 * @return posY
	 */
	public int getPosY() {
		return posY;
	}


	/**
	 * metodo que modifica el valor del atributo posY
	 * @param posY
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}

	@Override
	public int getVida() {
		return vida;
	}

	/**
	 * metodo que modifica la vida del personaje
	 * @param vida
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}

	

	/**
	 * metodo que devuelve el valor del atributo posYbatalla
	 * @return posYbatalla
	 */
	public int getPosYbatalla() {
		return posYbatalla;
	}

	/**
	 * metodo que modifica el valor del atributo posYbatalla
	 * @param posYbatalla
	 */
	public void setPosYbatalla(int posYbatalla) {
		this.posYbatalla = posYbatalla;
	}

	/**
	 * metodo que devuelve el valor del atributo rutaCamina
	 * @return
	 */
	public String getRutaCamina() {
		return rutaCamina;
	}

	/**
	 * metodo que modifica el valor del atributo rutaCamina
	 * @param rutaCamina
	 */
	public void setRutaCamina(String rutaCamina) {
		this.rutaCamina = rutaCamina;
	}

	/**
	 * metodo que devuelve el valor del atributo ataqueEspecial
	 * @return ataqueEspecial
	 */
	public int getAtaqueEspecial() {
		return ataqueEspecial;
	}

	/*
	 * metodo que modifica el valor del atributo ataqueEspecial
	 *  @Param: ataqueEspecial
	 */
	public void setAtaqueEspecial(int ataqueEspecial) {
		this.ataqueEspecial += ataqueEspecial;
	}

	/**
	 * metodo que devuelve el valor del atributo nomAtaqueEspecial
	 * @return nomAtaqueEspecial
	 */
	public String getNomAtaqueEspecial() {
		return nomAtaqueEspecial;
	}

	/**
	 * metodo que modifica el valor del atributo nomAtaqueEspecial
	 * @param nomAtaqueEspecial
	 */
	public void setNomAtaqueEspecial(String nomAtaqueEspecial) {
		this.nomAtaqueEspecial = nomAtaqueEspecial;
	}
	
	/*
	 * metodo que realiza el movimiento hacia arriba del personaje en el mapa
	 */
	public void moverArribaMapa() {
		
		posY -=3;
		
	}
	
	/**
	 * metodo que realiza el movimiento hacia abajo del personaje en el mapa
	 */
	public void moverAbajoMapa() {
		
		posY +=3;
		
	}
	
	/**
	 * metodo que realiza el movimiento hacia la derecha del personaje en el mapa
	 */
	public void moverDerechaMapa() {
		
		posX +=3;
		
	}
	
	/**
	 * metodo que realiza el movimiento a la izquierda del personaje en el mapa
	 */
	public void moverIzquierdaMapa() {
		
		posX -=3;
		
	}
	
	
	/**
	 * metodo que establece los limites en el borde superior de la pantalla
	 * @return boolean que establece si el personaje se encuentra en esa posicion
	 */
	public boolean limitesArriba() {
		
		boolean retorno = false;
		
		//Montaña atajo
		if(posX <= 100 && posY >= 70 && posY <= 102) {
					
			retorno = true;	
					
		}
		
		//Montaña 2
		else if(posY >= 160 && posY <= 165 && posX >= 255 && posX <= 334 || posY >= 160 && posY <= 165 && posX >= 343 && posX <= 557) {
			
			retorno = true;
			
		}
		
		//Casa Montaña
		else if(posY >= 87 && posY <= 90 && posX >= 343 && posX <= 570) {
			
			retorno = true;
			
		}
		
		//Montaña 2.1
		else if(posY >= 138 && posY <= 143 && posX >= 580 && posX <= 607) {
			
			retorno = true;
			
		}
		
		//Casa frente atajo 1
		else if(posY >= 225 && posY <= 230 && posX >= 95 && posX <= 198) {
			
			retorno = true;
			
		}
		
		//Casa 2
		else if(posY >= 428 && posY <= 433 && posX >= 243 && posX <= 371) {
			
			retorno = true;
			
		}
		
		//Casa3
		else if(posY >= 418 && posY <= 423 && posX >= 430 && posX <= 530) {
			
			retorno = true;
			
		}
		
		//Casa4
		else if(posY >= 578 && posY <= 583 && posX >= 440 && posX <= 543) {
			
			retorno = true;
			
		}
		
		//Casa5
		else if(posY >= 407 && posY <= 412 && posX >= 577 && posX <= 680) {
			
			retorno = true;
			
		}
		
		//Casa6
		else if(posY >= 268 && posY <= 273 && posX >= 590 && posX <= 690) {
			
			retorno = true;
			
		}
		
		else if(posY >= 485 && posY <= 490 && posX >= 750 && posX <= 808) {
			
			retorno = true;
			
		}
		
		return retorno;
	}
	
	/**
	 * metodo que establece los limites en el borde inferior de la pantalla
	 * @return boolean que establece si el personaje se encuentra en esa posicion
	 */
	public boolean limitesAbajo() {
		
		boolean retorno = false;
		
		//Casa montaña
		if(posY >= 32 && posY <= 37 && posX >= 343 && posX <= 570) {
			
			retorno = true;
			
		}
		
		//Montaña
		else if(posY >= 121 && posY <= 126 && posX >= 255 && posX <= 334 || posY >= 121 && posY <= 126 && posX >= 343 && posX <= 557) {
			
			retorno = true;
			
		}
		
		//Montaña 2.1
		else if(posY >= 105 && posY <= 110 && posX >= 580 && posX <= 607) {
			
			retorno = true;
			
		}
		
		//Casa frente a atajo
		else if(posY >= 148 && posY <= 153 && posX >= 95 && posX <= 198) {
			
			retorno = true;
			
		}
		
		//Casa2
		else if(posY >= 370 && posY <= 375 && posX >= 243 && posX <= 371) {
			
			retorno = true;
			
		}
		
		//Casa3
		else if(posY >= 340 && posY <= 345 && posX >= 430 && posX <= 530) {
			
			retorno = true;
			
		}
		
		//Casa4
		else if(posY >= 468 && posY <= 473 && posX >= 440 && posX <= 543) {
			
			retorno = true;
			
		}
		
		//Casa5
		else if(posY >= 330 && posY <= 335 && posX >= 577 && posX <= 680) {
			
			retorno = true;
			
		}
		
		//Casa6
		else if(posY >= 190 && posY <= 195 && posX >= 590 && posX <= 690) {
			
			retorno = true;
			
		}
		
		//Rio1
		else if(posY >= 33 && posY <= 38 && posX >= 724 && posX <= 832) {
			
			retorno = true;
			
		}
		
		//Rio2
		else if(posY >= 170 && posY <= 175 && posX >= 590 && posX <= 690) {
			
			retorno = true;
			
		}
		
		return retorno;
	}
	
	/**
	 * metodo que establece los limites en el borde Derecho de la pantalla
	 * @return boolean que establece si el personaje se encuentra en esa posicion
	 */
	public boolean limitesDerecha() {
		
		boolean retorno = false;
		
		//Montaña1
		if(posY >= 120 && posY <= 165 && posX >= 255 && posX <= 260 || posY >= 120 && posY <= 165 && posX >= 343 && posX <= 348) {
			
			retorno = true;
			
		}
		
		//Casa Montaña
		else if(posY >= 31 && posY <= 104 && posX >= 343 && posX <= 348) {
			
			retorno = true;
			
		}
		
		//Montaña2.1
		else if(posY >= 97 && posY <= 143 && posX >= 580 && posX <= 585) {
			
			retorno = true;
			
		}
		
		//Casa frente atajo
		else if(posY >= 147 && posY <= 230 && posX >= 95 && posX <= 100) {
			
			retorno = true;
			
		}
		
		//Casa2---
		else if(posY >= 338 && posY <= 433 && posX >= 243 && posX <= 248) {
			
			retorno = true;
			
		}
		
		//Casa3
		else if(posY >= 340 && posY <= 421 && posX >= 430 && posX <= 435) {
			
			retorno = true;
			
		}
		
		//Casa4
		else if(posY >= 468 && posY <= 582 && posX >= 440 && posX <= 445) {
			
			retorno = true;
			
		}
		
		//Casa5
		else if(posY >= 330 && posY <= 411 && posX >= 577 && posX <= 582) {
			
			retorno = true;
					
		}
				
		//Casa6
		else if(posY >= 190 && posY <= 272 && posX >= 590 && posX <= 595) {
					
			retorno = true;
					
		}
		
		//Rio1
		else if(posY >= 62 && posY <= 134 && posX >= 690 && posX <= 695 || posY >= 147 && posY <= 233 && posX >= 738 && posX <= 743 || posY >= 220 && posY <= 468 && posX >= 717 && posX <= 722) {
			
			retorno = true;
			
		}
		
		//Rio2
		else if(posY >= 198 && posY <= 401 && posX >= 1100 && posX <= 1105) {
			
			retorno = true;
			
		}
		
		return retorno;
	}
	
	/**
	 * metodo que establece los limites en el borde izquierdo de la pantalla
	 * @return boolean que establece si el personaje se encuentra en esa posicion
	 */
	public boolean limitesIzquierda() {
		
		boolean retorno = false;
		
		//Montaña1
		if(posY >= 120 && posY <= 165 && posX >= 329 && posX <= 334 || posY >= 120 && posY <= 165 && posX >= 553 && posX <= 558) {
			
			retorno = true;
			
		}
		
		//Casa Montaña
		else if(posY >= 31 && posY <= 104 && posX >= 565 && posX <= 570) {
			
			retorno = true;
			
		}
		
		//Montaña2.1
		else if(posY >= 97 && posY <= 143 && posX >= 602 && posX <= 607) {
			
			retorno = true;
			
		}
		
		//Casa frente atajo
		else if(posY >= 147 && posY <= 230 && posX >= 193 && posX <= 198) {
			
			retorno = true;
			
		}
		
		//Casa2---
		else if(posY >= 338 && posY <= 433 && posX >= 366 && posX <= 371) {
			
			retorno = true;
			
		}
		
		//Casa3
		else if(posY >= 340 && posY <= 421 && posX >= 527 && posX <= 532) {
			
			retorno = true;
			
		}
		
		//Casa4
		else if(posY >= 468 && posY <= 582 && posX >= 539 && posX <= 544) {
			
			retorno = true;
			
		}
		
		//Casa5
		else if(posY >= 330 && posY <= 411 && posX >= 675 && posX <= 680) {
			
			retorno = true;
					
		}
				
		//Casa6
		else if(posY >= 190 && posY <= 272 && posX >= 687 && posX <= 692) {
					
			retorno = true;
					
		}
		
		//Rio1
		else if(posY >= 100 && posY <= 125 && posX >= 875 && posX <= 880 || posY >= 194 && posY <= 222 && posX >= 861 && posX <= 866 || posY >= 240 && posY <= 465 && posX >= 833 && posX <= 838) {
			
			retorno = true;
					
		}
		
		//Rio2
		else if(posY >= 228 && posY <= 453 && posX >= 1237 && posX <= 1242) {
			
			retorno = true;
					
		}
		
		return retorno;
		
	}
	
	/**
	 * metodo que verifica si el personaje se encuentra en la coordenada establecida como atajo y modifica su posicion
	 */
	public void atajos() {
		
		
		if(posX >= 110 && posX <=156 && posY >= 89 && posY <= 106) {
			
			posX = 957;
			posY = 495;
			
		}
		
		else if(posX >= 964 && posX <= 1011 && posY >= 446 && posY <= 458) {
			
			posX = 204;
			posY = 117;
			
		}
		
		
	}
	
	/**
	 * metodo que establece la accion a realizar al encontrarse en los bordes derecho o izquierdo
	 */
	public void limiteX() {
		
		posX +=0;
		
	}
	
	/*
	 *metodo que establece la accion a realizar al encontrarse en los bordes derecho o izquierdo
	 */
	public void limiteY() {
		
		posY += 0;
		
	}
	
	/**
	 * metodo que ejecuta el ataque 1 del personaje Goku
	 */
	public void GokuAtaque1() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/Batalla/mover.gif")) {
			
			posYbatalla = 235;
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 14 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 15 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 15 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 16 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 16 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 17 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 17 + EXT)) {
			
			terminado = true;
			posYbatalla = 250;
			setRutaBatalla(RUTA + nombre + "/Batalla/mover.gif");
			
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque 2 del personaje Goku
	 */
	public void GokuAtaque2() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/Batalla/mover.gif")) {
			
			posYbatalla = 140;
			
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 14 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 15 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 15 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 16 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 16 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 17 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 17 + EXT)) {
			terminado = true;
			posYbatalla = 250;
			setRutaBatalla(RUTA + nombre + "/Batalla/mover.gif");
			
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque 1 del personaje Vegeta
	 */
	public void VegetaAtaque1() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/Batalla/mover.gif")) {
			
		
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 8 + EXT)) {
			
			terminado = true;
		
			setRutaBatalla(RUTA + nombre + "/Batalla/mover.gif");
			
		}
		
	}
	
	/**
	 * metodo que ejecuta el ataque 2 del personaje Vegeta
	 */
	public void VegetaAtaque2() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/Batalla/mover.gif")) {
			
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 14 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 15 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 15 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 16 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 16 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 17 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 17 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 18 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 18 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 19 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 19 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 20 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 20 + EXT)) {
			terminado = true;

			setRutaBatalla(RUTA + nombre + "/Batalla/mover.gif");
		}
	}
	
	
	/**
	 * metodo que ejecuta el ataque 1 del personaje Roshi
	 */
	public void RoshiAtaque1() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/Batalla/mover.gif")) {
			
			posYbatalla = 320;
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque1/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque1/" + 10 + EXT)) {
			
			terminado = true;
			posYbatalla = 250;
			setRutaBatalla(RUTA + nombre + "/Batalla/mover.gif");
			
		}
		
	}
	
	
	/**
	 * metodo que ejecuta el ataque 2 del personaje Roshi
	 */
	public void RoshiAtaque2() {
		
		if(rutaBatalla.equals(RUTA + nombre + "/Batalla/mover.gif")) {
			
		
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 1 + EXT);
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 1 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 2 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 2 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 3 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 3 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 4 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 4 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 5 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 5 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 6 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 6 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 7 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 7 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 8 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 8 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 9 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 9 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 10 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 10 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 11 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 11 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 12 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 12 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 13 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 13 + EXT)) {
			setRutaBatalla(RUTA + nombre + "/Batalla/" + "Ataque2/" + 14 + EXT);
			
		}else if(rutaBatalla.equals(RUTA + nombre + "/Batalla/" + "Ataque2/" + 14 + EXT)) {
			
			terminado = true;
		
			setRutaBatalla(RUTA + nombre + "/Batalla/mover.gif");
			
		}
		
	}
	
	
	/**
	 * metodo que retorna el valor del atributo terminado
	 * @return terminado
	 */
	public boolean isTerminado() {
		return terminado;
	}

	/**
	 * metodo que modifica el valor del atributo terminado
	 * @param terminado
	 */
	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}

	/**
	 * metodo que cambia la imagen del personaje cuando se mueve en el mapa
	 * @param String direccion que representa la direccion a la cual se mueve el personaje
	 */
	public void cambiarImagen(String direccion) {
		
		
		if(direccion.equals(DOWN)) {
			
			if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + UP + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "5" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "6" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + LEFT + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "11" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "12" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + RIGHT + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "8" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "9" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + DOWN + EXT);
				
			}
			
			else if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + DOWN + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + "2" + EXT);
				
			}
			
			else if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + "2" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + "3" + EXT);
				
			}
			
			else if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + "3" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + DOWN + EXT);
				 
				
			}
			
			
		}
		
		else if(direccion.equals(LEFT)) {
			
			if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + UP + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "5" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "6" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + DOWN + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "2" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "3" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + RIGHT + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "8" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "9" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + LEFT + EXT);
				
			}
			
			else if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + LEFT + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + "11" + EXT);
				
				
			}
			
			else if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + "11" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + "12" + EXT);
				
			}
			
			else if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + "12" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + LEFT + EXT);
				
			}	
			
		}
		
		else if(direccion.equals(RIGHT)) {
			
			if(rutaCamina.equalsIgnoreCase(RUTA + nombre + "/Caminar/" + UP + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "5" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "6" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + LEFT + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "11" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "12" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + DOWN + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "2" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "3" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + RIGHT + EXT);
				
			}
			
			else if(rutaCamina.equalsIgnoreCase(RUTA + nombre + "/Caminar/" + RIGHT + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + "8" + EXT);
				
			}
			
			else if(rutaCamina.equalsIgnoreCase(RUTA + nombre + "/Caminar/" + "8" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + "9" + EXT);
				
			}
			
			else if(rutaCamina.equalsIgnoreCase(RUTA + nombre + "/Caminar/" + "9" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + RIGHT + EXT);
				
			}
			
		}
		
		else if(direccion.equals(UP)) {
			
			if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + DOWN + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "2" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "3" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + LEFT + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "11" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "12" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + RIGHT + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "8" + EXT) || rutaCamina.equals(RUTA + nombre + "/Caminar/" + "9" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + UP + EXT);
				
			}
			
			else if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + UP + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + "5" + EXT);
				
			}
			
			else if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + "5" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + "6" + EXT);
				
			}
			
			else if(rutaCamina.equals(RUTA + nombre + "/Caminar/" + "6" + EXT)) {
				
				setRutaCamina(RUTA + nombre + "/Caminar/" + UP + EXT);
				
			}
			
		}
		
		
	}
	
	/**
	 * metodo que realiza el movimiento del personaje a traves del mapa modificando su posicion
	 * @param String direccion que indica la direccion a la cual se mueve el personaje
	 */
	public void moverse(String direccion) {
		
		if(direccion.equals(UP)) {	
			
			if(posY <= 0) {
			
				limiteY();
				cambiarImagen(direccion);
				
			}
			
			else if(limitesArriba() == true) {
				
				limiteY();
				cambiarImagen(direccion);
				
			}
			
			else {
				
				moverArribaMapa();
				cambiarImagen(direccion);
				
			}
			
		}
		
		else if(direccion.equals(DOWN)) {
			
			if( posY >= 593) {
				
				limiteY();
				cambiarImagen(direccion);
				
			}
			
			else if(limitesAbajo() == true) {
				
				limiteY();
				cambiarImagen(direccion);
				
			}
			
			else {

				moverAbajoMapa();
				cambiarImagen(direccion);
				
			}
			
		}
		
		else if(direccion.equals(RIGHT)) {
			
			
			if(posX >= 1270) {
				
				limiteX();
				cambiarImagen(direccion);
				
			}
			
			else if(limitesDerecha() == true) {
				
				limiteX();
				cambiarImagen(direccion);
				
			}
			
			else {
				
				moverDerechaMapa();
				cambiarImagen(direccion);
				
			}
			
			
		}
		
		else if(direccion.equals(LEFT)) {
			
			if( posX <=60) {
			
			limiteX();
			cambiarImagen(direccion);
			
		}
		
		else if(limitesIzquierda() == true) {
			
			limiteX();
			cambiarImagen(direccion);
			
		}
		
		else {
			
			moverIzquierdaMapa();
			cambiarImagen(direccion);
			
		}
			
		}
		
	}
	
	/**
	 * metodo que modifica el atributo vida
	 * @param vida
	 */
	public void setVida1(int vida) {
		this.vida -= vida;
	}


}
