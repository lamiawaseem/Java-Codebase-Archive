import java.awt.Point;
import java.util.Random;
/**
 * Robot.java
 * Makes a robot on an infinite plane that can change coordinates based on user inputs
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Robot{
	
	//The robot is located at a point with integer coordinates. It initially faces "North" - the top of the window.
    public int robotsX = 0;
    public int robotXStart = 0;
    public int robotsY = 0;
    public int robotYStart = 0;
    public int randomNumber;
    public Point location;
    public double distanceFromStart;

    private Random generator;

    /**
     * Constructor for objects of class Robot
     * @param theX the x coordinate
     * @param theY the y coordinate
     */
    public Robot(int theX, int theY)
    {
        // TODO: Complete the constructor
    	location = new Point(theX,theY);
    	robotsX = theX;
    	robotsY = theY;
    	robotXStart = theX;
    	robotYStart = theY;
        generator = new Random();
        generator.setSeed(12345);  //do  not change this statement
        
    }

    public void makeRandomMove()
    {
        randomNumber = generator.nextInt(4);
        //  0 is toward the top of the window (north)
        if (randomNumber == 0) {
    		robotsY--;
    	//  1 is towards the bottom of the window (south)
    	}else if (randomNumber == 1){
    		robotsY++;
    	 //  2 is towards the right side of the window (east)
    	}else if(randomNumber ==2 ) {
    		robotsX++;
    	//  3 is towards the left side of the window (west)
    	}else{
    		robotsX--;
    	}
        //returns current x and y location of the Robot
    	location.setLocation(robotsX, robotsY);
    	System.out.println(String.format("x=%d, y=%d", robotsX, robotsY));    
    }
    
    public double getDistanceFromStart() {
    	
    	//returns the distance the robot is from the starting point
    	//distanceFromStart =  Math.sqrt((robotXStart-robotsX)*(robotXStart-robotsX) + (robotYStart-robotsY)*(robotYStart-robotsY));
    	double distanceTestX = robotsY - robotYStart;
    	double distanceTestY = robotsX - robotXStart;
    	distanceFromStart = Math.sqrt(Math.pow(distanceTestX, 2)+Math.pow(distanceTestY, 2));
		return distanceFromStart;
    }

	// TODO Supply getLocation
    public Point getLocation()
    {
        return location;
    }
    // TODO: Supply the methods of the Robot class

}