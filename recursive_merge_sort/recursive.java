package ibu.edu.homework4.recursive_merge_sort;

public class recursive {
	 
	public static void sort(Comparable[] elements) {
	        Comparable[] aux = new Comparable[elements.length];           
	        sort(elements, aux, 0, elements.length - 1);   
	    }
	   
	   
	    private static void sort(Comparable[] elements, Comparable[] aux, int low, int high) {
	        if (high <= low) {                              
	            return;                                     
	        }
	       
	        int mid = low + (high - low) / 2;               
	        sort(elements, aux, low, mid);                  
	        sort(elements, aux, mid + 1, high);             
	        merge(elements, aux, low, mid, high);           
	    }
	   
	    private static void merge(Comparable[] elements, Comparable[] aux, int low, int mid, int high) {
	       
	        for (int k = low; k <= high; k++) {             
	            aux[k] = elements[k];                       
	        }          
	       
	        int i = low;                                    
	        int j = mid + 1;                                
	        for (int k = low; k <= high; k++) {             
	            if (i > mid) {                              
	                elements[k] = aux[j++];                 
	            } else if (j > high) {                      
	                elements[k] = aux[i++];                 
	            } else if (aux[j].compareTo(aux[i])<0) {          
	                elements[k] = aux[j++];                 
	            } else {                                    
	                elements[k] = aux[i++];                 
	            }
	        }
	    }
	    
	    public static void sort(Comparable[] elements, CityName CityName) {
	    	Comparable[] aux = new Comparable[elements.length];           
	        sort(elements, aux, 0, elements.length - 1, CityName);  
	    }
		   
		   
	    private static void sort(Comparable[] elements, Comparable[] aux, int low, int high, CityName CityName) {
	        if (high <= low) {                              
	            return;                                     
	        }
	       
	        int mid = low + (high - low) / 2;               
	        sort(elements, aux, low, mid, CityName);                  
	        sort(elements, aux, mid + 1, high, CityName);             
	        merge(elements, aux, low, mid, high, CityName);           
	    }
		   
	    private static void merge(Comparable[] elements, Comparable[] aux, int low, int mid, int high, CityName CityName) {
	        
	        for (int k = low; k <= high; k++) {             
	            aux[k] = elements[k];                      
	        }          
	       
	        int i = low;                                    
	        int j = mid + 1;                              
	        for (int k = low; k <= high; k++) {            
	            if (i > mid) {                              
	                elements[k] = aux[j++];                 
	            } else if (j > high) {                      
	                elements[k] = aux[i++];                 
	            } else if (CityName.compare((IPaddress) aux[j], (IPaddress) aux[i]) < 0) {      
	                elements[k] = aux[j++];                 
	            } else {                                    
	            	elements[k] = aux[i++];                 
	            }
	        } 
	    }

}
