/**
 * ReverseString.java
 * Print an entered string in reverse
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		//asks the user to enter a string
		 System.out.println("Enter string to reverse:");
		 String str = read.nextLine();
		 
		 StringBuilder sb = new StringBuilder(str);
		 
		 //takes the string and reverses it
		 System.out.println("Reversed string is:");
		 System.out.println(sb.reverse().toString());
	}//end main

}//end class
