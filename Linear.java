import java.util.Random;

/**
 * Linear.java
 * searches through the array one by one
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Linear{    
	
	public static void main(String a[]){    
		
		// Create a 10 number array of random data
		Random rnd = new Random();
		int[] data = new int [10]; 
		//prints random array (numbers between 0 and 20)
		System.out.println("Randomized array:");
		for (int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(20);
			System.out.print(data[i] + " ");
		} 
		
		//generates a random number
		int number = rnd.nextInt(20);
		System.out.println();
		System.out.println();
		int key = number;
		//prints generated key
		System.out.println("Randomly generated number to search for: " + key);
		System.out.println();
		//calls method
		 Search(data, key);
	}//end main
	
	public static int Search(int[] data, int key){    
		//searches array tll key matches one of the array indexes and prints which one
		for(int i=0;i<data.length;i++){    
			if(data[i] == key){    
		        System.out.println("Element is found at " + i);
				return i;    
		     }    
		 }  
		//if the key is not one of the array index's it prints statement declaring so
		 System.out.println("");
		 System.out.println("Element not found");
		 return -1;  
	}//end search
}  //end class  
