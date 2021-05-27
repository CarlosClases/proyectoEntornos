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
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Interfaz {

	private JFrame frame;
	private JTextField Nombre_escrito_Crear;
	private JTextField Nombre_gestionar;
	private JTextField Segundo_usuario_Gestionar;

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
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.setBounds(100, 100, 660, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Titulo_Crear = new JLabel("CREAR USUARIOS");
		Titulo_Crear.setBounds(10, 10, 270, 30);
		Titulo_Crear.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		Titulo_Crear.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Titulo_Crear);
		
		JLabel Nombre_Etiqueta_Crear = new JLabel("Nombre de usuario:");
		Nombre_Etiqueta_Crear.setBounds(25, 60, 120, 15);
		Nombre_Etiqueta_Crear.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Nombre_Etiqueta_Crear);
		
		Nombre_escrito_Crear = new JTextField();
		Nombre_escrito_Crear.setBounds(155, 60, 135, 20);
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
		
		Checkbox checkbox_Deportes = new Checkbox("");
		checkbox_Deportes.setBounds(50, 220, 25, 30);
		frame.getContentPane().add(checkbox_Deportes);
		
		JLabel Icon_Juegos = new JLabel("");
		Icon_Juegos.setIcon(new ImageIcon(Interfaz.class.getResource("/iconos/Juegos.png")));
		Icon_Juegos.setHorizontalAlignment(SwingConstants.CENTER);
		Icon_Juegos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Icon_Juegos.setBounds(120, 150, 70, 65);
		frame.getContentPane().add(Icon_Juegos);
		
		Checkbox checkbox_Juegos = new Checkbox("");
		checkbox_Juegos.setBounds(150, 220, 25, 30);
		frame.getContentPane().add(checkbox_Juegos);
		
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
		Boton_CrearUsuario.setEnabled(false);
		Boton_CrearUsuario.setBounds(88, 462, 137, 24);
		Boton_CrearUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Boton_CrearUsuario);
		
		JLabel Aviso_Nombre = new JLabel("Sin Nombre");
		Aviso_Nombre.setBounds(10, 91, 264, 30);
		Aviso_Nombre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Aviso_Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(Aviso_Nombre);
		
				Nombre_escrito_Crear.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						Metodos_estaticos.Comprobar_Nombre(listaPersonas,
														   Nombre_escrito_Crear,
														   Aviso_Nombre,
														   Boton_CrearUsuario);
					}
				});
				Boton_CrearUsuario.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Metodos_estaticos.Crear_usuario(checkbox_Deportes,
														checkbox_Juegos,
														checkbox_Series,
														checkbox_Animes,
														checkbox_Jardineria,
														checkbox_Informatica,
														checkbox_Historia,
														Nombre_escrito_Crear,
														listaPersonas,
														Aviso_Nombre,
														Boton_CrearUsuario);
					}
				});
		
		Canvas Separador_General = new Canvas();
		Separador_General.setBounds(300, 10, 5, 460);
		Separador_General.setBackground(Color.BLACK);
		Separador_General.setForeground(Color.WHITE);
		frame.getContentPane().add(Separador_General);
		
		JLabel Titulo_Gestionar = new JLabel("GESTIONAR USUARIOS");
		Titulo_Gestionar.setBounds(350, 10, 270, 30);
		Titulo_Gestionar.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo_Gestionar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		frame.getContentPane().add(Titulo_Gestionar);
		
		JLabel Nombre_Etiqueta_Gestionar = new JLabel("Nombre de usuario:");
		Nombre_Etiqueta_Gestionar.setBounds(340, 65, 120, 15);
		Nombre_Etiqueta_Gestionar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Nombre_Etiqueta_Gestionar);
		
		Nombre_gestionar = new JTextField();
		Nombre_gestionar.setBounds(470, 65, 140, 20);
		Nombre_gestionar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Nombre_gestionar.setColumns(10);
		frame.getContentPane().add(Nombre_gestionar);
		
		JLabel lblCompatibilidad = new JLabel("Compatibilidad");
		lblCompatibilidad.setBounds(400, 100, 155, 25);
		lblCompatibilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompatibilidad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		frame.getContentPane().add(lblCompatibilidad);
		
		JLabel Nombre_Etiqueta_usu2 = new JLabel("Segundo usuario");
		Nombre_Etiqueta_usu2.setBounds(310, 170, 155, 24);
		Nombre_Etiqueta_usu2.setHorizontalAlignment(SwingConstants.CENTER);
		Nombre_Etiqueta_usu2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(Nombre_Etiqueta_usu2);
		
		Canvas Separador_Compatibilidad = new Canvas();
		Separador_Compatibilidad.setBounds(475, 150, 3, 125);
		Separador_Compatibilidad.setForeground(Color.WHITE);
		Separador_Compatibilidad.setBackground(Color.BLACK);
		frame.getContentPane().add(Separador_Compatibilidad);
		
		JLabel lblCompatibilidadPersonal = new JLabel("Compatibilidad Personal");
		lblCompatibilidadPersonal.setBounds(310, 145, 155, 25);
		lblCompatibilidadPersonal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompatibilidadPersonal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		frame.getContentPane().add(lblCompatibilidadPersonal);
		
		Segundo_usuario_Gestionar = new JTextField();
		Segundo_usuario_Gestionar.setBounds(318, 203, 142, 20);
		Segundo_usuario_Gestionar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Segundo_usuario_Gestionar.setColumns(10);
		frame.getContentPane().add(Segundo_usuario_Gestionar);
		
		JButton Comprobar_Personal = new JButton("Comprobar");
		Comprobar_Personal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Comprobar_Personal.setBounds(310, 235, 150, 45);
		frame.getContentPane().add(Comprobar_Personal);
		
		JButton Comprobar_General = new JButton("");
		Comprobar_General.setIcon(new ImageIcon(Interfaz.class.getResource("/iconos/Compatibilidad_General.png")));
		Comprobar_General.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Comprobar_General.setBounds(485, 170, 145, 80);
		frame.getContentPane().add(Comprobar_General);
		
		JTextPane Resultados_Compatiblidad = new JTextPane();
		Resultados_Compatiblidad.setEditable(false);
		Resultados_Compatiblidad.setBounds(320, 320, 310, 150);
		frame.getContentPane().add(Resultados_Compatiblidad);
		
		Comprobar_Personal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Metodos_estaticos.Compatibilidad_Individual(listaPersonas,
															Nombre_gestionar,
															Segundo_usuario_Gestionar,
															Resultados_Compatiblidad);
			}
		});
		Comprobar_General.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Metodos_estaticos.Compatibilidad_General(listaPersonas,
														 Nombre_gestionar,
														 Resultados_Compatiblidad);
			}
		});
	}
}
