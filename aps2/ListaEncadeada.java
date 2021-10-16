package aps2;

public class ListaEncadeada {
    
    private Dados cabeca = null;
    private Dados cauda = null;
    private int total = 0;
    
    public void adicionarElementoNoInicioDaLista(Dados e) {
        e.setProximo(cabeca);
        cabeca = e;
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
    
    /*
    public void listarTodos() {
    	Dados aux = cabeca;
        while (aux != null) {
            System.out.println(aux.getNome() + " - " + aux.getRa());
            aux = aux.getProximo();
        }
            
    }
    
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