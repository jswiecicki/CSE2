// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 10 Feb 2015 
// hw03
// This program will take data from a user about their bicycle cyclometer and print out how long the bike trip took (in minutes),
// the distance of the trip, and their mph during the trip.

//allows the scanner class to be used
import java.util.Scanner;

// creates the class Bicycle
public class Bicycle {
        // the standard java  main method
        public static void main(String [] args) {
            Scanner inputReader = new Scanner(System.in); //declares and constructs the Scanner under the name inputReader
            // the initial cyclometer data
            System.out.println("Please enter the number of rotations for your trip:");
            int countsTrip = inputReader.nextInt(); //gets the user input for the number of rotations
            
            System.out.println("Please enter the duration of your trip in seconds:");
            int secsTrip = inputReader.nextInt(); //gets the user input for the length of the trip
            
            // variables for useful constants to perform calculations
            double wheelDiameter=27.0, //the diameter of the bicycle wheel
            PI=3.14159, //the value of pi
            feetPerMile=5280, // the number of feet in a mile
            inchesPerFoot=12, // the number of inches in a foot
            secondsPerMinute=60; // the number of seconds in a minute
            double distanceTrip,
            timeTrip,
            mphTrip; //variables to hold the calculations output
            
            //calculations
            distanceTrip=(countsTrip*wheelDiameter*PI)/(inchesPerFoot*feetPerMile); //calculates the distance by multiplying the number of rotations times the circumference of the wheel
            timeTrip=secsTrip/secondsPerMinute; //calculates the duration of the trip in minutes
            mphTrip=distanceTrip/(timeTrip/60); //calculates the the mph for the trip

            
            //printing out the calculated distance and mph
            System.out.printf("The distance was %.2f", distanceTrip);
            System.out.printf(" miles and took %.1f",timeTrip);
            System.out.println(" minutes.");
            System.out.printf("The average mph was %.2f",mphTrip);
            System.out.println(".");
        } //end of main method
} //end of class