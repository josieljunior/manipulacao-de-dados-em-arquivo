package aps2;



public class ListaEncadeada {
    
    private static Dados cabeca = null;
    private static int total = 0;
    
    public static void adicionarElementoNoInicioDaLista(Dados e) {
        e.setProximo(cabeca);
        cabeca = e;
    }
    
        
    public void listarTodos() {
    	Dados aux = cabeca;
        while (aux != null) {
            System.out.println(aux.getData());
            aux = aux.getProximo();
        }
            
    }
    
    public Dados desenfileirar() throws Exception{
        Dados valor = null;
        valor = cabeca;
        cabeca = cabeca.getProximo();
        return valor;
    }
    
    public Dados[] criarVetor() throws Exception {
    	int n = ListaEncadeada.getTotal();
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

	public static void setCabeca(Dados cabeca) {
		ListaEncadeada.cabeca = cabeca;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		ListaEncadeada.total = total;
	}
}