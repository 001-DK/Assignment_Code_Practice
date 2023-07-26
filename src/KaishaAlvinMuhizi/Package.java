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
public class Package {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random days = new Random();
        int expiryDay = days.nextInt(12);
        int discountRate = 0;

        if (expiryDay == 1) {
            discountRate = 20;
        }

        if (expiryDay <= 5) {
            discountRate = 10;
        }

        if (expiryDay < 1) {
            System.out.println("Your subscription has expired!");
            System.out.println("Please renew your subscription!");
            
        } else if (expiryDay == 1) {
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountRate + " %!");
        } else if (expiryDay <= 5) {
            System.out.println("Your subscription expires in: " + expiryDay + " days.");
            System.out.println("Renew now and save " + discountRate + " %!");
        } else if (expiryDay <= 10) {
            System.out.println("Your subscription expires in: " + expiryDay + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
        }
    }
    
}
