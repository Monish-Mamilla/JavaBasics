/**********************************
* Author: Monish Mamilla
* Program: Press Your Luck
* Version 1.0
* Development Date: 12/11/24
***********************************/
package Unit2;
// Importing scanner and random object
import java.util.Random;
import java.util.Scanner;
public class PressYourLuck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int spins = rand.nextInt(10) + 1; 
        int balance = 0; 
        boolean whammy = false; 
        int choice;
        // Do-while loop
        do 
        {
            // Generating a random number [1, 6]
            int outcome = rand.nextInt(6) + 1;
            if (outcome == 1) 
            {
                // Hit the Whammy
                System.out.println("You hit the Whammy.");
                balance = 0;
                whammy = true;
            } 
            else if (outcome == 2) 
            {
                // Extra spin
                balance += 500;
                spins++;
                System.out.println("You won $500 and got an extra spin. Current Balance: $" + balance);
            } 
            else 
            {
                // User will win a random amount: 250, 500, 750, or 1000
                int prize = 250 * (outcome - 1); 
                balance += prize;
                System.out.println("You won $" + prize + ". Current Balance: $" + balance);
            }
            // One spin will be deducted if no Whammy was hit
            if (!whammy) 
            {
                spins--;
                System.out.println("Spins remaining: " + spins);
                // Ask user if they want to continue
                if (spins > 0) 
                {
                    System.out.print("Do you want to Press Your Luck (1) or Pass (2): ");
                    choice = sc.nextInt();
                    if (choice == 2) 
                    {
                        System.out.println("Game ended.");
                        break;
                    }
                }
            }
        } 
        while (spins > 0 && !whammy);
        // User's final balance is printed.
        System.out.println("Final balance is $" + balance);
        // Close the scanner
        sc.close();
    }
}
