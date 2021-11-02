package model;

public class ListaEncadeada {

	private static Dados cabeca = null;
	private static int tamanho = 0;

	public void adicionarElementoNoInicioDaLista(Dados e) {
		e.setProximo(cabeca);
		cabeca = e;
		tamanho++;
	}
	
	public static Dados desenfileirar() throws Exception{
        Dados valor = null;
        valor = cabeca;
        cabeca = cabeca.getProximo();
        return valor;
    }
	
	public static Dados[] criarVetor() throws Exception {
    	int n = ListaEncadeada.getTamanho();
    	Dados vetor[] = new Dados[n];
    	int x = 0;
    	Dados aux = cabeca;
        while (aux != null) {
        	vetor[x] = desenfileirar();
        	aux = aux.getProximo();
        	x++;
        }
		return vetor;
    }

	public static Dados getCabeca() {
		return cabeca;
	}

	public void setCabeca(Dados cabeca) {
		ListaEncadeada.cabeca = cabeca;
	}


	public static int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		ListaEncadeada.tamanho = tamanho;
	}

}