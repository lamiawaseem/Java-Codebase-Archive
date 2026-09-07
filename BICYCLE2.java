package hi;
import java.util.Scanner;
/**
 * BICYCLE2.java
 * user guide
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
public class BICYCLE2{
	static int newValue1;
	static int newValue;
	static int newValue2;
	static int newValue3;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Bicycle Program! Would you like to modify changes to your bike?");
		String play = scan.next();

		while (play.equals("yes")) {

			System.out.println("Would you like to modify Bike 1 or Bike 2?");
			System.out.println("Please enter either 1 or 2 based on which bike you would like to modify.");
			int bike = scan.nextInt();

			// Info for Bike1
			if (bike == 1) {
				Bicycle bike1 = new Bicycle(newValue, newValue1);
				System.out.println(" ");
				//prints current info before modification
				System.out.println("cadence = " + Bicycle.cadence);
				System.out.println("gear = " + Bicycle.gear);
				System.out.println("What would you like to change the cadence to?(0-135Rpm)");
				newValue = scan.nextInt();
				//catches user input errors
				if (newValue > 135 || newValue < 0) {
    				System.out.println("Please enter a modification within the range");
    				newValue = scan.nextInt();
    			}
				bike1.changeCadence(newValue);
				System.out.println(" ");
				System.out.println("What would you like to change the gear to?");
				System.out.println("1(Biggest) - 10(Smallest)");
				newValue1 = scan.nextInt();
				//catches user input errors
				if (newValue1 > 10 || newValue1 < 1) {
    				System.out.println("Please enter a modification within the range");
    				newValue1 = scan.nextInt();
    			}
				bike1.changeGear(newValue1);
				System.out.println("The speed(km/h) of your bike is:");
				Bicycle.Speed();
			//info for bike 2
			}else {
				Bicycle bike2 = new Bicycle(newValue2, newValue3);
				System.out.println(" ");
				//prints current info before modification
				System.out.println("cadence = " + Bicycle.cadence2);
				System.out.println("gear = " + Bicycle.gear2);
				System.out.println("What would you like to change the cadence to?(0-135Rpm)");
				newValue2 = scan.nextInt();
				//catches user input errors
				if (newValue2 > 135 || newValue2 < 0) {
    				System.out.println("Please enter a modification within the range");
    				newValue2 = scan.nextInt();
    			}
				bike2.changeCadence2(newValue2);
				System.out.println(" ");
				System.out.println("What would you like to change the gear to?");
				System.out.println("1(Biggest) - 10(Smallest)");
				newValue3 = scan.nextInt();
				//catches user input errors
				if (newValue3 > 10 || newValue3 < 1) {
    				System.out.println("Please enter a modification within the range");
    				newValue3 = scan.nextInt();
    			}
				bike2.changeGear2(newValue3);
				System.out.println("The speed(km/h) of your bike is:");
				Bicycle.Speed2();
			}//end if
			//asks if you would like to modify another bike
			//if not ends the game
			System.out.println(" ");
    		System.out.println("Would you like to modify another bike?");
    		String Again = scan.next();
    		if (Again.equals("no")) {
    			System.out.println("Thank you!");
    			break;
    		}
		}//end while
	}//end main
}//end class