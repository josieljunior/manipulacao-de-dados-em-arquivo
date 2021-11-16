package controller;

import java.io.IOException;
import javax.swing.JOptionPane;
import model.Dados;
import model.Exportar;
import model.LerTexto;
import model.ListaEncadeada;
import model.Sort;
import view.Tabela;
import view.Tela;

public class CtrlTela {
	Tabela table2 = new Tabela();
	public static long selectTime;
	public static long quickTime;
	private static Dados var;

	public void create(Tela ta) {
		
		Dados var = new Dados();
		
		var.setId();
		JOptionPane.showMessageDialog(null, "ID adicionado automaticamente.");
		var.setData(Tela.tfData.getText());
		var.setHora(Tela.tfHora.getText());
		var.setEstacao(Tela.tfEsta.getText());
		var.setPoluente(Tela.tfPolu.getText());
		var.setValor(Double.parseDouble(Tela.tfValor.getText()));
		var.setUnidade(Tela.tfUni.getText());
		var.setTipo(Tela.tfTipo.getText());
		
		ListaEncadeada.adicionarElementoNoInicioDaLista(var);
		
		resetarCampos();
		JOptionPane.showMessageDialog(null, "Linha adicionada com sucesso.");
		
	}

	
	public void read(Tela ta) {
		table2.exibirTabela(LerTexto.getLista());
	}

	
	public void update(Tela ta) {
		Dados aux = ListaEncadeada.getCabeca();
		String Id = Tela.tfId.getText();
		int id = Integer.parseInt(Id);

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

		resetarCampos();
		
		Tela.btUpd.setVisible(true);
		Tela.btUpd2.setVisible(false);

	}

	public void delete(Tela ta) {

		ListaEncadeada.removerPrimeiro() ;
		
	}
	

	public void quick(Tela ta) throws Exception {
		quickTime = System.currentTimeMillis();
		Dados[] vetor = ListaEncadeada.criarVetor(LerTexto.getLista());
		Sort.quickSort(vetor, 0, vetor.length - 1);
		ListaEncadeada lista = new ListaEncadeada();
		for (int i = 0; i < vetor.length; i++) {
			Dados aux = vetor[i];
			lista.adicionarElementoNoInicioDaLista(aux);
		}
		LerTexto.setLista(lista);
		quickTime = System.currentTimeMillis() - quickTime;
	}
	
	public void selection(Tela ta) throws Exception {
		Dados[] vetor = ListaEncadeada.criarVetor(LerTexto.getLista());
		Sort.selectionSort(vetor);
		ListaEncadeada lista = new ListaEncadeada();
		for (int i = 0; i < vetor.length; i++) {
			Dados aux = vetor[i];
			lista.adicionarElementoNoInicioDaLista(aux);
		}
		LerTexto.setLista(lista);
	}
	
	public void resetarCampos() {
		Tela.tfId.setText("");
		Tela.tfData.setText("");
		Tela.tfHora.setText("");
		Tela.tfEsta.setText("");
		Tela.tfPolu.setText("");
		Tela.tfValor.setText("");
		Tela.tfUni.setText("");
		Tela.tfTipo.setText("");
		
	}

	public void export(Tela ta) throws IOException {
		Exportar expo = new Exportar();
		expo.principal();

	}
	
	public void logs(Tela ta) throws IOException {
		Exportar expo = new Exportar();
		expo.log();

		Runtime.getRuntime().exec("notepad aps2/log.txt");

	}

	public Dados getNovo() {
		return var;
	}

	public void setNovo(Dados novo) {
		CtrlTela.var = novo;
	}
}
