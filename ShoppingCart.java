/**
* ShoppingCart.java
* Allows the consumer to buy multiple or a single product
* @author Lamia
* Computer Science 10
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String person1;
		
		System.out.println("Hi, what is yor name?");
		
		person1 = sc.nextLine();
		
		System.out.println("Welcome to Safeway Lamia, " + person1 +"!");
		
		Scanner numscan = new Scanner(System.in);
		Scanner wordscan = new Scanner(System.in);
		
		int choice;
		String answer;
		double total = 0;
		int quantity;
		String stillShopping = "yes";
		
		System.out.println(" ");
		System.out.println("1. Starwberries 1LB. \t$4.99");
		System.out.println("2. Potatoes 10lb bag. \t$6.99");
		System.out.println("3. Frozen Pizza. \t$5.99");
		System.out.println("4. Mango Ice Cream. \t$6.49 ");
		System.out.println("5. Citrus Fruit Juice. \t$4.19 ");
		System.out.println("6. Monopoply BardGame. \t$24.99 ");
		System.out.println("7. Pack of gluesticks. \t$5.00 ");
		System.out.println("8. Nail Polish. \t$9.99 ");
		System.out.println("9. Bicycle Lock. \t$17.09 ");
		System.out.println("10. Kinder Bueno Bag. \t$4.29 ");
		
		while ( stillShopping.equals("yes") ){
			System.out.println(" ");
			System.out.println("What would you like to buy?");
			choice = numscan.nextInt();
			System.out.println("How many do you want to buy? ");
			quantity = numscan.nextInt();
			
			switch (choice){
				case 1:
					total = ((total + 4.99) * quantity);
					break;
				case 2:
					total = ((total + 6.99) * quantity);
					break;
				case 3:
					total = ((total + 5.99) * quantity);
					break;
				case 4:
					total = ((total + 6.49) * quantity);
					break;
				case 5:
					total = ((total + 4.19) * quantity);
					break;
				case 6:
					total = ((total + 24.99) * quantity);
					break;
				case 7:
					total = ((total + 5.00) * quantity);
					break;
				case 8:
					total = ((total + 9.99) * quantity);
					break;
				case 9:
					total = ((total + 17.09) * quantity);
					break;
				case 10:
					total = ((total + 4.29) * quantity);
					break;
			}//end switch, shows how to calculate the price
			
			total = total + (total * 0.05);
			System.out.println("Do you want to keep shopping?");
			stillShopping = wordscan.nextLine();
		}//end while, asks for shoppers name, and the item(s) they would like to purchase, then calculates price
		
		System.out.println(" ");
		System.out.println("Thank you for shopping " + person1 + ", your totals comes to $" + total + ".");
		}//end main, prints final price along with a statement.
	}
