/**
* NinetyNineBottles.java
* Sings the song Ninety nine bottles of pop
* @author Lamia
* Computer Science 10
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
public class NinetyNineBottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Bottle = 100;
		String Drink = ("pop");
		int age;
		
		/*The system asks the user their age, if they are older than 18 it ask which drink you prefer*/
		/*if you are younger it prints pop*/
		System.out.println("Welcome, ow old are you?");
		
		age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("Do you prefer pop, or beer?");
			Drink = sc.nextLine();
			Drink = sc.nextLine();
		}else {
			if (age < 18) {
				Drink = ("pop");
			}
		}
		/*The system prints out the ninety nine bottle song using the chosen drink*/
		/*each time the song repeated, it removes a bottle of the drink*/
		for (int i= 0; i<99; i++){
			System.out.println(" ");
			System.out.println(Bottle + " bottles of " + Drink + " on the wall!");
			System.out.println(Bottle + " bottles of " + Drink + ",");
			System.out.println("take one down, pass it around,");
			Bottle = Bottle - 1;
			System.out.println("you got " + Bottle + " bottles of " + Drink + " on the wall!");
		}
		System.out.println("If that one bottle should happen to fall,");
		System.out.println("No more bottles of " + Drink + " on the wall!");
	}

}
