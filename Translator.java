import java.util.Scanner;

/**
 * Translator.java
 * Trabslates between English and Urdu
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
public class Translator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String another = "yes";
		//array hold fifteen words in English
		String[] English = {"Hi", "Bye", "Tea", "Sleep", "Walk", "Key", "Blue", "Rice", "Chair", "Closet", "Lose", "Picture", "Lie", "Get up", "Deceieve"};
		//array hold fifteen words in Urdu
		String[] Urdu = {"Salam", "Khuda Hafiz", "Chai", "Sona", "Chalna", "Chabi", "Neela", "Chawal", "Kursi", "Almaari", "Haar", "Tasweer", "Jhoot", "Uthna", "Dhoka"};
		int[] Number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; 
		
		//instructions
		System.out.println("Welcome to the English & Urdu Translator.This program works both ways.");
		System.out.println("If you would like to translate from English to Urdu enter the number 1.");
		System.out.println("If you would like to translate from Urdu to English enter the number 2.");
		int Option = sc.nextInt();
		
		//if they want English to Urdu
		if (Option == 1) {
			//prints all the English words
			System.out.println("This translator works for the following English words:");
			for (int i=0; i<English.length; i++) {  
				System.out.print(Number[i] + ". ");
				System.out.println(English[i]);
			}//end for
			
			while(another.equals("yes")) {
				System.out.println("Which word would you like translated?");
				int word=sc.nextInt();
				
				//translates the selected word
				switch(word) {
					case 1:
						System.out.println("The Urdu version of this is " + Urdu[0] + ".");
					break;
					case 2:
						System.out.println("The Urdu version of this is " + Urdu[1] + ".");
					break;
					case 3:
						System.out.println("The Urdu version of this is " + Urdu[2] + ".");
					break;
					case 4:
						System.out.println("The Urdu version of this is " + Urdu[3] + ".");
					break;
					case 5:
						System.out.println("The Urdu version of this is " + Urdu[4] + ".");
					break;
					case 6:
						System.out.println("The Urdu version of this is " + Urdu[5] + ".");
					break;
					case 7:
						System.out.println("The Urdu version of this is " + Urdu[6] + ".");
					break;
					case 8:
						System.out.println("The Urdu version of this is " + Urdu[7] + ".");
					break;
					case 9:
						System.out.println("The Urdu version of this is " + Urdu[8] + ".");
					break;
					case 10:
						System.out.println("The Urdu version of this is " + Urdu[9] + ".");
					break;
					case 11:
						System.out.println("The Urdu version of this is " + Urdu[10] + ".");
					break;
					case 12:
						System.out.println("The Urdu version of this is " + Urdu[11] + ".");
					break;
					case 13:
						System.out.println("The Urdu version of this is " + Urdu[12] + ".");
					break;
					case 14:
						System.out.println("The Urdu version of this is " + Urdu[13] + ".");
					break;
					case 15:
						System.out.println("The Urdu version of this is " + Urdu[14] + ".");
					break;
				}//end switch
				System.out.println("Would you like to translate another word?");
				another=sc.next();
			}//end while
			System.out.println("Thank you!");
		}//end if
		
		//If they want Urdu to English
		if (Option == 2) {
			//prints all the Urdu words
			System.out.println("This translator works for the following Urdu words:");
			for (int i=0; i<English.length; i++) {  
				System.out.print(Number[i] + ". ");
				System.out.println(Urdu[i]);
			}//end for
			
			while(another.equals("yes")) {
				System.out.println("Which word would you like translated?");
				int translate=sc.nextInt();
				
				//translates the selected word
				switch(translate) {
					case 1:
						System.out.println("The English version of this is " + English[0] + ".");
					break;
					case 2:
						System.out.println("The English version of this is " + English[1] + ".");
					break;
					case 3:
						System.out.println("The English version of this is " + English[2] + ".");
					break;
					case 4:
						System.out.println("The English version of this is " + English[3] + ".");
					break;
					case 5:
						System.out.println("The English version of this is " + English[4] + ".");
					break;
					case 6:
						System.out.println("The English version of this is " + English[5] + ".");
					break;
					case 7:
						System.out.println("The English version of this is " + English[6] + ".");
					break;
					case 8:
						System.out.println("The English version of this is " + English[7] + ".");
					break;
					case 9:
						System.out.println("The English version of this is " + English[8] + ".");
					break;
					case 10:
						System.out.println("The English version of this is " + English[9] + ".");
					break;
					case 11:
						System.out.println("The English version of this is " + English[10] + ".");
					break;
					case 12:
						System.out.println("The English version of this is " + English[11] + ".");
					break;
					case 13:
						System.out.println("The English version of this is " + English[12] + ".");
					break;
					case 14:
						System.out.println("The English version of this is " + English[13] + ".");
					break;
					case 15:
						System.out.println("The English version of this is " + English[14] + ".");
					break;
				}//end switch
			System.out.println("Would you like to translate another word?");
			another=sc.next();
		}//end while
		System.out.println("Thank you!");
	}//end if
	}//end main

}//end class
