import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
	public static Scanner tec = new Scanner(System.in);
	private final static String [] gustos_generales = {"futbol", "baloncesto", "tennis", 
													   "ir al gimnasio", "videojuegos",
													   "informatica", "series", "peliculas"};
	private String user_name;
	private boolean [] gustos_personales = new boolean[6];

	private static ArrayList<String>  user_name_no_disponibles = new ArrayList<String>();
	
	public Persona (String Nombre_introducido){
		if(!user_name_no_disponibles.contains(Nombre_introducido)) {
			user_name_no_disponibles.add(Nombre_introducido);
			this.user_name =  Nombre_introducido;
		}
	}
	

	public static ArrayList<String> getUser_name_no_disponibles() {
		return user_name_no_disponibles;
	}


	public String getUser_name() {
		return user_name;
	}


	public String toString() {
		return "Persona [user_name=" + user_name + "]";
	}

	public void PersonalizarGustos() {
		System.out.println("¿Te gusta el futbol? SI/NO");
	}
}
