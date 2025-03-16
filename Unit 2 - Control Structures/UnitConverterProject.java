/**********************************
* Author: Monish Mamilla
* Program: Unit Converter
* Version 1.0
* Development Date: 11/11/24
***********************************/
package Unit2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class UnitConverter {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// User will choose preferred method
	System.out.print("Enter preferred conversion method (1. Inches to Cm, 2. Inches to Meters, "
			+ "3. Ft to Cm, 4. Ft to Meters, 5. Miles to Km, 6. Kilometers to Miles): ");
	double conversionMethod = sc.nextDouble();
	// User will enter number for conversion
	System.out.print("Enter your current number for conversion: ");
	double number = sc.nextDouble();
	// Variables for conversion
	double convert1 = number * 2.54;
	double convert2 = number / 39.37;
	double convert3 = number * 30.48;
	double convert4 = number / 3.281;
	double convert5 = number * 1.609;
	double convert6 = number / 1.609;
	DecimalFormat df = new DecimalFormat("#.##");
	// Loop for each of the options, including invalid choice. 
	if (conversionMethod == 1) 
	{
        System.out.println(number + " inches is " + df.format(convert1) + " centimeters.");
    }
	else if (conversionMethod == 2)
	{
		System.out.println(number + " inches is " + df.format(convert2) + " meters.");
	}
	else if (conversionMethod == 3)
	{
		System.out.println(number + " feet is " + df.format(convert3) + " centimeters.");
	}
	else if (conversionMethod == 4)
	{
		System.out.println(number + " feet is " + df.format(convert4) + " meters.");
	}
	else if (conversionMethod == 5)
	{
		System.out.println(number + " miles is " + df.format(convert5) + " kilometers.");
	}
	else if (conversionMethod == 6)
	{
		System.out.println(number + " kilometers is " + df.format(convert6) + " miles.");
	}
	else
	{
		System.out.println("Invalid Choice.");
	}
		sc.close();
	}

}
