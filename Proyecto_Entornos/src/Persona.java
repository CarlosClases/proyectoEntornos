import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
	public static Scanner tec = new Scanner(System.in);
	private final static String [] gustos_generales = {"futbol", "baloncesto", "tennis", 
													   "ir al gimnasio", "videojuegos",
													   "informatica", "series", "peliculas"};
	private String user_name;
	private boolean [] gustos_personales = new boolean[6];
	//Guarda una lista con los nombre introducidos de los usuarios
	private static ArrayList<Persona> user_name_no_disponibles = new ArrayList<Persona>();
	
	public Persona (String Nombre_introducido){
		//Comprueba si el nombre ya a sido introducion anteriormente 
		if(!user_name_no_disponibles.contains(Nombre_introducido)) {
			user_name_no_disponibles.add(new Persona(Nombre_introducido));
			this.user_name =  Nombre_introducido;
		}
	}

	public static ArrayList<Persona> getUser_name_no_disponibles() {
		return user_name_no_disponibles;
	}


	public String getUser_name() {
		return user_name;
	}
	

	public void MytoString() {
		System.out.print("user_name = " + user_name + "\n" + 
				"Gustos: ");
		int Longitud_array = gustos_personales.length -1;
		for(int i=0; i<=Longitud_array; i++) {
			if(gustos_personales[i]) {
				System.out.print( " | " + gustos_generales[i] + " | ");
			}
		}
		System.out.println();
	}

	public void Compatibilidad(Persona Objetivo) {
		int Puntos_en_comun=0;
		int Longitud_array = gustos_personales.length;
		for(int i=0; i>=Longitud_array; i++ ) {
			if(this.gustos_personales[i] == Objetivo.gustos_personales[i]) {
				Puntos_en_comun++;
			}
		}
		if(Puntos_en_comun >= 3) {
			System.out.println(this.user_name + " y " + Objetivo.user_name + " son compatibles");
		}
		else {
			System.out.println(this.user_name + " y " + Objetivo.user_name + " son compatibles");
		}
	}
}
