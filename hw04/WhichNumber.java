// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 17 Feb 2015 
// hw04
// This program will ask a user to think of a number. The program will then attempt to guess that number by asking a series of yes or no questions.

//allows the scanner class to be used
import java.util.Scanner;

// creates the class WhichNumber
public class WhichNumber {
        // the standard java  main method
        public static void main(String [] args) {
            
            Scanner inputReader = new Scanner(System.in); //constructs a scanner called "inputReader"
            
            //necessary variables (cannot be decalred in if statements)
            String isNumEven, isNumDivByThree, isNumDivByFour, isNumDivByFourGreaterOne, isNumDivByFive, isNumDivByThreeGreaterOne, isNumGreaterSix, isNumLessThree;
            
            //Tell the user to think of a number between 1 and 10
            System.out.println("Please think of an integer between 1 and 10. I will try to guess that number.");
            
            System.out.print("Is your number even? Enter \"y\" for yes and \"n\" for no for all questions.");
            isNumEven = inputReader.next();
            
                //start of the questioning
                if (isNumEven.equals("y") || isNumEven.equals("Y")) { //questioning for even numbers
                    System.out.print("Is it divisible by 3?");
                    isNumDivByThree = inputReader.next();
                        if(isNumDivByThree.equals("y") || isNumDivByThree.equals("Y")) {
                            System.out.println("Your number is 6.");
                            return; //ends the program
                        }
                        else {
                            if(isNumDivByThree.equals("n") || isNumDivByThree.equals("N")) {
                                System.out.print("Is it divisible by 4?");
                                isNumDivByFour = inputReader.next();
                                    if(isNumDivByFour.equals("y") || isNumDivByFour.equals("Y")) {
                                        System.out.print("IS the number divided by 4 greater than 1?");
                                        isNumDivByFourGreaterOne = inputReader.next();
                                            if(isNumDivByFourGreaterOne.equals("y") || isNumDivByFourGreaterOne.equals("Y")) {
                                                System.out.println("Your number is 8.");
                                                return;
                                            }
                                            else {
                                                if(isNumDivByFourGreaterOne.equals("n") || isNumDivByFourGreaterOne.equals("N")) {
                                                    System.out.println("Your number is 4.");
                                                    return;
                                                }
                                                else {
                                                    System.out.println("You did not enter y/n.");
                                                    return;
                                                }
                                            }
                                    }
                                    else {
                                        if(isNumDivByFour.equals("n") || isNumDivByFour.equals("N")) {
                                            System.out.print("Is it divisible by 5?");
                                            isNumDivByFive = inputReader.next();
                                                if(isNumDivByFive.equals("y") || isNumDivByFive.equals("Y")) {
                                                    System.out.println("Your number is 10.");
                                                    return;
                                                } 
                                                else {
                                                    if(isNumDivByFive.equals("n") || isNumDivByFive.equals("N")) {
                                                        System.out.println("Your number is 2.");
                                                        return;
                                                    }
                                                    else {
                                                        System.out.println("You did not enter y/n.");
                                                        return;
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                            System.out.println("You did not enter y/n.");
                            return; //ends the program
                        }
                else { //questioning for odd numbers
                    if(isNumEven.equals("n") || isNumEven.equals("N")) {
                        System.out.print("Is your number divisible by 3?");
                        isNumDivByThree = inputReader.next();
                        if(isNumDivByThree.equals("y") || isNumDivByThree.equals("Y")) {
                            System.out.print("When divided by 3 is the result greater than 1?");
                            isNumDivByThreeGreaterOne = inputReader.next();
                            if(isNumDivByThreeGreaterOne.equals("y") || isNumDivByThreeGreaterOne.equals("Y")) {
                                System.out.println("Your number is 9.");
                                return;
                            }
                            else if (isNumDivByThreeGreaterOne.equals("n") || isNumDivByThreeGreaterOne.equals("N")) {
                                System.out.println("Your number is 3.");
                                return;
                            }
                            else {
                                System.out.println("You did not enter y/n.");
                                return;
                            }
                        }
                        else if(isNumDivByThree.equals("n") || isNumDivByThree.equals("N")) {
                            System.out.print("Is it greater than 6?");
                            isNumGreaterSix = inputReader.next();
                                if(isNumGreaterSix.equals("y") || isNumGreaterSix.equals("Y")) {
                                    System.out.println("Your number is 7.");
                                    return;
                                }
                                else if(isNumGreaterSix.equals("n") || isNumGreaterSix.equals("N")) {
                                    System.out.print("Is it less than 3?");
                                    isNumLessThree = inputReader.next();
                                    if(isNumLessThree.equals("y") || isNumLessThree.equals("Y")) {
                                        System.out.println("Your number is 1.");
                                        return;
                                    }
                                    else if(isNumLessThree.equals("n") || isNumLessThree.equals("N")) {
                                        System.out.println("Your number is 5.");
                                        return;
                                    }
                                    else {
                                        System.out.println("You did not enter y/n.");
                                        return;
                                    }
                                }
                                else {
                                    System.out.println("You did not enter y/n.");
                                    return;
                                }
                        }
                        else {
                            System.out.println("You did not enter y/n.");
                            return;
                        }
                    }
                    System.out.println("You did not enter y/n.");
                    return; //ends the program
                }
        }
}
        