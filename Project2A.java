/**
* Project2A.java
* Simplifies the main class by creating multiple methods
* @author Lamia
* Computer Science 10
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
public class Project2A {
	
	// prints all information
	public static void welcomescreen(){
		System.out.println("Make your arithmetic selection from the choices below:\n");
		
		System.out.println("1. Area of Circle\n");
		System.out.println("2. Area of Rectangle\n");
		System.out.println("3. Area of Triangle\n");
		
		System.out.print("Your choice?");
	}//end welcome
	
	//Asks user to input information
	// Based on the shape being calculated the system inputs the values and provides an answer
	public static void switchcontrol(double x){		
		Scanner kbReader = new Scanner(System.in);
		
		int choice = kbReader.nextInt( );
		
		System.out.print("\nEnter first integer/value.");
		double op1 = kbReader.nextDouble( );
		System.out.print("\nEnter second integer/value.");
		double op2 = kbReader.nextDouble( );
		
		System.out.println("");
		
		switch (choice)
		{
		case 1: //radius squared times Pi
		System.out.println(op1 + " times " + op2 + " times " + 3.14 + " = " + (op1 * op2 * 3.14) );
		System.out.println("The area of your shape is" + "\t" + (op1 * op2 * 3.14));
		break;
		case 2: //Length times width
		System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
		System.out.println("The area of your shape is" + "\t" + (op1 * op2));
		break;
		case 3: // Base times height times 1/2
		System.out.println(op1 + " times " + op2 + " times " + "1/2" + " = " + (op1 * op2 * (0.5)) );
		System.out.println("The area of your shape is" + "\t" + (op1 * op2 * (0.5)));
		break;
		}
	}//end switch control
	
	public static void exit(){
		System.out.println(" ");
	}//end exit

	//initiates the sequence for the methods above
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		welcomescreen();
		switchcontrol(1);
		exit();
		
	}//end main

}//end class