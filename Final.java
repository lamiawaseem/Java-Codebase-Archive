import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Final.java
 * Anagram game
 * @author Lamia and Noura
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */
public class Final {
	static Scanner scan = new Scanner(System.in);
	static int gameNumber = 1;
	static String name1;
	static String name2;
	static int num;
	static int score1 = 0;
	static int score2 = 0;
	static boolean firstRound = true;
	//array list holds players letters
	static ArrayList<String> letters = new ArrayList<>();
	static ArrayList<String> p1 = new ArrayList<>();
	static ArrayList<String> p2 = new ArrayList<>();
	//array list holds letters players can't use as they were not assigned
	static ArrayList<String> not1 = new ArrayList<>();
	static ArrayList<String> not2 = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Anagram!");
		System.out.println("Would you like to play the game?");
		String play = scan.nextLine();

		while (play.contains("y")) {
			//after first round, if the user wants to play the game again
			//system will not ask for names or instructions to be provided
			if (firstRound) {
				//asks if user wants instructions
				System.out.println("would you like to see the game instructions and rules?");
				String rules = scan.next();
				if(rules.contains("y")) {
					instructions();
				}
				//takes both players names
				System.out.println();
				System.out.println("Please enter your name below player 1:");
				scan.nextLine();
				name1 = scan.nextLine();
				System.out.println("Please enter your name below player 2:");
				name2 = scan.nextLine();
				firstRound = false;
			}//end if
			Final1.game();
			//asks if user would like to play again
			System.out.println();
			System.out.println("Would you like to play again?");
    		play = scan.nextLine();
    		if(play.contains("y")) {
    			gameNumber++;
    			score1 = 0;
    			score2 = 0;
    			num = 0;
    			p1.clear();
    			p2.clear();
    			not1.clear();
    			not2.clear();
    			letters.clear();
    		}//end if
		}//end while
		System.out.println("Thank you for playing!");
	}//end main
	
	//method that holds instruction manual
	public static void instructions() {
		System.out.println("The game, Anagram, requires two players.");
		System.out.println("Player one will go first, revceiving a random number of generated letters.");
		System.out.println("The objective is to make as many words as possible, the more letters used the higher the calculated score will be.");
		System.out.println("Once both players have gone, the scores and the corisponding winner will be listed.");
	}//end instructions
	
	//random letter generator
	public static void randletters() {
		//generates a random number of letters to give player between 3 and 6
		int min = 3;  
		int max = 5; 
		num = (int) (Math.random() * (max - min + 1) + min); 
		
		//vowel array to randomly pick from
		String vowels[]= {"a", "e", "i", "o", "u", "y"};
		//consonant array to randomly pick from
		String consonants[]= {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
		
		//makes array list containing letters that cant be used-vowels
		for (int i=0; i<vowels.length; i++) {  
			not1.add(vowels[i]);
		}//end for
		
		//makes array list containing letters that cant be used-consonants
		for (int i=0; i<consonants.length; i++) {  
			not2.add(consonants[i]);
		}//end for
		
		//takes the number of letters the player gets and makes sure half are vowels
		int numvow = (num/2);
		for (int i=0; i<numvow; i++) {
			Random random = new Random();   
			int vow = random.nextInt(5);
			letters.add(vowels[vow]);
			not1.remove(vowels[vow]);
		}//end for
		
		int numcon = (num-(num/2));
		//the remaining number of letter may be consonants
		for (int i=0; i< numcon; i++) {
			Random random2 = new Random();   
			int con = random2.nextInt(19);
			letters.add(consonants[con]);
			not2.remove(consonants[con]);
		}//end for
		
		//prints array of random letter
		System.out.println(letters);
	}//end randletters
	
}//end class