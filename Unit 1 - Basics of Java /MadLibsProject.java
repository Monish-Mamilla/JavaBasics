/**********************************
* Author: Monish Mamilla
* Program: Mad Lib
* Version 1.0
* Development Date: 9/23/24
***********************************/
package unit_1_Basics_of_Java;
// Importing scanner. 
import java.util.Scanner;
public class Mad_Libs_Project {

	public static void main(String[] args) {
		// Declaring two scanners, one for strings and one for integers.
		Scanner sc = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		// Declaring variables. 
		String name;
		int number;
		String noun1;
		String noun2;
		String noun3;
		String adjective1;
		String adjective2;
		// User will choose a name, a number, three nouns, and 2 adjectives. 
		System.out.print("Enter a name: ");
		name = sc.nextLine();
		System.out.print("Enter a number: ");
		number = scInt.nextInt();
		System.out.print("Enter a noun: ");
		noun1 = sc.nextLine();
		System.out.print("Enter a noun: ");
		noun2 = sc.nextLine();
		System.out.print("Enter a noun: ");
		noun3 = sc.nextLine();
		System.out.print("Enter an adjective: ");
		adjective1 = sc.nextLine();
		System.out.print("Enter an adjective: ");
		adjective2 = sc.nextLine();
		// Paragraph that will utilize all of the user input. 
		System.out.print("At " + name + " Pizza Restaurant, they make a " + number + " inch pizza with " 
		+ noun1 + "s, " + noun2 + "s, and " + noun3 + "s. The pizza is always served " + adjective1 
		+ " and " + adjective2 + ".");
		sc.close();
		scInt.close();
	}

}
