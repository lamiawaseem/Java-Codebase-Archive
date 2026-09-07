/**
 * UnitCircle.java
 * Represents a circle whose radius is multiples of the unit circle - a circle with radius 1
 * @author Lamia
 * Computer Science 30
 * Copyright 2023, Centennial High School. All rights reserved.
 */
public class UnitCircle implements Comparable<UnitCircle>
{
    private int radius;
    
    //sets or creates radius
    public UnitCircle(int radius)
    {
        this.radius = radius;
    }
    
    //returns radius
    public int getRadius()
    {
        return radius;
    }
    
    //prints the returned radius in a statement
    public String toString()
    {
    	System.out.println("UnitCircle[r=" + radius + "]");
        return "UnitCircle[r=" + radius + "]"; 
    }

    //compares provided radius to that of the unit circle
    public int compareTo(UnitCircle circle) {
        return Integer.compare(this.radius, circle.radius);
    }
}//end class