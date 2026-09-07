/**
 * Introducer.java
 * gives information for profiles and prints statements regarding them
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Introducer {

	public void Introducer(Human person, Youth kid) {
		
		//gets name from human class and prints it
		System.out.print("I am pleased to introduce " + person.getFirstName() + person.getLastName());
		
		//determines pronouns based on gender
		String pronoun = "";
		Gender gender = null;
		if (gender == Gender.FEMALE) {
			pronoun = "She";
		}else {
			pronoun = "He";
		}//end if
		
		//gets age and pronouns then prints information
		int age = person.calculateCurrentAgeInYears();
		System.out.print( pronoun + " is " + age + " years old");
		
		//based on determined age it will print information regarding that
		//considered an adult
		if (age > 18) {
			System.out.println(pronoun + "works at " + Adult.getPlaceOfWork() + " as a " + Adult.getOccupation());
		//considered an adolescent
		}else {
			System.out.println(pronoun + " goes to " + kid.getSchoolName() + " school, and is in grade " + kid.getSchoolGrade());
			System.out.println(pronoun + "'Yotes Time is in the " + CentennialStudent.getHomeRoom() + " with " + CentennialStudent.getHomeRoomTeacher());
		}
	}//end method

	public Object createPublicIntroduction(Human alan) {
		// TODO Auto-generated method stub
		return null;
	}
}//end class