/**********************************
* Author: Monish Mamilla
* Program: Apothem Calculator
* Version 1.0
* Development Date: 9/30/24
***********************************/

package unit_1_Basics_of_Java;
//Importing scanner
import java.util.Scanner;
public class ApothemCalculator {

	public static void main(String[] args) {
		// Declaring scanner
		Scanner sc = new Scanner(System.in);
		double sidelength, numsides, pi, tan, answer;
		// User will enter the number of sides
		System.out.print("Enter the number of sides: ");
		numsides = sc.nextDouble();
		// User will enter the length of one of the sides
		System.out.print("Enter the length of one of the sides: ");
		sidelength = sc.nextDouble();
		pi = Math.PI;
		tan = Math.tan(pi/numsides);
		answer = sidelength / (2 * tan);
		// Length of the apothem is printed
		System.out.print("The length of the apothem is " + answer + ".");
		sc.close();
	}

}