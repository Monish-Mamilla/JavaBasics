/**********************************
* Author: Monish Mamilla
* Program: Circle Class
* Version: 5.0
* Development Date(s): 3/11/25
**********************************/
package Practice_Assignments;

public class Circle {
    // Private instance variables
    private double radius;
    private double diameter;
    private double circumference;
    private double area;
    
    // Blank constructor
    public Circle() 
    {
    	
    }
    public Circle(double radius) 
    {
        setRadius(radius); 
    }
    public double getRadius() 
    {
        return radius;
    }
    public void setRadius(double radius) 
    {
    	// if radius is greater than 0, then the input is valid
        if (radius >= 0) 
        { 
            this.radius = radius;
            values();
        }
    }
    // Method to update values
    private void values() 
    {
        this.diameter = 2 * radius;
        this.circumference = 2 * Math.PI * radius;
        this.area = Math.PI * radius * radius;
    }
    // Getters for calculated properties
    public double getDiameter() 
    {
        return diameter;
    }
    public double getCircumference() 
    {
        return circumference;
    }

    public double getArea() 
    {
        return area;
    }
    // toString method to display object details
    public String toString() {
        return "Radius: " + radius + "\n" +
               "Diameter: " + diameter + "\n" +
               "Circumference: " + circumference + "\n" +
               "Area: " + area;
    }
}


	

