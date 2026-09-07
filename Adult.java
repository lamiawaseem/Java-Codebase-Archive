/**
 * Adult.java
 * takes the human profile and adds more aspects
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Adult extends Human {
	private static String placeOfWork;
	private static String occupation;
	
	//takes the human profile with all its information and adds more aspects
	public Adult(String firstName, String lastName, Gender gender, int birthYear, int birthMonth, int birthDay, String placeOfWork, String occupation) { 
		super(firstName, lastName, gender, birthYear, birthMonth, birthDay);
		this.placeOfWork = placeOfWork;
		this.occupation = occupation;
	}
	
	//gets information and returns it
	public static String getPlaceOfWork() {
		return placeOfWork;
	}
	
	//gets information and returns it
	public static String getOccupation() {
		return occupation;
	}

}//end class