package controller;

import model.Dados;
import model.LerTexto;
import model.ListaEncadeada;
import model.Sort;
import view.Tabela;
import view.Tela;

public class CtrlTela {
	private static Dados novo;
	

	public void create(Tela ta) {

	}

	public void read(Tela ta) {
		
		Tabela table2 = new Tabela();
		table2.exibirTabela(LerTexto.getLista());

	}

	public void update(Tela ta) {
		String Id = Tela.tfId.getText();
		int id = Integer.parseInt(Id);
		Dados aux = ListaEncadeada.getCabeca();

		while (aux != null) {
			if (id == aux.getId()) {
				Tela.tfData.setText(aux.getData());
				Tela.tfHora.setText(aux.getHora());
				Tela.tfEsta.setText(aux.getEstacao());
				Tela.tfPolu.setText(aux.getPoluente());
				Tela.tfValor.setText(Double.toString(aux.getValor()));
				Tela.tfUni.setText(aux.getUnidade());
				Tela.tfTipo.setText(aux.getTipo());
				setNovo(aux);
			}
			aux = aux.getProximo();
		}
		Tela.btUpd.setVisible(false);
		Tela.btUpd2.setVisible(true);
	}

	public void update2(Tela ta) {

		getNovo().setData(Tela.tfData.getText());
		getNovo().setHora(Tela.tfHora.getText());
		getNovo().setEstacao(Tela.tfEsta.getText());
		getNovo().setPoluente(Tela.tfPolu.getText());
		getNovo().setValor(Double.parseDouble(Tela.tfValor.getText()));
		getNovo().setUnidade(Tela.tfUni.getText());
		getNovo().setTipo(Tela.tfTipo.getText());

		Tela.tfId.setText("");
		Tela.tfData.setText("");
		Tela.tfHora.setText("");
		Tela.tfEsta.setText("");
		Tela.tfPolu.setText("");
		Tela.tfValor.setText("");
		Tela.tfUni.setText("");
		Tela.tfTipo.setText("");
		Tela.btUpd.setVisible(true);
		Tela.btUpd2.setVisible(false);

	}

	public void delete(Tela ta) {
		
		

	}

	public void order(Tela ta) throws Exception {
		Dados[] vetor = ListaEncadeada.criarVetor(LerTexto.getLista());
		Sort.quickSort(vetor, 0, vetor.length - 1);
		ListaEncadeada lista = new ListaEncadeada();
		for (int i = 0; i < vetor.length; i++) {
			Dados aux = vetor[i];
			lista.adicionarElementoNoInicioDaLista(aux);
		}
		LerTexto.setLista(lista);
	}

	public Dados getNovo() {
		return novo;
	}

	public void setNovo(Dados novo) {
		CtrlTela.novo = novo;
	}
}
