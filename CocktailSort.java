import java.util.Scanner;

public class CocktailSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// array number one
		// Input the list of 10 numbers
		String input = scanner.nextLine();
		String[] inputArray = input.split(" ");
		int[] numbers = new int[10];
		// puts user inputed numbers into the empty array
		for (int i = 0; i < 10; i++) {
			numbers[i] = Integer.parseInt(inputArray[i].trim());
		}
		Sort(numbers);// calls method

		// array number two
		// Input the list of 10 numbers
		String input2 = scanner.nextLine();
		String[] inputArray2 = input2.split(" ");
		int[] numbers2 = new int[10];
		// puts user inputed numbers into the empty array
		for (int i = 0; i < 10; i++) {
			numbers2[i] = Integer.parseInt(inputArray2[i].trim());
		}
		Sort(numbers2);// calls method

		// array number three
		// Input the list of 10 numbers
		String input3 = scanner.nextLine();
		String[] inputArray3 = input3.split(" ");
		int[] numbers3 = new int[10];
		// puts user inputed numbers into the empty array
		for (int i = 0; i < 10; i++) {
			numbers3[i] = Integer.parseInt(inputArray3[i].trim());
		}
		Sort(numbers3);// calls method

	}// end main

	public static void Sort(int[] arr) {
		
		int n = arr.length;
		int swaps = 0;
		boolean sorted = false;
		
		while (!sorted) {
			sorted = true;
			// Pass from low to high
			//swapped numbers and increased number count of moves
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swaps++;
					sorted = false;
				}//end if
			}//end for

			if (sorted) {
				break;
			}//end if

			// Pass from high to low
			//swapped numbers and increased number count of moves
			for (int i = n - 1; i > 0; i--) {
				if (arr[i] < arr[i - 1]) {
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					swaps++;
					sorted = false;
				}//end if
			}//end for
		}//end while
		System.out.println(swaps);
	}//end Sort
	
}// end class