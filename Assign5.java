/**
* Averagemark.java
* Calculates students' average mark
* @author Lamia
* Computer Science 10
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*After entering the four course grades, the system calculates the students average by taking the four marks and dividing by how many there are*/
		System.out.print("Enter the class1grade: ");
		int class1grade = sc.nextInt();
		
		System.out.print("Enter the class2grade: ");
		int class2grade = sc.nextInt();
		
		System.out.print("Enter the class3grade: ");
		int class3grade = sc.nextInt();

		System.out.print("Enter the class4grade: ");
		int class4grade = sc.nextInt();
	    
		/* After it calculates the average, the system identifies the corresponding letter value, and what it represents*/		
		int average = (class1grade + class2grade + class3grade + class4grade) /4;
	    System.out.print("average");
		
		if (average >= 80){
				System.out.print("A, standard of excellence");
		} else {
			if (average >=65){
				System.out.print("B, exceeds acceptable standard");
		    }else {
				if (average >=50){
					System.out.print("C, acceptable standard");
				}else{
					if (average >=40) {
						System.out.print("D, bellow acceptable standard");
					}else{
						if (average >=0) {
							System.out.print("F, failing grade, no credits awarded toward Alberta High School Diploma");
					}
				}
			}
		}
		}
		System.out.print(". Your average is " + average);
	}
}

