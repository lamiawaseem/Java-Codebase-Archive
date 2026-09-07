/**
 * Cube.java
 * Uses the calculator of volume and surface area of a shape
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Cube implements GeometricSolid{
   
	private double side;
	
	//sets the side length
    public Cube(double s)
    {
        setSide(s);
    }
    
    //creates cube
    public Object getObject() 
    {
    	Object o = new Object();
		return o;	
    }

    //sets side length based on user inputs
	public void setSide(double side) {
		this.side = side;
	}
	
	//returns new side length
	public double getSide() {
		return side;
	}
	
	//calculates volume based on information
	public double getVolume() {
		double volume = 0;
		volume = Math.pow(side, 3);
		return volume;
	}

	//calculates surface area based on information provided
	public double getSurfaceArea() {
		double surfaceArea = 0;
		surfaceArea = (6*Math.pow(side, 2));
		return surfaceArea;
	}
}//end class