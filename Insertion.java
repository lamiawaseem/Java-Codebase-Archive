/**
 * Insertion.java
 * sorts by scanning the sorted part to find the correct position to place the element
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Insertion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//data
		int [] data = {9, 4, 2, 7, 1, 6, 3};
		
		//prints data before sorting
		System.out.println("data Before Insertion Sort:");  
			for(int i=0; i < data.length; i++){  
				System.out.print(data[i] + " ");  
		    }  
		System.out.println();  //calls method
        Sorting(data);//sorting data elements using Insertion sort  
        
        //prints data after sorting
	     System.out.println();
        System.out.println("data After Insertion Sort:");  
        for(int i=0; i < data.length; i++){  
                System.out.print(data[i] + " ");  
        }  
		
	}//close main void
	
	public static void Sorting(int data[]) {  
        
		//goes through entire data
		int n = data.length;  
		
		//goes through items in data
        for (int j = 1; j < n; j++) {  
            int key = data[j];  
            int i = j-1;  
            //searches for lower value in data
            while ( (i > -1) && ( data [i] > key ) ) {  
                data [i+1] = data [i];  
                i--;  
            }  
            //switches, places the value in correct position
            data[i+1] = key;  
            System.out.println();
	    	 System.out.println("Iteration" + i +":");
	    	 for(int l=0; l < data.length; l++){  
	    		 System.out.print(data[l] + " ");  
	 	     }  
	 	     System.out.println();
        }  
    }//end sort methods  
       
}//end class
