package agenda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 458, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel IdLabel = new JLabel("Id:");
		IdLabel.setBounds(41, 25, 46, 14);
		contentPane.add(IdLabel);
		
		JLabel firstNameLabel = new JLabel("Nombre:");
		firstNameLabel.setBounds(41, 50, 46, 14);
		contentPane.add(firstNameLabel);
		
		textField = new JTextField();
		textField.setBounds(163, 257, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel LastNameLabel = new JLabel("Apellido:");
		LastNameLabel.setBounds(41, 75, 46, 14);
		contentPane.add(LastNameLabel);
		
		JLabel mailLabel = new JLabel("Correo:");
		mailLabel.setBounds(41, 125, 46, 14);
		contentPane.add(mailLabel);
		
		JLabel phoneLabel = new JLabel("Telefono:");
		phoneLabel.setBounds(41, 100, 46, 14);
		contentPane.add(phoneLabel);
	}
}
