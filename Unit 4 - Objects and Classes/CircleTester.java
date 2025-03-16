/**********************************
* Author: Monish Mamilla
* Program: Circle Tester
* Version: 1.0
* Development Date(s): 3/11/25
**********************************/
package Practice_Assignments;

public class CircleTester {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        Circle largerCircle = new Circle(10.0);
        // Printing both circles
        System.out.println("First Circle:");
        System.out.println(myCircle);
        System.out.println("\nSecond Circle:");
        System.out.println(largerCircle);
        // Calculating how many times larger the second circle's area is
        double areaRatio = largerCircle.getArea() / myCircle.getArea();
        System.out.printf("The second circle compared to the first circle is " + areaRatio);
    }
}





