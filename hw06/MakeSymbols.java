// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 03 Mar 2015 
// hw06
// This program will generate an integer 0-100 and then output that number of symbols

import java.util.*;

public class MakeSymbols {
    public static void main(String[] args) {
        Random rand = new Random(); //construct the random number generator
        int numGenerated = rand.nextInt(101); //generates a random number [0,101)
        System.out.println("Random number generated: "+numGenerated);
        System.out.print("The output pattern: ");
        
        //Statements for printing the symbols
        if(numGenerated == 0) { //special case for 0 since 0 % 0 == 0 and would cause an error
            
        }
        else if(numGenerated % 2 == 0) { //even number case
            do {
                System.out.print("*");
                numGenerated--;
            } while(numGenerated > 0);
        }
        else { //odd number case
            do {
                System.out.print("&");
                numGenerated--;
            } while(numGenerated > 0);
        }
        System.out.println(""); //for nice formatting
    }
}