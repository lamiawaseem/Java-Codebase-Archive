/**
 * Project2.java
 * prints alphabet
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
package beginnersbook.com;
import java.io.*;
public class Project2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//write the alphabet to a random access file
		char [] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
							'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		RandomAccessFile random = new RandomAccessFile("C:\\Users\\16285512\\Alphabet.txt", "rw");
		
		System.out.println("Writing alphabet to the file!");
		
		for (int i = 0; i < alphabet.length; i++) {
			random.writeChar(alphabet[i]);
		}//end for
		
		System.out.println("Finished writing!");
		random.close();
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i]);
		}//end for
		
		System.out.println(" ");
		System.out.println("Prints the 2nd, 4th, 6th, 8th letter of the alphabet");
		System.out.println(alphabet[1]);
		System.out.println(alphabet[3]);
		System.out.println(alphabet[5]);
		System.out.println(alphabet[7]);
		
	}//end main
}//end class
