// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 03 Mar 2015 
// hw06
// This program will sum 5 non-negative integers

import java.util.*;

public class GetIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //construct the scanner
        int sum = 0;
        System.out.println("Please enter 5 non-negative integers:");
        
        
        int i, n;
        for(i = 0; i < 5; i++) {
            if(input.hasNextInt()) { // begins the case if user enters an integer
                n = input.nextInt();
                if (n > -1) { // begins the case of a non-negative integer
                    sum += n; //adds the integer to the running sum
                }
                else { //the case of a negative integer
                    System.out.println("Invalid input, please enter again:");
                    i--;
                }
            }
            else { // the case of a non-integer
                System.out.println("Invalid input, please enter again:");
                String junk = input.next();
                i--;
            }
        }
        System.out.println("The sum of these 5 integers is: "+sum);
        
    }
}
