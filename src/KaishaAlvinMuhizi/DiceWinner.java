/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaishaAlvin;

import java.util.Random;

/**
 *
 * @author Lora
 */
public class DiceWinner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random dice = new Random();
        int roll1 = dice.nextInt(6) + 1; // Generates a random integer between 1 and 6 (inclusive)
        int roll2 = dice.nextInt(6) + 1; // Generates a random integer between 1 and 6 (inclusive)
        int roll3 = dice.nextInt(6) + 1; // Generates a random integer between 1 and 6 (inclusive)
        int total = roll1 + roll2 + roll3;

        System.out.println("Dice roll: " + roll1 + " + " + roll2 + " + " + roll3);

        if ((roll1 == roll2) && (roll2 == roll3)) {
            System.out.println("You rolled tripples! +6 bonus to total!");
            total += 6;
            System.out.println("The Total is "+total);
            
        } else if (((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3))) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
            System.out.println("The Total is "+total);
            
        }

        if (total >= 15) {
            System.out.println("The Total is "+total);            
            System.out.println("You win!");
        } else {
            System.out.println("The Total is "+total);            
            System.out.println("Sorry, you lose.");
        }
    }
    
}
