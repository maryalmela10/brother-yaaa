package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cajaResultado;
	int num1, num2;
	String signo;
	int contador=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora de Mary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 350);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 244, 311);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		cajaResultado = new JTextField();
		cajaResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		cajaResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		cajaResultado.setBounds(15, 11, 219, 35);
		panel.add(cajaResultado);
		cajaResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText("");
			}
		});
		btnNewButton.setBounds(15, 62, 44, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(cajaResultado.getText());
				signo="-";
				cajaResultado.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(188, 62, 46, 39);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("/");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(cajaResultado.getText());
				signo="/";
				cajaResultado.setText("");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(69, 62, 44, 39);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("X");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(cajaResultado.getText());
				signo="X";
				cajaResultado.setText("");
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2.setBounds(123, 62, 44, 39);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"7");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(15, 112, 44, 39);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1_1 = new JButton("8");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"8");
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1.setBounds(69, 112, 44, 39);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("9");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"9");
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2_1.setBounds(123, 112, 44, 39);
		panel.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_3 = new JButton("+");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(cajaResultado.getText());
				signo="+";
				cajaResultado.setText("");
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_3.setBounds(188, 112, 46, 89);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"4");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(15, 162, 44, 39);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_1_2 = new JButton("5");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"5");
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_2.setBounds(69, 162, 44, 39);
		panel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("6");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"6");
			}
		});
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2_2.setBounds(123, 162, 44, 39);
		panel.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"1");
			}
			
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(15, 212, 44, 39);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_1_1_3 = new JButton("2");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"2");
			}
		});
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_3.setBounds(69, 212, 44, 39);
		panel.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_2_3 = new JButton("3");
		btnNewButton_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"3");
			}
		});
		btnNewButton_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2_3.setBounds(123, 212, 44, 39);
		panel.add(btnNewButton_1_2_3);
		
		JButton btnNewButton_1_6 = new JButton("=");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Integer.parseInt(cajaResultado.getText());
				switch(signo) {
				case "+": 
					cajaResultado.setText(Integer.toString(num1+num2));
					break;
				case "-": 
					cajaResultado.setText(Integer.toString(num1-num2));
					break;
				case "/": 
					cajaResultado.setText(Integer.toString(num1/num2));
					break;
				case "X": 
					cajaResultado.setText(Integer.toString(num1*num2));
					break;
					default:
						cajaResultado.setText("Error");
						break;
				}
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_6.setBounds(188, 212, 46, 89);
		panel.add(btnNewButton_1_6);
		
		JButton btnNewButton_5 = new JButton("0");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText()+"0");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(15, 262, 152, 39);
		panel.add(btnNewButton_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	}
}
