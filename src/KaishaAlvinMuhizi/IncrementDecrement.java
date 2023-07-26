/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaishaAlvin;

/**
 *
 * @author Lora
 */
public class IncrementDecrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number=1;
        //Storing an integer 1 to a variable called number 
        number = number +1;
        System.out.println(number);
        //Increasing the value stored in variable number by 1
        number+=1;
        System.out.println(number);
        //Alternative method of increments 
        number++;
        System.out.println(number);
        
        System.out.println("Decrement begins from the last value \n stored in the varible number");
        //Decreasing the value stored in variable number by 1        
        number=number-1;
        System.out.println(number);
        //Alternative method of Decreements
        number-=1;
        System.out.println(number);
        
        number--;
        System.out.println(number);
        
        System.out.println("INCREMENT AND DECREMENT ORDER");
        
        number++;
        System.out.println(number);
        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);
        
        System.out.println("Another method");
        number-=3;
        ++number;
        number++;
        System.out.println(number);
        

        
        
       



      
        
    }
    
}
