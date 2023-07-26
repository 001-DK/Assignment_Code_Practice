/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaishaAlvin;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Lora
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Temperature in Fahrenheit");
        double  fahren=input.nextDouble();
        System.out.println("Temprature in Fahrenheit is "+fahren+" Fahrenheit");
        
        double temp = ((fahren-32)*(5.0/9.0));
        System.out.println("Temprature in Degrees is "+temp+" Degrees");
        
        DecimalFormat df =new DecimalFormat("0.0");
        System.out.println("Using decimal fomart temperature in degrees is "+df.format(temp)+" Degrees");
        
        System.out.println("Using Rounding off temperature in degrees is "+Math.round(temp)+" Degrees");
        
        
        
        
    }
    
}
