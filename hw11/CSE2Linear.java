// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 15 Apr 2015 
// hw11
// This program will allow a user to enter grades into an array and then search that array. It will practice binary and linear searches. 

import java.util.*;

public class CSE2Linear {
    //the main program
    public static void main(String[] args) {
        int numToSearch = 0, iterations = 0;
        int firstArray[] = new int[15];
        int scrambledArray[] = new int[15];
        
        System.out.print("Please enter 15 ints that represent student's final CSE2 grades:");
        firstArray = fillArray(); //takes the user input for the first array
        printArray(firstArray); //prints out the array
        
        System.out.print("Please enter a grade to search for: ");
        numToSearch = getNum(); //handles the user entering an int 0-100
        iterations = binarySearch(numToSearch, firstArray); //returns the number of iterations taken to search
        if (iterations == 0) { // the method returns 0 if not found
            System.out.println("The grade of "+numToSearch+" was not found.");
        }
        else {
            System.out.println("The grade of "+numToSearch+" was found in "+iterations+" iterations.");
        }
        System.out.println("The array has been scrambled.");
        scrambledArray = scrambleArray(firstArray);
        printArray(scrambledArray);
        
        System.out.print("Please enter a grade to search for: ");
        numToSearch = getNum();
        iterations = linearSearch(numToSearch, scrambledArray);
        if (iterations == 0) { // the method returns 0 if not found
            System.out.println("The grade of "+numToSearch+" was not found.");
        }
        else {
            System.out.println("The grade of "+numToSearch+" was found in "+iterations+" iterations.");
        }
    }
    
    //Linear Search method
    public static int linearSearch(int num, int[] arrayToSearch) {
        int iterations = 0;
        for (int i = 0; i < arrayToSearch.length; i++) {
            iterations++;
            if (num == arrayToSearch[i]) {
                return iterations; //ends the method if number found
            } 
            else {
                
            }
        }
        iterations = 0; //resets to 0 if number not found
        return iterations;
    }
    
    public static int[] scrambleArray(int[] arrayToScramble) {
        Random rand = new Random();
        int k, store;
        //scrambles the array with the Fisher-Yates algorithm 
        for(int i = arrayToScramble.length -1; i > 0; i--) {
            k = rand.nextInt(i+1);
            store = arrayToScramble[i];
            arrayToScramble[i] = arrayToScramble[k];
            arrayToScramble[k] = store;
        }
        return arrayToScramble;
    }
    
    public static int binarySearch(int num, int[] arrayToSearch) {
        int iterations = 0, max = arrayToSearch.length - 1, min = 0;
        //standard binary search implementation, keeping track of the number of iterations
        while (max >= min) {
            int mid = (max+min) / 2;
            if (arrayToSearch[mid] == num) {
                iterations ++;
                return iterations;
            }
            else if (arrayToSearch[mid] < num) {
                min = mid +1;
                iterations ++;
            }
            else {
                max = mid -1;
                iterations++;
            }
        }
        iterations = 0; //resets to 0 if number not found
        return iterations;
    }
    
    public static int[] fillArray() { //creates the users first inputted array
        int[] usefulArray = new int[15];
        int usefulNum = 0, x = 0;
        for (int i =0; i < usefulArray.length; i++) {
            if (i == 0 ) {
                x = 0;
            }
            else {
                x = i-1;
            }
            usefulNum = getNextInt(usefulArray[x]);
          usefulArray[i] = usefulNum;
        }
        return usefulArray;
    }
    
    public static int getNum() {
        Scanner scan = new Scanner(System.in);
        int i = 0, n = 0;
         while (n != 1) {
        INPUT:
         if (scan.hasNextInt()) {
                i = scan.nextInt();
                if ( i < 0 || i > 100 ) {
                    System.out.print("You did not enter a number 0-100. Please try again: ");
                    break INPUT;
                }
                else {
                    n = 1;
                }
            }
            else {
                String junk = scan.next();
                System.out.print("You did not enter an int. Please try again: ");
            }
        }
        
        return i;
    }
    
    public static int getNextInt(int oneLess) {
        Scanner scan = new Scanner(System.in);
        int i = 0, n = 0;
        while (n != 1) {
        INPUT:
         if (scan.hasNextInt()) {
                i = scan.nextInt();
                if ( i < 0 || i > 100 ) {
                    System.out.print("You did not enter a number 0-100. Please try again: ");
                    break INPUT;
                }
                else {
                    
                }
                if (checkIfLarger(i, oneLess)) {
                    n = 1;
                }
                else {
                    System.out.print("The number you entered is smaller than the last int. Please try again: ");
                    n = 0;
                }
            }
            else {
                String junk = scan.next();
                System.out.print("You did not enter an int. Please try again: ");
            }
        }
        
        return i;
    }
    
    public static boolean checkIfLarger(int numToCheck, int checkAgainst) {
        if (numToCheck < checkAgainst ) {
            return false;
  
        }
        else {
            return true;
            
        }
    }
    
    public static void printArray(int[] arrayToPrint) {
        System.out.print("Your array is: [");
        for(int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            System.out.print(" ");
        }
        System.out.println(" ]");
    }
    
        
    
}