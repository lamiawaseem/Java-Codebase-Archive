/**
 * ReplacingWords.java
 * Stores a line from a song and has the user change one of the lyrics and reprints the modified version
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.util.Scanner;
public class ReplacingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String newWord;
		
		//stores the original lyrics for editing
		String OriginalLyrics = "And if you have a minute, why don't we go";
		
		System.out.println("This is the song lyric:");
		System.out.println(" 'And if you have a minute, why don't we go' ");
		System.out.println("Please pick a word to change from this lyric.");
		String replace = sc.nextLine();
		
		//replaces the And word and prints out the new lyric
		if(replace.equals(" And "))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'" + newWord + " if you have a minute, why don't we go'");
		}//end And if
		
		//replaces the If word and prints out the new lyric
		if(replace.equals("if"))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'And " + newWord + " you have a minute, why don't we go'");
		}//end If if
		
		//replaces the You word and prints out the new lyric
		if(replace.equals("you"))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'And if " + newWord + " have a minute, why don't we go'");
		}//end you if
		
		//replaces the Have word and prints out the new lyric
		if(replace.equals("have"))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'And if you " + newWord + " a minute, why don't we go'");
		}//end have if
		
		//replaces the A word and prints out the new lyric
		if(replace.equals("a"))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'And if you have " + newWord + " minute, why don't we go'");
		}//end a if
		
		//replaces the Minute word and prints out the new lyric
		if(replace.equals("minute"))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'And if you have a " + newWord + ", why don't we go'");
		}//end minute if
		
		//replaces the Why word and prints out the new lyric
		if(replace.equals("why"))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'And if you have a minute, " + newWord + " don't we go'");
		}//end why if
		
		//replaces the Don't word and prints out the new lyric
		if(replace.equals("don't"))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'And if you have a minute, why " + newWord + " we go'");
		}//end don't if
		
		//replaces the We word and prints out the new lyric
		if(replace.equals("we"))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'And if you have a minute, why don't " + newWord + " go'");
		}//end we if
		
		//replaces the Go word and prints out the new lyric
		if(replace.equals("go"))
		{
			System.out.println("Please enter what you would like to replace this word with:");
			newWord = sc.nextLine();
			System.out.println("Here is the modified version:");
			System.out.println("'And if you have a minute, why don't we " + newWord + "'");
		}//end go if
	
	}//end main

}//end class
