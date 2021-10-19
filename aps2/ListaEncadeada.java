package aps2;


public class ListaEncadeada {
    
    private Dados cabeca = null;
    private Dados cauda = null;
    private int total = 0;
    
    public void adicionarElementoNoInicioDaLista(Dados e) {
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
    	int n = this.getTotal();
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
    
    public int getTotal() {
		return total;
	}

	public Dados getCabeca() {
		return cabeca;
	}

	public void setCabeca(Dados cabeca) {
		this.cabeca = cabeca;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
    
    
    /*
    public void removerEstudanteDaLista(Dados e) {
    	Dados aux = cabeca;
        while(aux!=null) {
            if(aux.getProximo()==e) {
            	Dados proximo = aux.getProximo();
                aux.setProximo(proximo.getProximo());
            }
            else if(aux==e) {
                cabeca = e.getProximo();
            }
            aux = aux.getProximo();
        }
    }*/
    
}