package dw1a_2023_3eva_almelaMary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;
	private MetodosVentana metodos= new MetodosVentana();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto1 = new JTextField();
		texto1.setBounds(35, 42, 105, 39);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.setBounds(150, 42, 103, 39);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		JLabel etiqueta = new JLabel("");
		etiqueta.setBounds(35, 138, 218, 48);
		contentPane.add(etiqueta);
		
		JButton guardarBoton = new JButton("Guardar");
		guardarBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre;
				Double poblacion;
				Pais pais;
				if(!texto1.getText().isEmpty()&&!texto2.getText().isEmpty()) {
					nombre=texto1.getText();
					try {
					poblacion=Double.parseDouble(texto2.getText());	
					pais = new Pais(nombre,poblacion,0,0);
					if(metodos.insertar(pais)) {
						etiqueta.setText("Datos almacenados");
					} else {
						etiqueta.setText("Error al guardar los datos");
					}
					} catch (NumberFormatException e1) {
						etiqueta.setText("Error al guardar los datos");
					}
				}
			}
		});
		guardarBoton.setBounds(285, 125, 89, 23);
		contentPane.add(guardarBoton);
		
		JButton buscarBoton = new JButton("Buscar");
		buscarBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pais pais;
				if(!texto1.getText().isEmpty()) {
					pais = metodos.buscarPais(texto1.getText());
					if(pais!=null) {
						texto2.setText(Double.toString(pais.getPoblacion()));
					} else {
						etiqueta.setText("No existe el pais");
					}
				} else {
					etiqueta.setText("No puede estar vacío");
				}
			}
		});
		buscarBoton.setBounds(285, 163, 89, 23);
		contentPane.add(buscarBoton);
		
		lblNewLabel = new JLabel("Pais");
		lblNewLabel.setBounds(57, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Población");
		lblNewLabel_1.setBounds(176, 24, 46, 14);
		contentPane.add(lblNewLabel_1);
		metodos.comenzar();
	}
	
	
}
