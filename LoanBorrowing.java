
package loanborrowing;

import java.util.Scanner;

public class LoanBorrowing {

   
    public static void main(String[] args) {
        
        
        double totalPayment, monthlyPayment, monthlyInterestRate, loanAmount, numYears, annualInterestRate;
        int count;

        count = 5;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Loan Amount: ");
        loanAmount = input.nextDouble();
        
      
        System.out.println("Enter Length of Borrowing in Years: ");
        numYears = input.nextDouble();
        
        
        
        
        System.out.println("Interest Rate" + "       " + "Monthly Payment" + "       " + "Total Payment");
        System.out.println("----------------------------------------------------------");
        annualInterestRate = 5;
            while(annualInterestRate >= 5 && annualInterestRate <= 8){
                annualInterestRate = 5;
                monthlyInterestRate = (annualInterestRate + 0.125) / 12;
                double roundedInterestRate;
                roundedInterestRate = (annualInterestRate + 100.0) / 100.0;
               
                monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numYears * 12));
                totalPayment = monthlyPayment * numYears * 12;
                
                
                
                
                System.out.println(roundedInterestRate + "%" + "     " + "$" + monthlyPayment + "     " + "$" + totalPayment);
                count++;
             
    }
    
        
            
            
  }  
    
}
