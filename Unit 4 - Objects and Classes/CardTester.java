/**********************************
 * Author: Monish Mamilla
 * Program: Card Tester
 * Version 1.0
 * Development Date(s): 3/11/25
 **********************************/
package Practice_Assignments;
// Importing random object
import java.util.Random;
public class CardTester 
{
    public static void main(String[] args) 
    {
    	// Declaring random object
        Random rand = new Random();
        // Suit counters
        int hearts = 0, clubs = 0, diamonds = 0, spades = 0;
        for (int i = 0; i < 5; i++) 
        {
            int randNum = rand.nextInt(52);
            Card cards = new Card(randNum);
            System.out.println(cards.toString());
            if (cards.getSuit().equals("Hearts")) 
            {
                hearts++;
            } 
            else if (cards.getSuit().equals("Clubs")) 
            {
                clubs++;
            } 
            else if (cards.getSuit().equals("Diamonds")) 
            {
                diamonds++;
            } 
            else if (cards.getSuit().equals("Spades")) 
            {
                spades++;
            }
        }
        // Printing the suit counts
        System.out.println("Hearts: " + hearts);
        System.out.println("Clubs: " + clubs);
        System.out.println("Diamonds: " + diamonds);
        System.out.println("Spades: " + spades);
    }
}