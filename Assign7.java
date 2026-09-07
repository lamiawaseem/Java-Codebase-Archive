/**
* Assignment7.java
* Welcomes you to a game show
* @author Lamia
* Computer Science 10
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
public class Assign7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String person1;
		int age1;
		String onelinerap1;
		
		/*The system asks your name, then welcomes you, and asks how old you are. 
		 *It then asks you to enter a rap, which it then comments about, referring to the year you were born*/
		System.out.println("Hi, what is yor name?");
		
		person1 = sc.nextLine();
		
		System.out.println("Welcome to So You Think You Can Rap! How old are you " + person1 +"?");
		
		age1 = sc.nextInt();
		
		System.out.println("Please enter a one line rap.");
		
		onelinerap1 = sc.nextLine();
		onelinerap1 = sc.nextLine();
		
		System.out.println("That was a pretty good rap for someone born in " + (2022 - age1));
		
		/*Repeates above process for another individual.*/
		String person2;
		int age2;
		String onelinerap2;
		
		System.out.println(" ");
		System.out.println("Hi, what is yor name?");
		
		person2 = sc.nextLine();
		
		System.out.println("Welcome to So You Think You Can Rap! How old are you " + person2 +"?");
		
		age2 = sc.nextInt();
		
		System.out.println("Please enter a one line rap.");
		
		onelinerap2 = sc.nextLine();
		onelinerap2 = sc.nextLine();
		
		System.out.println("That was a pretty good rap for someone born in " + (2022 - age2));
	}

}

