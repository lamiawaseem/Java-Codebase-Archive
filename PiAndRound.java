/**
 * PiAndRound.java
 * prints the rounded area and circumference
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.util.Scanner;
public class PiAndRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int diameter;
		
		//asks the user to input the diameter
		System.out.println("Enter the diameter of the circle in cm:");
		diameter = scan.nextInt();
		
		//prints the area and circumference
		System.out.println("The area of the circle is " + RoundedArea(diameter) + "cm^2 and the circumference is " + RoundedCircumference(diameter) + "cm");
	}//end main

public static double RoundedArea(int diameter){
	//calculates the area of the circle and rounds it
	int radius;
	int radiusSquared;
	double area;
	
	radius = (diameter/2);
	radiusSquared = radius * radius;
	area = 3.14 * radiusSquared;
	double result1 = Math. ceil(area);
	return result1;
}//end RoundArea

public static double RoundedCircumference(int diameter){
	//calculates the circumference of the circle and rounds it
	int radius2;
	double circumference;
	
	radius2 = (diameter / 2);
	circumference = radius2 * 3.14 * 2;
	double result2 = Math. ceil(circumference);
	return result2;
}//end RoundedCircumference

}//end class