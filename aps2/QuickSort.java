package aps2;



public class QuickSort {


	public static void quickSort(Dados[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		
		}
	
	}

	private static int separar(Dados[] vetor, int inicio, int fim) {
		double pivo = vetor[inicio].getValor();
		int i = inicio + 1;
		while (i <= fim) {
			if (vetor[i].getValor() <= pivo)
				i++;
			else if (pivo < vetor[fim].getValor())
				fim--;
			else {
				double troca = vetor[i].getValor();
				vetor[i].setValor(vetor[fim].getValor());
				vetor[fim].setValor(troca);
				i++;
				fim--;
			}
		}
		vetor[inicio].setValor(vetor[fim].getValor());;
		vetor[fim].setValor(pivo);
		return fim;
	}
	
	public static void main(String[] args) {
		
		LerTexto tex = new LerTexto();
    	ListaEncadeada list = new ListaEncadeada();
    	tex.run();
    	Dados[] vet = list.listarTodos();
    	quickSort(vet, 0, vet.length-1);
    	
    	for(int i=0; i<500000;i++) {
    	
    		System.out.println(vet[i].getHora()+" "+vet[i].getValor());
    	
    	}
    	System.out.println(vet.length);
		
	}

}