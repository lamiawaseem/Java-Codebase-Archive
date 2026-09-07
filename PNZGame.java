/**
* PNZGame.java
* In this game you have to guess a three digit number with provided hints
* @author Lamia
* Computer Science 20
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
public class PNZGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String play = "yes";
		String person;
		
		// asks user their name and provides instructions
		System.out.println("Hi, what is yor name?");
		person = sc.nextLine();
		System.out.println("Welcome to The PNZ Game, " + person +"!");
		//User inputs if they want to play the game
		System.out.println("Would you like to play the game?");
		play = sc.next();
				
		while (play.equals("yes")) {	
			//takes the methods and assigns when to proceed to one
			WelcomeScreen();
			GetRandomInteger();
			Guess();
			System.out.println("Would you like to play again?");
			play = sc.next();
		}//end while
		System.out.println("Thank you!");
		
	}//end main

	public static void WelcomeScreen() {
		System.out.println("In this game you have to guess a three digit number, based on what you guess the computer will provide you hints.");
		System.out.println("Each P means that each digit is in the correct position.");
		System.out.println("Each N means that a digit occurs in the number, but it’s not in the correct position.");
		System.out.println("Each Z means no digits are in the number.");
		System.out.println(" ");
		System.out.println("Beginning Game:");
		
	}//end WelcomeScreen
	
	public static int GetRandomInteger() {
		// range and random number generator
		int randomdigit = (int)(1000 * Math.random() + 1);
		return randomdigit;
	}//end GetRandomInteger
	
	public static void Guess() {
		Scanner sc = new Scanner(System.in);
		boolean Guess1 = false;// variable for while loop
		boolean Guess2 = false;
		boolean Guess3 = false;
		
		int n = GetRandomInteger();
		
		String number = Integer.toString(n);
		System.out.println(number);
		
		while (Guess1 != true || Guess2 != true || Guess3 != true) {
			// asks the user to guess the number
			System.out.println(" ");
			System.out.println("Guess the number");
			String answer = sc.nextLine();
			System.out.println(" ");
		
			//determines if the guess the user made is accurate and provides hints accordingly 
			if (number.charAt(0) == answer.charAt(0)) {
				System.out.print("P");
				Guess1 = true;
			}else {
				if (number.charAt(0) != answer.charAt(0) && (number.charAt(0) != answer.charAt(1)) && (number.charAt(0) != answer.charAt(2))) {
					System.out.print("Z");
				}else {
					if (number.charAt(0) != answer.charAt(0) || (number.charAt(0) == answer.charAt(1)) || (number.charAt(0) == answer.charAt(2))) {
						System.out.print("N");
					}
				}
			}
		
			if (number.charAt(1) == answer.charAt(1)) {
				System.out.print("P");
				Guess2 = true;
			}else {
				if (number.charAt(1) != answer.charAt(1) && (number.charAt(1) != answer.charAt(2)) && (number.charAt(1) != answer.charAt(0))) {
					System.out.print("Z");
				}else {
					if (number.charAt(1) != answer.charAt(1) || (number.charAt(1) == answer.charAt(2)) || (number.charAt(1) == answer.charAt(0))) {
						System.out.print("N");
					}
				}
			}
		
			if (number.charAt(2) == answer.charAt(2)) {
				System.out.print("P");
				Guess3 = true;
			}else {
				if (number.charAt(2) != answer.charAt(2) && (number.charAt(2) != answer.charAt(1)) && (number.charAt(2) != answer.charAt(0))) {
					System.out.print("Z");
				}else {
					if (number.charAt(2) != answer.charAt(2) || (number.charAt(2) == answer.charAt(1)) || (number.charAt(2) == answer.charAt(0))) {
						System.out.print("N");
					}
				}
			}//end if
		}//end while	
		System.out.println(" ");
		System.out.println("Thank you for playing!");
	}//end Guess

}//end class