/**
 * Binary.java
 * Searches for a number by going to the middle of the array and if the key is bigger it goes up from there otherwise is moves down
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
class Binary{  
   
 public static void main(String args[]){  
     
	 //array
	 int arr[] = {10,20,30,40,50};  
	 //the value to be found
	 int key = 30;  
     //last number in the array
	 int last=arr.length-1;  
     //calls method
	 Search(arr,0,last,key);   
	 
 }  //end main
 
 public static void Search(int arr[], int first, int last, int key){  
	 
	 //number in the middle of the array
	 int mid = (first + last)/2;  
	 //starts from first number and works to the last
	 while( first <= last ){  
		 // if the number in the middle is less than the key than it will search beginning from the halfway point of the array
		 if ( arr[mid] < key ){  
			 first = mid + 1;  
		//if the middle number is the key it stops the search
		 }else if ( arr[mid] == key ){  
			 System.out.println("Element is found at index: " + mid);  
			 break;  
		// otherwise it searches
		 }else{  
			 last = mid - 1;  
		 }  
		 mid = (first + last)/2;  
	 }  
	 if ( first > last ){  
		 System.out.println("Element is not found!");  
	 }  
 }//end search method
 
}//end class