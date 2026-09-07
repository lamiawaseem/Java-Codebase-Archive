import java.util.PriorityQueue;
import java.util.*;  
/**
 * Bus.java
 * Makes busses according to number of people
 * @author Lamia 
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */

public class Bus {
	//stores bus number
	static int busnum = 1  ;
	
	public static void main(String[] args) {
		//creates queue for the number of passengers
		PriorityQueue<Integer> pass =new PriorityQueue<Integer>(); 
		// Minimum value of range
		Integer min = 100; 
		// Maximum value of range
	    Integer max = 250;
	    //generates random passenger number count
		Integer randp = (int)Math.floor(Math.random() * (max - min + 1) + min);
		//stores random generated passenger number count in queue
		pass.add(randp);
		//prints the number of passengers
		System.out.println("Initial passenger queue " + pass);
		System.out.println();
		
		//holds unchanged passenger value
		int people = randp;
		int number, i;
		//declares value in for statement
		int start = 1;
		//runs loop till all passengers are seated
		while (randp > 0) {
			//generates bus and the number of seats on it
			int seat = Buss();
			//changes to number of seated passengers as they are transported
			randp = randp - seat;
			//prints bus number and the amount of seats on it
			System.out.print("Bus #" + busnum + "- size - " + seat + " Manifest: ");
			//holds bus number and how many are called
			busnum++;
			//prints the passengers placed on each bus
			for (i = start; i < start + seat; i++) {
				System.out.print(i + " ");
				//when all passengers have been transported stops printing
				if (i == people) {
					break;
				}
			}
			start = i;
			System.out.println();
		}//end while
	}//end main
	
	//generates bus and the number of seats on it
	//picks between three values
	public static int Buss() {
		int[] intArray = {20, 30, 40};
        int idx = new Random().nextInt(intArray.length);
        int randb = intArray[idx];
        return randb;
	}//buss
}//end class
