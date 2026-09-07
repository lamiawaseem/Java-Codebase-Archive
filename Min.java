/**
 * Min.java
 * finds the minimum out of four random numbers
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.util.Scanner;
public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		//asks the user to input 4 integers
		System.out.println("Enter first number:");
		a = scan.nextInt();
		System.out.println("Enter second number:");
		b = scan.nextInt();
		System.out.println("Enter third number:");
		c = scan.nextInt();
		System.out.println("Enter fourth number:");
		d = scan.nextInt();
		
		//identifies the smaller number of the 4 given
		int smallest = Math. min(a, b);
		int smallest1 = Math. min(c, d);
		
		//prints the smallest number
		System. out. println("The Smallest Number is " + Math. min(smallest, smallest1));
	}

}
