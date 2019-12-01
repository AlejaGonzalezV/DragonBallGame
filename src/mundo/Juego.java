package mundo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * clase Juego
 */
public class Juego {
	
	/**
	 * atributo de tipo Jugador que representa la relacion con la clase Jugador
	 */
	private Jugador usuario;
	/**
	 * atributo de tipo Puntajes que representa la relacion con la clase Puntajes
	 */
	private Puntajes raiz;
	
	/**
	 * constructor de la clase Juego
	 * @param usuario
	 */
	public Juego(Jugador usuario) {
		
		this.usuario = usuario;
		
	}
	
	/**
	 * metodo que serializa la clase jugador 
	 */
	public void guardarDatos() {
		
		ObjectOutputStream o;
		try {
			o = new ObjectOutputStream(new FileOutputStream("archivos/datos.dat"));
			o.writeObject(usuario);
			o.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	/**
	 * metodo que carga el archivo con la infomacion del usuario que jugo la ultima partida
	 */
	public void cargarDatos() {
		
		ObjectInputStream i;
		try {
			i = new ObjectInputStream(new FileInputStream("archivos/datos.dat"));
			usuario = (Jugador)i.readObject();
			i.close();
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}catch(IOException e) {
			
			
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	/**
	 * metodo que devuelve la relacion con la clase Puntajes
	 * @return raiz
	 */
	public Puntajes getRaiz() {
		return raiz;
	}



	/**
	 * metodo que modifica la relacion con la clase Puntajes
	 * @param raiz 
	 */
	public void setRaiz(Puntajes raiz) {
		this.raiz = raiz;
	}

	/*
	 *metodo que busca un personaje pedido por el usuario
	 *@param nombre: String que representa el nombre del personaje pedido por el usuario
	 *@return personaje: atributo de tipo personaje que representa el personaje pedido por el usuario
	 */
	public Personajes buscarPersonaje(String nombre) {
		
		usuario.ordenarPersonajes();
		Personajes personaje = usuario.buscarBinario(nombre);
		return personaje;
		
	}
	
	/**
	 * metoo que devuelve la relacion con la clase Jugador
	 * @return usuario
	 */
	public Jugador getJugador() {
		
		return usuario;
	}
	
	/**
	 * metodo que devuelve el personaje escogido por el usuario
	 * @param nombrePersonaje: String que representa el nombre del personaje pedido
	 * @return atributo de tipo Personaje que representa el personaje pedido
	 */
	public Personajes getHeroe(String nombrePersonaje) {
		
		return usuario.getHeroe(nombrePersonaje);
		
	}
	
	/**
	 * metodo que agrega una esfera al jugador
	 * @param numero: int que representa la esfera obtenida
	 */
	public void agregarEsfera(int numero) {
		
		usuario.setNumeroEsferas(numero);
		
	}
	
	/**
	 * metodo que devuelve el numero de esferas que tiene un jugador
	 * @return atributo de tipo int que representa el numero de esferas del jugador
	 */
	public int numeroEsferas() {
		
		return usuario.getNumeroEsferas();
		
	}
	
	/*
	 *metodo que guarda la informacion del usuario en un archivo de texto
	 */
	public void guardarTexto(){
		
		File file = new File("archivos/datosJugadores.txt");  
		
		try {
			String nombre = usuario.getNombre();
			String esferas = String.valueOf(usuario.getNumeroEsferas());

			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(nombre+"@"+esferas);
			bw.newLine();
			bw.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	/**
	 * metodo que carga la informacion del usuario desde un archivo de texto
	 */
	public void recuperarTexto() {
		
		File file = new File("archivos/DatosJugadores.txt");
		
		try {
			String nombre;
			int esferas;
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea =  br.readLine();
	        
	        while(linea != null) {
	        	
	            String[] values = linea.split("@");
	       
	                nombre = values[0];
	                esferas = Integer.parseInt(values[1]);
	                Puntajes puntaje = new Puntajes(nombre, esferas);
	                agregarElementos(puntaje);
	                linea = br.readLine();
		}
	        br.close();
		
        }catch(FileNotFoundException e) {
        	e.printStackTrace();
        }catch(IOException e) {
        	e.printStackTrace();
        }
		
	}
	
	/**
	 * metodo que agrega elementos al arbol de puntajes
	 * @param puntaje: atributo de tipo Puntajes que representa el objeto que se va a agregar al arbol
	 */
	public void agregarElementos(Puntajes puntaje) {
		
		if(raiz == null) {
			
			raiz = puntaje;
			
		}
		
		else if(raiz != null) {
			
			raiz.agregar(puntaje);
			
		}
		
	}


}
