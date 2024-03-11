
package keypadaz.homework4;

import java.util.Scanner;
public class KeypadAZHomework4 {


    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Enter a Letter A-Z: ");
       String letter = input.next();
       char character = letter.charAt(0);
       character = Character.toUpperCase(character);
       
       int number = 0;
       if(Character.isLetter(character)){
        
        if(character >= 'A' && character <= 'C')
            number = 2;
        else if(character >= 'D' && character <= 'F')
            number = 3;
        else if(character >= 'G' && character <= 'I')
            number = 4;
        else if(character >= 'J' && character <= 'L')
            number = 5;
        else if(character >= 'M' && character <= 'O')
            number = 6;
        else if(character >= 'p' && character <= 'S')
            number = 7;
        else if(character >= 'T' && character <= 'V')
            number = 8;
        else if(character >= 'W' && character <= 'Z')
            number = 9;
        
        System.out.println(letter + " is " + number);
    } 
       else
            System.out.println("Please Enter a Valid Letter A-Z.");
        
    }
}
