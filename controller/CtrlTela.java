package controller;

import model.LerTexto;
import view.Tabela;
import view.Tela;

public class CtrlTela {

	public void create (Tela ta) {
		
	}

	public void read (Tela ta) {
		Tabela table = new Tabela();
		table.exibirTabela(LerTexto.getLista());
		
	}

	public void update (Tela ta) {
	
	}

	public void delete (Tela ta) {

	}
	
	public void order (Tela ta) {
		
		
	}
}
