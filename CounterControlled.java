
package countercontrolled;

import java.util.Scanner;
public class CounterControlled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, numCircles;
        double radius;
        double area, average;
        double sum;
        System.out.println("How many crop circles?");
        numCircles = input.nextInt();
                sum = 0;
                count = 0;
                while(count < numCircles){
                    System.out.println("Enter Radius");
                    radius = input.nextDouble();
                    area = Math.PI * Math.pow(radius, 2);
                    System.out.println("Area = " + area);
                    sum = sum + area;
                    count++;
                }
                average = sum / count;
                System.out.println("The average area of damage is " + average);
    }
    
}
