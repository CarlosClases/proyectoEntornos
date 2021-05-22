import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTest {
	
	private static Persona a, a2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		boolean [] b = {true ,true ,true ,true ,true ,false, false};
		a = new Persona("admin", b, listaPersonas);
		boolean [] b2 = {true ,true ,true ,true ,true ,true, true};
		a2 = new Persona("Paco", b2, listaPersonas);
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
		a.Compatibilidad(a2);
		assertEquals(a.getNombre() + " y " + a2.getNombre() + " son compatibles",a.Compatibilidad(a2));
	}

}
