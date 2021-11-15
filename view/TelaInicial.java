package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TelaInicial extends JFrame implements ActionListener{

	
	private JTextField field = new JTextField();
	private JButton bt = new JButton("continuar");
	
	
	public TelaInicial() {
		this.setTitle("Programa");
		setLocationRelativeTo(null);
		this.setSize(350, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		
	
		
		JPanel painel1 = new JPanel();
		painel1.setLayout(null);
		painel1.setSize(350, 150);
		
		JLabel l1 = new JLabel("Digite o nome do diretório a ser criado ou acessado: ");
		l1.setBounds(20, 20, 300, 10);
		painel1.add(l1);
		field.setBounds(20, 40, 300, 20);
		painel1.add(field);
		
		bt.setBounds(120, 70, 100, 30);
		painel1.add(bt);
		
		this.add(painel1);
		bt.addActionListener(this);
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Diretorios dir = new Diretorios();
		String[] lista = dir.ListaDiretorio(field.getText());
		Object obj = e.getSource();
		
		if(obj.equals(bt)) {
			dir.CriaDiretorio(field.getText());
			TelaAbrirArquivo abrir = new TelaAbrirArquivo(lista);
			this.dispose();
		}
		
		
		
	}	

}
	
		


