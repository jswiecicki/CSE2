// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 20 Mar 2015 
// lab08
// This program will convert a user's input of RGB values to their hexadecimal counterparts.

import java.util.*;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer to calculate the superfactorial of:");
        int userInput = input.nextInt();
        int x = userInput;
        long finalSum = 0;
        for (int i = 1; i <= x; i++) {
            finalSum += factorial(i);
        }
        
        print(userInput, finalSum);
        
    }
        
    public static long factorial(int facInput) {
        long output = facInput;
        while(facInput != 1) {
            output *= (facInput - 1);
            facInput--;
        }
        return output;
    }
    
    public static void print(int inputNum, long finalNum) {
        System.out.println("The super factorial of "+inputNum+" is equal to "+finalNum);
    }
    
}