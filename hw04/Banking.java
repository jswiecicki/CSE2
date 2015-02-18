// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 17 Feb 2015 
// hw04
// This program will generate a random bank account balance for a user, then give them the option of depositing, withdrawing or viewing their balance.

//imports all necessary java classes used
import java.util.*;

public class Banking { //creates the class banking
    public static void main(String [] args) { //standard java main method
    
        Random rand = new Random(); //construct the java.util.Random method
        Scanner input = new Scanner(System.in); //construct the Scanner method
        
        //initialize and declare the person's bank account value
       int currentBankValue = rand.nextInt(4001) + 1000; //ensure it is between 1,000 and 5,0000
       System.out.println("Your starting balance is: $" + currentBankValue); //prints out the initial balance so the user can see how much to withdraw/how it changes
       
       System.out.print("Would you like to deposit money (keyletter: d), withdraw money (keyletter: w), or view your balance"+
       " (keyletter: b)?"); //asks the user what action they would like to make
       String choice = input.next();
       
       switch (choice.toLowerCase()) { //the switch statement for all the actions. .toLowerCase allows the user to enter an uppercase keyletter without issues
           case "d":
                    System.out.print("How much money would you like to deposit?");
                    int deposit = input.nextInt();
                    if(deposit > 0) { //ensures the deposit is positive
                        currentBankValue = currentBankValue + deposit;
                    }
                    else {
                        System.out.println("You did not enter a valid input (a positive integer).");
                        return; //ends the program
                    }
                    break; //leaves the switch
            case "w":
                    System.out.print("How much money would you like to withdraw?");
                    int withdraw = input.nextInt();
                    if (withdraw > 0 && withdraw <= currentBankValue) { //ensures the user does not overdraw and enters a positive value
                        currentBankValue = currentBankValue - withdraw;
                    }
                    else {
                        System.out.println("You did either tried to overdraw or entered an invalid input.");
                        return;
                    }
                    break;
            case "b":
                    break;  //the balance is automatically printed out at the end of the program, so this skips to there
            default:  //runs if one of the above 3 letters is not entered
                    System.out.println("You did not enter one of the banking function keyletters."); 
                    return;
       }
       //print out the balance of the bank account
       System.out.println("Your current balance after any activities is: $" + currentBankValue);
       return;
    } 
}
