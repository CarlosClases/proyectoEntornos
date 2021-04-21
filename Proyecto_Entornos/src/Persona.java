import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
	public static Scanner tec = new Scanner(System.in);
	

	private String nombre;
	private boolean[] afinidades = new boolean[6];
	
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
	
	public boolean[] decidirAfinidades() {//Crea el array de los gustos Persona00les
		boolean[] afinidades = new boolean[7];
		
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
		
		System.out.println("풲e gustan la Historia?");//6
		if (tec.nextLine().equalsIgnoreCase("si")) {
			afinidades[6] = true;
		} else {
			afinidades[6] = false;
		}
		
		return afinidades;
	}
	
	public void Compatibilidad(Persona Objetivo) {
		int Puntos_en_comun=0;
		int Longitud_array = afinidades.length;
		for(int i=0; i<=Longitud_array; i++ ) {
			if(this.afinidades[i] == Objetivo.afinidades[i]) {
				Puntos_en_comun++;
			}
		}
		if(Puntos_en_comun >= 3) {
			System.out.println(this.nombre + " y " + Objetivo.nombre + " son compatibles");
		}
		else {
			System.out.println(this.nombre + " y " + Objetivo.nombre + " son compatibles");
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



	public boolean[] getAfinidades() {
		return afinidades;
	}



	public void setAfinidades(boolean[] afinidades) {
		this.afinidades = afinidades;
	}
	
}
