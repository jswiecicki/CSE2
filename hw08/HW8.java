// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 24 Mar 2015 
// hw08
// This program will allow a user to play a simple text RPG. It practices overloading methods.
import java.util.*; //imports scanner and random class

public class HW8 {
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!"); 
    }
    
    public static String getInput(Scanner scan, String string) {
            Character c = scan.next().charAt(0); //takes the user's input as a character
            if (c.equals(string.charAt(0)) || c.equals(string.charAt(1))) { //checks if user enters C or c
            
            } else {
            System.out.println("Yea right LOSER!");
            System.exit(0); //exits the game if user doesn't enter C or c
            }
            return null; //value returned isnt useful
    }
    
    public static String getInput(Scanner scan, String string, int trial) {
        Random rand = new Random();
        int crit = 0; 
        while(trial != 0 ) {
        Character c = scan.next().charAt(0); //takes the user's input as a character
        if (c.equals(string.charAt(0)) || c.equals(string.charAt(1))) { //checks if A or a
           crit = rand.nextInt(2);
           switch (crit) {
               case 0: System.out.println("Gosh! How can you miss it?!");
                        break;
               case 1: System.out.println("Critical hit!");
                       trial --;
           }
           System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        } else if (c.equals(string.charAt(2)) || c.equals(string.charAt(3))) { //checks if E or e
            crit = rand.nextInt(11);
            if (crit == 10) {
                return null; // leaves the method if user gets a 10
            } else {
                System.out.print("Escape failed! ");
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            }
            
        } else {
            System.out.println("Executed by the GIANT! GAME OVER!");
            System.exit(0);
        }
        }

        
            return null; //value returned isnt useful
    } 
    
    public static String getInput(Scanner scan) {
        String inputNum = scan.next(); //takes input in as a string to allow for non integers
            switch (inputNum) {
                case "1": System.out.print("Your reward is a scaliber! ");
                            break;
                case "2": System.out.print("Your reward is a piece of driftwood! ");
                            break;
                case "3": System.out.print("Your reward is a car door for a shield! ");
                         break;
                default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                         System.exit(0);
            }
            return null; //value returned isnt useful
    } 
    
      public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

}
