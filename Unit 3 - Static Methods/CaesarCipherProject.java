/**********************************
* Author: Monish Mamilla
* Program: Caesar Cipher
* Version 1.0
* Development Date(s): 1/9/25
***********************************/
package Projects;
// Importing scanner
import java.util.Scanner;
public class CaesarCipher {
	// Main method
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// User has to enter text and key.
		System.out.print("Enter a string of text: ");
		String text = sc.nextLine().toUpperCase();
		System.out.print("Enter an encryption key: ");
		int key = sc.nextInt();
		// Closing scanner
		sc.close();
		caesar (text, key);
	}
	// Caesar method
	   public static void caesar(String text, int key) {
	        // Setting a blank string
	        String result = "";
	        for (int i = 0; i < text.length(); i++) 
	        {
	        	// Each character is isolated
	            char ch = text.charAt(i);
	            if (ch >= 'A' && ch <= 'Z') 
	            { 
	                ch = (char) ((ch - 'A' + key + 26) % 26 + 'A'); 
	            }
	            result += ch; 
	        }
	        // Encrypted text is printed
	        System.out.println("Encrypted Text: " + result);
	    }
	}