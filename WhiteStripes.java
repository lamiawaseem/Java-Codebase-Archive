/**
 * WhiteStripes.java
 * Checks if users band preferences are to my liking
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.util.Scanner;
public class WhiteStripes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String newWord;
		
		//Asks the user to input all of their favorite bands
		System.out.println("Please enter all of your favorite bands, then hit enter.");
		String bands = sc.nextLine();
		
		//determines if the bands are to my liking
		if (bands.contains ("white ")){
			System.out.println("You are cool");
		}else {
			System.out.println("Your choice isn't mine");
		}//end if
	}//end main

}//end class
