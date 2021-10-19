package aps2;

import javax.swing.JOptionPane;

public class CtrlTela {

	public void create(Tela ta) {
		Dados dado = new Dados();
		dado.setData(Tela.tfData.getText());
		dado.setHora(Tela.tfHora.getText());
		dado.setEstacao(Tela.tfEsta.getText());
		dado.setPoluente(Tela.tfPolu.getText());
		dado.setValor(Tela.tfValor.getText());
		dado.setUnidade(Tela.tfUni.getText());
		dado.setTipo(Tela.tfTipo.getText());

		Dados currDado = ListaEncadeada.getCabeca();
		while (currDado.getProximo() != null) {
			currDado = currDado.getProximo();
		}
		currDado.setProximo(dado);
		int total = ListaEncadeada.getTotal();
		ListaEncadeada.setTotal(total++);

		Tela.tfData.setText("");
		Tela.tfHora.setText("");
		Tela.tfEsta.setText("");
		Tela.tfPolu.setText("");
		Tela.tfValor.setText("");
		Tela.tfUni.setText("");
		Tela.tfTipo.setText("");

		JOptionPane.showMessageDialog(null, "Dado adicionado com sucesso.");
	}

	public void read(Tela ta) {
		Tabela table = new Tabela();
		table.montarTabela(LerTexto.getLista());
	}

	public void update(Tela ta) {
		System.out.println(Tela.tfData.getText());
	}

	public void delete(Tela ta) {
		Dados currDado = ListaEncadeada.getCabeca();
		ListaEncadeada.setCabeca(currDado.getProximo());
		int total = ListaEncadeada.getTotal();
		ListaEncadeada.setTotal(total--);
		
		JOptionPane.showMessageDialog(null, "Dado excluido com sucesso.");

	}

	public void order(Tela ta) {

	}
}
