package aps2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CtrlTela {

	private JFrame telaTexto;

	public void create(Tela ta) {
		Dados dado = new Dados();
		dado.setData(Tela.tfData.getText());
		dado.setHora(Tela.tfHora.getText());
		dado.setEstacao(Tela.tfEsta.getText());
		dado.setPoluente(Tela.tfPolu.getText());
		dado.setValor(Integer.parseInt(Tela.tfValor.getText()));
		dado.setUnidade(Tela.tfUni.getText());
		dado.setTipo(Tela.tfTipo.getText());
		Dados currDado = ListaEncadeada.getCabeca();
		dado.setId(currDado.getId() + 1);
		ListaEncadeada.adicionarElementoNoInicioDaLista(dado);

		int total = ListaEncadeada.getTotal();
		ListaEncadeada.setTotal(total++);

		Tela.tfData.setText("");
		Tela.tfHora.setText("");
		Tela.tfEsta.setText("");
		Tela.tfPolu.setText("");
		Tela.tfValor.setText("");
		Tela.tfUni.setText("");
		Tela.tfTipo.setText("");

		JOptionPane.showMessageDialog(null, "Linha adicionada com sucesso.");
	}

	public void read(Tela ta) {
		Tabela table = new Tabela();
		table.montarTabela(LerTexto.getLista());
	}

	public void saerch(Tela ta) {
		TelaPesquisa tp = new TelaPesquisa();

	}

	public void delete(Tela ta) {
		Dados currDado = ListaEncadeada.getCabeca();

		while (currDado.getProximo().getProximo() != null) {
			currDado = currDado.getProximo();
		}
		currDado.setProximo(null);

		int total = ListaEncadeada.getTotal();
		ListaEncadeada.setTotal(total--);

		JOptionPane.showMessageDialog(null, "Linha excluida com sucesso.");

	}

	public void update(Tela ta) {
		Tela.btUpd.setVisible(false);
		Tela.btSae.setVisible(true);
		TelaPesquisa.getAux().setData(Tela.tfData.getText());
		TelaPesquisa.getAux().setHora(Tela.tfHora.getText());
		TelaPesquisa.getAux().setEstacao(Tela.tfEsta.getText());
		TelaPesquisa.getAux().setPoluente(Tela.tfPolu.getText());
		TelaPesquisa.getAux().setValor(Integer.parseInt(Tela.tfValor.getText()));
		TelaPesquisa.getAux().setUnidade(Tela.tfUni.getText());
		TelaPesquisa.getAux().setTipo(Tela.tfTipo.getText());
		
		Tela.tfData.setText("");
		Tela.tfHora.setText("");
		Tela.tfEsta.setText("");
		Tela.tfPolu.setText("");
		Tela.tfValor.setText("");
		Tela.tfUni.setText("");
		Tela.tfTipo.setText("");
		
		JOptionPane.showMessageDialog(null, "Linha atualizada com sucesso.");

	}

	public void order(Tela ta) {
		//SelectionSort select = new SelectionSort();
		//Dados dados = ListaEncadeada.getCabeca();
		try {
			SelectionSort.insertionSort(ListaEncadeada.criarVetor());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
