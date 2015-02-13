// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 13 Feb 2015 
// lab04
// This program will take data from a user about how to split up cookies amongst people.
// It ensures that the user must enter an int value for their input, as well as sensible positive values. 

// import the java Scanner class
import java.util.Scanner;

//creates the class Cookies
public class Cookies {
    //standard java main method
    public static void main(String[] args) {
        //creates and constructs a new Scanner inputReader
        Scanner inputReader = new Scanner(System.in);
        
        //declare necessary variables
        int numPeople;
        int numCookies;
        int numCookiesPerPerson;
        int totalNecessary;
        int divideEvenly;
        String notEnough;
        String evenly;
        int moreCookies;
        
        
        //NUMBER OF PEOPLE
        //prompt the user for input for number of people
        System.out.println("Please enter the number of people:");
        
        //check if the user entered an int
        if (inputReader.hasNextInt()) {
            numPeople = inputReader.nextInt(); //saves the int input to variable numPeople
        }
        else {
            System.out.println("You did not enter an int.");
            return; //ends the program
        }
        
        //validate the input to ensure it is greater than 0
        if (numPeople <1) {
            System.out.println("You must have at least one person.");
            return; //ends the program
        }
        else {
            System.out.println("Please enter the number of cookies you want to buy:");
        }
        //NUMBER OF COOKIES
        //check if the user entered an int for # of cookies
        if (inputReader.hasNextInt()) {
            numCookies = inputReader.nextInt(); //saves the int input to variable numCookies
        }
        else {
            System.out.println("You did not enter an int.");
            return; //ends the program
        }
        
        //validate the input to ensure it is greater than 0
        if (numCookies <0) {
            System.out.println("You can't have negative cookies.");
            return; //ends the program
        }
        else {
            System.out.println("Please enter how many cookies you want each person to have:");
        }
        //NUMBER OF COOKIES PER PERSON
        if (inputReader.hasNextInt()) {
            numCookiesPerPerson = inputReader.nextInt(); //saves the int input to variable numCookiesPerPerson
        }
        else {
            System.out.println("You did not enter an int.");
            return; //ends the program
        }
        if (numCookiesPerPerson <1) {
            System.out.println("You must enter a positive number.");
            return; //ends the program
        }
        else {
            totalNecessary = numPeople*numCookiesPerPerson; //calculates if there are enough for everyone
            divideEvenly = numCookies%numPeople; //calculates if they divide evenly
            moreCookies = totalNecessary-numCookies; //calculates how many more cookies are necessary
        }
        //allows the divies evenly statements to be printed
        if (divideEvenly==0) {
            evenly = "and the amount divides evenly.";  
        }
        else {
            evenly = "but the amount does not divide evenly.";
        }
        //prints out the necessary statements
        if (numCookies-totalNecessary >=0) {
            notEnough = "You have enough cookies";
            System.out.println(notEnough+" "+evenly);
        }
        else {
            notEnough = "You do not have enough cookies.";
            System.out.println(notEnough+" You need to buy at least "+moreCookies+" more cookies.");
        }
        
    }
}
