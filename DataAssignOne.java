import java.util.Scanner;

/**
 * DataAssignOne.java
 * Lists superheores names, prints the first and last then all
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
public class DataAssignOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] HeroNames = {"The Wasp" , "Iron Man" , "Hulk" , "Black Widow" , "Thor"};
		//Array holds hero powers
		String[] HeroPower = {"	Size" , "	Superhuman" , "		Transformation" , "	Assasin" , "		Thunder"};
		//Array holds hero names
		String[] HeroGender = {"		Female" , "	Male" , "	 Male" , "		 Female" , "		 Male"};
				
		System.out.println("The names of the first and last superhero in the list:");
		System.out.println(HeroNames[0]);
		System.out.println(HeroNames[4]);
		
		System.out.println(" ");
		System.out.println("The names of all the heroes are:");
		  //The length property takes the number of elements in an array and sets or returns them.
		    for (int i=0; i<HeroNames.length; i++) 
		    {  
		    	System.out.println(HeroNames[i] );
		    }//end for
	    
		//asks the user to enter superhero information
		System.out.println(" ");
		System.out.println("Enter a name of a hero:");
		String Name1=sc.next();
		System.out.println("Enter " + Name1 + "'s power:");
		String Power1=sc.next();
		System.out.println("Enter " + Name1 + "'s gender:");
		String Gender1=sc.next();
		
		System.out.println(" ");
		System.out.println("Enter a name of another hero:");
		String Name2=sc.next();
		System.out.println("Enter " + Name2 + "'s power:");
		String Power2=sc.next();
		System.out.println("Enter " + Name2 + "'s gender:");
		String Gender2=sc.next();
		
		//Array holds hero names
		String[] UserHeroNames = {Name1, Name2};
		//Array holds hero powers
		String[] HeroPowers = {Power1, Power2};
		//Array holds hero names
		String[] HeroGenders = {Gender1, Gender2};
			
		//prints table headings
		System.out.println(" ");
		System.out.println("Name            Power           Gender");
		 
		//prints table contents-information stored in the arrays
		for (int i=0; i<UserHeroNames.length; i++) {  
			System.out.print(HeroNames[i] );
		    System.out.print(HeroPower[i] );
		    System.out.println(HeroGender[i] );
		}//end for
		
		//prints table contents-information stored in the arrays
		for (int i=0; i<UserHeroNames.length; i++) {
			System.out.print(UserHeroNames[i] + ("	"));
		    System.out.print(HeroPowers[i] + ("		"));
		    System.out.print(HeroGenders[i] );
		    System.out.println(" ");
		}
	}//End Main

}//End Class
