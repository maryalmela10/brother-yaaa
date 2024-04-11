package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

public class Ventanita {

	private JFrame frame;
	private JTextField campoTexto;
	JLabel etiquetaSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanita window = new Ventanita();
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
	public Ventanita() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Arial", Font.ITALIC, 12));
		frame.setBounds(100, 100, 419, 298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botonPulsar = new JButton("Pulsar");
		botonPulsar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto;
				texto=campoTexto.getText();
				etiquetaSalida.setText("Has introducido "+texto);
			}
		});
		botonPulsar.setBounds(243, 46, 89, 23);
		frame.getContentPane().add(botonPulsar);
		
		JLabel etiquetaValor = new JLabel("Valor:");
		etiquetaValor.setBounds(27, 50, 46, 14);
		frame.getContentPane().add(etiquetaValor);
		
		campoTexto = new JTextField();
		campoTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto;
				texto=campoTexto.getText();
				etiquetaSalida.setText("Has introducido "+texto);
			}
		});
		campoTexto.setBounds(64, 47, 150, 23);
		frame.getContentPane().add(campoTexto);
		campoTexto.setColumns(10);
		
		etiquetaSalida = new JLabel("");
		etiquetaSalida.setBounds(27, 127, 307, 76);
		frame.getContentPane().add(etiquetaSalida);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
	}
}
