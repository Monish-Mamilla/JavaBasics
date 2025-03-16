/**********************************
* Author: Monish Mamilla
* Program: Roman Numerals
* Version 1.0
* Development Date(s): 11/18/24
***********************************/
package Unit2;
// Importing scanner
import java.util.Scanner;
public class RomanNumeral {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Declaring variables
		int number, hundreds, tens, ones;
		System.out.print("Enter a number in the range [1, 1000]: ");
		number = sc.nextInt();
		hundreds = number / 100;
		tens = (number / 10) % 10;
		ones = number % 10;
		// Determining if number is in the range
		if (number <= 1000 && number >= 1) 
		{
            System.out.println("Number is in the range.");
        }
		else
		{
			System.out.println("Number is not in the range.");
		}
		switch (hundreds) {
        case 1:
            System.out.print("C");
            break;
        case 2:
        	System.out.print("CC");
        	break;
        case 3: 
        	System.out.print("CCC");
        	break;
        case 4:
        	System.out.print("CD");
        	break;
        case 5:
        	System.out.print("D");
        	break;
        case 6:
        	System.out.print("DC");
        	break;
        case 7:
        	System.out.print("DCC");
        	break;
        case 8:
        	System.out.print("DCCC");
        	break;
        case 9:
        	System.out.print("CM");
        	break;
        case 10:
        	System.out.print("M");
        	break;
        default:
            System.out.print("");
    }
		switch (tens) {
        case 1:
            System.out.print("X");
            break;
        case 2:
        	System.out.print("XX");
        	break;
        case 3: 
        	System.out.print("XXX");
        	break;
        case 4:
        	System.out.print("XL");
        	break;
        case 5:
        	System.out.print("L");
        	break;
        case 6:
        	System.out.print("LX");
        	break;
        case 7:
        	System.out.print("LXX");
        	break;
        case 8:
        	System.out.print("LXXX");
        	break;
        case 9:
        	System.out.print("XC");
        	break;
        default:
            System.out.print("");

	}
		switch (ones) {
        case 1:
            System.out.print("I");
            break;
        case 2:
        	System.out.print("II");
        	break;
        case 3: 
        	System.out.print("III");
        	break;
        case 4:
        	System.out.print("IV");
        	break;
        case 5:
        	System.out.print("V");
        	break;
        case 6:
        	System.out.print("VI");
        	break;
        case 7:
        	System.out.print("VII");
        	break;
        case 8:
        	System.out.print("VIII");
        	break;
        case 9:
        	System.out.print("IX");
        	break;
        default:
            System.out.print("");
	}
		 sc.close();
	        // Closing scanner
	}
}
