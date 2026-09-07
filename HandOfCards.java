/**
 * HandOfCards.java
 * Prints cards suits and numbers
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.util.Scanner;
public class HandOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//array stores card suits
		String[] Suits = {"Clubs" , "Diamonds" , "Spades" , "Hearts" , "Spades"};
		//array stores card number
		int[] Number = {13, 3 , 11, 9, 7};
		
		//prints out the information of the card]
		System.out.println("Your cards are:");
		for (int i=0; i<Number.length; i++){  
			System.out.print(Number[i] + " of ");	
			System.out.println(Suits[i] + " ");
		}//end for
		
		//asks which card the user would like to change
		System.out.println(" ");
		System.out.println("Which card would you like to change?");
		int Card = sc.nextInt();
		
		int randomdigit = (int)(13 * Math.random() + 1);
		//Based on users choice this will change the card they chose
		if (Card == 1) {
			Suits[0] = "Spades";
			Number[0] = randomdigit;
		}//end if
		
		if (Card == 2) {
			Suits[1] = "Hearts";
			Number[1] = randomdigit;
		}//end if
		
		if (Card == 3) {
			Suits[2] = "Diamonds";
			Number[2] = randomdigit;
		}//end if
		
		if (Card == 4) {
			Suits[3] = "Clubs";
			Number[3] = randomdigit;
		}//end if
		
		if (Card == 5) {
			Suits[4] = "Diamond";
			Number[4] = randomdigit;
		}//end if
				
		System.out.println(" ");
		System.out.println("Which other card would you like to change?");
		int Card2 = sc.nextInt();
		
		//Based on users choice this will change the card they chose
		int randomdigit2 = (int)(13 * Math.random() + 1);
		//Based on users choice this will change the card they chose
		if (Card2 == 1) {
			Suits[0] = "";
			Number[0] = randomdigit2;
		}//end if
		
		if (Card2 == 2) {
			Suits[1] = "Hearts";
			Number[1] = randomdigit2;
		}//end if
		
		if (Card2 == 3) {
			Suits[2] = "Diamonds";
			Number[2] = randomdigit2;
		}//end if
		
		if (Card2 == 4) {
			Suits[3] = "Clubs";
			Number[3] = randomdigit2;
		}//end if
		
		if (Card2 == 5) {
			Suits[4] = "Diamond";
			Number[4] = randomdigit2;
		}//end if
		
		//prints out the information of the card
		System.out.println(" ");
		System.out.println("Your new cards are:");
		for (int i=0; i<Number.length; i++){  
			System.out.print(Number[i] + " of ");	
			System.out.println(Suits[i] + " ");
		}//end for
		
		//checks for flush
		for(int i=0; i<Suits.length; i++){
			if(Suits[i] == Suits[i]) {
				System.out.println(" ");
				System.out.println("You have a flush of " + Suits[i]);
				break;
			}else {
				System.out.println("You do not have a flush");
			}
		}//end for
						
		//prints out the cards with a number high than nine
		System.out.println(" ");
		System.out.println("Your cards that are higher than 9 are:");
		for (int i=0; i<Number.length; i++){
			if (Number[i] >= 9){  	
				System.out.print(Number[i] + " of ");	
				System.out.println(Suits[i] + " ");
			}//end if
		}//end for
		
		//prints out the information of the card]
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Which cards information would you like to see?");
		System.out.println("Enter a number:");
		int Card3 = sc.nextInt();
				
		//Based on users choice this will send them to a method to calculate what they chose
		if (Card3 == 1) {
			System.out.print(Number[0] + " of ");	
			System.out.println(Suits[0] + " ");
		}//end if
			
		if (Card3 == 2) {
			System.out.print(Number[1] + " of ");	
			System.out.println(Suits[1] + " ");
		}//end if
				
		if (Card3 == 3) {
			System.out.print(Number[2] + " of ");	
			System.out.println(Suits[2] + " ");
		}//end if
				
		if (Card3 == 4) {
			System.out.print(Number[3] + " of ");	
			System.out.println(Suits[3] + " ");
		}//end if
				
		if (Card3 == 5) {
			System.out.print(Number[4] + " of ");	
			System.out.println(Suits[4] + " ");
		}//end if
	}//end main

}//end class
