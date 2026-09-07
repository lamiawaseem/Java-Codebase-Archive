/**
* HomeRenoCalculator.java
* this helps calculate different things that you would need to renovate
* @author Lamia
* Computer Science 20
* Copyright 2022, Centennial High School. All rights reserved.
*/
import java.util.Scanner;
public class HomeRenoPorject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner(System.in);
		
		WelcomeScreen();
		int choice = kbReader.nextInt( );
		
		//Based on users choice this will send them to a method to calculate what they chose
		switch (choice)
		{
		case 1:
		FloorDepartment();
		break;
		case 2:
		Paint();
		break;
		case 3: 
		Outdoor();
		break;
		case 4:
		Wallpaper();
		break;
		case 5:
		BackSplash();
		break;
		}//end switch
	}//end main

public static void WelcomeScreen() {
	System.out.println("Welcome to the Home Reno Calculator, which provides nessicary calculations for your home renovation.");
	System.out.println("Make you choice from the options listed below");
	System.out.println("1. Floor Department/Carpeting");
	System.out.println("2. Paint");
	System.out.println("3. Outdoor/Patio");
	System.out.println("4. Wallpaper");
	System.out.println("5. BackSplash");
	System.out.print("\n");
	System.out.print("What would you like to calculate: Your choice?" + "\n");
}//end WelcomeScreen

public static void FloorDepartment() {
	Scanner kbReader = new Scanner(System.in);
	
	//Collects the rectangular rooms dimensions and determines its area
	System.out.print("Please enter the width of the room in feet." + "\n");
	int w = kbReader.nextInt( );
	System.out.print("Please enter the length of the room in feet. " + "\n");
	int l = kbReader.nextInt( );
	int Area = l * w;
	System.out.print("The total square feet of carpeting in this rectangular room would be " + Area + "ft²." + "\n");
	
	//States diameter and surface area of a circular rug that could fit in the same room
	int radius = (w/2);
	double radiusSquared = radius * radius;
	double CircleArea = 3.14 * radiusSquared;
	double SurfaceArea = Math. ceil(CircleArea);
	System.out.print("The maximum diameter of a circular rug that would fit in the same room is " + w + ". The area would be " + SurfaceArea + " ft².");
}//end FloorDepartment

public static void Paint() {
	Scanner kbReader = new Scanner(System.in);
	
	//Collects the rectangular rooms dimensions and determines its area and how many cans of paint would be needed
	System.out.print("Please enter the height of the room in feet." + "\n");
	int h = kbReader.nextInt( );
	System.out.print("Please enter the length of the room in feet. " + "\n");
	int l = kbReader.nextInt( );
	int Area = l * h;
	int NumberOfCans= Area /350;
	double PaintCans = Math. ceil(NumberOfCans);
	System.out.print("It will take " + PaintCans + " number of cans/gallons of paint to cover the room.");
}//end Paint

public static void Outdoor() {
	Scanner kbReader = new Scanner(System.in);
	
	//collects tile size and patio size then determines the amount of tiles needed to cover the patio
	System.out.println("Please enter the width of the patio tiles in feet.");
	int PatioTileWidth = kbReader.nextInt();
	System.out.println("Please enter the length of the patio tiles in feet.");
	int PatioTileLength = kbReader.nextInt();
	System.out.println("Please enter the width of the patio in feet.");
	int PatioWidth = kbReader.nextInt();
	System.out.println("Please enter the length of the patio in feet.");
	int PatioLength = kbReader.nextInt();
	
	int PatioTileArea = PatioTileWidth * PatioTileLength;
	int PatioArea = PatioWidth * PatioLength;
	int TileNumber = PatioArea/PatioTileArea;
	double NumberOfTiles = Math.round(TileNumber);
	System.out.println("The total amount of patio tiles you would need to cover your patio is " + NumberOfTiles + ".");
}//end Outdoor

public static void Wallpaper() {
	Scanner kbReader = new Scanner(System.in);
	
	//collects wallpaper size and wall size then determines the amount of walllpaper needed to cover the wall
	System.out.println("Please enter the width of the wallpaper sheets in feet.");
	int WallpapereWidth = kbReader.nextInt();
	System.out.println("Please enter the length of the wallpaper sheets in feet.");
	int WallpaperLength = kbReader.nextInt();
	System.out.println("Please enter the width of the wall in feet.");
	int WallWidth = kbReader.nextInt();
	System.out.println("Please enter the length of the wall in feet.");
	int WallLength = kbReader.nextInt();
		
	int WallpaperArea = WallpapereWidth * WallpaperLength;
	int WallArea = WallWidth * WallLength;
	int WallpaperSheets = WallArea/WallpaperArea;
	double NumberOfWallpaper = Math.round(WallpaperSheets);
	System.out.println("The amount of wallpaper sheets needed to cover the wall is " + NumberOfWallpaper + ".");
}//end Wallpaper

public static void BackSplash() {
	Scanner kbReader = new Scanner(System.in);
	
	//collects tile size and wall size then determines the amount of tile needed to cover the wall
	System.out.println("Please enter the width of the tile in feet.");
	int TileWidth = kbReader.nextInt();
	System.out.println("Please enter the length of the tile in feet.");
	int TileLength = kbReader.nextInt();
	System.out.println("Please enter the width of the wall in feet.");
	int WallWidth = kbReader.nextInt();
	System.out.println("Please enter the length of the wall in feet.");
	int WallLength = kbReader.nextInt();
		
	int TileArea = TileWidth * TileLength;
	int WallArea = WallWidth * WallLength;
	int TileNumber = WallArea/TileArea;
	double NumberOfTiles = Math.round(TileNumber);
	System.out.println("The amount of wallpaper sheets needed to cover the wall is " + TileNumber + ".");
}//end BackSplash

}//end class