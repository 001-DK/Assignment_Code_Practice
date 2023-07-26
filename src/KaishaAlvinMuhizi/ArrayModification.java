/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaishaAlvinMuhizi;

import java.util.Arrays;

/**
 *
 * @author Lora
 */
public class ArrayModification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] person = {"Christine", "Alvin", "Zion", "Brian"};


        System.out.println("");

        System.out.println("Before: " + person[0].toLowerCase());
        Arrays.fill(person, 0, 2, null);

        if (person[0] != null) {
            System.out.println("After: " + person[0].toLowerCase());
        }

        System.out.println("Clearing 2 ... count: " + person.length);
        for (String pallet : person) {
            System.out.println("-- " + pallet);
        }
    }
    
}
