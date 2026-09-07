
import java.util.Scanner;
import java.util.Stack;
/**
 * Tower.java 
 * Plays the game tower of Hanoi
 * @author Lamia 
 * Computer Science 30 
 * Copyright 2023, Centennial High School. 
 * All rights reserved.
 */
import java.util.Scanner;

public class Tower {
	//stores move number
    static int moves = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //asks the user how many disks they would play like to play the game with
        System.out.println("How many disks would you like there to be?");
        int n = sc.nextInt();
        //creates the sticks
        int[] start = new int[n];
        int[] middle = new int[n];
        int[] end = new int[n];
        //puts the number of starting disks on the the first stick
        for (int i = n; i >= 1; i--) {
            start[n - i] = i;
        }
        //calls the methods
        TOH(n, start, middle, end);
        Poss(n);
    }//end main
    
    //moves the disk
    public static void TOH(int n, int[] start, int[] middle, int[] end) {
       if (n > 0) {
            TOH(n - 1, start, end, middle);
            moveDisk(start, end);
            printTowers(start, middle, end);
            moves++;
            TOH(n - 1, middle, start, end);
        }
    }//end TOH
    
    ////moves the disk
    public static void moveDisk(int[] start, int[] end) {
        int startTop = findTop(start);
        int destTop = findTop(end);
        end[destTop + 1] = start[startTop];
        start[startTop] = 0;
    }//end moveDisk
    
    //moves the disk
    public static int findTop(int[] tower) {
        for (int i = tower.length - 1; i >= 0; i--) {
            if (tower[i] != 0) {
                return i;
            }
        }
        return -1;
    }//findTop
    
    //prints each stick and the disks on it
    public static void printTowers(int[] One, int[] Two, int[] Three) {
        System.out.println("Move " + moves);
        System.out.println("One: " + arrayToString(One));
        System.out.println("Two: " + arrayToString(Two));
        System.out.println("Three: " + arrayToString(Three)  + "\n");
    }//printTowers
    
    //takes the values and converts them in order to print them
    public static String arrayToString(int[] tower) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tower.length; i++) {
            if (tower[i] != 0) {
                sb.append(tower[i]);
                if (i != tower.length - 1) {
                    sb.append(", ");
                }
            }
        }
       
        return sb.toString();
    }//arrayToString
    
    //calculates the best possible number of moves according to the number of disks the user wants to play with
    public static void Poss(int n) {
        System.out.println("When n = " + n);
        double moves = Math.pow(2, n) - 1;
        System.out.println("The best possible number of moves is " + moves);
    }//poss ends
}//end class