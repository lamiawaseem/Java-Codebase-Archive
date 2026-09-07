/**
* Project2B.java
* Adds a Try and Catch statement
* @author Lamia
* Computer Science 10
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
public class Project2B {
	
	// prints all information
	public static void welcomescreen(){
		System.out.println("Make your arithmetic selection from the choices below:\n");
		
		System.out.println("1. Area of Circle\n");
		System.out.println("2. Area of Rectangle\n");
		System.out.println("3. Area of Triangle\n");
		
		System.out.print("Your choice?");
	}//end welcome
	
	//Asks user to input information
	//Before applying information checks the user didin't make an error while inputing information
	// Based on the shape being calculated the system inputs the values and provides an answer
	public static void switchcontrol(double x){		
		Scanner kbReader = new Scanner(System.in);
		
		int choice = kbReader.nextInt( );
		
		//error checker
		while (choice >=4){
			try {
				System.out.println("");
				System.out.println("Please make sure your arithmetic selection is from the choices listed above");
				choice = kbReader.nextInt( );
			} catch (Exception e) {
				System.out.println("");
			}//end catch
		}//end while
		
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