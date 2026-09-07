/**
* Mathods1NumberGame.java
* High Low Number Guessing Game
* @author Lamia
* Computer Science 20
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
import java.util.Random;

public class Methods1NumberGame {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean number = false;// variable for while loop
		boolean done = false;// variable for while loop

		welcomescreen();
		//User inputs if they want to play the game
		String play = sc.next();
		
		if ((play.charAt(0) == 'n') || (play.charAt(0) == 'N'))
			return;// doesn't do the game if they answer no
		while (!done) {
			
			instructions();
			int  guess = GetRandomInteger();
			int ans = getGuess();;
			
			// based on guess gives hint and continues to do so until they guess correctly
			while (!number) {
				if ((ans== guess)) {
					System.out.println("You guessed it!");
					number = true;
				} else {
					if ((ans > guess)) {
						System.out.println("Your number is too high, guess again");
						number = false;
						ans = sc.nextInt();
					} else {
						if ((ans < guess)) {
							System.out.println("Your number is too low, guess again");
							number = false;
							ans = sc.nextInt();
						}
					}
				} // end if
			}//end while
			
			// asks the user if they would like to play again, if not the system thanks them for playing
			System.out.println(" ");
			System.out.println("Would you like to play again");
			String Again = sc.next();
			if ((Again.charAt(0) == 'y') || (Again.charAt(0) == 'Y')) {
				done = false;
			} else {
				done = true;
			}
			System.out.println("Thanks for playing!");
		} // end while
	}// end main
	
	public static void welcomescreen() {
		Scanner sc = new Scanner(System.in);
		String person;
		// asks user their name and if they would like to play the game
		System.out.println("Hi, what is yor name?");
		person = sc.nextLine();
		System.out.println("Welcome to The High Low Guessing Game, " + person +"!");
		System.out.println("Do you want to play the game?");
	}//end welcomescreen
	
	public static void instructions() {
		// Prints instructions to user
		System.out.println("In this game the computer generates a random number between 0 and 100.Your goal is to guess the number.");
		System.out.println("The computer will gives you clues,if the number you imputed is higher or lower than the generated one.");

		System.out.println(" ");
		System.out.println("Beginning Game:");
	}//end instructions
	
	public static int GetRandomInteger() {
		// range and random number generator
		int guess = (int)(100 * Math.random() + 1);
		return guess;
	}//end GetRandomInteger
	
	public static int getGuess() {
		Scanner sc = new Scanner(System.in);
		// asks the user to guess a number
		System.out.println("Guess a number");
		int ans = sc.nextInt();
		return ans;
	}//end getGuess
	
}// end class