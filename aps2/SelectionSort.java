package aps2;



public class SelectionSort {  
	
	
    public static	Dados[] selectionSort(Dados[] arr){  
    	System.out.println(arr.length);
        for (int i = 0; i <= arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j].getValor() <= arr[index].getValor()){ 
                    index = j;//searching for lowest index  
                }  
            }  
            double smallerNumber = arr[index].getValor();   
            arr[index].setValor(arr[i].getValor());  
            arr[i].setValor(smallerNumber);
        }
        return arr;
    }  
       
    public static void main(String a[]){
    	
    	LerTexto tex = new LerTexto();
    	ListaEncadeada list = new ListaEncadeada();
    	tex.run();
    	Dados[] vet = selectionSort(list.listarTodos());
    	
    	
    	
    	for(int i=0; i<100000;i++) {
    		System.out.println(vet[i].getHora()+" "+vet[i].getValor());
    	
    	}
    	
    	
    	
    	
    }  
}  