import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
	public static Scanner tec = new Scanner(System.in);
	
	private String nombre;
	private boolean[] afinidades = new boolean[6];
	private static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	
	public Persona() {
		this.nombre = decidirNombre();
		this.afinidades = decidirAfinidades();
	}

	
	
	



	public static void setListaPersonas(ArrayList<Persona> listaPersonas) {
		Persona.listaPersonas = listaPersonas;
	}


/*
	public void Compatibilidad(Persona Objetivo) {
		int Puntos_en_comun=0;
		int Longitud_array = afinidades.length;
		for(int i=0; i>=Longitud_array; i++ ) {
			if(this.afinidades[i] == Objetivo.afinidades[i]) {
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
	*/
	public boolean[] decidirAfinidades() {//Crea el array de los gustos Persona00les
		boolean[] afinidades = new boolean[6];
		
		System.out.println("풲e gustan los deportes?");//0
		if (tec.nextLine().equalsIgnoreCase("si")) {
			afinidades[0] = true;
		} else {
			afinidades[0] = false;
		}
		
		System.out.println("풲e gustan los juegos?");//1
		if (tec.nextLine().equalsIgnoreCase("si")) {
			afinidades[1] = true;
		} else {
			afinidades[1] = false;
		}
		
		System.out.println("풲e gustan las series?");//2
		if (tec.nextLine().equalsIgnoreCase("si")) {
			afinidades[2] = true;
		} else {
			afinidades[2] = false;
		}
		
		System.out.println("풲e gustan los animes?");//3
		if (tec.nextLine().equalsIgnoreCase("si")) {
			afinidades[3] = true;
		} else {
			afinidades[3] = false;
		}
		
		System.out.println("풲e gusta la jardineria?");//4
		if (tec.nextLine().equalsIgnoreCase("si")) {
			afinidades[4] = true;
		} else {
			afinidades[4] = false;
		}
		
		System.out.println("풲e gustan la informatica?");//5
		if (tec.nextLine().equalsIgnoreCase("si")) {
			afinidades[5] = true;
		} else {
			afinidades[5] = false;
		}
		
		return afinidades;
	}
	
	public String toString() {
		return "Nombre: " +nombre+", afinidad 1: "+afinidades[0]+", afinidad 2: "+afinidades[1]+", afinidad 3: "+afinidades[2]+", afinidad 4: "+afinidades[3]+", afinidad 5: "+afinidades[4]+", afinidad 6: "+afinidades[5];
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public boolean[] getAfinidades() {
		return afinidades;
	}



	public void setAfinidades(boolean[] afinidades) {
		this.afinidades = afinidades;
	}



	public static ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}
	
}
