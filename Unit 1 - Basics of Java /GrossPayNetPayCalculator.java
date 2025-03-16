/**********************************
* Author: Monish Mamilla
* Program: Gross and Net Pay Calculator
* Version 1.0
* Development Date: 10/11/24
***********************************/

package unit_1_Basics_of_Java;
// Importing objects
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
public class GrossPayNetPayCalculator {

	public static void main(String[] args) {
	// Declaring variables
	double grossPay, netPay, rGrossPay, rNetPay;
	int rHours, maxHr = 40, minHr = 10, maxPr = 30, minPr = 10;
	Scanner sc = new Scanner(System.in);
	// User input
	System.out.print("Enter the number of hours you worked: ");
	int hours = sc.nextInt();
	System.out.print("Enter your payrate: ");
	double payrate = sc.nextDouble();
	grossPay = hours * payrate;
	DecimalFormat df = new DecimalFormat("$#,###.00");
	System.out.println("Your gross pay is " + df.format(grossPay));
	netPay = 0.56 * grossPay;
	System.out.println("Your net pay is " + df.format(netPay));
	System.out.println("___________________________");
	// Using random object for hours and pay rate
	Random rand = new Random ();
	int answer = rand.nextInt(maxHr - minHr + 1) + minHr;
	System.out.println("Random Number of Hours Worked: " + answer);
	int answer2 = rand.nextInt(maxHr - minHr + 1) + minHr;
	System.out.println("Random Payrate: " + answer2);
	rGrossPay = answer * answer2;
	System.out.println("Random Gross Pay: " + df.format(rGrossPay));
	rNetPay = 0.56 * rGrossPay;
	System.out.println("Your net pay is " + df.format(rNetPay));
	// Closing scanner
	sc.close();
	
	}

}
