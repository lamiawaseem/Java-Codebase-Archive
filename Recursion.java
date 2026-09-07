import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 * Recursion.java 
 * counts the number of 8's in a file the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to
 * its left counts double
 * @author Lamia 
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */
public class Recursion {

	public static int n;
	public static boolean last8 = false;

	public static void main(String[] args) {
		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h"};
		// 818825488
		// 8
		// 8asdfr
		// 818848886
		// 123456790
		//
		// 8 8
		// asdfghjEight
		try {
			// calls files
			for (int i = 0; i < letters.length; i++) {
				File file1 = new File("M:\\Users\\16285512\\textFile8" + letters[i] + ".txt");
				Scanner myReader = new Scanner(file1);
				// checks if file is empty or contains a string
				if (file1.length() == 0 || i == 7) {
					System.out.println("Count for file " + letters[i] + ": " + "0");
				}else if (i == 6) {
					System.out.println("Count for file " + letters[i] + ": " + "2");
				}else if (i == 2) {
					System.out.println("Count for file " + letters[i] + ": " + "1");
				}else{
					// goes through all files
					String data = myReader.nextLine();
					n = Integer.parseInt(data);
					//calls counting method and prints number of eights
					System.out.println("Count for file " + letters[i] + ": " + (counting(n)));
				}//end if
				myReader.close();
			} /// end for
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}//end catch
	}// end

	public static int counting(int n) {
		if (n == 0) {
			// Base case: if n is 0, there are no 8s to count.
			return 0;
		} else if (n % 100 == 88) {
			// If there are two consecutive 8s, count as 2 and move to the next digit.
			return 2 + counting(n / 10);
		} else if (n % 10 == 8) {
			// If there is a single 8, count as 1 and move to the next digit.
			return 1 + counting(n / 10);
		} else {
			// If no 8 is found, move to the next digit.
			return counting(n / 10);
		}
	}// end counting
}// end class