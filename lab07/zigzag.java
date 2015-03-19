// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 06 Mar 2015 
// lab07
// This program will generate an integer 0-100 and then output that number of symbols
import java.util.*;

public class zigzag {
    public static void main(String[] args) {
        int nStars = 10;
        int i = 0;
        
        while(i != nStars) {
            System.out.print("*");
            i++;
        }
        i = 0;
        int n = 0;
        while(i != nStars) {
            System.out.println("*");
            n = i;
            while(n != 0) {
                System.out.print(" ");
                n--;
            }
            i++;
        }
        int nStarts = 10;
        Scanner input = new Scanner(System.in);
    }
}