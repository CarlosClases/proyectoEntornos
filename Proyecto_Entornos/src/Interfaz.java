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
import javax.swing.ImageIcon;
import java.awt.Checkbox;


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
		frame.setBounds(100, 100, 660, 550);
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
		
		JLabel Icon_Deportes = new JLabel("");
		Icon_Deportes.setForeground(Color.BLACK);
		Icon_Deportes.setIcon(new ImageIcon(Interfaz.class.getResource("/iconos/Deportes.png")));
		Icon_Deportes.setBounds(20, 155, 70, 65);
		Icon_Deportes.setHorizontalAlignment(SwingConstants.CENTER);
		Icon_Deportes.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(Icon_Deportes);
		
		JLabel Icon_Juegos = new JLabel("");
		Icon_Juegos.setIcon(new ImageIcon(Interfaz.class.getResource("/iconos/Juegos.png")));
		Icon_Juegos.setHorizontalAlignment(SwingConstants.CENTER);
		Icon_Juegos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Icon_Juegos.setBounds(120, 150, 70, 65);
		frame.getContentPane().add(Icon_Juegos);
		
		Checkbox checkbox_Juegos = new Checkbox("");
		checkbox_Juegos.setBounds(150, 220, 25, 30);
		frame.getContentPane().add(checkbox_Juegos);
		
		Checkbox checkbox_Deportes = new Checkbox("");
		checkbox_Deportes.setBounds(50, 220, 25, 30);
		frame.getContentPane().add(checkbox_Deportes);
		
		JLabel Icon_Series = new JLabel("");
		Icon_Series.setIcon(new ImageIcon(Interfaz.class.getResource("/iconos/Series.png")));
		Icon_Series.setHorizontalAlignment(SwingConstants.CENTER);
		Icon_Series.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Icon_Series.setBounds(220, 150, 70, 65);
		frame.getContentPane().add(Icon_Series);
		
		Checkbox checkbox_Series = new Checkbox("");
		checkbox_Series.setBounds(250, 220, 25, 30);
		frame.getContentPane().add(checkbox_Series);
		
		JLabel Icon_Animes = new JLabel("");
		Icon_Animes.setIcon(new ImageIcon(Interfaz.class.getResource("/iconos/Animes.png")));
		Icon_Animes.setHorizontalAlignment(SwingConstants.CENTER);
		Icon_Animes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Icon_Animes.setBounds(20, 255, 70, 65);
		frame.getContentPane().add(Icon_Animes);
		
		Checkbox checkbox_Animes = new Checkbox("");
		checkbox_Animes.setBounds(50, 320, 25, 30);
		frame.getContentPane().add(checkbox_Animes);
		
		JLabel Icon_Jardineria = new JLabel("");
		Icon_Jardineria.setToolTipText("");
		Icon_Jardineria.setIcon(new ImageIcon(Interfaz.class.getResource("/iconos/Jardineria.png")));
		Icon_Jardineria.setHorizontalAlignment(SwingConstants.CENTER);
		Icon_Jardineria.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Icon_Jardineria.setBounds(120, 250, 70, 65);
		frame.getContentPane().add(Icon_Jardineria);
		
		Checkbox checkbox_Jardineria = new Checkbox("");
		checkbox_Jardineria.setBounds(145, 320, 25, 30);
		frame.getContentPane().add(checkbox_Jardineria);
		
		JLabel Icon_Informatica = new JLabel("");
		Icon_Informatica.setIcon(new ImageIcon(Interfaz.class.getResource("/iconos/Informatica.png")));
		Icon_Informatica.setToolTipText("");
		Icon_Informatica.setHorizontalAlignment(SwingConstants.CENTER);
		Icon_Informatica.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Icon_Informatica.setBounds(220, 250, 70, 65);
		frame.getContentPane().add(Icon_Informatica);
		
		Checkbox checkbox_Informatica = new Checkbox("");
		checkbox_Informatica.setBounds(245, 320, 25, 30);
		frame.getContentPane().add(checkbox_Informatica);
		
		JLabel Icon_Historia = new JLabel("");
		Icon_Historia.setIcon(new ImageIcon(Interfaz.class.getResource("/iconos/Historia.png")));
		Icon_Historia.setToolTipText("");
		Icon_Historia.setHorizontalAlignment(SwingConstants.CENTER);
		Icon_Historia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Icon_Historia.setBounds(120, 356, 70, 65);
		frame.getContentPane().add(Icon_Historia);
		
		Checkbox checkbox_Historia = new Checkbox("");
		checkbox_Historia.setBounds(145, 426, 25, 30);
		frame.getContentPane().add(checkbox_Historia);
		
		JButton Boton_CrearUsuario = new JButton("Crear usuario");
		Boton_CrearUsuario.setBounds(88, 462, 137, 24);
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
						/*
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
						*/
					}
				});
		
		Canvas Separador_General = new Canvas();
		Separador_General.setBounds(309, 11, 3, 455);
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
