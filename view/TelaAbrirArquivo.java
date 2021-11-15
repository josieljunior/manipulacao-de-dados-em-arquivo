package view;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaAbrirArquivo extends JFrame implements ActionListener{
	
	JComboBox<String> cb = new JComboBox<String>();
	JButton bt1, bt2;
	
	
	public TelaAbrirArquivo(String args[]) {
		this.setSize(400, 150);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	
		
		
		JPanel painel1 = new JPanel();
		painel1.setLayout(null);
		painel1.setSize(400, 150);
		
		//JComboBox
		cb.setBounds(50, 35,200, 25);
		//Adicionando valores a Jcombobox
		if (args.length > 1) {
			for (int i = 0; i < args.length; i++) {
				cb.addItem(args[i]);
			}
		}else {
			cb.addItem(args[0]);
		}
		
		painel1.add(cb);
	
		
		//JButton
		bt1 = new JButton("Abrir");
		bt1.setBounds(260, 35, 75, 25);
		
		painel1.add(bt1);
		
		
		this.add(painel1);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = new Object();
		obj = e.getSource();
		
		if(obj.equals(bt1)) {
			
			String resposta = (String) cb.getSelectedItem();
			
			
			
		}
		
		
		
	}
	

}
