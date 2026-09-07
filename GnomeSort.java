import java.util.Scanner;

public class GnomeSort {

// Driver program to test above functions.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//creates empty array that stores 10 indexes
		int[] arr = new int[10];
		//user enters numbers that are put into empty array  
		for (int i = 0; i < 10; i++) {
			//reading array elements from the user  
			arr[i] = sc.nextInt();
		}
		//calls method
		Sort(arr, arr.length);

		//repeats above process for second array
		int[] arr2 = new int[10];
		//user enters numbers that are put into empty array  
		for (int i = 0; i < 10; i++) {
			//reading array elements from the user  
			arr2[i] = sc.nextInt();
		}
		//calls method
		Sort(arr2, arr2.length);

		//repeats above process for third array
		int[] arr3 = new int[10];
		//user enters numbers that are put into empty array  
		for (int i = 0; i < 10; i++) {
			//reading array elements from the user  
			arr3[i] = sc.nextInt();
		}
		//calls method
		Sort(arr3, arr3.length);

	}// end main

	static void Sort(int arr[], int n) {
		//index of array
		int i = 0;
		//counts passes or swaps or moves made
		int passes = 0;
		//goes through entire array
		while (i < n) {
			//if the value of the number is less than the next one the gnome moves forwards
			if (i == 0 || arr[i - 1] <= arr[i]) {
				i++;
				passes++;
			//otherwise it swaps numbers and moves accordingly
			} else {
				int move = arr[i];
				arr[i] = arr[i - 1];
				arr[--i] = move;
				passes++;
			}
		} // end while
		//prints number of gnome moves
		System.out.println(passes);
	}// end sort

}// end class