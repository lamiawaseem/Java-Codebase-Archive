/**
 * TriangleMethod.java
 * Uses angles to determine the type of triangle
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.util.Scanner;
public class TriangleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner(System.in);
		
		//states the instructions and asks the user the three triangle angles
		System.out.println("This program takes the degrees of three angles and determines the type of triangle it is.");
		System.out.println("Please enter the first angle:");
		double a = kbReader.nextInt( );
		System.out.println("Please enter the second angle:");
		double b = kbReader.nextInt( );
		System.out.println("Please enter the third angle:");
		double c = kbReader.nextInt( );
		
		isTriangle (a, b, c);
		double triangle = a + b + c;
		
		//prints out if it is a triangle
		if ( triangle == 180) {
			System.out.println("This is a triangle");
			triangleType(a, b, c);
		}else {
			System.out.println("This is not a triangle");
		}//end if
	}//end main

	public static double isTriangle(double a, double b, double c) {
		//checks whether or not this is a triangle
		double triangle = a + b + c;
		return triangle;
	}//end isTriangle
	
	public static double triangleType(double a, double b, double c) {
		//determines the type of triangle it is
		if ((a!=b) && (b==c) && (a!=c)) {
			System.out.println("This is an isosceles triangle");
		}else {
			if ((a==b) && (b==c) && (a==c) && (a==b)){
				System.out.println("This is an equilateral triangle");
			}else {
				if ((a!=b) && (b!=c) && (a!=c)){
					System.out.println("This is an scalene triangle");
				}
			}
		}//end if
		return a;
	}// triangleType
	
}//end class
