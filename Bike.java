package hi;
/**
 * Bike.java
 * mountain features
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
public class Bike extends MountainBike {
	
	public static int cadence = 0;
	public static double speed = 0;
	public static int gear = 1;
	public static int shockTravel = 0;
	public static int suspensionTravel = 0;
	public static double wheelSize = 0;
	public static String frameSize = "";
	public static double [] gearFactor= {0.3033, 0.2805, 0.2612, 0.2429, 0.2281, 0.2144, 0.203, 0.1916, 0.1733, 0.1583};
	
	public Bike(int cadence, int gear, int shockTravel, int suspensionTravel, double wheelSize, String frameSize) {
		Bike.cadence = cadence;
		Bike.gear = gear;
		Bike.shockTravel = shockTravel;
		Bike.suspensionTravel = suspensionTravel;
		Bike.wheelSize = wheelSize;
		Bike.frameSize = frameSize;
	}
	void changeCadence(int newValue) {
		cadence = newValue;
	}

	void changeGear(int newValue1) {
		gear = newValue1;
	}
	
	void changeShockTravel(int shockValue) {
		shockTravel = shockValue;
	}
	
	void changeSuspensionTravel(int suspensionValue) {
		suspensionTravel = suspensionValue;
	}
	
	void changeWheelSize(double wheelValue) {
		wheelSize = wheelValue;
	}
	
	void changeFrameSize(String frameValue) {
		frameSize =frameValue;
	}
	//calculates speed
	public static void Speed() {
		speed = cadence * gearFactor[gear-1];
		System.out.println(speed);
	}
	
	//prints info
	public static void printStates() {
		System.out.println("cadence:" + cadence);
		System.out.println("gear:" + gear);
		System.out.println("shock value:" + shockTravel);
		System.out.println("suspension value:" + suspensionTravel);
		System.out.println("wheel size:" + wheelSize);
		System.out.println("frame size:" + frameSize);
	}

}
