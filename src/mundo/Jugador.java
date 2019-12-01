package mundo;

import java.io.Serializable;

/**
 * clase Jugador
 */
public class Jugador implements Serializable{
	
	/**
	 * atributo de tipo Personajes que representa la relacion con la clase Personajes
	 */
	private Personajes primero;
	/**
	 * atributo de tipo String que representa el nombre del jugador
	 */
	private String nombre;
	/**
	 * atributo de tipo String que representa el nombre del personaje escogido por el usuario
	 */
	private String personajeEscogido;
	/**
	 * atributo de tipo int que representa el numero de esferas que tiene el usuario
	 */
	private int numeroEsferas;
	/**
	 * arreglo de tipo Personajes donde se almacenan todos los personajes del juego
	 */
	private Personajes[] personajes;
	
	/*
	 * constructor de la clase Jugador
	 */
	public Jugador(String nombre, String personajeEscogido, Personajes personaje) {
		
		personajes = new Personajes[7];
		inicializarArray();
		this.personajeEscogido = personajeEscogido;
		this.nombre = nombre;
		this.primero = personaje;
		inicializarVillanos();
		inicializarHeroe(personajeEscogido);
		
	}
	
	/**
	 * metodo que devuelve el valor del arreglo personajes
	 * @return personajes
	 */
	public Personajes[] getPersonajes() {
		return personajes;
	}
	
	/**
	 * metodo que devuelve el valor del atributo numeroEsferas
	 * @return numeroEsferas
	 */
	public int getNumeroEsferas() {
		return numeroEsferas;
	}

	/**
	 * metodo que modifica el valor del atributo numeroEsferas
	 * @param numeroEsferas
	 */
	public void setNumeroEsferas(int numeroEsferas) {
		this.numeroEsferas += numeroEsferas;
	}

	/**
	 * metodo que devuelve la relacion con la clase Personajes
	 * @return primero
	 */
	public Personajes getPrimero() {
		return primero;
	}

	/**
	 * metodo que modifica la relacion con la clase Personajes 
	 * @param primero
	 */
	public void setPrimero(Personajes primero) {
		this.primero = primero;
	}

	/**
	 * metodo que retorna el atributo personajeEscogido
	 * @return personajeEscogido
	 */
	public String getPersonajeEscogido() {
		return personajeEscogido;
	}

	/**
	 * metodo que modifica el atributo personajeEscogido
	 * @param personajeEscogido
	 */
	public void setPersonajeEscogido(String personajeEscogido) {
		this.personajeEscogido = personajeEscogido;
	}

	/**
	 * metodo que devuelve la relacion con la clase Personajes
	 * @return
	 */
	public Personajes getPersonaje() {
		return primero;
	}

	/**
	 * metodo que modifica la relacion con la clase Personajes
	 * @param personaje
	 */
	public void setPersonaje(Personajes personaje) {
		this.primero = personaje;
	}

	/**
	 * metodo que devuelve el valor del atributo nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * metodo que modifica el valor del atributo nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * metodo que busca en la lista el heroe solicitado 
	 * @param nombrePersonaje: String que representa el nombre del herore solicitado
	 * @return atributo de tipo Heroe que representa el heroe solicitado
	 */
	public Personajes getHeroe(String nombrePersonaje) {
		
		Personajes actual = primero;	
			
		while(actual != null && actual.getNombre() != nombrePersonaje) {
				
			actual = actual.getSiguiente();
				
		}
			
			
		return actual;
		
	}
	
	/**
	 * metodo que ordena el arreglo personajes 
	 * @return
	 */
	public Personajes[] ordenarPersonajes() {
		
		 for( int i = 1; i < personajes.length; i++ ){
			 
			 for( int j = i; j > 0 && personajes[ j - 1 ].getNombre().compareToIgnoreCase(personajes[j].getNombre()) > 0; j-- ){
				 Personajes temp = personajes[ j ];
				 personajes[ j ] = personajes[ j - 1 ];
				 personajes[ j - 1 ] = temp;
			 }
		 }
		 
		 return personajes;
	}
	
	/**
	 * metodo que busca un personaje en el arreglo personajes 
	 * @param nombre
	 * @return
	 */
	public Personajes buscarBinario( String nombre ) {
	 boolean encontre = false;
	 int inicio = 0;
	 int fin = personajes.length - 1;
	 Personajes retorno = null;
	 
		 while( inicio <= fin && !encontre ) {
			 
			 int medio = ( inicio + fin ) / 2;
		 
				 if( personajes[ medio ].getNombre().equalsIgnoreCase(nombre) ) {
				
					retorno = personajes[medio];
					encontre = true;
				 
				 }
		 
				 else if( personajes[ medio ].getNombre().compareToIgnoreCase(nombre) > 0 ) {
					 
					 fin = medio - 1;
				 }
				 
				 else {
					 
					 inicio = medio + 1;
				 }
		 }
		 
	 return retorno;
	 
	}
	
	/**
	 * metodo que inicializa el heroe escogido por el usuario
	 * @param nombre
	 */
	public void inicializarHeroe(String nombre) {
		
		if(nombre.equalsIgnoreCase("goku")) {
			
			addPersonaje(new Heroes("Goku", 50, "Ráfaga de aura Saiyan", 60, "Genkidama", 90, "Puño del dragon", 120 , "Kame hame ha", "Datos/personajes/Goku/Batalla/mover.gif" , "Datos/personajes/Goku/Caminar/1.png" , 957, 495, 500, 1));
			
		}
		
		else if(nombre.equalsIgnoreCase("roshi")) {
			
			addPersonaje(new Heroes("Roshi", 50 , "Mafuba", 60, "Bankoku Bikkuri Sho", 90, "Onda de Ki", 120, "Kame hame ha", "Datos/personajes/Roshi/Batalla/mover.gif", "Datos/personajes/Roshi/Caminar/1.png", 957, 495, 500, 1));
			
		}
		
		else if(nombre.equalsIgnoreCase("vegeta")) {
			
			addPersonaje(new Heroes("Vegeta", 50, "Rafaga de Ki", 60, "Onda explosiva", 90, "Big bang", 120, "Golpe final" , "Datos/personajes/Vegeta/Batalla/mover.gif", "Datos/personajes/Vegeta/Caminar/1.png", 957, 495, 500, 1));
			
		}
		
	}
	
	/**
	 * metodo que inicializa los villanos del juego
	 */
	public void inicializarVillanos() {
		
		addPersonaje(new Villanos("Majin boo", 100, "Aliento en llamas", 140, "Rayo de desaparicion", 160, "Explosión enfadada", "Datos/personajes/Majin boo/mover.gif", 500, 7, "Datos/esferas/7.png", "¿En qué clase de caramelo te gustaría ser convertido para que después te coma?" + "\n" + "¿En chocolate, caramelo o jalea?" + "\n" + "¡Me caes bien! Te convertiré en mi sirviente"));
		addPersonaje(new Villanos("Cell", 100, "Fuego rápido", 120, "Cañón cósmico", 130, "Abrazo de oso", "Datos/personajes/Cell/mover.gif", 500, 5, "Datos/esferas/5.png", "¡Necio! ¿¡No te das cuenta que estás peleando contra el arma perfecta?!"));
		addPersonaje(new Villanos("Broly", 50, "Disparo de Volley Borrador", 90, "Omega Bláster", 120, "Estallido Meteórico", "Datos/personajes/Broly/mover.gif", 500, 3, "Datos/esferas/3.png", "¿Que soy un monstruo infernal?, te equivocas. ¡Soy el mismo demonio!"));
		addPersonaje(new Villanos("Freezer", 40, "Cañon cósmico", 70, "Tormenta mortal", 100, "Bláster de la muerte", "Datos/personajes/Freezer/mover.gif", 500, 1, "Datos/esferas/1.png" , "¿¡Que pasa contigo!? No te muevas ¿¡No ves que te voy a matar!?" ));
		
		
	}
	
	/**
	 * metodo que añade personajes a la lista
	 * @param personaje
	 */
	public void addPersonaje(Personajes personaje) {
		
		
		 if( primero == null )  {
			 
			 primero = personaje;
		 
		 }
		 
		 else {
			 
			 Personajes per = localizarUltimoPersonaje( );
			 per.insertarDespues( personaje );
		 
		 }
		 
	}
	
	/**
	 * metodo que busca el ultimo personaje de la lista
	 * @return atributo de tipo Personajes
	 */
	public Personajes localizarUltimoPersonaje() {
		
		 Personajes actual = primero;
		 
		 if( actual != null ) {
			 
			 while( actual.getSiguiente( )!=null ) {
				 
			 actual = actual.getSiguiente( );
			 
			 }
		 
		 }
		 
		 return actual;
	}
	
	/**
	 * metodo que inicializa los valores del array de personajes
	 */
	public void inicializarArray() {
		
		
		personajes[0] = new Heroes("Goku", 50, "Ráfaga de aura Saiyan", 60, "Genkidama", 90, "Puño del dragon", 120 , "Kame hame ha", "Datos/personajes/Goku/Batalla/mover.gif" , "Datos/personajes/Goku/Caminar/1.png" , 957, 495, 500, 1);
		personajes[1] = new Heroes("Roshi", 50 , "Mafuba", 60, "Bankoku Bikkuri Sho", 90, "Onda de Ki", 120, "Kame hame ha", "Datos/personajes/Roshi/Batalla/", "Datos/personajes/Roshi/Caminar/1.png", 957, 495, 500, 1);
		personajes[2] = new Heroes("Vegeta", 50, "Rafaga de Ki", 60, "Onda explosiva", 90, "Big bang", 120, "Golpe final" , "Datos/personajes/Vegeta/Batalla/", "Datos/personajes/Vegeta/Caminar/1.png", 957, 495, 500, 1);
		personajes[3] = new Villanos("Majin boo", 100, "Aliento en llamas", 140, "Rayo de desaparicion", 160, "Explosión enfadada", "Datos/personajes/Majin boo/mover.gif", 500, 7, "Datos/esferas/7.png", "¿En qué clase de caramelo te gustaría ser convertido para que después te coma?" + "\n" + "¿En chocolate, caramelo o jalea?" + "\n" + "¡Me caes bien! Te convertiré en mi sirviente");
		personajes[4] = new Villanos("Cell", 100, "Fuego rápido", 120, "Cañón cósmico", 130, "Abrazo de oso", "Datos/personajes/Cell/mover.gif", 500, 5, "Datos/esferas/5.png", "¡Necio! ¿¡No te das cuenta que estás peleando contra el arma perfecta?!");
		personajes[5] = new Villanos("Broly", 50, "Disparo de Volley Borrador", 90, "Omega Bláster", 120, "Estallido Meteórico", "Datos/personajes/Broly/mover.gif", 500, 3, "Datos/esferas/3.png", "¿Que soy un monstruo infernal?, te equivocas. ¡Soy el mismo demonio!");
		personajes[6] = new Villanos("Freezer", 40, "Cañon cósmico", 70, "Tormenta mortal", 100, "Bláster de la muerte", "Datos/personajes/Freezer/mover.gif", 500, 1, "Datos/esferas/1.png" , "¿¡Que pasa contigo!? No te muevas ¿¡No ves que te voy a matar!?" );
		
	}
	

	
	
	
	

}
