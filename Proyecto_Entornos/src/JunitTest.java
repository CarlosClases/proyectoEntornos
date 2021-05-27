import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTest {
	
	private static Persona Persona_Prueba1, Persona_Prueba2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		boolean [] Afinidades_Prueba1 = {true ,true ,true ,true ,true ,false, false};
		Persona_Prueba1 = new Persona("admin", Afinidades_Prueba1, listaPersonas);
		boolean [] Afinidades_Prueba2 = {true ,true ,true ,true ,true ,true, true};
		Persona_Prueba2 = new Persona("Paco", Afinidades_Prueba2, listaPersonas);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAfinidad() {
		Persona_Prueba1.Compatibilidad(Persona_Prueba2);
		assertEquals(Persona_Prueba1.getNombre() + " y " + Persona_Prueba2.getNombre() + " son compatibles",Persona_Prueba1.Compatibilidad(Persona_Prueba2));
	}

}
