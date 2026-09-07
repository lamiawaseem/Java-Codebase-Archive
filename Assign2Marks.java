import java.util.Scanner;

/**
 * Assign2Marks.java
 * Prints students names, and information
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
public class Assign2Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//array stores ten names
		String[] Names = {"Liam" , "Olivia" , "Noah" , "Emma" , "William" , "Charlotte" , "James" , "Amelia" , "Henry" , "Sophia"};
		//array stores the grade these people are in
		int[] Grades = {11 , 10 , 12 , 10 , 11 , 12 , 11 , 10 , 11 , 12};
		//array stores the marks on the first test out of 100
		int[] Test1 = {89 , 44 , 52 , 27 , 35 , 26 , 41 , 100 , 94 , 79};
		//array stores the marks on the second test out of 100
		int[] Test2 = {70 , 52 , 43 , 23 , 58 , 20 , 60 , 77 , 96 , 71};
		//array stores the marks on the third test out of 100
		int[] Test3 = {73 , 46 , 58 , 33 , 43 , 38 , 49 , 81 , 93 , 85};
		int[] Number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		
		//prints all the data for person one
		System.out.println(Names[0]);
		System.out.println("Is in grade " + Grades[0]);
		System.out.println(Test1[0] + "% on test 1");
		System.out.println(Test2[0] + "% on test 2");
		System.out.println(Test3[0] + "% on test 3");
		
		//prints all the data for person ten
		System.out.println(" ");
		System.out.println(Names[9]);
		System.out.println("Is in grade " + Grades[9]);
		System.out.println(Test1[9] + "% on test 1");
		System.out.println(Test2[9] + "% on test 2");
		System.out.println(Test3[9] + "% on test 3");
		
		//prints all the students names and numbers them accordingly
		System.out.println(" ");
		for (int i=0; i<Names.length; i++) {  
			System.out.print(Number[i] + ". ");
			System.out.println(Names[i]);
		}///end for
		
		System.out.println(" ");
		System.out.println("Would you like to see a students information?");
		String answer = sc.next();
		
		while (answer.equals("yes")) {
			//asks the user to enter a number and according to the inputed number a students information will be printed
			System.out.println("Whose information of the 10 students would you like to see?");
			System.out.println("Enter their number:");
			int student = sc.nextInt();
			
			//Based on users choice this will send them to a method to calculate what they chose
			if (student == 1) {
				System.out.println(Names[0]);
				System.out.println("Is in grade " + Grades[0]);
				System.out.println(Test1[0] + "% on test 1");
				System.out.println(Test2[0] + "% on test 2");
				System.out.println(Test3[0] + "% on test 3");
			}//end if
			
			if (student == 2) {
				System.out.println(Names[1]);
				System.out.println("Is in grade " + Grades[1]);
				System.out.println(Test1[1] + "% on test 1");
				System.out.println(Test2[1] + "% on test 2");
				System.out.println(Test3[1] + "% on test 3");
			}//end if
			
			if (student == 3) {
				System.out.println(Names[2]);
				System.out.println("Is in grade " + Grades[2]);
				System.out.println(Test1[2] + "% on test 1");
				System.out.println(Test2[2] + "% on test 2");
				System.out.println(Test3[2] + "% on test 3");
			}//end if
			
			if (student == 4) {
				System.out.println(Names[3]);
				System.out.println("Is in grade " + Grades[3]);
				System.out.println(Test1[3] + "% on test 1");
				System.out.println(Test2[3] + "% on test 2");
				System.out.println(Test3[3] + "% on test 3");
			}//end if
			
			if (student == 5) {
				System.out.println(Names[4]);
				System.out.println("Is in grade " + Grades[4]);
				System.out.println(Test1[4] + "% on test 1");
				System.out.println(Test2[4] + "% on test 2");
				System.out.println(Test3[4] + "% on test 3");
			}//end if
			
			if (student == 6) {
				System.out.println(Names[5]);
				System.out.println("Is in grade " + Grades[5]);
				System.out.println(Test1[5] + "% on test 1");
				System.out.println(Test2[5] + "% on test 2");
				System.out.println(Test3[5] + "% on test 3");
			}//end if
			
			if (student == 7) {
				System.out.println(Names[6]);
				System.out.println("Is in grade " + Grades[6]);
				System.out.println(Test1[6] + "% on test 1");
				System.out.println(Test2[6] + "% on test 2");
				System.out.println(Test3[6] + "% on test 3");
			}//end if
			
			if (student == 8) {
				System.out.println(Names[7]);
				System.out.println("Is in grade " + Grades[7]);
				System.out.println(Test1[7] + "% on test 1");
				System.out.println(Test2[7] + "% on test 2");
				System.out.println(Test3[7] + "% on test 3");
			}//end if
			
			if (student == 9) {
				System.out.println(Names[8]);
				System.out.println("Is in grade " + Grades[8]);
				System.out.println(Test1[8] + "% on test 1");
				System.out.println(Test2[8] + "% on test 2");
				System.out.println(Test3[8] + "% on test 3");
			}//end if
			
			if (student == 10) {
				System.out.println(Names[9]);
				System.out.println("Is in grade " + Grades[9]);
				System.out.println(Test1[9] + "% on test 1");
				System.out.println(Test2[9] + "% on test 2");
				System.out.println(Test3[9] + "% on test 3");
			}//end if
			System.out.println(" ");
			System.out.println("Would you like to see another students information?");
			answer = sc.next();
		}//end while
		
	}//end main

}//end class
