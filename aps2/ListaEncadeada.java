package aps2;

public class ListaEncadeada {
    
    private Dados cabeca = null;
    private Dados cauda = null;
    private static int tamanho =0;
    
    public void adicionarElementoNoInicioDaLista(Dados e) {
        e.setProximo(cabeca);
        cabeca = e;
        
        tamanho ++;
    }

	public Dados getCabeca() {
		return cabeca;
	}

	public void setCabeca(Dados cabeca) {
		this.cabeca = cabeca;
	}

	public Dados getCauda() {
		return cauda;
	}

	public void setCauda(Dados cauda) {
		this.cauda = cauda;
	}
    
    

	public static int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Dados[] listarTodos() {
    	int contador =0;
    	
    	Dados[] vetor = new Dados[ListaEncadeada.getTamanho()];
    	LerTexto obj = new LerTexto();
	    obj.run();
	    
	    Dados aux = obj.lista.getCabeca();
    
	    
        while (aux != null) {
        	
        	vetor[contador] = aux;
        			
        	aux = aux.getProximo();
        	contador++;
        
        }
        
        
        return vetor;
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