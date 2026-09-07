/**
* SimpleCalculator.java
* takes two integers and applies an operation to them
* @author Lamia
* Computer Science 20
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner(System.in);
		
		System.out.println("Welcome to the calculator.");
		
		welcomescreen();
		//then your program should scan for the operator variable
		double choice = kbReader.nextInt( );
		if (choice == 5) {
			System.out.println("Thank you.");
		}else {
			//then your program should scan for the first number variable
			System.out.println("Enter first number:");
			double op1 = kbReader.nextDouble( );
			//then your program should scan for the second number variable
			System.out.println("Enter second number:");
			double op2 = kbReader.nextDouble( );
			if (choice == 1) {
				double add = (op1 + op2);
				System.out.println("Thank you. Your answer is " + add + ".");
			}else {
				if (choice == 2) {
					double subtract = (op1 - op2);
					System.out.println("Thank you. Your answer is " + subtract + ".");
				}else {
					if (choice == 3) {
						double multiply = (op1 * op2);
						System.out.println("Thank you. Your answer is " + multiply + ".");
					}else {
						if (choice == 4) {
							// error checker
							while (op2 == 0) {
								try {
									System.out.println("There is an error, please input new numbers");
									System.out.println("Enter first number:");
									op1 = kbReader.nextDouble( );
									System.out.println("Enter second number:");
									op2 = kbReader.nextDouble( );
								} catch (Exception e) {
									System.out.println("");
								} // end catch
							} // end while
							double divide = (op1 / op2);
							System.out.println("Thank you. Your answer is " + divide + ".");
						}
					}
				}
			}//end if
		}//end main if
	}//end main

	public static void welcomescreen() {
		System.out.println("Please choose operator.");
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		System.out.println("5. Exit");
		System.out.println(" ");
		System.out.println("Please enter operator:");
	}
	
	public static double add(double op1, double op2) {
		//this method adds both of the operands
		double add = (op1 + op2);
		return add;
	}//end add
	
	public static double subtract(double op1, double op2) {
		//this method subtracts both of the operands
		double subtract = (op1 - op2);
		return subtract;
	}//end add

	public static double multiply(double op1, double op2) {
		//this method multiplies both of the operands
		double multiply = (op1 * op2);
		return multiply;
	}//end add

	public static double divide(double op1, double op2) {
		//this method divides both of the operands
		double divide = (op1 / op2);
		return divide;
	}//end add
	
}//end class
