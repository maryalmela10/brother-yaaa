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
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idTextField;
	private JTextField lastNameTextField;
	private JTextField nameTextField;
	private JTextField numberTextField;
	private JTextField mailTextField;
	private JTextField bigtextField;
	private JTextField recordLabel;

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
		setBounds(100, 100, 374, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel IdLabel = new JLabel("Id:");
		IdLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		IdLabel.setBounds(22, 24, 46, 14);
		contentPane.add(IdLabel);
		
		JLabel firstNameLabel = new JLabel("Nombre:");
		firstNameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		firstNameLabel.setBounds(22, 49, 61, 14);
		contentPane.add(firstNameLabel);
		
		idTextField = new JTextField();
		idTextField.setBounds(89, 23, 86, 20);
		contentPane.add(idTextField);
		idTextField.setColumns(10);
		
		JLabel LastNameLabel = new JLabel("Apellido:");
		LastNameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		LastNameLabel.setBounds(22, 74, 79, 14);
		contentPane.add(LastNameLabel);
		
		JLabel mailLabel = new JLabel("Correo:");
		mailLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		mailLabel.setBounds(22, 124, 61, 14);
		contentPane.add(mailLabel);
		
		JLabel phoneLabel = new JLabel("Telefono:");
		phoneLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		phoneLabel.setBounds(22, 99, 71, 14);
		contentPane.add(phoneLabel);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setColumns(10);
		lastNameTextField.setBounds(89, 73, 86, 20);
		contentPane.add(lastNameTextField);
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameTextField.setBounds(89, 48, 86, 20);
		contentPane.add(nameTextField);
		
		numberTextField = new JTextField();
		numberTextField.setColumns(10);
		numberTextField.setBounds(89, 99, 86, 20);
		contentPane.add(numberTextField);
		
		mailTextField = new JTextField();
		mailTextField.setColumns(10);
		mailTextField.setBounds(89, 123, 86, 20);
		contentPane.add(mailTextField);
		
		JButton insertButton = new JButton("INSERT");
		insertButton.setBounds(214, 24, 110, 35);
		contentPane.add(insertButton);
		
		JButton updateButton = new JButton("UPDATE");
		updateButton.setBounds(214, 65, 110, 35);
		contentPane.add(updateButton);
		
		JButton deleteButton = new JButton("DELETE");
		deleteButton.setBounds(214, 106, 110, 35);
		contentPane.add(deleteButton);
		
		JButton deleteButton_1 = new JButton("SELECT");
		deleteButton_1.setBounds(214, 146, 110, 35);
		contentPane.add(deleteButton_1);
		
		bigtextField = new JTextField();
		bigtextField.setBounds(22, 209, 311, 65);
		contentPane.add(bigtextField);
		bigtextField.setColumns(10);
		
		recordLabel = new JTextField();
		recordLabel.setText("50");
		recordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		recordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		recordLabel.setBounds(150, 305, 35, 30);
		contentPane.add(recordLabel);
		recordLabel.setColumns(10);
		
		JLabel lastRecordLabel = new JLabel("/50");
		lastRecordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lastRecordLabel.setBounds(188, 305, 35, 30);
		contentPane.add(lastRecordLabel);
		
		JButton lastRecordButton = new JButton("A");
		lastRecordButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lastRecordButton.setBounds(86, 305, 46, 30);
		contentPane.add(lastRecordButton);
		
		JButton firstRecordButton = new JButton("P");
		firstRecordButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		firstRecordButton.setBounds(20, 305, 59, 30);
		contentPane.add(firstRecordButton);
		
		JButton nextRecordButton = new JButton("S");
		nextRecordButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nextRecordButton.setBounds(233, 305, 46, 30);
		contentPane.add(nextRecordButton);
		
		JButton theLastRecordButton = new JButton("U");
		theLastRecordButton.setBounds(284, 305, 59, 30);
		contentPane.add(theLastRecordButton);
	}
}
