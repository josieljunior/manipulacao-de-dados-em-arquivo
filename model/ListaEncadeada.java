package model;

import javax.swing.JOptionPane;

public class ListaEncadeada {

	private static Dados cabeca = null;
	private static int tamanho = 0;
	private static int limite = 100000;
	public static void adicionarElementoNoInicioDaLista(Dados e) {
		e.setProximo(cabeca);
		cabeca = e;
		if(tamanho == limite) {
			limite ++;
		}
		tamanho++;
	}
	
	public static Dados desenfileirar() throws Exception{
        Dados valor = null;
        valor = cabeca;
        cabeca = cabeca.getProximo();
        return valor;
    }
	
	public static Dados[] criarVetor(ListaEncadeada listaEncadeada) throws Exception {
    	int n = ListaEncadeada.getTamanho();
    	Dados vetor[] = new Dados[n];
    	int x = 0;
    	Dados aux = ListaEncadeada.getCabeca();
        while (aux != null) {
        	vetor[x] = desenfileirar();
        	aux = aux.getProximo();
        	x++;
        }
		return vetor;
    }

	public static void removerPrimeiro() {
		Dados aux = cabeca;
		if(ListaEncadeada.getTamanho() == 0) {
			JOptionPane.showMessageDialog(null, "A Tabela está vazia!");
		} else {
				
				ListaEncadeada.cabeca = aux.getProximo();
					
			
		}
		
		
	}
	
	
	
	
	
	public static int getLimite() {
		return limite;
	}

	public static void setLimite(int limite) {
		ListaEncadeada.limite = limite;
	}
	public static void setLimite() {
		ListaEncadeada.limite ++;
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