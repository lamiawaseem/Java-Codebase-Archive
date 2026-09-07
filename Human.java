import java.time.LocalDateTime;
import java.util.Comparator;

/**
 * Human.java
 * takes information of a person and creates a profile for them
 * calculates age based on current year and the persons date of birth
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Human extends Gender {
	
	//gets current information regarding date, month and year
	static LocalDateTime currentDate = LocalDateTime.now();
	private static int Year = currentDate.getYear();
	private static int Month = currentDate.getMonthValue();
	private static int Day = currentDate.getDayOfMonth();;
	
	public String Gender = null;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private String firstName;
	private String lastName;
	private Gender gender;
	
	//makes a human profile with all its information
	public Human(String firstName, String lastName, Gender gender, int birthYear, int birthMonth, int birthDay) {
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		
	}//end human
	
	//gets gender and returns it
	public String getGender() {
		return Gender;
	}
	
	//sets gender
	public void setGender(String gender) {
		Gender = gender;
	}
	
	//sets gender
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	//gets birth year and returns it
	public int getBirthYear() {
		return birthYear;
	}
	
	//sets new birth year
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	//gets birth month and returns it
	public int getBirthMonth() {
		return birthMonth;
	}

	//sets new birth year
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	//gets new birth day and returns it
	public int getBirthDay() {
		return birthDay;
	}
	
	//sets new birth day
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	//gets name and returns it
	public String getFirstName() {
		return firstName;
	}
	
	//sets new name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//gets last name an returns it
	public String getLastName() {
		return lastName;
	}

	//sets new last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//calculates age with current year and information from the profile
	int calculateCurrentAgeInYears() {
		int age = Year - birthYear;
		if ((birthMonth <= Month) && (birthDay <= Day)) {
			age = age;
		}else {
			if ((birthMonth > Month) || (birthDay > Day)) {
			age--;
			}
		}
		return age;
	}
/**Interface addition
 * ranks humans based on certain attributes listed below:
 * AGE_ORDER, which orders from oldest to youngest based on birthYear, birthMonth, and birthDay
 * NAME_ORDER will order lexicographically by lastName and then firstName
 * ASSEMBLY_ORDER will order by type (Student < Youth < Adult < Human) and then by NAME_ORDER
**/
	
	//provides a number rank based on classification
	public static int rankOfHuman(Human h1)
	{
		int rank = 0;
		
		//adult rank of 3
		if(h1 instanceof Adult){
			rank = 3;
		//student rank of 1
		}else if(h1 instanceof  CentennialStudent){
				rank = 1;
			//youth rank of 2
			}else if (h1 instanceof Youth){
				rank = 2;
			//human rank of 4
			}else {
				rank = 4;
			}
		
		return rank;
	}
	
	//orders from oldest to youngest based on birthYear, birthMonth, and birthDay
	public static Comparator<Human> AGE_ORDER = new Comparator<Human>()
	{
		public int compare(Human h1, Human h2) 
		{
	
			if(h1.getBirthYear() == h2.getBirthYear()){
				
				if(h1.getBirthMonth() == h2.getBirthMonth()){
					
					if(h1.getBirthDay() == h2.getBirthDay()){
						
						//if all information is the same
						return 0;
						
					}else if(h1.getBirthDay() < h2.getBirthDay()){
						
						//if everything but birthday is the same
						return -1;
					}
					
				}else if(h1.getBirthMonth() < h2.getBirthMonth()){
					//if everything but birth month is the same
					return -1;
				}
			}else if(h1.getBirthYear() < h2.getBirthYear()){
				//if everything but birth year is the same
				return -1;
			}
			//otherwise return
			return 1;
		}
	};
	
	//order by type (Student < Youth < Adult < Human) and then by NAME_ORDER
	public static Comparator<Human> ASSEMBLY_ORDER = new Comparator<Human>()
	{
		public int compare(Human h1, Human h2) 
		{
			//takes provided rank and compares them
			int rankA = rankOfHuman(h1);
			int rankB = rankOfHuman(h2);
			
			//if of the same ranking, compares name
			if(rankA == rankB){
				
				return(h1.getLastName().compareTo(h2.getLastName()));
			}
			
			//rank established if they are different
			return (rankA - rankB);
		}
	};

	//order based on name: lexicographically by lastName and then firstName
	public static Comparator<Human> NAME_ORDER = new Comparator<Human>()
	{
		//compares names
		public int compare(Human h1, Human h2) {
			
			return(h1.getLastName().compareTo(h2.getLastName()));
		}

	};
}//end class