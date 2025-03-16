/**********************************
* Author: Monish Mamilla
* Program: Dinosaur Tester
* Version 1.0
* Development Date(s): 2/18/25
***********************************/
package Projects;

public class DinosaurTester {
    public static void main(String[] args) {
        // Declaring dino classes and passing values
        Dinosaur dino1 = new Dinosaur("T-Rex", 80, 6, 8, 10, 10, 8, 6, 30);
        Dinosaur dino2 = new Dinosaur("Triceratops", 100, 6, 8, 12, 14, 6, 2, 25);
        System.out.println(dino1.species + " | " + "HP: " + dino1.HP);
        System.out.println(dino2.species + " | " + "HP: " + dino2.HP);
        // Calling the methods
        int damage1 = dino1.getAttack(3);
        int defense1 = dino1.getDefense(3);
        int damage2 = dino2.getAttack(1);
        int defense2 = dino2.getDefense(1);
        int totalDamage1 = damage1 - defense2;
        // If damage is positive, calculate the damage done
        if (totalDamage1 > 0)
        {
        	  dino1.HP -= damage2;
        }
        int totalDamage2 = damage2 - defense1;
     // If damage is positive, calculate the damage done
        if (totalDamage2 > 0)
        {
        	dino2.HP -= damage1;
        }
        // Printing the HPs
        System.out.println("T-Rex HP: " + dino1.HP);
        System.out.println("Triceratops HP: " + dino2.HP);
    }
}

