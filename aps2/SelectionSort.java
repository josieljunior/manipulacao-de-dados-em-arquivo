package aps2;



public class SelectionSort {  
	
	
    public static void selectionSort(int[] arr){  
        for (int i = 0; i <= arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] <= arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
    	
    	LerTexto tex = new LerTexto();
    	ListaEncadeada list = new ListaEncadeada();
    	tex.run();
    	list.listarTodos();
    	
    	
    	
    	
    	
    }  
}  