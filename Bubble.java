/**
 * Bubble.java
 * sorts by  swapping adjacent elements that are in the wrong order
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array
		int [] data = {4, 9, 2, 7, 1, 6, 3};
		
		//prints array before sorting
		System.out.println("Array Before Bubble Sort:");  
        for(int i=0; i < data.length; i++){  
                System.out.print(data[i] + " ");  
        }  
        System.out.println();  
        
        //calls method
        Sorting(data);//sorting array elements using bubble sort  
        
      //prints array after sorting
        System.out.println();
        System.out.println("Array After Bubble Sort:");  
        for(int i=0; i < data.length; i++){  
                System.out.print(data[i] + " ");  
        }  
		
	}//close main void
	
	public static void Sorting(int[] data) {
		
		//reads array in this method
		int array = data.length; 
		//used for swapping information in array
	    int swap = 0; 
	    
	    //goes through entire array
	    for(int i=0; i < array; i++){  
	    	//each item in the array
	    	 for(int j=1; j < (array-i); j++){ 
	    		 //the number after the one being scanned is bigger they swap places
	    		 if(data[j-1] > data[j]){  
	    			 //swap elements  
	                 swap = data[j-1];  
	                 data[j-1] = data[j];  
	                 data[j] = swap;  
	             }  //end if            
	         }//end for  
	    	 System.out.println();
	    	 System.out.println("Iteration" + i +":");
	    	 for(int l=0; l < data.length; l++){  
	    		 System.out.print(data[l] + " ");  
	 	     }  
	 	     System.out.println();
	     }  //end for
	}//close Sorting method
}//close class
