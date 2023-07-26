/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alvin;

import java.util.Random;

/**
 *
 * @author Lora
 */
public class DiceRolling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random dice = new Random();//Class Random allows generation of random numbers 
        int roll1 = dice.nextInt(); // Generates a random integer between Integer.MIN_VALUE and Integer.MAX_VALUE
        int roll2 = dice.nextInt(101); // Generates a random integer between 0 (inclusive) and 101 (exclusive)
        int roll3 = dice.nextInt(51) + 50; // Generates a random integer between 50 (inclusive) and 101 (exclusive)

        System.out.println("First roll: " + roll1);
        System.out.println("Second roll: " + roll2);
        System.out.println("Third roll: " + roll3);
    }
    
}
