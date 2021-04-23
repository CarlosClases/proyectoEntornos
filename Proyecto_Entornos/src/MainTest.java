import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
	public static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		boolean [] b = {true ,true ,true ,true ,true ,false, false};
		Persona a = new Persona("administrador", b, listaPersonas);
		
		new Persona(listaPersonas);
		new Persona(listaPersonas);

		
		System.out.println(listaPersonas.get(0));
		System.out.println(listaPersonas.get(1));
		System.out.println(listaPersonas.get(2));

	}
}
