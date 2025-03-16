/**********************************
* Author: Monish Mamilla
* Program: Dinosaur Class
* Version 4.0
* Development Date(s): 2/18/25
***********************************/
package Projects;
// Importing random object
import java.util.Random;
public class Dinosaur {
    // Declaring all variables and random object
    Random rand = new Random();
    String species;
    int HP;
    int Attack1;
    int Attack2;
    int Attack3;
    int Defense1;
    int Defense2;
    int Defense3;
    int CritChance;
    // Blank constructor
    public Dinosaur ()
    {
    	
    }
    // Constructor takes in parameters for each instance variable and initializes them
    public Dinosaur (String species, int HP, int Attack1, int Attack2, int Attack3, int Defense1, int Defense2, int Defense3, int CritChance)
    {
    	this.species = species;
    	this.HP = HP;
    	this.Attack1 = Attack1;
    	this.Attack2 = Attack2;
    	this.Attack3 = Attack3;
    	this.Defense1 = Defense1;
    	this.Defense2 = Defense2;
    	this.Defense3 = Defense3;
    	this.CritChance = CritChance;
    }
    public int getAttack(int mode) 
    {
    	// Initializing attack as 0
        int attack = 0;
        if (mode == 1) 
        {
            attack = (int)(Math.random() * (Attack1 + 4 - (Attack1 - 4) + 1) + (Attack1 - 4));
        } 
        else if (mode == 2) 
        {
            attack = (int)(Math.random() * (Attack2 + 4 - (Attack2 - 4) + 1) + (Attack2 - 4));
        } 
        else if (mode == 3) 
        {
            attack = (int)(Math.random() * (Attack3 + 4 - (Attack3 - 4) + 1) + (Attack3 - 4));
        }
        if (isCritical() ) 
        {
         // Double the attack if critical hit
            attack *= 2;  
        }
        // Returning attack
        return attack;
    }

    public int getDefense(int mode) 
    {
    	// Initializing defense to 0
        int defense = 0;
        if (mode == 1) 
        {
           defense = (int)(Math.random() * (Defense1 + 4 - (Defense1 - 4) + 1) + (Defense1 - 4));
        } 
        else if (mode == 2) 
        {
          defense = (int)(Math.random() * (Defense2 + 4 - (Defense2 - 4) + 1) + (Defense2 - 4));
        } 
        else if (mode == 3) 
        {
            defense = (int)(Math.random() * (Defense3 + 4 - (Defense3 - 4) + 1) + (Defense3 - 4));
        }
        // Returning defense
        return defense;
    }

    public boolean isCritical()
    {
    	// Critical hit chance is random
        int randomNumber = (int)(Math.random() * 100) + 1;
        if (randomNumber <= CritChance) 
        {
            System.out.println("Critical Hit.");
            return true;
        }
        return false;
    }

    public void adjustHP(int damage) 
    {
    	// Subtracting the damage from HP
        HP -= damage;  
    }
    // toString for returning species and hp
    public String toString()
	{
		// Returning everything using toString()
		return "Species: " + species + "\n" + "HP: " + HP;
	}
}

