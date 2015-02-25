// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 24 Feb 2015 
// hw05
// This program will convert a user's input of RGB values to their hexadecimal counterparts.

//import all neccessary classes
import java.util.*;

public class ToHex {
    public static void main(String[] args) {
        //construct the scanner
        Scanner input = new Scanner(System.in);
        //declare variables
        int r = 0, g = 0, b = 0;
        
        System.out.println("Please enter three numbers representing RGB values (numbers are 0-255):");
        // get R input 0-255
        if (input.hasNextInt()) {
            r = input.nextInt();
            if (r >= 0 && r <= 255) {
                
            }
            else {
                System.out.println("Please enter a number 0-255.");
                return;
            }
        }
        else {
            System.out.println("Please enter a number 0-255.");
            return;
        }
        //get G input 0-255
        if (input.hasNextInt()) {
            g = input.nextInt();
            if (g >= 0 && g <= 255) {
                
            }
            else {
                System.out.println("Please enter a number 0-255.");
                return;
            }
        }
        else {
            System.out.println("Please enter a number 0-255.");
            return;
        }
        //get B input 0-255
         if (input.hasNextInt()) {
             b = input.nextInt();
            if (b >= 0 && b <= 255) {
                
            }
            else {
                System.out.println("Please enter a number 0-255.");
                return;
            }
        }
        else {
            System.out.println("Please enter a number 0-255.");
            return;
        }
        //convert the r decimal value to hex
        int rHex1 = r / 16;
        int rHex2 = r % 16;
        String rHex1String = "", rHex2String = "", finalHexValue = "";
        if (rHex1 < 10) {
            rHex1String = Integer.toString(rHex1);
        }
        else {
            switch (rHex1) {
                case 10: rHex1String = "A";
                                break;
                case 11: rHex1String = "B";
                                break;
                case 12: rHex1String = "C";
                                break;
                case 13: rHex1String = "D";
                                break;
                case 14: rHex1String = "E";
                                break;
                case 15: rHex1String = "F";
                                break;
            }
        }
        finalHexValue += rHex1String; //adds the first character
        if (rHex2 < 10) {
            rHex2String = Integer.toString(rHex2);
        }
        else {
            switch (rHex2) {
                case 10: rHex2String = "A";
                                break;
                case 11: rHex2String = "B";
                                break;
                case 12: rHex2String = "C";
                                break;
                case 13: rHex2String = "D";
                                break;
                case 14: rHex2String = "E";
                                break;
                case 15: rHex2String = "F";
                                break;
            }
        }
        finalHexValue += rHex2String; //adds the second character
        //convert the g value to hex
       int gHex1 = g / 16;
        int gHex2 = g % 16;
        String gHex1String = "", gHex2String = "";
        if (gHex1 < 10) {
            gHex1String = Integer.toString(gHex1);
        }
        else {
            switch (gHex1) {
                case 10: gHex1String = "A";
                                break;
                case 11: gHex1String = "B";
                                break;
                case 12: gHex1String = "C";
                                break;
                case 13: gHex1String = "D";
                                break;
                case 14: gHex1String = "E";
                                break;
                case 15: gHex1String = "F";
                                break;
            }
        }
        finalHexValue += gHex1String; //adds the third character
        if (gHex2 < 10) {
            gHex2String = Integer.toString(gHex2);
        }
        else {
            switch (gHex2) {
                case 10: gHex2String = "A";
                                break;
                case 11: gHex2String = "B";
                                break;
                case 12: gHex2String = "C";
                                break;
                case 13: gHex2String = "D";
                                break;
                case 14: gHex2String = "E";
                                break;
                case 15: gHex2String = "F";
                                break;
            }
        }
        finalHexValue += gHex2String; //adds the fourth character
        // convert the b value to hex
        int bHex1 = b / 16;
        int bHex2 = b % 16;
        String bHex1String = "", bHex2String = "";
        if (bHex1 < 10) {
            bHex1String = Integer.toString(bHex1);
        }
        else {
            switch (bHex1) {
                case 10: bHex1String = "A";
                                break;
                case 11: bHex1String = "B";
                                break;
                case 12: bHex1String = "C";
                                break;
                case 13: bHex1String = "D";
                                break;
                case 14: bHex1String = "E";
                                break;
                case 15: bHex1String = "F";
                                break;
            }
        }
        finalHexValue += bHex1String; //adds the fifth character
        if (bHex2 < 10) {
            bHex2String = Integer.toString(bHex2);
        }
        else {
            switch (bHex2) {
                case 10: bHex2String = "A";
                                break;
                case 11: bHex2String = "B";
                                break;
                case 12: bHex2String = "C";
                                break;
                case 13: bHex2String = "D";
                                break;
                case 14: bHex2String = "E";
                                break;
                case 15: bHex2String = "F";
                                break;
            }
        }
        finalHexValue += bHex2String; //adds the sixth character
        //print out the final hexadecimal string
        System.out.println("The decimal numbers R:"+r+", G:"+g+", B:"+b+", is represented in hexadecimal as: "+finalHexValue);
    }
}