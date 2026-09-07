
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * DataSets.java
 * Takes a file and puts the information into an array list and print according to teacher provided scenarios
 * @author Lamia 
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */
public class DataSet {
	public static void main(String[] args) {
		// creating ArrayList one and printing it
		// 10, 13, 18, 27, 52, 61, 1, 3, 5, 102, 296, 351
		ArrayList<Integer> dataA = new ArrayList<>();
		try {
			// taking the file path as input using File
			File file = new File("M:\\Users\\16285512\\a.txt");
			Scanner scanner = new Scanner(file);
			// Read the entire line and split it by commas to extract integers
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbersAsString = line.split(",");
                
                // Parse each string value to integer and add to the ArrayList
                for (String numberStr : numbersAsString) {
                    int number = Integer.parseInt(numberStr.trim()); // Remove leading/trailing spaces
                    dataA.add(number);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
		System.out.println("Data Set A: " + dataA);

       // Creating a copy of dataA before sorting
        ArrayList<Integer> unsortedDataA = new ArrayList<>(dataA);
		
		// creating ArrayList two and printing it
		// 9, 14, 32, 27, 102, 641, 12, 52
		ArrayList<Integer> dataB = new ArrayList<>();
		try {
			File file1 = new File("M:\\Users\\16285512\\b.txt");
			Scanner scanner1 = new Scanner(file1);
			// Read the entire line and split it by commas to extract integers
			if (scanner1.hasNextLine()) {
	            String line = scanner1.nextLine();
	            String[] numbersAsString = line.split(",");
	            
	            // Parse each string value to integer and add to the ArrayList
	            for (String numberStr : numbersAsString) {
	                int number = Integer.parseInt(numberStr.trim()); // Remove leading/trailing spaces
	                dataB.add(number);
	            }
	        }
	        scanner1.close();
    	} catch (FileNotFoundException e) {
	        System.out.println("An error occurred while reading the file.");
	        e.printStackTrace();
    	}
		System.out.println("");
		System.out.println("Data Set B: " + dataB);
		System.out.println("");
		
		// Creating a copy of dataB before sorting
      	ArrayList<Integer> unsortedDataB = new ArrayList<>(dataB);

		// sorting ArrayList's in ascending order and printing them side by side
		Collections.sort(dataA);
		Collections.sort(dataB);
		// printing ArrayList after sorting
		System.out.println(dataA + " /\\ " + dataB);

		// sorting ArrayList's in descending order and printing them side by side
		Collections.sort(dataA, Collections.reverseOrder());
		Collections.sort(dataB, Collections.reverseOrder());
		// printing ArrayList after sorting
		System.out.println("");
		System.out.println(dataA + " \\/ " + dataB);

		Collections.sort(dataA);

		// printing unsorted  ArrayList A then ArrayList B side by side
		System.out.println("");
        System.out.println(unsortedDataA + " ! " + unsortedDataB);
        System.out.println("");
        System.out.println(unsortedDataB + " ! " + unsortedDataA);
		
        //combines or merges array lists
		System.out.println("");
		dataA.addAll(dataB);
		// Use HashSet to remove duplicates and then re-assign it to mergedData
        HashSet<Integer> set = new HashSet<>(dataA);
        dataA.clear();
        dataA.addAll(set);
        //sorts merged array lost after deleting doubles
        Collections.sort(dataA);
        //prints final no double merged array list
		System.out.println(dataA);
		
		
	}// end main

}// end class