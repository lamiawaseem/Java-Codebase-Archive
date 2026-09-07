import java.util.Iterator;

/**
 * Final1.java
 * Anagram game
 * @author Lamia and Noura
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */
public class Final1 extends Final {
	// game code
	public static void game() {
		System.out.println();
		System.out.println("Game: " + gameNumber);
		System.out.println("Word Bank:");
		randletters();
		// player 1
		System.out.println(name1 + ", would you like to enter a word?");
		String able = scan.nextLine();
		while (able.contains("y")) {
			System.out.println("Enter a word below:");
			String word = scan.nextLine();
			
			//makes sure not duplicate words are imputed
			if (p1.contains(word)) {
				System.out.println("This word has already been entered");
				System.out.println("Would you like to enter another word?");
				able = scan.nextLine();
			}//end if
			p1.add(word);
			//checks if user imputed number
			if (word.matches("\\d+")) {
			    System.out.println("The input is numeric.");
			    p1.remove(word);
				System.out.println("Would you like to enter another word?");
				able = scan.nextLine();
			}//end if
			// if word contains a letter not provided from generated
			Iterator<String> iterator = p1.iterator();

			while (iterator.hasNext()) {
			    String w1 = iterator.next();
			    boolean removed = false;  // Reset the flag for each word

			    for (String letter1 : not1) {
			        for (String letter11 : not2) {
			            if (w1.contains(letter1) || w1.contains(letter11)) {
			                System.out.println("This word is not applicable as it contains unusable letters");
			                iterator.remove();
			                removed = true;
			                break;  // Exit the inner loop
			            }
			        }

			        if (removed) {
			            break;  // Exit the outer loop
			        }
			    }
			}//end while
			//checks if user imputed letter
			if((word.length() == 1)) {
				System.out.println("Single letters cannot be used as this is not a word");
				p1.remove(word);
				System.out.println("Would you like to enter another word?");
				able = scan.nextLine();
			}
			//checks if exceed number of words given
			if ((word.length() > num)){
				System.out.println("This word is not applicable as it contains unusable letters");
				p1.remove(word);
				System.out.println("Would you like to enter another word?");
				able = scan.nextLine();
			}else {
				System.out.println("Would you like to enter another word?");
				able = scan.nextLine();
			}//end if
		} // end while

		// player2
		System.out.println(name2 + ", would you like to enter a word?");
		String able2 = scan.nextLine();
		while (able2.contains("y")) {
			System.out.println("Enter a word below:");
			String word2 = scan.nextLine();
			//makes sure not duplicate words are imputed
			if (p2.contains(word2)) {
				System.out.println("This word has already been entered");
				System.out.println("Would you like to enter another word?");
				able2 = scan.nextLine();
			}//end if
			p2.add(word2);		
			//checks if user imputed number
			if (word2.matches("\\d+")) {
			    System.out.println("The input is numeric.");
			    p2.remove(word2);
				System.out.println("Would you like to enter another word?");
				able2 = scan.nextLine();
			}//end if
			// if word contains a letter not provided from generated
			Iterator<String> iterator2 = p2.iterator();

			while (iterator2.hasNext()) {
			    String w2 = iterator2.next();
			    boolean removed2 = false;  // Reset the flag for each word

			    for (String letter2 : not1) {
			        for (String letter22 : not2) {
			            if (w2.contains(letter2) || w2.contains(letter22)) {
			                System.out.println("This word is not applicable as it contains unusable letters");
			                iterator2.remove();
			                removed2 = true;
			                break;  // Exit the inner loop
			            }
			        }

			        if (removed2) {
			            break;  // Exit the outer loop
			        }
			    }
			}//end while
			//user imputed letters
			if((word2.length() == 1)) {
				System.out.println("Single letters cannot be used as this is not a word");
				p2.remove(word2);
				System.out.println("Would you like to enter another word?");
				able = scan.nextLine();
			}
			//user exceed number of words provided
			if ((word2.length() > num)){
				System.out.println("This word is not applicable as it contains unusable letters");
				p2.remove(word2);
				System.out.println("Would you like to enter another word?");
				able2 = scan.nextLine();
			}else {
				System.out.println("Would you like to enter another word?");
				able2 = scan.nextLine();
			}//end if
		} // end while

		// when both players are no longer capable of making words
		Score();
		if (score1 == score2) {
			System.out.println();
			System.out.println("Its a Tie!");
		}else if (score1 > score2) {
			System.out.println();
			System.out.println("The winner is " + name1 + "!");
		} else {
			System.out.println();
			System.out.println("The winner is " + name2 + "!");
		} // end if
	}// end game

	// calculates score based on the total number of letters used in every word
	public static void Score() {
		// player 1
		// Counts each character except space
		for (String string : p1) {
			score1 += string.length();
			// certain letters are worth more when used
			if (string.contains("x") || string.contains("y") || string.contains("z") || string.contains("q") || string.contains("v")) {
				score1++;
			} // end if
		} // end for

		// Your count of Number of Letters in Array
		System.out.println(name1 + "'s list:" + p1);
		System.out.println(name1 + "'s score:" + score1);

		// player 2
		// Counts each character except space
		for (String string : p2) {
			score2 += string.length();
			// certain letters are worth more when used
			if (string.contains("x") || string.contains("y") || string.contains("z") || string.contains("q") || string.contains("v")) {
				score2++;
			} // end if
		} // end for

		// Your count of Number of Letters in Array
		System.out.println();
		System.out.println(name2 + "'s list:" + p2);
		System.out.println(name2 + "'s score:" + score2);

	}// end score
}// end class