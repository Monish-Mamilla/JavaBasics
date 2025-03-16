/**********************************
* Author: Monish Mamilla
* Program: Prime Up to X
* Version 1.0
* Development Date(s): 1/16/25
***********************************/
package Projects;
// Importing scanner
import java.util.Scanner;
public class PrimeUpToX {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int integer;
		// User has to enter an integer greater than 1.
		System.out.print("Enter an integer greater than 1: ");
		integer = sc.nextInt();
		// Checking if each integer is greater than 1.
		if (integer > 1)
		{
			System.out.print("Prime numbers up to " + integer + ": ");
			for (int i = 2; i <= integer; i++)
			{
				if (isPrime(i))
				{
					System.out.print(i + " ");
				}
			}
		}
		else
		{
			// If the number is not greater than 1, then the print statement below will be printed.
			System.out.println("Invalid number.");
		}
		// Closing scanner
		sc.close();
	}
	public static boolean isPrime (int integer)
	{
		for (int i = 2; i < integer; i++) 
		{
			// Dividing the parameter by the counter variable and returning false if there is no remainder
			if (integer % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
