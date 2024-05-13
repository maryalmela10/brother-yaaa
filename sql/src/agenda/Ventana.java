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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idTextField;
	private JTextField lastNameTextField;
	private JTextField nameTextField;
	private JTextField numberTextField;
	private JTextField mailTextField;
	private JTextField recordLabel;
	Agenda newAgenda = new Agenda();

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				newAgenda.closeConnection();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 361);
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

		JLabel bigField = new JLabel("");
		bigField.setBackground(new Color(255, 255, 255));
		bigField.setForeground(new Color(0, 0, 0));
		bigField.setBounds(22, 177, 422, 70);
		contentPane.add(bigField);
		
		JLabel lastRecordLabel = new JLabel("/"+Integer.toString(newAgenda.records()));
		lastRecordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lastRecordLabel.setBounds(240, 266, 35, 30);
		contentPane.add(lastRecordLabel);
		
		recordLabel = new JTextField();
		recordLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigField.setText("");
				String firstName = null, lastName = null, mail = null;
				int number = 0, id = 0;
				Contacto newContact;
				newContact=newAgenda.findContact(Integer.parseInt(recordLabel.getText()));
				if(newContact!=null) {
					idTextField.setText(Integer.toString(newContact.getId()));
					nameTextField.setText(newContact.getFirstName());
					lastNameTextField.setText(newContact.getLastName());
					numberTextField.setText(Integer.toString(newContact.getNumber()));
					mailTextField.setText(newContact.getMail());
				} else {
					bigField.setText("Ingresa un indice dentro del rango");
				}
				
			}
		});
		recordLabel.setText("0");
		recordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		recordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		recordLabel.setBounds(200, 266, 35, 30);
		contentPane.add(recordLabel);
		recordLabel.setColumns(10);

		JButton insertButton = new JButton("INSERT");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigField.setText("");
				String firstName = null, lastName = null, mail = null;
				int number = 0, id = 0;
				Contacto newContact;
				if (nameTextField.getText() == null || nameTextField.getText().isEmpty()
						|| lastNameTextField.getText() == null || lastNameTextField.getText().isEmpty()
						|| mailTextField.getText() == null || mailTextField.getText().isEmpty()
						|| numberTextField.getText() == null || numberTextField.getText().isEmpty()
						|| idTextField.getText() == null || idTextField.getText().isEmpty()) {
					bigField.setText("No puede quedar ningun campo vacío");
				} else {
					firstName = nameTextField.getText();
					lastName = lastNameTextField.getText();
					mail = mailTextField.getText();
					if (isInt(numberTextField.getText()) && isInt(idTextField.getText())) {
						number = Integer.parseInt(numberTextField.getText());
						id = Integer.parseInt(idTextField.getText());
						bigField.setText("Has introducido:  " + id + ", " + firstName + ", " + lastName + ", " + number
								+ ", " + mail + ".");
						newContact = new Contacto(id, firstName, lastName, number, mail);
						newAgenda.insert(newContact);
						lastRecordLabel.setText("/"+Integer.toString(newAgenda.records()));
					} else {
						bigField.setText("Ingresa el dato correcto");
					}
				}

			}
		});
		insertButton.setBounds(214, 24, 110, 35);
		contentPane.add(insertButton);

		JButton updateButton = new JButton("UPDATE");
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigField.setText("");
				String firstName = null, lastName = null, mail = null;
				int number = 0, id = 0;
				Contacto newContact;
				if (idTextField.getText() == null || idTextField.getText().isEmpty()) {
					bigField.setText("Es obligatorio ingresar el Id");
				} else if (!isInt(idTextField.getText())) {
					bigField.setText("Ingresa el dato correcto");
				} else if ((nameTextField.getText() == null || nameTextField.getText().isEmpty())
						&& (lastNameTextField.getText() == null || lastNameTextField.getText().isEmpty())
						&& (mailTextField.getText() == null || mailTextField.getText().isEmpty())
						&& (numberTextField.getText() == null || numberTextField.getText().isEmpty())) {
					bigField.setText("Debes modificar al menos un campo");
				} else {
					if (!nameTextField.getText().isEmpty()) {
						firstName = nameTextField.getText();
					} if (!lastNameTextField.getText().isEmpty()) {
						lastName = lastNameTextField.getText();
					}  if (!mailTextField.getText().isEmpty()) {
						mail = mailTextField.getText();
					}  if (!numberTextField.getText().isEmpty()) {
						if (!isInt(numberTextField.getText())) {
							bigField.setText("Ingresa el dato correcto");
						} else {
							number = Integer.parseInt(numberTextField.getText());
						}
					}
					id = Integer.parseInt(idTextField.getText());
					newContact = new Contacto(id, firstName, lastName, number, mail);
					newAgenda.update(newContact);
					bigField.setText("Ahora si");
				}

			}
		});
		updateButton.setBounds(214, 65, 110, 35);
		contentPane.add(updateButton);

		JButton deleteButton = new JButton("DELETE");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigField.setText("");
				String firstName = null, lastName = null, mail = null;
				int number = 0, id = 0;
				Contacto newContact;
				if (idTextField.getText() == null || idTextField.getText().isEmpty()) {
					bigField.setText("Es obligatorio ingresar el Id");
				} else if (!isInt(idTextField.getText())) {
					bigField.setText("Ingresa el dato correcto");
				} else {
					id = Integer.parseInt(idTextField.getText());
					newContact = new Contacto(id, firstName, lastName, number, mail);
					newAgenda.detele(newContact);
					lastRecordLabel.setText("/"+Integer.toString(newAgenda.records()));
					bigField.setText("Ahora si");
				}
			}
		});
		deleteButton.setBounds(214, 106, 110, 35);
		contentPane.add(deleteButton);

		JButton deleteButton_1 = new JButton("SELECT");
		deleteButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigField.setText("");
				Contacto contacto;
				contacto=newAgenda.select();
				idTextField.setText(Integer.toString(contacto.getId()));
				nameTextField.setText(contacto.getFirstName());
				lastNameTextField.setText(contacto.getLastName());
				numberTextField.setText(Integer.toString(contacto.getNumber()));
				mailTextField.setText(contacto.getMail());
				recordLabel.setText(Integer.toString(contacto.getRow()));
			}
		});
		deleteButton_1.setBounds(334, 24, 110, 35);
		contentPane.add(deleteButton_1);

		JButton lastRecordButton = new JButton("<");
		lastRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigField.setText("");
				Contacto contacto;
				contacto=newAgenda.previus();
				if(contacto!=null) {
					idTextField.setText(Integer.toString(contacto.getId()));
					nameTextField.setText(contacto.getFirstName());
					lastNameTextField.setText(contacto.getLastName());
					numberTextField.setText(Integer.toString(contacto.getNumber()));
					mailTextField.setText(contacto.getMail());
					recordLabel.setText(Integer.toString(contacto.getRow()));
				} else {
					bigField.setText("No hay más datos");
				}
			}
		});
		lastRecordButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lastRecordButton.setBounds(131, 266, 46, 30);
		contentPane.add(lastRecordButton);

		JButton firstRecordButton = new JButton("<<");
		firstRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigField.setText("");
				Contacto contacto;
				contacto=newAgenda.select();
				idTextField.setText(Integer.toString(contacto.getId()));
				nameTextField.setText(contacto.getFirstName());
				lastNameTextField.setText(contacto.getLastName());
				numberTextField.setText(Integer.toString(contacto.getNumber()));
				mailTextField.setText(contacto.getMail());
				recordLabel.setText(Integer.toString(contacto.getRow()));
			}
		});
		firstRecordButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		firstRecordButton.setBounds(65, 266, 59, 30);
		contentPane.add(firstRecordButton);

		JButton nextRecordButton = new JButton(">");
		nextRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigField.setText("");
				Contacto contacto;
				contacto=newAgenda.next();
				if(contacto!=null) {
					idTextField.setText(Integer.toString(contacto.getId()));
					nameTextField.setText(contacto.getFirstName());
					lastNameTextField.setText(contacto.getLastName());
					numberTextField.setText(Integer.toString(contacto.getNumber()));
					mailTextField.setText(contacto.getMail());
					recordLabel.setText(Integer.toString(contacto.getRow()));
				} else {
					bigField.setText("No hay más datos");
				}
			}
		});
		nextRecordButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nextRecordButton.setBounds(278, 266, 46, 30);
		contentPane.add(nextRecordButton);

		JButton theLastRecordButton = new JButton(">>");
		theLastRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bigField.setText("");
				Contacto contacto;
				contacto=newAgenda.lastRecord();
					idTextField.setText(Integer.toString(contacto.getId()));
					nameTextField.setText(contacto.getFirstName());
					lastNameTextField.setText(contacto.getLastName());
					numberTextField.setText(Integer.toString(contacto.getNumber()));
					mailTextField.setText(contacto.getMail());
					recordLabel.setText(Integer.toString(contacto.getRow()));
			}
		});
		theLastRecordButton.setBounds(329, 266, 59, 30);
		contentPane.add(theLastRecordButton);
		
		JButton binaryFileButton = new JButton("BINARY FILE");
		binaryFileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newAgenda.binaryFile();
			}
		});
		binaryFileButton.setBounds(334, 103, 110, 35);
		contentPane.add(binaryFileButton);
		
		JButton textFileButton = new JButton("TEXT FILE");
		textFileButton.setBounds(334, 63, 110, 35);
		contentPane.add(textFileButton);
		Contacto contacto;
		contacto=newAgenda.select();
		idTextField.setText(Integer.toString(contacto.getId()));
		nameTextField.setText(contacto.getFirstName());
		lastNameTextField.setText(contacto.getLastName());
		numberTextField.setText(Integer.toString(contacto.getNumber()));
		mailTextField.setText(contacto.getMail());
		recordLabel.setText(Integer.toString(contacto.getRow()));

	}

	private boolean isInt(String in) {
		try {
			Integer.parseInt(in);
			return true;
		} catch (NumberFormatException excepcion) {
			return false;
		}
	}
}
