/**
* FinalProject.java
* High Low Number Guessing Game
* @author Lamia
* Computer Science 10
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
import java.util.Random;

public class FinalProject {

	public static void welcomescreen() {
		// asks user if they would like to play the game
		System.out.println("Welcome to The High Low Guessing Game!");
		System.out.println("Do you want to play the game?");
	}
	
	public static void whileloops(double x) {
		Scanner sc = new Scanner(System.in);
		Scanner numscan = new Scanner(System.in);
		Random randomNum = new Random();

		// range and random number generator
		int max = 32767;
		int min = 0;
		int guess = min + randomNum.nextInt(max);

		boolean done = false;// variable for while loop
		boolean number = false;// variable for while loop

		//User inputs if they want to play the game
		String play = sc.next();

		if ((play.charAt(0) == 'n') || (play.charAt(0) == 'N'))
			return;// doesn't do the game if they answer no
		while (!done) {
			// Prints instructions to user
			System.out.println("In this game the computer generates a random number between 0 and 32767.Your goal is to guess the number.");
			System.out.println("The computer will gives you clues,if the number you imputed is higher or lower than the generated one.");

			System.out.println(" ");
			System.out.println("Beginning Game:");
			// asks the user to guess a number
			System.out.println("Guess a number");
			int ans = sc.nextInt();

			// error checker
			while (ans > 32767) {
				try {
					System.out.println("Please make sure your guess is within the generated number range");
					ans = sc.nextInt();
				} catch (Exception e) {
					System.out.println("");
				} // end catch
			} // end while
			
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
			} // end while
			
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
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcomescreen();
		whileloops(1);
	}// end main
	
}// end class