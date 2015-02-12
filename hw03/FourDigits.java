// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 10 Feb 2015 
// hw03
// This program will take a double from a user and output the first four digits after the decimal point 

//allows the scanner class to be used
import java.util.Scanner;

// creates the class FourDigits
public class FourDigits {
        // the standard java  main method
        public static void main(String [] args) {
            Scanner inputReader = new Scanner(System.in); //declares and constructs the Scanner under the name inputReader
            // collecting the user's number
            System.out.println("Please enter a number (a double). I will output the 4 numbers after the decimal point:");
            double x = inputReader.nextDouble(); //gets the user input for the number 
            
            //casting the input to an int
             int y = (int) x; //converts the double to an integer to lose the decimal points
             x = x*10000; //moves decimal places to the left
             int z = (int) x; //converts the large double to an integer to lose the decimal points
             int b = z%(y*10000); //gives the remainder after dividing by 10000, which should be the first 4 decimal places
             if (z%(y*10000)<1) {
                 System.out.println("The four decimal digits are:000"+b); //the case where the first four digits are zeros
             }
             else if (z%(y*10000)<10) {
                 System.out.println("The four decimal digits are:000"+b); // the case where the first three digits are zeros
             }
             else if(z%(y*10000)<100) {
                 System.out.println("The four decimal digits are:00"+b); //the case where the first two digits are zeros
             }
             else if(z%(y*10000)<1000) {
                 System.out.println("The four decimal digits are:0"+b); //the case where the first digit is zero
             }
            else {
           
            //print out the guess
             System.out.println("The four decimal digits are:"+b); // the standard output 
             }
        } //end of main method
} //end of class