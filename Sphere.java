/**
 * Sphere.java
 * Uses the calculator of volume and surface area of a shape
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class Sphere implements GeometricSolid{
    private double radius;
    private double SPHERECALC = (1.33333333333333333333333333333333);
    
    //sets radius
    public Sphere()
    {
        radius = 0;
    }

    //makes radius a double variable
    public Sphere( double r)
    {
        radius = r;
    }

    //changes radius based on user inputs
    public void setRadius(double r)
    {
        radius = r;
    }
    
    //returns new radius
    public double getRadius()
    {
        return radius;
    }
    
	//calculates volume based on information
    public double getVolume()
    {
    	double volume = 0;
    	
    	double radius = this.radius;
    	volume = (SPHERECALC* Math.PI * Math.pow(radius, 3));
    return volume;
    }

  //calculates surface area based on information provided
	public double getSurfaceArea() {
		double surfaceArea;
		surfaceArea = ((4)*Math.PI * Math.pow(radius, 2));
		return surfaceArea;
	}
}//end class