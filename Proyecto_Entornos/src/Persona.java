import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h2>Clase Persona</h2> Esta clase simula ser una persona
 *
 * @author Daniel y Carlos
 * @version 9.5
 *
 */

public class Persona {
	public static Scanner tec = new Scanner(System.in);

	/**
	 * Atributo nombre
	 *
	 * Indica el nombre de la persona
	 *
	 */
	private String nombre;
	/**
	 * Atributo Numero_Aficiones
	 *
	 * Indica el numero de afinidades
	 *
	 */
	private static int Numero_Aficiones = 7;
	/**
	 * Atributo afinidades
	 *
	 * Indica las afinidades de una persona
	 *
	 */
	private boolean[] afinidades = new boolean[Numero_Aficiones];

	/**
	 *
	 * Constructor vacio de una persona
	 *
	 */
	public Persona() {
	}

	/**
	 *
	 * Constructor de una persona
	 *
	 * @param nombre        Nombre que tiene la persona
	 * 
	 * @param afinidades    Lista de gustos de la persona
	 * 
	 * @param listaPersonas Lista de las personas a la que se anyade la persona
	 *
	 */
	public Persona(String nombre, boolean[] afinidades, ArrayList<Persona> listaPersonas) {
		this.nombre = nombre;
		this.afinidades = afinidades;
		listaPersonas.add(this);
	}

	/**
	 *
	 * @return Objetivo Indica la persona con la que se compara
	 *
	 */
	public String Compatibilidad(Persona Objetivo) {
		int Puntos_en_comun = 0;
		int Longitud_array_afinidades = afinidades.length;
		for (int i = 0; i < Longitud_array_afinidades; i++) {
			if (this.afinidades[i]==true && this.afinidades[i] == Objetivo.afinidades[i]) {
				Puntos_en_comun++;
			}
		}
		if (Puntos_en_comun >= 3) {
			return this.nombre + " y " + Objetivo.nombre + " son compatibles";
		} else {
			return this.nombre + " y " + Objetivo.nombre + " no son compatibles";
		}
	}

	/**
	 *
	 * @return Devuelve informacion sobre la persona
	 *
	 */
	public String toString() {
		return "Nombre: " + nombre + "\n" 
				+ "Afinidades: \n" 
				+ "    Deportes: " + afinidades[0] + "\n" 
				+ "    Juegos: "+ afinidades[1] + "\n" 
				+ "    Series: " + afinidades[2] + "\n" 
				+ "    Animes: " + afinidades[3] + "\n"
				+ "    Jardineria: " + afinidades[4] + "\n" 
				+ "    Informatica: " + afinidades[5] + "\n"
				+ "    Historia: " + afinidades[6];
	}

	/**
	 *
	 * @return Devuelve el nombre de la persona
	 *
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *
	 * @param nombre Fijar el nombre de la persona a uno concreto
	 *
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 *
	 * @param afinidades Fijar las afinidades de la persona a uno concreto
	 *
	 */
	public void setAfinidades(boolean[] afinidades) {
		this.afinidades = afinidades;
	}
}
