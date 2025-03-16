/**********************************
 * Author: Monish Mamilla
 * Program: Card 
 * Version 5.0
 * Development Date(s): 3/11/25
 **********************************/
package Practice_Assignments;
public class Card {
    // Declaring variables as private
    private String suit, faceValue;
    private int sequenceNumber;
    // Blank constructor
    public Card() 
    {
    	
    }
    // Constructor with parameter of sequence number
    public Card(int sequenceNumber) 
    {
        this.sequenceNumber = sequenceNumber;
        setFaceValue(sequenceNumber);
    }

    // Getter and setter methods
    public String getSuit() 
    {
        return suit;
    }

    public void setSuit(String suit) 
    {
        this.suit = suit;
    }

    public String getFaceValue() 
    {
        return faceValue;
    }

    public void setFaceValue(int sequenceNumber) 
    {
        int index = sequenceNumber % 13;
        switch (index) {
            case 0:
                faceValue = "Ace";
                break;
            case 1:
                faceValue = "2";
                break;
            case 2:
                faceValue = "3";
                break;
            case 3:
                faceValue = "4";
                break;
            case 4:
                faceValue = "5";
                break;
            case 5:
                faceValue = "6";
                break;
            case 6:
                faceValue = "7";
                break;
            case 7:
                faceValue = "8";
                break;
            case 8:
                faceValue = "9";
                break;
            case 9:
                faceValue = "10";
                break;
            case 10:
                faceValue = "Jack";
                break;
            case 11:
                faceValue = "Queen";
                break;
            case 12:
                faceValue = "King";
                break;
        }

        int suitIndex = sequenceNumber % 4;
        switch (suitIndex) 
        {
            case 0:
                suit = "Clubs";
                break;
            case 1:
                suit = "Diamonds";
                break;
            case 2:
                suit = "Hearts";
                break;
            case 3:
                suit = "Spades";
                break;
        }
    }
// toString to print faceValue with suit
    public String toString() {
        return faceValue + " of " + suit;
    }
}


