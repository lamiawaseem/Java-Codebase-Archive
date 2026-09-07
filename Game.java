import java.util.Scanner;

/**
 * Game.java
 * user inputs and info
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
public class Game {
	
	static String newName1 = "";
	static String newName2 = "";
	static int gameNumber = 1;
	static int newScore1 = 0;
	static int newScore2 = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe!");
		System.out.println("Would you like to play the game?");
		String play = scan.next();

		while (play.contains("y")) {
			//asks and depending on user provides game rules
			System.out.println("would you like to see the game instructions and rules?");
			String rules = scan.next();
			if(rules.contains("y")) {
				Info.instruction();
			}
			//takes both players names
			System.out.println();
			System.out.println("Please enter your name below player 1:");
			newName1 = scan.next();
			Info.changePlayer1(newName1);
			System.out.println("Please enter your name below player 2:");
			newName2 = scan.next();
			Info.changePlayer2(newName2);
			System.out.println(" ");
			//prints game info
			Info.printInfo();
			//starts game
			Info.playGame();
			System.out.println("Would you like to play again?");
    		String Again = scan.next();
    		//repeats game
    		while(Again.contains("y")){
    			System.out.println(" ");
    			Info.changeGame(gameNumber +1);
    			Info.printInfo();
    			Info.playGame();
    			System.out.println("Would you like to play again?");
        		Again = scan.next();
    		}
    		break;
		}//end while
		System.out.println("Thank you!");
	}//end main

}//end class