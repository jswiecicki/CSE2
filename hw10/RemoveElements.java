// CSE 002 -111 Prof. Brian Chen
// Joseph Swiecicki
// 6 Apr 2015 
// hw10
// This program will demonstrates array manipulation by allowing a user to delete certain values/places from arrays.

import java.util.*; //imports necessary classes
public class RemoveElements{
  public static Scanner scan; //allows the scanner class to be used everywhere
  public static void main(String [] arg){
    scan = new Scanner(System.in); //constructs the scanner class
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
    	System.out.print("Random input 10 ints [0-9]");
  	    num = randomInput();
  	    String out = "The original array is:";
  	    out += listArray(num);
  	    System.out.println(out);
 
  	    System.out.print("Enter the index ");
  	    index = scan.nextInt();
  	    newArray1 = delete(num,index);
  	    String out1="The output array is ";
  	    out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out1);
 
        System.out.print("Enter the target value ");
    	target = scan.nextInt();
  	    newArray2 = remove(num,target);
  	    String out2="The output array is ";
  	    out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out2);
  	 
  	    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	    answer=scan.next(); 
	    } while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	    if(j>0){
    	    out+=", ";
  	    }
  	    out+=num[j];
	    }
	    out+="} ";
	    return out;
  }
  
  public static int[] randomInput() {
      Random rand = new Random(); //constructs the random generator
      int[] randomIntArray = new int[10];
      for (int i =0; i < randomIntArray.length; i++) {
          randomIntArray[i] = rand.nextInt(10); //fills the new array with random numbers 0-9
      }
      return randomIntArray;
      
  }
  
  public static int[] delete(int[] list, int pos) {
      int n = 0;
      while (n != 1) {
          if (pos >= 0 && pos <= list.length-1) {
              n = 1;
          }
          else {
              System.out.print("Your given target to delete was out of range. Please enter a valid target:");
              pos = scan.nextInt();
          }
      } //above ensures the user enters a valid array position
      int[] deleteArray = new int[list.length - 1]; //creates a new array 1 smaller than the old one
      for(int i = 0; i < list.length - 1; i++) {
          if (i < pos) {
          deleteArray[i] = list[i]; //fills the new array with values
          }
          else if (i >= pos) {
              deleteArray[i] = list[i+1]; //fills the new array with values, skipping list[pos]
          }
          else {
              
          }
      }
      return deleteArray;
  }
  
  public static int[] remove(int[] list, int target) {
      int tracker = 0;
      for(int i = 0; i < list.length; i++) { //counts to see how large the new array will need to be
          if (list[i] == target) {
              tracker++;
          }
          else {
              
          }
      }
      int[] removeArray = new int[list.length - tracker]; //constructs the new array
      for(int i = 0, j = 0; j < removeArray.length; i++) {
        if (list[i] == target) { 
        }
        else {
             removeArray[j] = list[i]; //fills the new array with values only if list[i] != target
             j++;
        }
      }
      return removeArray;
  } 
  
  
}
