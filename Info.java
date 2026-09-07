import java.util.Scanner;
/**
 *  Info.java 
 *  game code
 *  @author Lamia 
 *  Computer Science 20 
 *  Copyright 2021, Centennial High School. All rights reserved.
 */
public class Info extends Game {

	public static int game = 1;
	public static int score1 = 0;
	public static int score2 = 0;
	public static String player1 = "";
	public static String player2 = "";

	public Info(int game, String player1, int score1, String player2, int score2) {
		Info.game = game;
		Info.player1 = player1;
		Info.score1 = score1;
		Info.player2 = player2;
		Info.score2 = score2;

	}
	
	//changes game number
	static int changeGame(int gameNumber) {
		game = gameNumber;
		return gameNumber;
	}
	
	//inputs player one name
	static void changePlayer1(String newName1) {
		player1 = newName1;
	}
	
	//inputs player two name
	static void changePlayer2(String newName2) {
		player2 = newName2;
	}
	
	//changes player one's score
	public static int changeScore1(int newScore1) {
		score1 = newScore1+1;
		return newScore1;
	}
	
	//changes player two's score
	public static int changeScore2(int newScore2) {
		score2 =newScore2 +1;
		return newScore2;
	}
	
	//prints instructions
	public static void instruction() {
		System.out.println("The game is played on a grid that's 3 squares by 3 squares.");
		System.out
				.println("Player one is X, player two is O. Players take turns putting their marks in empty squares.");
		System.out.println(
				"The first player to get 3 of their marks in a row (up, down, across, or diagonally) is the winner.");
		System.out.println("If not, When all 9 squares are full, the game is over.");
		System.out.println("To select a square first type in the x coordinate, then the y coordinate.");
	}
	
	//prints info
	public static void printInfo() {
		System.out.println("Game: " + game);
		System.out.println(player1 + " vs " + player2);
		System.out.println("Score:" + score1 + " - " + score2);
	}
	
	//game code
	public static void playGame() {
		Scanner in = new Scanner (System.in);
		
		// 3x3 board
		// row is first set of brackets column second set
		char[][] board = new char[3][3];

		// fill board with dashes
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		} // end for

		// track turn
		boolean isPlayer1 = true;
		// track end of game
		boolean gameEnd = false;

		while (!gameEnd) {
			// draw board
			drawBoard(board);

			// track symbol
			char symbol = ' ';
			if (isPlayer1) {
				symbol = 'x';
			} else {
				symbol = 'o';
			}

			// which players turn
			if (isPlayer1) {
				System.out.println(newName1 + "'s turn(x):");
			} else {
				System.out.println(newName2 + "'s turn(o):");
			}

			// variables
			int row = 0;
			int col = 0;

			// runs until info provided is valid
			while (true) {
				// get row and column from user
				System.out.print("Enter a column(0, 1, or 2):");
				col = in.nextInt();
				System.out.print("Enter a row(0, 1, or 2):");
				row = in.nextInt();
				// check if valid
				if (row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("Row and column are out of bounds");
					// check is a move can be made there
				} else if (board[row][col] != '-') {
					System.out.println("Someone has already made a move there!");
				} else {
					// info is valid
					break;
				}
			} // end while

			// position match player's symbol
			board[row][col] = symbol;

			// prints winner
			if (hasWon(board) == 'x') {
				System.out.println();
				System.out.println(newName1 + " has won!");
				System.out.println();
				changeScore1(score1);
				gameEnd = true;
			} else if (hasWon(board) == 'o') {
				System.out.println();
				System.out.println(newName2 + " has won!");
				System.out.println();
				changeScore2(score2);
				gameEnd = true;
			} else {
				// no winner
				if (hasTied(board)) {
					System.out.println();
					System.out.println("It is a tie!");
					gameEnd = true;
				} else {
					// continue game
					// switches turns
					isPlayer1 = !isPlayer1;
				}
			}
		} // end while

		// final board
		printInfo();
		drawBoard(board);
	}// end playGame
	
	//draws board
	public static void drawBoard(char[][] board) {
		// fill board with dashes
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		} // end for
	}// end drawBoard
	
	//checks winner
	public static char hasWon(char[][] board) {
		// row
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
				return board[i][0];
			}
		}
		// col
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
				return board[0][j];
			}
		}
		// diagonal
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
			return board[0][0];
		}
		if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
			return board[2][0];
		}
		// no winner
		return '-';
	}// end hasWon

	//checks id their is a tie
	public static boolean hasTied(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

}//end class