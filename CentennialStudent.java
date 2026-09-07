/**
 * CentennialStudent.java
 * takes the human profile plus added aspects of the youth and adds more information
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class CentennialStudent extends Youth {
	private static int homeRoom;
	private static String homeRoomTeacher;
	private static String schoolName;
	
	//takes the human and youth profile with all its information and adds more aspects
	public CentennialStudent(String firstName, String lastName, Gender gender, int birthYear, int birthMonth, int birthDay, int schoolGrade, int homeRoom, String homeRoomTeacher ) {
		super(firstName, lastName, gender, birthYear, birthMonth, birthDay, schoolGrade, schoolName);
		this.homeRoom = homeRoom;
		this.homeRoomTeacher = homeRoomTeacher;
		this.schoolName = schoolName;
	}
	
	//gets information and returns it
	public static int getHomeRoom() {
		return homeRoom;
	}
	
	//gets information and returns it
	public static String getHomeRoomTeacher() {
		return homeRoomTeacher;
	}
	
	//gets information and returns it, 
	//overrides information provided in superclass Youth
	@Override
	public String getSchoolName() {
		return schoolName  = "Centennial High School";
	}
}//end class