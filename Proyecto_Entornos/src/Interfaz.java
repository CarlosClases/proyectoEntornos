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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Canvas;
import java.awt.Button;


public class Interfaz {

	private JFrame frame;
	private JTextField Nombre_escrito_Crear;
	private JTextField Nombre_escrito_gestionar;
	private JTextField Segundo_usuario;

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
		frame.setBounds(100, 100, 660, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Titulo_1 = new JLabel("CREAR USUARIOS");
		Titulo_1.setBounds(10, 10, 270, 30);
		Titulo_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		Titulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Titulo_1);
		
		JLabel Nombre_Crear = new JLabel("Nombre de usuario:");
		Nombre_Crear.setBounds(10, 66, 121, 14);
		Nombre_Crear.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Nombre_Crear);
		
		Nombre_escrito_Crear = new JTextField();
		Nombre_escrito_Crear.setBounds(141, 64, 137, 20);
		Nombre_escrito_Crear.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Nombre_escrito_Crear);
		Nombre_escrito_Crear.setColumns(10);
		
		JLabel Gustos = new JLabel("A  F  I  C  I  O  N  E  S");
		Gustos.setBounds(70, 119, 155, 24);
		Gustos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		frame.getContentPane().add(Gustos);
		
		JLabel texto_deportes = new JLabel("풲e gustan los deportes?");
		texto_deportes.setBounds(10, 147, 170, 20);
		texto_deportes.setHorizontalAlignment(SwingConstants.CENTER);
		texto_deportes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(texto_deportes);
		
		ButtonGroup Grupo_deportes = new ButtonGroup();
		
		JRadioButton Deportes_si = new JRadioButton("si");
		Deportes_si.setBounds(180, 147, 45, 20);
		Deportes_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Deportes_si);
		
		JRadioButton Deportes_no = new JRadioButton("no");
		Deportes_no.setBounds(230, 147, 45, 20);
		Deportes_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Deportes_no);
		
		Grupo_deportes.add(Deportes_si);
		Grupo_deportes.add(Deportes_no);
		
		
		JLabel texto_juegos = new JLabel("풲e gustan los juegos?");
		texto_juegos.setBounds(10, 187, 170, 20);
		texto_juegos.setHorizontalAlignment(SwingConstants.CENTER);
		texto_juegos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(texto_juegos);
		
		ButtonGroup Grupo_juegos = new ButtonGroup();
		
		JRadioButton Juegos_si = new JRadioButton("si");
		Juegos_si.setBounds(180, 187, 45, 20);
		Juegos_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Juegos_si);
		
		JRadioButton Juegos_no = new JRadioButton("no");
		Juegos_no.setBounds(230, 187, 45, 20);
		Juegos_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Juegos_no);
		
		Grupo_juegos.add(Juegos_si);
		Grupo_juegos.add(Juegos_no);
		
		JLabel texto_series = new JLabel("풲e gustan las series?");
		texto_series.setBounds(10, 227, 170, 20);
		texto_series.setHorizontalAlignment(SwingConstants.CENTER);
		texto_series.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(texto_series);
		
		ButtonGroup Grupo_series = new ButtonGroup();
		
		JRadioButton Series_si = new JRadioButton("si");
		Series_si.setBounds(180, 227, 45, 20);

		Series_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Series_si);
		
		JRadioButton Series_no = new JRadioButton("no");
		Series_no.setBounds(230, 227, 45, 20);
		Series_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Series_no);
		
		Grupo_series.add(Series_si);
		Grupo_series.add(Series_no);
		
		JLabel texto_animes = new JLabel("풲e gustan los animes?");
		texto_animes.setBounds(10, 267, 170, 20);
		texto_animes.setHorizontalAlignment(SwingConstants.CENTER);
		texto_animes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(texto_animes);
		
		ButtonGroup Grupo_animes = new ButtonGroup();
		
		JRadioButton Animes_si = new JRadioButton("si");
		Animes_si.setBounds(180, 267, 45, 20);
		Animes_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Animes_si);
		
		JRadioButton Animes_no = new JRadioButton("no");
		Animes_no.setBounds(230, 267, 45, 20);
		Animes_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Animes_no);
		
		Grupo_animes.add(Animes_si);
		Grupo_animes.add(Animes_no);
		
		JLabel texto_jardineria = new JLabel("풲e gusta la jardineria?");
		texto_jardineria.setBounds(10, 307, 170, 20);
		texto_jardineria.setHorizontalAlignment(SwingConstants.CENTER);
		texto_jardineria.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(texto_jardineria);
		
		ButtonGroup Grupo_jardineria =  new ButtonGroup();
		
		JRadioButton Jardineria_si = new JRadioButton("si");
		Jardineria_si.setBounds(180, 307, 45, 20);
		Jardineria_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Jardineria_si);
		
		JRadioButton Jardineria_no = new JRadioButton("no");
		Jardineria_no.setBounds(230, 307, 45, 20);
		Jardineria_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Jardineria_no);
		
		Grupo_jardineria.add(Jardineria_si);
		Grupo_jardineria.add(Jardineria_no);
		
		JLabel texto_informatica = new JLabel("풲e gusta la informatica?");
		texto_informatica.setBounds(10, 347, 170, 20);
		texto_informatica.setHorizontalAlignment(SwingConstants.CENTER);
		texto_informatica.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(texto_informatica);
		
		ButtonGroup Grupo_informatica =  new ButtonGroup();
		
		JRadioButton Informatica_si = new JRadioButton("si");
		Informatica_si.setBounds(180, 347, 45, 20);
		Informatica_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Informatica_si);
		
		JRadioButton Informatica_no = new JRadioButton("no");
		Informatica_no.setBounds(230, 347, 45, 20);
		Informatica_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Informatica_no);
		
		Grupo_informatica.add(Informatica_si);
		Grupo_informatica.add(Informatica_no);
		
		JLabel texto_Historia = new JLabel("풲e gusta la Historia?");
		texto_Historia.setBounds(10, 387, 170, 20);
		texto_Historia.setHorizontalAlignment(SwingConstants.CENTER);
		texto_Historia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(texto_Historia);
		
		ButtonGroup Grupo_Historia =  new ButtonGroup();
		
		JRadioButton Historia_si = new JRadioButton("si");
		Historia_si.setBounds(180, 387, 45, 20);
		Historia_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Historia_si);
		
		JRadioButton Historia_no = new JRadioButton("no");
		Historia_no.setBounds(230, 387, 45, 20);
		Historia_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Historia_no);
		
		Grupo_Historia.add(Historia_si);
		Grupo_Historia.add(Historia_no);
		
		
		JButton Boton_CrearUsuario = new JButton("Crear usuario");
		Boton_CrearUsuario.setBounds(70, 418, 137, 24);
		Boton_CrearUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Boton_CrearUsuario);
		
		JLabel Aviso_Nombre = new JLabel("Sin Nombre");
		Aviso_Nombre.setBounds(10, 91, 264, 30);
		Aviso_Nombre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Aviso_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Aviso_Nombre);
		
		//Comprueba si el nombre esta repetido cada vez que dejamos el campo de texto
				Nombre_escrito_Crear.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						String Nuevo_nombre = Nombre_escrito_Crear.getText();
						String Aviso_texto;
						if(NombreRepetido(listaPersonas, Nuevo_nombre)) {
							Aviso_Nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
							Aviso_texto = "Nombre no disponible, intruduzca uno nuevo";
							Aviso_Nombre.setText(Aviso_texto);
							Aviso_Nombre.setForeground(Color.red);
							Boton_CrearUsuario.setEnabled(false);

						}
						else {
							Aviso_texto = "Nombre disponible";
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
						String Nuevo_nombre = Nombre_escrito_Crear.getText();
						Persona Nuevo_usuario = new Persona(Nuevo_nombre, Nuevas_Afinidades, listaPersonas);
						System.out.println(Nuevo_usuario.toString());
					}
				});
		
		Canvas Separador_General = new Canvas();
		Separador_General.setBounds(309, 11, 3, 432);
		Separador_General.setBackground(Color.BLACK);
		Separador_General.setForeground(Color.WHITE);
		frame.getContentPane().add(Separador_General);
		
		JLabel Titulo_2 = new JLabel("GESTIONAR USUARIOS");
		Titulo_2.setBounds(350, 11, 268, 33);
		Titulo_2.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		frame.getContentPane().add(Titulo_2);
		
		JLabel Nombre_Gestionar = new JLabel("Nombre de usuario:");
		Nombre_Gestionar.setBounds(339, 66, 121, 14);
		Nombre_Gestionar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Nombre_Gestionar);
		
		Nombre_escrito_gestionar = new JTextField();
		Nombre_escrito_gestionar.setBounds(470, 64, 137, 20);
		Nombre_escrito_gestionar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Nombre_escrito_gestionar.setColumns(10);
		frame.getContentPane().add(Nombre_escrito_gestionar);
		
		JLabel lblCompatibilidad = new JLabel("Compatibilidad");
		lblCompatibilidad.setBounds(399, 100, 155, 24);
		lblCompatibilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompatibilidad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		frame.getContentPane().add(lblCompatibilidad);
		
		JLabel Nombre_Gestionar_usu2 = new JLabel("Segundo usuario");
		Nombre_Gestionar_usu2.setBounds(319, 168, 121, 24);
		Nombre_Gestionar_usu2.setHorizontalAlignment(SwingConstants.CENTER);
		Nombre_Gestionar_usu2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Nombre_Gestionar_usu2);
		
		Canvas Separador_Compativilidad = new Canvas();
		Separador_Compativilidad.setBounds(475, 150, 3, 125);
		Separador_Compativilidad.setForeground(Color.WHITE);
		Separador_Compativilidad.setBackground(Color.BLACK);
		frame.getContentPane().add(Separador_Compativilidad);
		
		JLabel lblCompatibilidadPersonal = new JLabel("Compatibilidad Personal");
		lblCompatibilidadPersonal.setBounds(309, 143, 155, 24);
		lblCompatibilidadPersonal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompatibilidadPersonal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		frame.getContentPane().add(lblCompatibilidadPersonal);
		
		Segundo_usuario = new JTextField();
		Segundo_usuario.setBounds(318, 203, 142, 20);
		Segundo_usuario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Segundo_usuario.setColumns(10);
		frame.getContentPane().add(Segundo_usuario);
		
		JLabel lblCompatibilidadPersonal_1_1 = new JLabel("Compatibilidad General");
		lblCompatibilidadPersonal_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompatibilidadPersonal_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblCompatibilidadPersonal_1_1.setBounds(489, 143, 155, 24);
		frame.getContentPane().add(lblCompatibilidadPersonal_1_1);
		
		JButton Comprobar_Personal = new JButton("Comprobar \n compatibilidad");
		Comprobar_Personal.setFont(new Font("Times New Roman", Font.BOLD, 10));
		Comprobar_Personal.setBounds(318, 234, 151, 46);
		frame.getContentPane().add(Comprobar_Personal);
		
		JButton Comprobar_Personal_1 = new JButton("Comprobar");
		Comprobar_Personal_1.setBounds(517, 203, 89, 23);
		frame.getContentPane().add(Comprobar_Personal_1);
		

	}
}
