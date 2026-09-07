package hi;
/**
 * MountainBike.java
 * user guide
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.util.Scanner;

class MountainBike {
	
	static int  shockValue;
	static int suspensionValue;
	static double wheelValue;
	static String frameValue;
	static int newValue1;
	static int newValue;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Bicycle Program!");
		System.out.println("Would you like to modify changes to your bike?");
		String play = scan.next();

		while (play.equals("yes")) {
			Bike Bike1 = new Bike(newValue, newValue1, shockValue, suspensionValue, wheelValue, frameValue);
			//prints current info before modification
			Bike.printStates();
			System.out.println(" ");
			System.out.println("What would you like to change the cadence to?(0-135Rpm)");
			newValue = scan.nextInt();
			//catches user input errors
			if (newValue > 135 || newValue < 0) {
				System.out.println("Please enter a modification within the range");
				newValue = scan.nextInt();
			}
			Bike1.changeCadence(newValue);
			System.out.println(" ");
			System.out.println("What would you like to change the gear to?1(Biggest) - 10(Smallest)");
			newValue1 = scan.nextInt();
			//catches user input errors
			if (newValue1 > 10 || newValue1 < 1) {
				System.out.println("Please enter a modification within the range");
				newValue1 = scan.nextInt();
			}
			Bike1.changeGear(newValue1);
			System.out.println(" ");
			System.out.println("What would you like to change the shock value to?(0-160mm)");
			shockValue = scan.nextInt();
			Bike1.changeShockTravel(shockValue);
			System.out.println(" ");
			System.out.println("What would you like to change the suspension value to?(0-160mm)");
			suspensionValue = scan.nextInt();
			Bike1.changeSuspensionTravel(suspensionValue);
			System.out.println(" ");
			System.out.println("What would you like to change the wheel size to?(24in, 26in, 27.5in, or 29in)");
			wheelValue = scan.nextDouble();
			Bike1.changeWheelSize(wheelValue);
			System.out.println(" ");
			System.out.println("What would you like to change the frame size to?(small, medium, or large)");
			frameValue = scan.next();
			Bike1.changeFrameSize(frameValue);
			//prints info
			System.out.println(" ");
			Bike.printStates();
			System.out.println("The speed(km/h) of your bike is:");
			Bike.Speed();
			//asks if you would like to modify another bike
			//if not ends the game
			System.out.println(" ");
    		System.out.println("Would you like to modify the bike again?");
    		String Again = scan.next();
    		if (Again.equals("no")) {
    			System.out.println("Thank you!");
    			break;
    		}
		}//end while
	}//end main

}//end class
