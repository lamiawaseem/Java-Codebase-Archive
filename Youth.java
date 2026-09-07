/**
 * Youth.java
 * takes human profile and adds more aspects
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Youth extends Human {
	private int schoolGrade;
	private String schoolName;
	
	//takes the human profile with all its information and adds more aspects
	public Youth(String firstName, String lastName, Gender gender, int birthYear, int birthMonth, int birthDay, int schoolGrade, String schoolName) {
		super(firstName, lastName, gender, birthYear, birthMonth, birthDay);
		this.schoolGrade = schoolGrade;
		this.schoolName = schoolName;
	}
	
	//gets information and returns it
	public int getSchoolGrade() {
		return schoolGrade;
	}
	
	//gets information and returns it
	public String getSchoolName() {
		return schoolName;
	}

}//end class