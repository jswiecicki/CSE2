// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 03 Mar 2015 
// hw06
// This program will calculate factorials for integers 9-16

import java.util.*;

public class RunFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //constructs the scanner
        
        //while loop to ensure an integer 9-16 is entered
        System.out.println("Please enter an integer between 9 and 16:");
        int n = 0, inputNum = 0;
        while(n == 0) {
            if(input.hasNextInt()) {
                inputNum = input.nextInt();
                if(inputNum >= 9 && inputNum <= 16) {
                    System.out.println("Input accepted:");
                    n = 1;
                }
                else { //case if an integer but outside range
                    System.out.println("Invalid input, please enter again:");
                }
            }
            else { //case if mot an integer
                System.out.println("Invalid input, please enter again:");
                String junk = input.next();
            }
        }
        //end input while loop
        int countdownNum = inputNum; //creates a new variable countdownNum so inputNum can be used later
        long output = inputNum; //assigns an initial value
 
        //factorial multiplication loop
        while(countdownNum != 1) {
            output *= (countdownNum - 1);
            countdownNum--;
        }
        System.out.println(inputNum+"! = "+output);
    }
}