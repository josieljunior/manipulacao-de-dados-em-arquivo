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

	public void listarTodos() {
    	int contador =0;
    	
    	String[][] vetor = new String[ListaEncadeada.getTamanho()][8];
    	
    	Dados aux = cabeca;
        while (aux != null) {
        	
        	vetor[contador][0] = aux.getData();
        	vetor[contador][1] = aux.getHora();
        	vetor[contador][2] = aux.getEstacao();
        	vetor[contador][3] = aux.getPoluente();
        	vetor[contador][4] = Double.toString(aux.getValor());
        	vetor[contador][5] = aux.getData();
        	vetor[contador][6] = aux.getData();
        			
        	aux = aux.getProximo();
        	contador++;
        
        }
        
        
        for(int i=0;i<vetor.length;i++) {
        	if (i==10) {
        		break;
        		}
        	for(int j=0; j<7;j++) {
        		System.out.print(vetor[i][j]);
        	}
        	
        	System.out.println();
        }
       
        
            
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