package controller;

import model.Dados;
import model.LerTexto;
import model.ListaEncadeada;
import model.Sort;
import view.Tabela;
import view.Tela;

public class CtrlTela {

	public void create (Tela ta) {
		
	}

	public void read (Tela ta) {
		System.out.println(Tabela.aberto);
		Tabela table = new Tabela();
		if (Tabela.aberto = true) {
			table.dispose();
			//Tabela.aberto = false;
		}else {
			Tabela table2 = new Tabela();
			table2.exibirTabela(LerTexto.getLista());
			Tabela.aberto = true;
		}
		
		System.out.println(Tabela.aberto);
		
	}

	public void update (Tela ta) {
	  
	}

	public void delete (Tela ta) {

	}
	
	public void order (Tela ta) throws Exception {
		Dados[] vetor = ListaEncadeada.criarVetor(LerTexto.getLista());
		Sort.quickSort(vetor,0,vetor.length-1);
		ListaEncadeada lista = new ListaEncadeada();
		for(int i=0; i <vetor.length; i++) {
			Dados aux = vetor[i];
			lista.adicionarElementoNoInicioDaLista(aux);
		}
		LerTexto.setLista(lista);
	}
}
