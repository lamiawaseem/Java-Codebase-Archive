import java.util.Scanner;

/**
 * Data4Coffee.java
 * tracks the total calories and caffeine you consume over a week
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
public class Data4Coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//array stores the drink names
		String[] Name = {"Fresh Filter Coffee", "Iced Coffee", "Espresso", "Iced Cafe Americano", "Cappuccino", "Iced Cafe Latte"};
		//array stores the drink size
		String[] Size= {"Large", "Large", "Large", "Large", "Large", "Large"};
		//array stores the drink calories
		int[] Calories = {6, 5, 6, 23, 184, 168};
		//array stores the drink caffeine
		int[] Caffeine = {400, 330, 75, 300, 150, 150};
		
		int weeklycal =0;
		int weeklycaf=0;
		int results = 0;
		
		System.out.println("Hi, what is your name?");
		String person = sc.nextLine();
		System.out.println("Are you male or female?");
		String gender = sc.nextLine();
		System.out.println("How old are you?");
		String age = sc.nextLine();
		System.out.println("Welcome to The Coffee Calorie Counter " + person + " this program tracks the total calories and caffeine you consume over a week on Starbucks drinks");
		while (true) {
			System.out.println(" ");
			System.out.println("What did you drink today?");
			System.out.println("1.Fresh Filter Coffee");
			System.out.println("2.Iced Coffe");
			System.out.println("3.Espresso");
			System.out.println("4.Iced Cafe Americano");
			System.out.println("5.Cappuccino");
			System.out.println("6.Iced Cafe Latte");
			System.out.println(" ");
			System.out.println("7. Exit");
			int choice = sc.nextInt();
			
			switch (choice){
			
				case 1: 
				results = search(Name, "Fresh Filter Coffee");
				
				if(results == -1)
				{
					System.out.println("That drink does not exist.");
				}else {
					System.out.print(Name[0] + " ");
					System.out.println(Size[0]);
					System.out.println(Calories[results] + "cals");
					System.out.println(Caffeine[results] + "mg of caffeine");
					int save = (Calories[results] + weeklycal);
					weeklycal = Calories[results];
					int save2 = (Caffeine[results] + weeklycaf);
					weeklycaf = Caffeine[results];
					System.out.println("Your weekly calories are " + save + " and your weekly caffeine intake is " + save2);
					break;
				}
				case 2: 
				results = search(Name, "Iced Coffe");
				if(results == -1)
				{
					System.out.println("That drink does not exist.");
				}else {
					System.out.print(Name[1] + " ");
					System.out.println(Size[1]);
					System.out.println(Calories[results] + "cals");
					System.out.println(Caffeine[results] + "mg of caffeine");
					int save = (Calories[results] + weeklycal);
					weeklycal = Calories[results];
					int save2 = (Caffeine[results] + weeklycaf);
					weeklycaf = Caffeine[results];
					System.out.println("Your weekly calories are " + save + " and your weekly caffeine intake is " + save2);
					break;
				}
				case 3: 
				results = search(Name, "Espresso");
				if(results == -1)
				{
					System.out.println("That drink does not exist.");
				}else {
					System.out.print(Name[2] + " ");
					System.out.println(Size[2]);
					System.out.println(Calories[results] + "cals");
					System.out.println(Caffeine[results] + "mg of caffeine");
					int save = (Calories[results] + weeklycal);
					weeklycal = Calories[results];
					int save2 = (Caffeine[results] + weeklycaf);
					weeklycaf = Caffeine[results];
					System.out.println("Your weekly calories are " + save + " and your weekly caffeine intake is " + save2);
					break;
				}
				case 4: 
				results = search(Name, "Iced Cafe Americano");
				if(results == -1)
				{
					System.out.println("That drink does not exist.");
				}else {
					System.out.print(Name[3] + " ");
					System.out.println(Size[3]);
					System.out.println(Calories[results] + "cals");
					System.out.println(Caffeine[results] + "mg of caffeine");
					int save = (Calories[results] + weeklycal);
					weeklycal = Calories[results];
					int save2 = (Caffeine[results] + weeklycaf);
					weeklycaf = Caffeine[results];
					System.out.println("Your weekly calories are " + save + " and your weekly caffeine intake is " + save2);
					break;
				}
				case 5: 
				results = search(Name, "Cappuccino");
				if(results == -1)
				{
					System.out.println("That drink does not exist.");
				}else {
					System.out.print(Name[4] + " ");
					System.out.println(Size[4]);
					System.out.println(Calories[results] + "cals");
					System.out.println(Caffeine[results] + "mg of caffeine");
					int save = (Calories[results] + weeklycal);
					weeklycal = Calories[results];
					int save2 = (Caffeine[results] + weeklycaf);
					weeklycaf = Caffeine[results];
					System.out.println("Your weekly calories are " + save + " and your weekly caffeine intake is " + save2);
					break;
				}
				case 6: 
				results = search(Name, "Iced Cafe Latte");	
				if(results == -1)
				{
					System.out.println("That drink does not exist.");
				}else {
					System.out.print(Name[5] + " ");
					System.out.println(Size[5]);
					System.out.println(Calories[results] + "cals");
					System.out.println(Caffeine[results] + "mg of caffeine");
					int save = (Calories[results] + weeklycal);
					weeklycal = Calories[results];
					int save2 = (Caffeine[results] + weeklycaf);
					weeklycaf = Caffeine[results];
					System.out.println("Your weekly calories are " + save + " and your weekly caffeine intake is " + save2);
					break;
				}
			}//end switch
		}//end while
	}//end class

	public static int search (String[] Name, String value)
	{
		int index;
		int element;
		@SuppressWarnings("unused")
		boolean found;
		
		index = 0;
		
		element = -1;
		found = false;
		
		 for(int i = 0; i < Name.length; i++)
	     {
			if(Name[index].equals(value))
			{
				found = true;
				element = index;
			}
			index++;
		}
		return element;
	}

}//end main