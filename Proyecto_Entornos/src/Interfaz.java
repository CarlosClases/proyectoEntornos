import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Nombre = new JLabel("Nombre de usuario:");
		Nombre.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Nombre.setBounds(10, 13, 121, 14);
		frame.getContentPane().add(Nombre);
		
		Nombre_escrito = new JTextField();
		Nombre_escrito.setBounds(141, 11, 137, 20);
		frame.getContentPane().add(Nombre_escrito);
		Nombre_escrito.setColumns(10);
		
		JLabel Gustos = new JLabel("G U S T O S");
		Gustos.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Gustos.setBounds(70, 40, 109, 24);
		frame.getContentPane().add(Gustos);
		
		JLabel texto_deportes = new JLabel("풲e gustan los deportes?");
		texto_deportes.setHorizontalAlignment(SwingConstants.CENTER);
		texto_deportes.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		texto_deportes.setBounds(10, 70, 170, 20);
		frame.getContentPane().add(texto_deportes);
		
		ButtonGroup Grupo_deportes = new ButtonGroup();
		
		JRadioButton Deportes_si = new JRadioButton("si");
		Deportes_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Deportes_si.setBounds(180, 70, 45, 20);
		frame.getContentPane().add(Deportes_si);
		
		JRadioButton Deportes_no = new JRadioButton("no");
		Deportes_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Deportes_no.setBounds(230, 70, 45, 20);
		frame.getContentPane().add(Deportes_no);
		
		Grupo_deportes.add(Deportes_si);
		Grupo_deportes.add(Deportes_no);
		
		JLabel texto_juegos = new JLabel("풲e gustan los juegos?");
		texto_juegos.setHorizontalAlignment(SwingConstants.CENTER);
		texto_juegos.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		texto_juegos.setBounds(10, 110, 170, 20);
		frame.getContentPane().add(texto_juegos);
		
		ButtonGroup Grupo_juegos = new ButtonGroup();
		
		JRadioButton Juegos_si = new JRadioButton("si");
		Juegos_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Juegos_si.setBounds(180, 110, 45, 20);
		frame.getContentPane().add(Juegos_si);
		
		JRadioButton Juegos_no = new JRadioButton("no");
		Juegos_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Juegos_no.setBounds(230, 110, 45, 20);
		frame.getContentPane().add(Juegos_no);
		
		Grupo_juegos.add(Juegos_si);
		Grupo_juegos.add(Juegos_no);
		
		JLabel texto_series = new JLabel("풲e gustan las series?");
		texto_series.setHorizontalAlignment(SwingConstants.CENTER);
		texto_series.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		texto_series.setBounds(10, 150, 170, 20);
		frame.getContentPane().add(texto_series);
		
		ButtonGroup Grupo_series = new ButtonGroup();
		
		JRadioButton Series_si = new JRadioButton("si");
		Series_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Series_si.setBounds(180, 150, 45, 20);
		frame.getContentPane().add(Series_si);
		
		JRadioButton Series_no = new JRadioButton("no");
		Series_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Series_no.setBounds(230, 150, 45, 20);
		frame.getContentPane().add(Series_no);
		
		Grupo_series.add(Series_si);
		Grupo_series.add(Series_no);
		
		JLabel texto_animes = new JLabel("풲e gustan los animes?");
		texto_animes.setHorizontalAlignment(SwingConstants.CENTER);
		texto_animes.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		texto_animes.setBounds(10, 190, 170, 20);
		frame.getContentPane().add(texto_animes);
		
		ButtonGroup Grupo_animes = new ButtonGroup();
		
		JRadioButton Animes_si = new JRadioButton("si");
		Animes_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Animes_si.setBounds(180, 190, 45, 20);
		frame.getContentPane().add(Animes_si);
		
		JRadioButton Animes_no = new JRadioButton("no");
		Animes_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Animes_no.setBounds(230, 190, 45, 20);
		frame.getContentPane().add(Animes_no);
		
		Grupo_animes.add(Animes_si);
		Grupo_animes.add(Animes_no);
		
		JLabel texto_jardineria = new JLabel("풲e gusta la jardineria?");
		texto_jardineria.setHorizontalAlignment(SwingConstants.CENTER);
		texto_jardineria.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		texto_jardineria.setBounds(10, 230, 170, 20);
		frame.getContentPane().add(texto_jardineria);
		
		ButtonGroup Grupo_jardineria =  new ButtonGroup();
		
		JRadioButton Jardineria_si = new JRadioButton("si");
		Jardineria_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Jardineria_si.setBounds(180, 230, 45, 20);
		frame.getContentPane().add(Jardineria_si);
		
		JRadioButton Jardineria_no = new JRadioButton("no");
		Jardineria_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Jardineria_no.setBounds(230, 230, 45, 20);
		frame.getContentPane().add(Jardineria_no);
		
		Grupo_jardineria.add(Jardineria_si);
		Grupo_jardineria.add(Jardineria_no);
		
		JLabel texto_informatica = new JLabel("풲e gusta la informatica?");
		texto_informatica.setHorizontalAlignment(SwingConstants.CENTER);
		texto_informatica.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		texto_informatica.setBounds(10, 270, 170, 20);
		frame.getContentPane().add(texto_informatica);
		
		ButtonGroup Grupo_informatica =  new ButtonGroup();
		
		JRadioButton Informatica_si = new JRadioButton("si");
		Informatica_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Informatica_si.setBounds(180, 270, 45, 20);
		frame.getContentPane().add(Informatica_si);
		
		JRadioButton Informatica_no = new JRadioButton("no");
		Informatica_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Informatica_no.setBounds(230, 270, 45, 20);
		frame.getContentPane().add(Informatica_no);
		
		Grupo_informatica.add(Informatica_si);
		Grupo_informatica.add(Informatica_no);
		
		JLabel texto_Historia = new JLabel("풲e gusta la Historia?");
		texto_Historia.setHorizontalAlignment(SwingConstants.CENTER);
		texto_Historia.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		texto_Historia.setBounds(10, 310, 170, 20);
		frame.getContentPane().add(texto_Historia);
		
		ButtonGroup Grupo_Historia =  new ButtonGroup();
		
		JRadioButton Historia_si = new JRadioButton("si");
		Historia_si.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Historia_si.setBounds(180, 310, 45, 20);
		frame.getContentPane().add(Historia_si);
		
		JRadioButton Historia_no = new JRadioButton("no");
		Historia_no.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Historia_no.setBounds(230, 310, 45, 20);
		frame.getContentPane().add(Historia_no);
		
		Grupo_Historia.add(Historia_si);
		Grupo_Historia.add(Historia_no);
		
		JButton Boton_CrearUsuario = new JButton("Crear usuario");
		Boton_CrearUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Boton_CrearUsuario.setBounds(72, 350, 109, 24);
		frame.getContentPane().add(Boton_CrearUsuario);
		
	}
}
