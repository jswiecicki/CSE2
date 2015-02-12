// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 10 Feb 2015 
// hw03
// This program will take a double as input from the user and compute the cube root of that number using a crude,
// formula with repetition 

//allows the scanner class to be used
import java.util.Scanner;

// creates the class Root
public class Root {
        // the standard java  main method
        public static void main(String [] args) {
            Scanner inputReader = new Scanner(System.in); //declares and constructs the Scanner under the name inputReader
            // collecting the user's number
            System.out.println("Please enter a number (a double). The cube root will be output:");
            double x = inputReader.nextDouble(); //gets the user input for the number to be cube rooted
            
            //declare variables to use for calculations
            double guess1,guess2,guess3,guess4,guess5,guess6;
            
            //perform calculations
            guess1=x/3; //get the first crude guess
            guess2=(guess1*guess1*guess1+x)/(3*guess1*guess1); //get a second crude guess
            guess3=(2*guess2*guess2*guess2+x)/(3*guess2*guess2); //get a third crude guess
            guess4=(2*guess3*guess3*guess3+x)/(3*guess3*guess3); //get a fourth crude guess
            guess5=(2*guess4*guess4*guess4+x)/(3*guess4*guess4); //get a fifth crude guess
            guess6=(2*guess5*guess5*guess5+x)/(3*guess5*guess5); //get a sixth crude guess
            
            //print out the guess
            System.out.println("The cube root is "+guess6);
            System.out.println(guess6+"*"+guess6+"*"+guess6+"="+guess6*guess6*guess6);
        
        
        } //end of main method
} //end of class