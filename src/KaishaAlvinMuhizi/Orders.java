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
public class Orders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        String[] orders = new String[5];

        for (int i = 0; i < orders.length; i++) {
            char prefix = (char) (random.nextInt(6) + 'A'); // Generates a random character between 'A' and 'F'
            String suffix = String.format("%03d", random.nextInt(1000)); // Generates a random integer between 0 and 999 with leading zeros

            orders[i] = prefix + suffix;
        }

        for (String customer : orders) {
            System.out.println(customer);
        }
    }
    
}
