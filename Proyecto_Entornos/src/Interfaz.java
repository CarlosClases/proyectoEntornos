import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interfaz {

	private JFrame frame;
	private JTextField Nombre_escrito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//Metodo para comprobar si un nombre esta repetido
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
	
	private void initialize() {
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		boolean [] b = {true ,true ,true ,true ,true ,false, false};
		Persona a = new Persona("admin", b, listaPersonas);
		boolean [] b2 = {true ,true ,true ,true ,true ,true, true};
		Persona a2 = new Persona("Paco", b2, listaPersonas);
		boolean [] b3 = {true ,true ,true ,true ,true ,true, true};
		Persona a3 = new Persona("Francisco", b3, listaPersonas);
		boolean [] b4 = {false ,false ,false ,false ,false ,false, false};
		Persona a4 = new Persona("Eurelio", b4, listaPersonas);
		boolean [] Nuevas_Afinidades = new boolean[7];
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.setBounds(100, 100, 300, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Nombre = new JLabel("Nombre de usuario:");
		Nombre.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Nombre.setBounds(10, 14, 121, 14);
		frame.getContentPane().add(Nombre);
		
		Nombre_escrito = new JTextField();
		Nombre_escrito.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Nombre_escrito.setBounds(141, 12, 137, 20);
		frame.getContentPane().add(Nombre_escrito);
		Nombre_escrito.setColumns(10);
		
		JLabel Gustos = new JLabel("G U S T O S");
		Gustos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Gustos.setBounds(70, 65, 109, 24);
		frame.getContentPane().add(Gustos);
		
		JLabel texto_deportes = new JLabel("풲e gustan los deportes?");
		texto_deportes.setHorizontalAlignment(SwingConstants.CENTER);
		texto_deportes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		texto_deportes.setBounds(10, 95, 170, 20);
		frame.getContentPane().add(texto_deportes);
		
		ButtonGroup Grupo_deportes = new ButtonGroup();
		
		JRadioButton Deportes_si = new JRadioButton("si");
		Deportes_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Deportes_si.setBounds(180, 95, 45, 20);
		frame.getContentPane().add(Deportes_si);
		
		JRadioButton Deportes_no = new JRadioButton("no");
		Deportes_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Deportes_no.setBounds(230, 95, 45, 20);
		frame.getContentPane().add(Deportes_no);
		
		Grupo_deportes.add(Deportes_si);
		Grupo_deportes.add(Deportes_no);
		
		
		JLabel texto_juegos = new JLabel("풲e gustan los juegos?");
		texto_juegos.setHorizontalAlignment(SwingConstants.CENTER);
		texto_juegos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		texto_juegos.setBounds(10, 135, 170, 20);
		frame.getContentPane().add(texto_juegos);
		
		ButtonGroup Grupo_juegos = new ButtonGroup();
		
		JRadioButton Juegos_si = new JRadioButton("si");
		Juegos_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Juegos_si.setBounds(180, 135, 45, 20);
		frame.getContentPane().add(Juegos_si);
		
		JRadioButton Juegos_no = new JRadioButton("no");
		Juegos_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Juegos_no.setBounds(230, 135, 45, 20);
		frame.getContentPane().add(Juegos_no);
		
		Grupo_juegos.add(Juegos_si);
		Grupo_juegos.add(Juegos_no);
		
		JLabel texto_series = new JLabel("풲e gustan las series?");
		texto_series.setHorizontalAlignment(SwingConstants.CENTER);
		texto_series.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		texto_series.setBounds(10, 175, 170, 20);
		frame.getContentPane().add(texto_series);
		
		ButtonGroup Grupo_series = new ButtonGroup();
		
		JRadioButton Series_si = new JRadioButton("si");

		Series_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Series_si.setBounds(180, 175, 45, 20);
		frame.getContentPane().add(Series_si);
		
		JRadioButton Series_no = new JRadioButton("no");
		Series_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Series_no.setBounds(230, 175, 45, 20);
		frame.getContentPane().add(Series_no);
		
		Grupo_series.add(Series_si);
		Grupo_series.add(Series_no);
		
		JLabel texto_animes = new JLabel("풲e gustan los animes?");
		texto_animes.setHorizontalAlignment(SwingConstants.CENTER);
		texto_animes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		texto_animes.setBounds(10, 215, 170, 20);
		frame.getContentPane().add(texto_animes);
		
		ButtonGroup Grupo_animes = new ButtonGroup();
		
		JRadioButton Animes_si = new JRadioButton("si");
		Animes_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Animes_si.setBounds(180, 215, 45, 20);
		frame.getContentPane().add(Animes_si);
		
		JRadioButton Animes_no = new JRadioButton("no");
		Animes_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Animes_no.setBounds(230, 215, 45, 20);
		frame.getContentPane().add(Animes_no);
		
		Grupo_animes.add(Animes_si);
		Grupo_animes.add(Animes_no);
		
		JLabel texto_jardineria = new JLabel("풲e gusta la jardineria?");
		texto_jardineria.setHorizontalAlignment(SwingConstants.CENTER);
		texto_jardineria.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		texto_jardineria.setBounds(10, 255, 170, 20);
		frame.getContentPane().add(texto_jardineria);
		
		ButtonGroup Grupo_jardineria =  new ButtonGroup();
		
		JRadioButton Jardineria_si = new JRadioButton("si");
		Jardineria_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Jardineria_si.setBounds(180, 255, 45, 20);
		frame.getContentPane().add(Jardineria_si);
		
		JRadioButton Jardineria_no = new JRadioButton("no");
		Jardineria_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Jardineria_no.setBounds(230, 255, 45, 20);
		frame.getContentPane().add(Jardineria_no);
		
		Grupo_jardineria.add(Jardineria_si);
		Grupo_jardineria.add(Jardineria_no);
		
		JLabel texto_informatica = new JLabel("풲e gusta la informatica?");
		texto_informatica.setHorizontalAlignment(SwingConstants.CENTER);
		texto_informatica.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		texto_informatica.setBounds(10, 295, 170, 20);
		frame.getContentPane().add(texto_informatica);
		
		ButtonGroup Grupo_informatica =  new ButtonGroup();
		
		JRadioButton Informatica_si = new JRadioButton("si");
		Informatica_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Informatica_si.setBounds(180, 295, 45, 20);
		frame.getContentPane().add(Informatica_si);
		
		JRadioButton Informatica_no = new JRadioButton("no");
		Informatica_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Informatica_no.setBounds(230, 295, 45, 20);
		frame.getContentPane().add(Informatica_no);
		
		Grupo_informatica.add(Informatica_si);
		Grupo_informatica.add(Informatica_no);
		
		JLabel texto_Historia = new JLabel("풲e gusta la Historia?");
		texto_Historia.setHorizontalAlignment(SwingConstants.CENTER);
		texto_Historia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		texto_Historia.setBounds(10, 335, 170, 20);
		frame.getContentPane().add(texto_Historia);
		
		ButtonGroup Grupo_Historia =  new ButtonGroup();
		
		JRadioButton Historia_si = new JRadioButton("si");
		Historia_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Historia_si.setBounds(180, 335, 45, 20);
		frame.getContentPane().add(Historia_si);
		
		JRadioButton Historia_no = new JRadioButton("no");
		Historia_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Historia_no.setBounds(230, 335, 45, 20);
		frame.getContentPane().add(Historia_no);
		
		Grupo_Historia.add(Historia_si);
		Grupo_Historia.add(Historia_no);
		
		
		JButton Boton_CrearUsuario = new JButton("Crear usuario");
		Boton_CrearUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Boton_CrearUsuario.setBounds(70, 375, 137, 24);
		frame.getContentPane().add(Boton_CrearUsuario);
		
		JLabel Aviso_Nombre = new JLabel("Sin Nombre");
		Aviso_Nombre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Aviso_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Aviso_Nombre.setBounds(10, 39, 264, 20);
		frame.getContentPane().add(Aviso_Nombre);
		
		//Comprueba si el nombre esta repetido cada vez que dejamos el campo de texto
		Nombre_escrito.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String Nuevo_nombre = Nombre_escrito.getText();
				String Aviso_texto;
				if(NombreRepetido(listaPersonas, Nuevo_nombre)) {
					Aviso_texto = "Nombre no disponible";
					Aviso_Nombre.setText(Aviso_texto);
					Aviso_Nombre.setForeground(Color.red);
					Boton_CrearUsuario.setEnabled(false);

				}
				else {
					Aviso_texto = "Nombre disponible, intruduzca uno nuevo";
					Aviso_Nombre.setText(Aviso_texto);
					Aviso_Nombre.setForeground(Color.green);
					Boton_CrearUsuario.setEnabled(true);
					
				}
			}
		});
		Boton_CrearUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Deportes_si.isSelected()==true){Nuevas_Afinidades[0]=true;}
				if(Juegos_si.isSelected()==true){Nuevas_Afinidades[1]=true;}
				if(Series_si.isSelected()==true){Nuevas_Afinidades[2]=true;}
				if(Animes_si.isSelected()==true){Nuevas_Afinidades[3]=true;}
				if(Jardineria_si.isSelected()==true){Nuevas_Afinidades[4]=true;}
				if(Informatica_si.isSelected()==true){Nuevas_Afinidades[5]=true;}
				if(Historia_si.isSelected()==true){Nuevas_Afinidades[6]=true;}
				String Nuevo_nombre = Nombre_escrito.getText();
				Persona Nuevo_usuario = new Persona(Nuevo_nombre, Nuevas_Afinidades, listaPersonas);
				System.out.println(Nuevo_usuario.toString());
			}
		});
		

	}
}
