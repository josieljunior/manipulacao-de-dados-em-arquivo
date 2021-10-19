package aps2;

public class CtrlTela {

	public void create (Tela ta) {
		
	}

	public void read (Tela ta) {
		LerTexto texto = new LerTexto();
		texto.run();
		Tabela table = new Tabela();
		table.montarTabela(texto.getVetor());
	
		
	}

	public void update (Tela ta) {
	
	}

	public void delete (Tela ta) {

	}
	
	public void order (Tela ta) {
		
		
	}
}
