import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
	public static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		boolean [] b = {true ,true ,true ,true ,true ,false, false};
		Persona a = new Persona("admin", b, listaPersonas);
		boolean [] b2 = {true ,true ,true ,true ,true ,true, true};
		Persona a2 = new Persona("Paco", b2, listaPersonas);
		boolean [] b3 = {true ,true ,true ,true ,true ,true, true};
		Persona a3 = new Persona("Francisco", b3, listaPersonas);
		boolean [] b4 = {false ,false ,false ,false ,false ,false, false};
		Persona a4 = new Persona("Eurelio", b4, listaPersonas);
		
		System.out.println(listaPersonas.get(0));
		System.out.println(listaPersonas.get(1));
		System.out.println(listaPersonas.get(2));
		a2.CompatibilidadGlobal(listaPersonas);

	}
}
