package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class janela extends JFrame {

	private JPanel cbOp;
	private String paises = "";
	private Integer x = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
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
	public janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		cbOp = new JPanel();
		cbOp.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(cbOp);
		cbOp.setLayout(null);
		
		JLabel op = new JLabel("Opções");
		op.setBounds(49, 39, 46, 14);
		cbOp.add(op);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 78, 344, 102);
		cbOp.add(scrollPane);
		
			JTextArea taAdd = new JTextArea();
			scrollPane.setViewportView(taAdd);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(135, 35, 118, 22);
		
		String[] vetPaises = {"Brasil","Argentina","Chile","Uruguai"};
		for (int i = 0; i < vetPaises.length; i++) {
			comboBox.addItem(vetPaises[i]);
		}
		
		JButton btAdd = new JButton("ADICIONAR");
		btAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				if(x == 0) {
					paises = paises + comboBox.getSelectedItem().toString();
					x++;
				}
				else {
					paises = paises + ", " + comboBox.getSelectedItem().toString();
				}
	
				taAdd.setText(paises);
				
				
			}
		});
		
		btAdd.setBounds(275, 35, 118, 23);
		cbOp.add(btAdd);

		/*cdOp.addItem("Brasil");
		 * cdOp.addItem("Argentina");
		 * cdOp.addItem("Chile");
		 * cdOp.addItem("Uruguai");
		 */
	
		
		cbOp.add(comboBox);
		

	}
}
