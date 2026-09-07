/**
 * PowAndSQRT.java
 * takes a number and finds the square root and the cubed
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.util.Scanner;
public class PowAndSQRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//the number
		System.out.println("Enter a number in cm that you want square rooted, and cubed.");
		int numLetters = sc.nextInt();
		
		//Prints out the calculated number square rooted and squared
		System.out.println("The number to the power of three is " + PowerThree(numLetters) + "cm^3");
		System.out.println("The square root of the number is " + SquareRoot(numLetters) + "cm");
	}//end main

	public static double PowerThree(int numLetters){
		//calculates a number to the power of three
		double Power = numLetters * numLetters * numLetters;
		return Power;
	}//end PowerThree
	
	public static double SquareRoot(int numLetters){
		//calculates the square root of the number
		double Root =  Math.sqrt(numLetters);
		double Root1 = Math. ceil(Root);
		return Root1;
	}//end PowerThree
	
}//end class
