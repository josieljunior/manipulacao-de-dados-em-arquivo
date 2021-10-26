package aps2;



public class SelectionSort {
	public static void selectionSort(Dados arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].getValor() < arr[index].getValor()) {
					index = j;// searching for lowest index
				}
				System.out.println(i);
			}
			float smallerNumber = arr[index].getValor();
			arr[index].setValor(arr[i].getValor());
			arr[i].setValor(smallerNumber);
		}
		System.out.println("Acabou!");
	}
	
	 public static void insertionSort(Dados array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            float key = array[j].getValor();  
	            int i = j-1;  
	            while ( (i > -1) && array[i].getValor() > key )  {  
	                array[i+1].setValor((array[i].getValor()));
	                i--;  
	            }       
	            array[i+1].setValor(key);		
	        }  

}
}