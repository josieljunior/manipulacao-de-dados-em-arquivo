package aps2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaPesquisa extends JFrame implements ActionListener {
	JLabel lbId = new JLabel("Digite o ID:");
	static JTextField tfId = new JTextField();
	JButton btOK = new JButton("OK");
	static Dados aux = ListaEncadeada.getCabeca();

	public TelaPesquisa() {

		this.setLayout(null);
		this.setBounds(100, 50, 400, 150);
		tfId.setText("");
		lbId.setBounds(20, 30, 70, 25);
		tfId.setBounds(110, 30, 200, 25);
		btOK.setBounds(162, 70, 75, 25);
		this.add(lbId);
		this.add(tfId);
		this.add(btOK);
		btOK.addActionListener(this);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(btOK)) {
			pesquisar();
		}
	}

	public Dados pesquisar() {
		this.setVisible(false);
		int id = Integer.parseInt(tfId.getText());
		while (aux != null) {
			if (id == aux.getId()) {
				Tela.tfData.setText(aux.getData());
				Tela.tfHora.setText(aux.getHora());
				Tela.tfEsta.setText(aux.getEstacao());
				Tela.tfPolu.setText(aux.getPoluente());
				Tela.tfValor.setText(Float.toString(aux.getValor()));
				Tela.tfUni.setText(aux.getUnidade());
				Tela.tfTipo.setText(aux.getTipo());
				Tela.btUpd.setVisible(true);
				Tela.btSae.setVisible(false);
				return aux;
			}
			aux = aux.getProximo();
		}
		return null;
		

	}

	public static Dados getAux() {
		return aux;
	}
}
