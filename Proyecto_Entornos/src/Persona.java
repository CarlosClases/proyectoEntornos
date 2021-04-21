import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
	public static Scanner tec = new Scanner(System.in);
	
	private String nombre;
	private boolean[] afinidades = new boolean[7];
	private final static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	
	public Persona() {
		this.nombre = decidirNombre();
		this.afinidades = decidirAfinidades();
		listaPersonas.add(this);
	}
	
	public String decidirNombre() {
		boolean cerrojo = false;
		String Nombre_introducido;
		int numero_lista_persona = listaPersonas.size();
		System.out.print("Introduce tu nombre: ");
		//Comprobar si el nombre ya existe
		if(numero_lista_persona == 0){
			Nombre_introducido = tec.nextLine();
			return Nombre_introducido;
		}
		else {
			do {
				Nombre_introducido = tec.nextLine();
				for(int i=0; i<=numero_lista_persona -1; ) {
					if(listaPersonas.get(i).getNombre().equals(Nombre_introducido)){
						System.out.print("nombre no disponible, introduzca uno nuevo: ");
						Nombre_introducido = tec.nextLine();
						i=0;  //Reinicia la busqueda
					}
					else {cerrojo = true; i++;}
				}
			}
			while(!cerrojo);
			return Nombre_introducido;
		}
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
		
		System.out.println("풲e gustan la Historia?");//5
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
	
	public static ArrayList<Persona> getListapersonas() {
		return listaPersonas;
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
