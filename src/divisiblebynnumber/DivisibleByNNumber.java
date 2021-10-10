/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiblebynnumber;

/**
 *
 * @author christopherii
 */
public class DivisibleByNNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set n number
        int baseNumber = 10; // You can set it to whatever you want. Example 5, 50, 100
        
        // Create variables for the counter values
        int divisibleBy2 = 0, divisibleBy3 = 0, divisibleBy5 = 0;
        
        // Loop it
        for (int i = 1; i <= baseNumber; i++) { // I start with 1 because we don't need to start with zero
            // create if else statement
            if (i % 2 == 0) // if the current number is divisible by 2.
                divisibleBy2++;
            
            if (i % 3 == 0)
                divisibleBy3++;
            
            if (i % 5 == 0)
                divisibleBy5++;
            
            // I use if statements since a number can be divisible by 3 or 2 or 5.
        }
        System.out.println("There are " + divisibleBy2 + " that are divisible by 2 from 1" + " to " + baseNumber);
        System.out.println("There are " + divisibleBy3 + " that are divisible by 3 from 1" + " to " + baseNumber);
        System.out.println("There are " + divisibleBy5 + " that are divisible by 5 from 1" + " to " + baseNumber);
    }
    
}
