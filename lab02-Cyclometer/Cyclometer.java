// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 30 Jan 2015 
// lab02
// This program will take data from a bicycle cyclometer and print out how long the bike trip took (in minutes),
// the number of wheel rotations, the distance of the trip, and the distance of two trips combined.

// creates the class Cyclometer
public class Cyclometer {
        // the standard java  main method
        public static void main(String [] args) {
            // the initial cyclometer data
            int secsTrip1=480; // variable for the number of seconds of trip 1
            int secsTrip2=3220; // variable for the number of seconds of trip 2
            int countsTrip1=1561; // variable for the number of rotations for trip 1
            int countsTrip2=9037; //variable for the number of rotations for trip 2
            
            // variables for useful constants to perform calculations
            double wheelDiameter=27.0, //the diameter of the bicycle wheel
            PI=3.14159, //the value of pi
            feetPerMile=5280, // the number of feet in a mile
            inchesPerFoot=12, // the number of inches in a foot
            secondsPerMinute=60; // the number of seconds in a minute
            double distanceTrip1, distanceTrip2, totalDistance; // variables to hold calculation outputs
            
            //prints out the duration of each trip and the number of rotations
            System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+ " counts."); //prints out the length and number of rotations for trip 1
            System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts."); //prints out the length and number of rotations for trip 2
            
            //calculations
            distanceTrip1=countsTrip1*wheelDiameter*PI; //calculates the distance by multiplying the number of rotations times the circumference of the wheel
            distanceTrip1/=inchesPerFoot*feetPerMile; // converts the distance from inches into miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculates the distance in miles by combining the steps in the above 2 lines
            totalDistance=distanceTrip1+distanceTrip2; //adds the distance of trip 1 and 2 together to get the total distance
            
            //printing out the calculated distance
            System.out.println("Trip 1 was "+distanceTrip1+" miles."); //prints out the calculated distance for trip 1
            System.out.println("Trip 2 was "+distanceTrip2+" miles."); //prints out the calculated distance for trip 2
            System.out.println("The total distance was "+totalDistance+" miles."); //prints out the distance of both trip 1 and 2
        } //end of main method
} //end of class
