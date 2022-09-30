package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField Nota1;
	private JTextField Nota3;
	private JTextField Nota2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 232, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Nota3 = new JTextField();
		Nota3.setBounds(68, 116, 108, 20);
		contentPane.add(Nota3);
		Nota3.setColumns(10);
		
		Nota2 = new JTextField();
		Nota2.setBounds(68, 85, 108, 20);
		contentPane.add(Nota2);
		Nota2.setColumns(10);
		
		Nota1 = new JTextField();
		Nota1.setBounds(68, 54, 108, 20);
		contentPane.add(Nota1);
		Nota1.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(68, 11, 108, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(27, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota1:");
		lblNewLabel_1.setBounds(27, 57, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setBounds(27, 88, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(27, 119, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btcalcular = new JButton("Calcular");
		btcalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String name = txtNome.getText();
				String num1 = Nota1.getText();
				String num2 = Nota2.getText();
				String num3 = Nota3.getText();
				
			if(!num1.isEmpty() && !num2.isEmpty() && !num3.isEmpty()) {	
				
				Double n1 = Double.valueOf(num1);
				Double n2 = Double.valueOf(num2);
				Double n3 = Double.valueOf(num3);
				
				Double calc = (n1+n2+n3)/3;
				
				JOptionPane.showMessageDialog(null,"A nota do "+name+" é : "+calc);
			}
			}
		});
		btcalcular.setBounds(78, 147, 89, 23);
		contentPane.add(btcalcular);
	}
}
