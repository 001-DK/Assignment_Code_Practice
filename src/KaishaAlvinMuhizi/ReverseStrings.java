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
public class ReverseStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "The quick brown fox jumps over the lazy dog";
        String[] subs = s.split(" ");

        for (String sub : subs) {
            char[] value = sub.toCharArray();
            StringBuilder reversed = new StringBuilder();
            for (int i = value.length - 1; i >= 0; i--) {
                reversed.append(value[i]);
            }
            String result = reversed.toString();
            System.out.println(result);
        }
    }
    
}
