// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 13 Feb 2015 
// lab03
// This program will convert a user's input of RGB values to their hexadecimal counterparts.

import java.util.*;

public class BigMac {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the number of Big Macs (an integer > 0): ");
       int nBigMacs = input.nextInt();
       
       System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): ");
       double bigMac$ = input.nextDouble();
       
       System.out.print("Enter the percent tax as a whole number (xx): ");
       double taxRate = input.nextDouble();
       taxRate /=100;
       
       
        
    }
}