/**********************************
* Author: Monish Mamilla
* Program: Rock Paper Scissors
* Version 1.0
* Development Date: 12/17/24
***********************************/
package Unit2;
// Importing scanner and random object
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean replay = true;
        while (replay) 
        {
            int userWins = 0;
            int compWins = 0;
            int targetScore = 0;
            // User has to enter a positive odd number
            while (replay == true) 
            {
                System.out.print("Enter the number of games for a Best Of series (positive odd number): ");
                // Using .hasNext() method to return true if the number is positive and odd
                // Learned from w3 schools. 
                if (sc.hasNextInt()) 
                {
                    int numGames = sc.nextInt();
                    if (numGames > 0 && numGames % 2 == 1) 
                    {
                        targetScore = (numGames / 2) + 1;
                        break;
                    }
                }
                System.out.println("Invalid number. Enter a positive odd number.");
                sc.nextLine(); 
            }
            // Choices the user will choose from
            while (userWins < targetScore && compWins < targetScore) 
            {
                System.out.println("\n1 - Rock");
                System.out.println("2 - Paper");
                System.out.println("3 - Scissors");
                System.out.print("Enter your choice (1, 2, or 3): ");
                int userChoice = -1;
                if (sc.hasNextInt()) 
                {
                    userChoice = sc.nextInt();
                }
                sc.nextLine(); 
                if (userChoice < 1 || userChoice > 3) 
                {
                    System.out.println("Invalid number. Computer wins this round.");
                    compWins++;
                    System.out.println("Score - User: " + userWins + " | Computer: " + compWins);
                    continue;
                }
                // Map choices to words
                String[] choices = {"Rock", "Paper", "Scissors"};
                String userWord = choices[userChoice - 1];
                // Computer will randomly choose rock, paper, or scissors
                int compChoice = rand.nextInt(3) + 1;
                String compWord = choices[compChoice - 1];
                // Print choices
                System.out.println("User: " + userWord + " | Computer: " + compWord);
                // Determine winner of the round
                if (userChoice == compChoice) 
                {
                    System.out.println("It's a tie. No one gets a point.");
                } 
                else if ((userChoice == 1 && compChoice == 3) || (userChoice == 2 && compChoice == 1) || (userChoice == 3 && compChoice == 2)) 
                {
                    System.out.println("You win this round.");
                    userWins++;
                } 
                else 
                {
                    System.out.println("Computer wins this round.");
                    compWins++;
                }
                // Print scores
                System.out.println("Score - User: " + userWins + " | Computer: " + compWins);
            }
            // Series result
            if (userWins == targetScore) 
            {
                System.out.println("\nCongratulations, you won the series.");
            } else 
            {
                System.out.println("\nThe computer won the series.");
            }
            // User gets the option to play again
            System.out.print("\nDo you want to play again (yes/no): ");
            String replayChoice = sc.nextLine().toLowerCase();
            replay = replayChoice.equals("yes");
            if (!replay) 
            {
                System.out.println("Thanks for playing.");
            }
        }
        // Close scanner
        sc.close();
    }
}
