/*
Jack Stryker
Homework 1
Comp-177-01
 */

package subtotal1;

import java.util.Scanner;

public class Subtotal1 {
            
 
    public static void main(String[] args) {
        //Declaration
            double total;
            double tip;
            
        //Input
           Scanner input = new Scanner(System.in);
           System.out.println("Enter cost here: ");
           double cost = input.nextInt();
           System.out.println("Enter tip percent here: ");
           double  tiprate = input.nextInt();
             
        //Process
        tip = tiprate * cost;
        total = cost + tip;
       
        //Output
            System.out.println("Total Tip Due: " + tip);
            System.out.println("Total Amount Due: " + total);
        
    }
    
}
