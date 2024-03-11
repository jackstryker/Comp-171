/*
Jack Stryker
Homework 3
Comp-177-01
 */
package daymonth;

import java.util.Scanner;


public class DayMonth {

    
    public static void main(String[] args) {
        
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Month");
        int month = input.nextInt();
        
        System.out.println("Enter Year");
        int year = input.nextInt();
        boolean leap = false;
        double leapYear;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0)
                  leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
            }
        else
            leap = false;
    
        if(leap = true)
            leapYear = 29;
            else 
            leapYear = 28;

        switch (month) {
            case 1 -> System.out.println("January " + year + " has 31 days.");
            case 2 -> System.out.println("February " + year + " has " + leapYear + " days.");
            case 3 -> System.out.println("March " + year + " has 31 days.");
            case 4 -> System.out.println("April " + year + " has 30 days.");
            case 5 -> System.out.println("May " + year + " has 31 days.");
            case 6 -> System.out.println("June " + year + "  has 30 days.");
            case 7 -> System.out.println("July " + year + "  has 31 days.");
            case 8 -> System.out.println("August " + year + " has 31 days.");
            case 9 -> System.out.println("September " + year + " has 30 days.");
            case 10 -> System.out.println("October " + year + " has 31 days.");
            case 11 -> System.out.println("November " + year + " has 30 days.");
            case 12 -> System.out.println("December " + year + " has 31 days.");
            default -> {
            }
            }
        
    }
    
}


/*

run:
Enter Month
2
Enter Year
2000
February 2000 has 29.0 days.
BUILD SUCCESSFUL (total time: 6 seconds)

*/