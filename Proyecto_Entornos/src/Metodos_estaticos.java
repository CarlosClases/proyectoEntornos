import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 * <h2>Clase Metodos_estaticos</h2> Esta clase contiene metodos estaticos
 *
 * @author Daniel y Carlos
 * @version 9.5
 *
 */
public class Metodos_estaticos {
	
	/**
	 *
	 * @return listaPersonas Indica la lista de las personas donde se busca si hay
	 *         una persona con el mismo nombre
	 *
	 * @return Nuevo_nombre Indica el nombre con el que se compara con otros nombres
	 *         de la listaPersona
	 * 
	 */
	static boolean NombreRepetido(ArrayList<Persona> listaPersonas, String Nuevo_nombre) {
		boolean repetido=false;
		int listaPersona_size = listaPersonas.size();
		for (int i = 0; i < listaPersona_size && !repetido; i++) {
			if (listaPersonas.get(i).getNombre().equals(Nuevo_nombre)) {
				repetido=true;
			}	
		}
		return repetido;
	}
	
	/**
	 *
	 * @param listaPersonas        Indica la lista de las personas
	 *
	 * @param Nombre_escrito_Crear Indica el nombre de la persona al que se compueba
	 *                             si tiene un minimo de caracteres
	 * 
	 * @param Aviso_Nombre         Indica el mensaje del aviso
	 * 
	 * @param Boton_CrearUsuario   Es el boton para crear usuarios
	 * 
	 */
	static void Comprobar_Nombre(ArrayList<Persona> listaPersonas,
								 JTextField Nombre_escrito_Crear,
								 JLabel Aviso_Nombre,
								 JButton Boton_CrearUsuario) {

		String Nuevo_nombre = Nombre_escrito_Crear.getText();
		String Aviso_texto;
		int Numero_Letras_Nombre = Nuevo_nombre.length();
		if (Numero_Letras_Nombre < 5) { // Comprueba si el nuevo nombre cumple el minimo de caracteres
			Aviso_texto = "Minimo de caracteres no alcanzado";
			Aviso_Nombre.setText(Aviso_texto);
			Aviso_Nombre.setForeground(Color.red);
			Boton_CrearUsuario.setEnabled(false);
		} else {
			if (Metodos_estaticos.NombreRepetido(listaPersonas, Nuevo_nombre)) {
				Aviso_Nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
				Aviso_texto = "Nombre no disponible, intruduzca uno nuevo";
				Aviso_Nombre.setText(Aviso_texto);
				Aviso_Nombre.setForeground(Color.red);
				Boton_CrearUsuario.setEnabled(false);

			} else {
				Aviso_texto = "Nombre disponible";
				Aviso_Nombre.setText(Aviso_texto);
				Aviso_Nombre.setForeground(Color.green);
				Boton_CrearUsuario.setEnabled(true);
			}
		}
	}
	
	/**
	 *
	 *
	 * @param checkbox_Deportes    Indica si le gustan los deportes
	 *
	 * @param checkbox_Juegos      Indica si le gustan los juegos
	 * 
	 * @param checkbox_Animes      Indica si le gustan los animes
	 * 
	 * @param checkbox_Jardineria  Indica si le gustan los jardineria
	 * 
	 * @param checkbox_Informatica Indica si le gustan los informatica
	 * 
	 * @param checkbox_Historia    Indica si le gustan los historia
	 * 
	 * @param Nombre_escrito_Crear Nombre que tiene una persona
	 * 
	 * @param ArrayList<Persona>   listaPersonas Lista de las personas a la que se
	 *                             anyade la persona
	 * 
	 * @param Aviso_Nombre         Indica el mensaje del aviso
	 * 
	 * @param Boton_CrearUsuario   Es el boton para crear usuarios
	 * 
	 * 
	 */
	static void Crear_usuario(Checkbox checkbox_Deportes,
							  Checkbox checkbox_Juegos,
							  Checkbox checkbox_Series,
							  Checkbox checkbox_Animes,
							  Checkbox checkbox_Jardineria,
							  Checkbox checkbox_Informatica,
							  Checkbox checkbox_Historia,
							  JTextField Nombre_escrito_Crear,
							  ArrayList<Persona> listaPersonas,
							  JLabel Aviso_Nombre,
							  JButton Boton_CrearUsuario) {
		boolean [] Nuevas_Afinidades = new boolean[7];
		if(checkbox_Deportes.getState()==true){Nuevas_Afinidades[0]=true;}
		if(checkbox_Juegos.getState()==true){Nuevas_Afinidades[1]=true;}
		if(checkbox_Series.getState()==true){Nuevas_Afinidades[2]=true;}
		if(checkbox_Animes.getState()==true){Nuevas_Afinidades[3]=true;}
		if(checkbox_Jardineria.getState()==true){Nuevas_Afinidades[4]=true;}
		if(checkbox_Informatica.getState()==true){Nuevas_Afinidades[5]=true;}
		if(checkbox_Historia.getState()==true){Nuevas_Afinidades[6]=true;}
		String Nuevo_nombre = Nombre_escrito_Crear.getText();
		Persona Nuevo_usuario = new Persona(Nuevo_nombre, Nuevas_Afinidades, listaPersonas);
		System.out.println(Nuevo_usuario.toString());
		Nombre_escrito_Crear.setText("");
		String Aviso_texto = "Usuario creado correctamente";
		Aviso_Nombre.setForeground(Color.blue);
		Aviso_Nombre.setText(Aviso_texto);
		Boton_CrearUsuario.setEnabled(false);
	}
	
	/**
	 *
	 * @param listaPersonas             Indica la lista de las personas
	 *
	 * @param Nombre_gestionar          Indica el nombre de la persona con la que se
	 *                                  compara
	 * 
	 * @param Segundo_usuario_Gestionar Indica el otro nombre de la persona con la
	 *                                  que se compara
	 * 
	 * @param Resultados_Compatiblidad  Indica si es afin o no a la otra persona
	 * 
	 */
	static void Compatibilidad_Individual(ArrayList<Persona> listaPersonas,
								 		  JTextField Nombre_gestionar,
								 		  JTextField Segundo_usuario_Gestionar,
								 		  JTextPane Resultados_Compatiblidad) {
		int listaPersona_size = listaPersonas.size();
		Boolean cerrojo_1=true, cerrojo_2=true;
		String Nombre_Usu_Primero = Nombre_gestionar.getText();
		String Nombre_Usu_Segundo = Segundo_usuario_Gestionar.getText();
		Persona Primer_usuario = new Persona();
		Persona	Segundo_usuario = new Persona();
		//Busca a los dos usuarios en el ArrayList
		for (int i = 0; i < listaPersona_size || (cerrojo_1 && cerrojo_2); i++) {
			if (listaPersonas.get(i).getNombre().equals(Nombre_Usu_Primero)) { //Busqueda del primer usuario
				Primer_usuario = listaPersonas.get(i);
				cerrojo_1=false;
			}
			if (listaPersonas.get(i).getNombre().equals(Nombre_Usu_Segundo)) {//Busqueda del segundo usuario
				Segundo_usuario = listaPersonas.get(i);
				cerrojo_2=false;
			}
		}
		Resultados_Compatiblidad.setText(Primer_usuario.Compatibilidad(Segundo_usuario));
	}
	
	
	/**
	 *
	 * @param listaPersonas            Indica la lista de las personas
	 *
	 * @param Nombre_gestionar         Indica el nombre de la persona con la que se
	 *                                 compara
	 * 
	 * @param Resultados_Compatiblidad Indica si es afin o no a la otra persona
	 * 
	 */
	static void Compatibilidad_General(ArrayList<Persona> listaPersonas,
	 		  						   JTextField Nombre_gestionar,
	 		  						   JTextPane Resultados_Compatiblidad) {
		int listaPersona_size = listaPersonas.size();
		Boolean cerrojo=true;
		Persona usuario = new Persona();
		for (int i = 0; i < listaPersona_size || cerrojo; i++) {
			if (listaPersonas.get(i).getNombre().equals(Nombre_gestionar.getText())) { //Busqueda del primer usuario
				usuario = listaPersonas.get(i);
				cerrojo=false;
			}
		}
		Resultados_Compatiblidad.setText("");
		for (int i = 0; i < listaPersona_size; i++) {
			if (!listaPersonas.get(i).getNombre().equals(Nombre_gestionar.getText())) {//Para que no lo haga con el mismo usuario
				Resultados_Compatiblidad.setText(Resultados_Compatiblidad.getText() + "\n" + usuario.Compatibilidad(listaPersonas.get(i)));
			}
		}
	}
}

