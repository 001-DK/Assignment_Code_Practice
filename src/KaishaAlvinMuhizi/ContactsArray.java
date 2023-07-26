/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaishaAlvin;

import java.util.Scanner;

/**
 *
 * @author Lora
 */
public class ContactsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] person = {"Alvin", "Allan", "Brian", "Beatrice", "Churchill", "Chloe", "Mike", "Majeed"};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter contact name or Character");
        String contact=input.nextLine();
        for (String item : person) //Iterates across all the names in array person
        {
            if (item.startsWith(contact)) {
                System.out.println(item);
                System.out.println("Has been Found");
            }
        }
        
        System.out.println("Contacts has not been Found");
    }
    
}
