import java.util.Scanner;
import java.util.Stack;
/**
 * Sequence.java
 * Makes fibonacci sequence with stack
 * @author Lamia 
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */
class Sequence {
	public static void main(String args[]) {
		double n1 = 0;
		double n2 = 1;
		double n3; 
		int i; 
		int count = 1000;
		
		//user inputs number to go up to
		System.out.println("What number would you like the fibonacci sequence to go up to?");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		
		//creates stack
		Stack<Double> seq = new Stack<>(); 
		System.out.println();
		
		// printing 0 and 1
		System.out.print(n1 + ", " + n2 + ", ");
		// loop starts from 2 because 0 and 1 are already printed
		for (i = 2; i < count; ++i){
			n3 = n1 + n2;
			seq.push( n3);
			//when the user number is reached it stops breaking
			if(n3 >= number) {
				break;
			}
			//prints
			System.out.print(" " + n3 + ", ");
			n1 = n2;
			n2 = n3;
		}//end for

	}//end main
}//end class