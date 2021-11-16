package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import controller.CtrlTela;

public class Tela extends JFrame implements ActionListener {
	
	JMenuBar mb = new JMenuBar();
	JMenu opcoes = new JMenu("Opções");
	CtrlTela cta = new CtrlTela();
	public static int load ;

	JLabel lbId = new JLabel("Id:");
	public static JTextField tfId = new JTextField();

	JLabel lbData = new JLabel("Data:");
	public static JTextField tfData = new JTextField();

	JLabel lbHora = new JLabel("Hora:");
	public static JTextField tfHora = new JTextField();

	JLabel lbEsta = new JLabel("Estação:");
	public static JTextField tfEsta = new JTextField();

	JLabel lbPolu = new JLabel("Poluente:");
	public static JTextField tfPolu = new JTextField();

	JLabel lbValor = new JLabel("Valor:");
	public static JTextField tfValor = new JTextField();

	JLabel lbUni = new JLabel("Unidade:");
	public static JTextField tfUni = new JTextField();

	JLabel lbTipo = new JLabel("Tipo:");
	public static JTextField tfTipo = new JTextField();
	
	JLabel lbOrder = new JLabel("Ordenar com:");
	public static JLabel lbLoad = new JLabel("" + load);

	JButton btCre = new JButton("Create");
	JButton btRead = new JButton("Read");
	public static JButton btUpd = new JButton("Update");
	public static JButton btUpd2 = new JButton("Update");
	JButton btDel = new JButton("Delete");
	JButton btOrde1 = new JButton("SelectionSort ");
	JButton btOrde2 = new JButton("QuickSort");
	JMenuItem btExport = new JMenuItem("Exportar");
	JMenuItem btLog = new JMenuItem("Tempos de Execução");
	JButton btCan = new JButton("Cancel");

	public Tela() {
		this.setLayout(null);
		this.setBounds(100, 50, 400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(mb);
		
		lbOrder.setBounds(158, 335, 80, 25);
		lbLoad.setBounds(175, 400, 80, 25);

		lbId.setBounds(30, 10, 70, 25);
		tfId.setBounds(110, 10, 200, 25);

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
		btUpd.setBounds(190, 300, 75, 25);
		btUpd2.setBounds(190, 300, 75, 25);
		btDel.setBounds(270, 300, 75, 25);
		btOrde1.setBounds(30, 370, 155, 25);
		btOrde2.setBounds(190, 370, 155, 25);
		btExport.setBounds(270, 400, 75, 25);
		btCan.setBounds(30, 350, 75, 25);

		mb.add(opcoes);
		opcoes.add(btExport);
		opcoes.add(btLog);
		this.add(lbLoad);
		this.add(lbId);
		this.add(tfId);
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
		this.add(lbOrder);

		this.add(btCre);
		this.add(btRead);
		this.add(btUpd);
		this.add(btUpd2);
		this.add(btDel);
		//this.add(btCan);
		this.add(btOrde1);
		this.add(btOrde2);


		btCre.addActionListener(this);
		btRead.addActionListener(this);
		btUpd.addActionListener(this);
		btUpd2.addActionListener(this);
		btDel.addActionListener(this);
		//btCan.addActionListener(this);
		btOrde1.addActionListener(this);
		btOrde2.addActionListener(this);
		btExport.addActionListener(this);
		btLog.addActionListener(this);
		opcoes.addActionListener(this);
		btUpd2.setVisible(false);
		lbLoad.setVisible(false);
		

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {

	

		Object obj = arg0.getSource();
		if (obj.equals(btCan)) {
			System.exit(0);
		} else if (obj.equals(btCre)) {
			cta.create(this);
		} else if (obj.equals(btRead)) {
			cta.read(this);
		} else if (obj.equals(btUpd)) {
			cta.update(this);
		} else if (obj.equals(btUpd2)) {
			cta.update2(this);
		} else if (obj.equals(btDel)) {
			cta.delete(this);
		} else if (obj.equals(btOrde1)) {
			try {
				cta.selection(this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (obj.equals(btOrde2)) {
			try {
				cta.quick(this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (obj.equals(btExport)) {
			try {
				cta.export(this);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if (obj.equals(btLog)) {
			try {
				cta.logs(this);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
