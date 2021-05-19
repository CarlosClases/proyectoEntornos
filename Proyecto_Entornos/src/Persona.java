import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
	public static Scanner tec = new Scanner(System.in);
	

	private String nombre;
	private boolean[] afinidades = new boolean[7];
	
	public Persona() {}
	
	public Persona(ArrayList<Persona> listaPersonas) {
		this.nombre = decidirNombre(listaPersonas);
		this.afinidades = decidirAfinidades();
		listaPersonas.add(this);
	}
	
	public Persona(String nombre, boolean[] afinidades, ArrayList<Persona> listaPersonas) {
		this.nombre = nombre;
		this.afinidades = afinidades;
		listaPersonas.add(this);
	}
	
	private String decidirNombre(ArrayList<Persona> listaPersonas) {//Metodo para que el usuario no pueda repetir nombre
		boolean cerrojo=true;
		System.out.println("좪scribe un nombre unico para tu usuario!");
		nombre=tec.nextLine();
		for (int i = 0; i < listaPersonas.size()&&cerrojo; i++) {
			if (listaPersonas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				do {
					System.out.println("Ese nombre de usuario ya existe, prueba con otro");
					nombre=tec.nextLine();
				} 
				while (listaPersonas.get(i).getNombre().equalsIgnoreCase(nombre));
				cerrojo=false;
			}	
		}
		
		return nombre;
	}

	public boolean ResponderSINO() {//Impide al usuario responder cualquier cosa que no sea si o no, devolviendo si le gusta o no
		boolean sino=true;
		String respuesta=tec.nextLine();
		if (!(respuesta.equalsIgnoreCase("si")||respuesta.equalsIgnoreCase("no"))) {
			do {
				System.out.println("Por favor responda si o no");
				respuesta=tec.nextLine();
			} while (!(respuesta.equalsIgnoreCase("si")||respuesta.equalsIgnoreCase("no")));
		}
		if (respuesta.equalsIgnoreCase("no")) {
			sino = false;
		}
		return sino;
	}
	
	public boolean[] decidirAfinidades() {//Crea el array de los gustos Personales
		boolean[] afinidades = new boolean[7];
		
		System.out.println("풲e gustan los deportes?");//0
		afinidades[0] = ResponderSINO();
		System.out.println("풲e gustan los juegos?");//1
		afinidades[1] = ResponderSINO();
		System.out.println("풲e gustan las series?");//2
		afinidades[2] = ResponderSINO();
		System.out.println("풲e gustan los animes?");//3
		afinidades[3] = ResponderSINO();
		System.out.println("풲e gusta la jardineria?");//4
		afinidades[4] = ResponderSINO();
		System.out.println("풲e gusta la informatica?");//5
		afinidades[5] = ResponderSINO();
		System.out.println("풲e gusta la Historia?");//6
		afinidades[6] = ResponderSINO();
			
		return afinidades;
	}
	
	public String Compatibilidad(Persona Objetivo) {
		int Puntos_en_comun=0;
		int Longitud_array_afinidades = afinidades.length;
		for(int i=0; i<Longitud_array_afinidades; i++ ) {
			if(this.afinidades[i] == Objetivo.afinidades[i]) {
				Puntos_en_comun++;
			}
		}
		if(Puntos_en_comun >= 3) {
			return this.nombre + " y " + Objetivo.nombre + " son compatibles";
		}
		else {
			return this.nombre + " y " + Objetivo.nombre + " no son compatibles";
		}
	}

	
	public void CompatibilidadGlobal(ArrayList<Persona> listaPersonas) {
		int Longitud_arraylist_personas = listaPersonas.size();
		for(int j=0; j<Longitud_arraylist_personas; j++) {
			this.Compatibilidad(listaPersonas.get(j));
		}
	}
	
	public String toString() {
		return "Nombre: "+nombre+"\n"+
				"Afinidades: \n" +
				"    Deportes: "+afinidades[0]+"\n"+
				"    Juegos: "+afinidades[1]+"\n"+
				"    Series: "+afinidades[2]+"\n"+
				"    Animes: "+afinidades[3]+"\n"+
				"    Jardineria: "+afinidades[4]+"\n"+
				"    Informatica: "+afinidades[5]+"\n"+
				"    Historia: "+afinidades[6];
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAfinidades(boolean[] afinidades) {
		this.afinidades = afinidades;
	}
}
