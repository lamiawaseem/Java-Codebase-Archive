package hi;
import java.util.Scanner;
/**
 * Bicycle.java
 * gear and cadenceye
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
class Bicycle extends BICYCLE2{

	public static int cadence = 0;
	public static double speed = 0;
	public static int gear = 1;
	public static int cadence2 = 0;
	public static double speed2 = 0;
	public static int gear2 = 1;
	public static double [] gearFactor= {0.3565, 0.3299, 0.306, 0.2858, 0.2682, 0.2518, 0.238, 0.2254, 0.204, 0.1864};
	
	public Bicycle(int cadence, int gear) {
		Bicycle.cadence = cadence;
		Bicycle.gear = gear;
	}
	void changeCadence(int newValue) {
		cadence = newValue;
	}

	void changeGear(int newValue1) {
		gear = newValue1;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
	}
	
	//calculates speed
	public static void Speed() {
		speed = cadence * gearFactor[gear-1];
		System.out.println(speed);
	}
	
	//calculates speed of bike 2
	public static void Speed2() {
		speed2 = cadence2 * gearFactor[gear2-1];
		System.out.println(speed2);
	}
	
	//cadence of bike 2
	void changeCadence2(int newValue2) {
		cadence2 = newValue2;
	}
	//gear of bike 2
	void changeGear2(int newValue3) {
		gear2 = newValue3;
	}

}// end class