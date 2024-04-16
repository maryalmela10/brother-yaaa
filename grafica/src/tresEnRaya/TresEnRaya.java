package tresEnRaya;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TresEnRaya extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean turno;
	char[][]  tablero = {{0,0},{0,0},{0,0}};
	private boolean inicioPartida=true;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresEnRaya frame = new TresEnRaya();
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
	public TresEnRaya() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setText("X");
			}
		});
		btnNewButton_2.setBounds(10, 262, 80, 80);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2_1.setBounds(10, 171, 80, 80);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2_2.setBounds(10, 80, 80, 80);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_2_1 = new JButton("");
		btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2_2_1.setBounds(114, 80, 80, 80);
		contentPane.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2_1_1.setBounds(114, 171, 80, 80);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_3 = new JButton("");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2_3.setBounds(114, 262, 80, 80);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_2_2 = new JButton("");
		btnNewButton_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2_2_2.setBounds(221, 80, 80, 80);
		contentPane.add(btnNewButton_2_2_2);
		
		JButton btnNewButton_2_1_2 = new JButton("");
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2_1_2.setBounds(221, 171, 80, 80);
		contentPane.add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_4 = new JButton("");
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2_4.setBounds(221, 262, 80, 80);
		contentPane.add(btnNewButton_2_4);
		
		JLabel titulo = new JLabel("Tres en raya");
		titulo.setFont(new Font("Rockwell Condensed", Font.BOLD, 23));
		titulo.setBounds(93, 25, 154, 28);
		contentPane.add(titulo);
	}
	
	private void ponerFicha(boolean turno) {
		if(inicioPartida==true) {
			
		}
	}
}
