/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaishaAlvin;

import java.util.Arrays;

/**
 *
 * @author Lora
 */
public class ArraySorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] person = {"Christine", "Alvin", "Zion", "Brian"};

        System.out.println("Sorted ....");
        Arrays.sort(person);
        for (String name : person) {
            System.out.println("--" + name);
        }

        System.out.println("Reverse ....");
        Arrays.sort(person, (a, b) -> b.compareTo(a)); // Sort in reverse order using a custom comparator
        for (String name : person) {
            System.out.println("--" + name);
        }
    }
    
}
