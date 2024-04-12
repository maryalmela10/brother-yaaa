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
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionListener;

public class Ventanita {

	private JFrame frame;
	private JTextField campoTextoOrigen;
	JLabel etiquetaSalida;
	private JTextField campoTextoSalida;
	

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
		
		JButton botonPulsar = new JButton("Copiar");
		botonPulsar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto, destino;
				texto=campoTextoOrigen.getText();
				//mirar si están vacíos
				destino=campoTextoSalida.getText();
				copiarFichero(texto,destino);
				
			}
		});
		botonPulsar.setBounds(243, 46, 89, 23);
		frame.getContentPane().add(botonPulsar);
		
		JLabel etiquetaValor = new JLabel("Origen");
		etiquetaValor.setBounds(27, 50, 46, 14);
		frame.getContentPane().add(etiquetaValor);
		
		campoTextoOrigen = new JTextField();
		campoTextoOrigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto;
				texto=campoTextoOrigen.getText();
				etiquetaSalida.setText("Has introducido "+texto);
			}
		});
		campoTextoOrigen.setBounds(64, 47, 150, 23);
		frame.getContentPane().add(campoTextoOrigen);
		campoTextoOrigen.setColumns(10);
		
		etiquetaSalida = new JLabel("");
		etiquetaSalida.setBounds(27, 127, 307, 76);
		frame.getContentPane().add(etiquetaSalida);
		
		campoTextoSalida = new JTextField();
		campoTextoSalida.setBounds(64, 96, 150, 23);
		frame.getContentPane().add(campoTextoSalida);
		campoTextoSalida.setColumns(10);	
		
		JLabel lblNewLabel = new JLabel("Salida");
		lblNewLabel.setBounds(27, 100, 33, 14);
		frame.getContentPane().add(lblNewLabel);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
	}
	
	private void copiarFichero(String origin, String destino) {
		 FileInputStream in = null;
	        FileOutputStream out = null;

	        try {
	            in = new FileInputStream(origin);
	            out = new FileOutputStream(destino);
	            int c;

	            while ((c = in.read()) != -1) {
	                out.write(c);
	            }
	        } 
	        catch (IOException e) { 
	        	this.etiquetaSalida.setText("Error en copia");
	        }
	        finally {
	            if (in != null) {
	                try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	            if (out != null) {
	                try {
						out.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        }
	    }
	
	}


