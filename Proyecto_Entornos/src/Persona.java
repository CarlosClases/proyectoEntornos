import java.util.Scanner;

public class Persona {
	public static Scanner tec = new Scanner(System.in);
	private final static String [] gustos_generales = {"futbol", "baloncesto", "tennis", 
													   "ir al gimnasio", "videojuegos",
													   "informatica", "series", "peliculas"};
	private String user_name;
	private boolean [] gustos_personales = new boolean[6];
	
	public Persona (String Nombre_introducido){
		this.user_name = Nombre_introducido;
	}
	
	public void PersonalizarGustos() {
		System.out.println("¿Te gusta el futbol? SI/NO");
	}
}
