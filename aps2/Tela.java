package aps2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener {

	JLabel lbData = new JLabel("Data:");
	static JTextField tfData = new JTextField();	

	JLabel lbHora = new JLabel("Hora:");
	static  JTextField tfHora = new JTextField();
	
	JLabel lbEsta = new JLabel("Estação:");
	static  JTextField tfEsta = new JTextField();

	JLabel lbPolu = new JLabel("Poluente:");
	static  JTextField tfPolu = new JTextField();

	JLabel lbValor = new JLabel("Valor:");
	static  JTextField tfValor = new JTextField();
	
	JLabel lbUni = new JLabel("Unidade:");
	static  JTextField tfUni = new JTextField();
	
	JLabel lbTipo = new JLabel("Tipo:");
	static  JTextField tfTipo = new JTextField();

	JButton btCre = new JButton("Create");
	JButton btRead = new JButton("Read");
	static JButton btSae = new JButton("Search");
	static JButton btUpd = new JButton("Update");
	JButton btDel = new JButton("Delete");
	JButton btOrde1 = new JButton("Order1");
	JButton btOrde2 = new JButton("Order2");

	JButton btCan = new JButton("Cancel");

	public Tela() {
		this.setLayout(null);
		this.setBounds(100, 50, 400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbData.setBounds(30, 40, 70, 25);
		tfData.setBounds(110, 40, 200, 25);
		
		lbHora.setBounds(30, 70, 70, 25);
		tfHora.setBounds(110, 70, 200, 25);
		
		lbEsta.setBounds(30, 100, 70, 25);
		tfEsta.setBounds(110, 100, 200, 25);
		
		lbPolu.setBounds(30, 130, 70, 25);
		tfPolu.setBounds(110, 130, 200, 25);
		
		lbValor.setBounds(30, 160, 70, 25);
		tfValor.setBounds(110, 160, 200, 25);
		
		lbUni.setBounds(30, 190, 70, 25);
		tfUni.setBounds(110, 190, 200, 25);
		
		lbTipo.setBounds(30, 220, 70, 25);
		tfTipo.setBounds(110, 220, 200, 25);
		
		btCre.setBounds(30, 300, 75, 25);
		btRead.setBounds(110, 300, 75, 25);
		btSae.setBounds(190, 300, 75, 25);
		btUpd.setBounds(190, 300, 75, 25);
		btDel.setBounds(270, 300, 75, 25);
		btOrde1.setBounds(190, 350, 75, 25);
		btOrde2.setBounds(270, 350, 75, 25);
		btCan.setBounds(30, 350, 75, 25);
		
		this.add(lbData);
		this.add(tfData);
		this.add(lbHora);
		this.add(tfHora);
		this.add(lbEsta);
		this.add(tfEsta);
		this.add(lbPolu);
		this.add(tfPolu);
		this.add(lbValor);
		this.add(tfValor);
		this.add(lbUni);
		this.add(tfUni);
		this.add(lbTipo);
		this.add(tfTipo);
		
		this.add(btUpd);
		this.add(btCre);
		this.add(btRead);
		this.add(btSae);
		this.add(btDel);
		this.add(btCan);
		this.add(btOrde1);
		this.add(btOrde2);
		
		btUpd.setVisible(false);

		btCre.addActionListener(this);
		btRead.addActionListener(this);
		btSae.addActionListener(this);
		btUpd.addActionListener(this);
		btDel.addActionListener(this);
		btCan.addActionListener(this);
		btOrde1.addActionListener(this);
		btOrde2.addActionListener(this);
		
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		
		CtrlTela cta = new CtrlTela();
		
		Object obj = arg0.getSource();
		if (obj.equals(btCan)) {
			System.exit(0);
		} else if (obj.equals(btCre)) {
			cta.create(this);
		} else if (obj.equals(btRead)) {
			cta.read(this);
		} else if (obj.equals(btSae)) {
			cta.saerch(this);
		} else if (obj.equals(btDel)) {
			cta.delete(this);
		} else if (obj.equals(btOrde1)) {
			cta.order(this);
		} else if (obj.equals(btOrde2)) {
			cta.order(this); 
		} else if (obj.equals(btUpd)) {
			cta.update(this); 
		}
	}

	
	

	
	}