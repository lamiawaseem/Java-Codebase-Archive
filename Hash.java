import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
/**
 * Hash.java
 * Makes dictionary with user inputs
 * @author Lamia 
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */
public class Hash {
	static Scanner sc = new Scanner(System.in);
	static String Key;
	static String Value;
	
	public static void main(String args[]) {
		
		
		//This is how to declare HashMap 
		HashMap<String, String> dictionary= new HashMap<>();
		
		//asks user if they would like to add word
		System.out.println("The dicitonary is currently empty, would you like to add a word?");
		String maybe = sc.nextLine();
		//takes user input of word and definition
		while(maybe.contains(("y"))){
			System.out.println();
			System.out.println("What word would you like to add?");
			Key = sc.nextLine();
			//user inputs number to go up to
			System.out.println("What is the definition of this word?");
			Value = sc.nextLine();
			
			//adds user inputs to hash
			dictionary.put(Key, Value);   
			System.out.println();
			System.out.println("Dictionary:");
			
			//sorts alphabetically    
			HashMap<String, String> result = new LinkedHashMap<>();
	        dictionary.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
			
	        //prints hashmap contents
			for(Map.Entry m : result.entrySet()){    
			    System.out.println(m.getKey() + " - " + m.getValue());    
			}
			
			//asks if user would like to add more words
			System.out.println();
			System.out.println("Would you like to add another word?");
			maybe = sc.nextLine();
		}//end while
		
		//when user is done inputing words and searches for them
		System.out.println();
		System.out.println("Would you like to search for a word?");
		String maybe2 = sc.nextLine();
				
		//searches for user
		while(maybe2.contains(("y"))){
			//asks user what word they are looking for
			System.out.println();
			System.out.println("What word are you looking for?");
			String word = sc.nextLine();
			
			//if word not found allows user to enter it
			if(dictionary.containsKey (word)) {
				//searches for the word and prints it
				System.out.println(word + " - " +  dictionary.get(word));
			}else {
				System.out.println("Word not found. Please insert its definition below.");
				Key = word;
				Value = sc.nextLine();
				
				//adds user inputs to hash
				dictionary.put(Key, Value);   
				System.out.println();
				System.out.println("Dictionary:");
				
				//sorts alphabetically   
				HashMap<String, String> result = new LinkedHashMap<>();
		        dictionary.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
				
		        //prints hashmap contents
				for(Map.Entry m : result.entrySet()){    
				    System.out.println(m.getKey() + " - " + m.getValue());    
				}
			}//end if
			
			//asks if user would like to search for more words
			System.out.println();
			System.out.println("Would you like to search for another word?");
			maybe2 = sc.nextLine();
		}//end while
		
		System.out.println("Thank you!");
	}//end main 
}//end class