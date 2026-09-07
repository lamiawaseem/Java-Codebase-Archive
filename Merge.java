import java.util.Random;

/**
 * Merge.java 
 * combines two sorted lists into a single sorted list that contains all the elements from both of the original lists.
 * @author Lamia 
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */
public class Merge {

	public static void main(String[] args) {
		
		//prints first random array
		Random rnd = new Random();
		int[] data1 = new int[5];
		System.out.println("The randomized array is displayed:");
		for (int i = 0; i < data1.length; i++) {
			data1[i] = rnd.nextInt(20);
			System.out.print(data1[i] + " ");
		}
		//prints sorted first array
		System.out.println();
		System.out.println();
		insertion(data1);
		System.out.println();
		System.out.println("the data1 array sorted:");
		for (int q = 0; q < data1.length; q++) {
			System.out.print(data1[q] + " ");
		}
		System.out.println();
		System.out.println();
		//prints second random array
		int[] data2 = new int[5];
		System.out.println("The data2 randomized array is displayed:");
		for (int i = 0; i < data2.length; i++) {
			data2[i] = rnd.nextInt(20);
			System.out.print(data2[i] + " ");
		}
		//prints sorted second array
		System.out.println();
		System.out.println();
		insertion(data2);
		System.out.println();
		System.out.println("the data2 array sorted:");
		for (int q = 0; q < data2.length; q++) {
			System.out.print(data2[q] + " ");
		}
		System.out.println();
		System.out.println();

		int first = data1.length; // determines length of data1Array
		int second = data2.length; // determines length of data2Array
		int[] result = new int[first + second]; // resultant array of size data1 array and data2 array
		System.arraycopy(data1, 0, result, 0, first);
		System.arraycopy(data2, 0, result, first, second);
		System.out.println();
		//combines array
		System.out.println("The unsorted combined array:");
		for (int q = 0; q < result.length; q++) {
			System.out.print(result[q] + " ");

		}
		System.out.println();
		insertion(result);
		System.out.println();
		//prints sorted combined array
		System.out.println("the sorted combined array");
		for (int q = 0; q < result.length; q++) {
			System.out.print(result[q] + " ");
		}
		System.out.println();
	}

	public static void insertion(int[] arr) {

		// note: we start with 1 instead of 0
		for (int i = 1; i < arr.length; i++) {
			int curNumber = arr[i];

			// Set index to be place to the left
			int curIndex = i - 1;

			// We are still inbounds and the current number
			// is less than the current index
			while (curIndex >= 0 && arr[curIndex] > curNumber) {
				// Shift the value at curIndex to the right one place
				arr[curIndex + 1] = arr[curIndex];
				curIndex--;
			}

			// Put this number in the proper location
			arr[curIndex + 1] = curNumber;

			System.out.print("Iteration " + i + ": ");
			for (int q = 0; q < arr.length; q++) {
				System.out.print(arr[q] + " ");
			}
			System.out.println();
		}
	}
}