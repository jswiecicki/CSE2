// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 17 Mar 2015 
// hw07
// This program will take a user's input of 1-30 and generate a wave using numbers as symbols. A type of ASCII art.
import java.util.*; //imports the scanner class

public class waves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //constructs the scanner for input
        
        // input code
        System.out.print("Enter a number between 1 and 30:");
        int n = 0, inputNum = 0; //variables to be used in while loop
        while(n == 0) {
            if(input.hasNextInt()) {
                inputNum = input.nextInt(); //if an integer, assigns the users input to inputNum
                if(inputNum >= 1 && inputNum <= 30) {
                    n = 1; // ends the loops if an integer in the proper range
                }
                else { //case if an integer but outside range
                    System.out.print("Invalid input, please enter again:");
                }
            }
            else { //case if mot an integer
                System.out.print("Invalid input, please enter again:");
                String junk = input.next(); 
            }
        }
        
        System.out.println(""); //output formatting
        
        //for loop
        System.out.println("FOR LOOP:");
        System.out.println("1"); //always prints a 1 to start the wave
        int i, g;
        int b, x; //varaibles used in loops
        int startNum = 2; //the first number to be printed
        for(i = inputNum; i > 1; i--) {
            if (startNum % 2 == 0 ) { //checks if startNum is even or odd to know whether to decrement or increment in making the wave
            x = 1;
            }
            else {
            x = startNum;
            }
           for(b = startNum; b > 0; b--) {
               if(startNum % 2 == 0) { //again to see whether to decrement or increment
                  for(g = 0; g < x; g++) {
                       System.out.print(startNum); //incrementing loop
                  }
                  x++;
                  System.out.println("");
               }
               else {
                  for(g = 0; g < x; g++) {
                       System.out.print(startNum); //decrementing loop
                  }
                  x--;
                  System.out.println("");
               }
           }
           startNum++;
        }
        
        //while loop   identical to for-loop except using while loop structure
        System.out.println("WHILE LOOP:");
        System.out.println("1");
        startNum = 2;
        i = inputNum;
        b = startNum;
         while (i > 1) {
            if (startNum % 2 == 0) {
            x = 1;
            }
            else {
                x = startNum;
            }
            b = startNum;
           while ( b > 0) {
               if( startNum % 2 == 0) {
                   g = 0;
                  while(g < x) {
                       System.out.print(startNum);
                       g++;
                  }
                  x++;
                  System.out.println("");
               }
               else {
                   g = 0;
                  while (g < x) {
                       System.out.print(startNum);
                       g++;
                  }
                  x--;
                  System.out.println("");
               }
               b--;
           }
           startNum++;
           i--;
        }
        
        //do-while loop identical to while loop except using do-while loop structure
        System.out.println("DO-WHILE LOOP:");
        System.out.println("1");
        startNum = 2;
        i = inputNum;
        b = startNum;
        if (inputNum != 1) { //checks for the case of user entering a 1, as a do while loop will run before checking if the only number is 1
        do {
          if (startNum % 2 == 0) {
            x = 1;
            }
          else {
              x = startNum;
            } 
            b = startNum;
            do {
                if( startNum % 2 == 0) {
                   g = 0;
                  do {
                       System.out.print(startNum);
                       g++;
                  } while (g < x);
                  x++;
                  System.out.println("");
               }
               else {
                   g = 0;
                  do {
                       System.out.print(startNum);
                       g++;
                  } while (g < x);
                  x--;
                  System.out.println("");
               }
               b--;
            } while ( b >0);
            startNum++;
            i--;
        } while (i > 1);
        }
        else {
            
        }
    }
}