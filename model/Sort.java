package model;

public class Sort {

	// Quick Sort

	
	public static void quickSort(Dados[] vetor, int inicio, int fim) {
		
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int separar(Dados[] vetor, int inicio, int fim) {
		Dados pivo = vetor[inicio];
		int i = inicio + 1;
		while (i <= fim) {
			if (vetor[i].getValor() <= pivo.getValor())
				i++;
			else if (pivo.getValor() < vetor[fim].getValor())
				fim--;
			else {
				Dados troca = vetor[i];
				vetor[i] = vetor[fim];
				vetor[fim] = troca;
				i++;
				fim--;
			}
		}
		vetor[inicio] = vetor[fim];
		vetor[fim] = pivo;
		return fim;
	}

	/* Teste
	 * 
	 * public static void main(String[] args) {
	 * 
	 * LerTexto tex = new LerTexto(); ListaEncadeada list = new ListaEncadeada();
	 * tex.run(); Dados[] vet = list.listarTodos(); 
	 * quickSort(vet, 0, vet.length-1);
	 * 
	 * for(int i=0; i<500000;i++) {
	 * 
	 * System.out.println(vet[i].getHora()+" "+vet[i].getValor());
	 * 
	 * } System.out.println(vet.length);
	 * 
	 * }
	 */

	// Selection Sort

	public static Dados[] selectionSort(Dados[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].getValor() <= arr[index].getValor()) {
					index = j;
				}
			}
			Dados smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}
	


	/* Teste
	 * 
	 * public static void main(String a[]){
	 * 
	 * LerTexto tex = new LerTexto(); ListaEncadeada list = new ListaEncadeada();
	 * tex.run(); Dados[] vet = selectionSort(list.listarTodos());
	 * 
	 * 
	 * 
	 * for(int i=0; i<100000;i++) {
	 * System.out.println(vet[i].getHora()+" "+vet[i].getValor());
	 * 
	 * }
	 */

}