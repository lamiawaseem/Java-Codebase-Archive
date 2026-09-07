import java.util.Scanner;

/**
 * GCF.java 
 * finds greatest common factor of provided integers
 * @author Lamia 
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */

public class GCF {
	/**Because the greatest common factor (GCF) only applies to integers, finding the GCF for floating-point values is not a simple operation. 
	However, you might think about converting the numbers to fractions (by multiplying them by a common power of 10 to eliminate decimal points)
	and then determining the GCF of the resulting integers if you wish to identify a common factor for a group of floating-point numbers.
	Take the integers 0.5, 0.75, and 1.25, for instance. Fractionalize them to 5/10, 75/100, and 125/100. Next, ascertain GCF for 5, 75, and 125. 
	To obtain the GCF of the original floating-point numbers, find the GCF and divide it by the common power of 10 that was used during conversion.
	**/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to find the greatest common factor of?");
		int choice = sc.nextInt();
		System.out.println("Enter the numbers:");
		// creates empty array that stores 10 indexes
		int[] arr = new int[choice];
		// user enters numbers that are put into empty array
		for (int i = 0; i < choice; i++) {
			// reading array elements from the user
			arr[i] = sc.nextInt();
		}
		// calls method
		gcf(arr);

	}

	// gets greatest common factor between user inputed number
	public static int gcf(int[] arr) {
		int gcf = arr[0];
		for (int i = 1; i < arr.length; i++) {
			gcf = calculateGCF(gcf, arr[i]);
		}
		System.out.println("The greatest common factor is: " + gcf);
		return gcf;
	}

	public static int calculateGCF(int a, int b) {
		if (b == 0) {
			return a;
		}
		return calculateGCF(b, a % b);
	}
}// end class