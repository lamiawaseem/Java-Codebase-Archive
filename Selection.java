/**
 * Selection.java
 * sorts by going through the entire array and finding the smallest value and placing it accordingly
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array
		int [] data = {4, 9, 2, 7, 1, 6, 3};
		
		//prints data before sorting
		System.out.println("data Before Selection Sort:");  
			for(int i=0; i < data.length; i++){  
				System.out.print(data[i] + " ");  
		    }  
		System.out.println();  //calls method
        Sorting(data);//sorting data elements using selection sort  
        
        //prints data after sorting
        System.out.println();
        System.out.println("data After Selection Sort:");  
        for(int i=0; i < data.length; i++){  
                System.out.print(data[i] + " ");  
        }  
		
	}//close main void
	
	public static void Sorting(int[] data) {
		
		//goes through entire array
		for (int i = 0; i < data.length - 1; i++)  
        {   
			int index = i; 
			//goes through items in array
            for (int j = i + 1; j < data.length; j++){  
            	//finds smallest value
            	if (data[j] < data[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            //prints smallest item at the beginning of the array
            int smallerNumber = data[index];   
            data[index] = data[i];  
            data[i] = smallerNumber; 
            System.out.println();
	    	 System.out.println("Iteration" + i +":");
	    	 for(int l=0; l < data.length; l++){  
	    		 System.out.print(data[l] + " ");  
	 	     }  
	 	     System.out.println();
        }//end for
	}//close Sorting method
}//end class
