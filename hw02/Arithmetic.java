// CSE 002-111 Prof. Brian Chen
// Joseph Swiecicki
// 3 Feb 2015
// hw02
/* This program will calculate the costs of certain purchases at Walmart, based on the amount purchased 
and the cost per item. In addition, it will calculate the sales tax on these purchases as well as the subtotal
and grand total. */

// creates the class Arithmetic
public class Arithmetic {
    //the standard java main method
    public static void main(String [] args) {
        
        // INPUTS/ASSUMPTIONS
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        // PA Sales tax of 6%
        double taxPercent=0.06;
        // END INPUTS/ASSUMPTIONS
        
        // CALCULATE SOCK COST AND TAX
        double totalSockCost$; //variable to store sock cost
        double sockSalesTax$; //variable to store sock sales tax
        
        totalSockCost$=nSocks*sockCost$; //get the total sock cost
        sockSalesTax$=totalSockCost$*taxPercent; // get the sales tax on socks
        
        // CALCULATE GLASS COST AND TAX
        double totalGlassCost$; //variable to store glass cost
        double glassSalesTax$;// variable to store glass sales tax
        
        totalGlassCost$=nGlasses*glassCost$; // get the total glass cost
        glassSalesTax$=totalGlassCost$*taxPercent; //get the sales tax on glasses
        
        // CALCULATE ENVELOPE COST AND TAX
        
        double totalEnvelopeCost$; //variable to store the envelopes cost
        double envelopeSalesTax$; //variable to store the envelope sales tax
        
        totalEnvelopeCost$=nEnvelopes*envelopeCost$; //get the total envelope cost
        envelopeSalesTax$=totalEnvelopeCost$*taxPercent; //get the sales tax on envelopes
        
        // CALCULATE TOTAL COST OF PURCHASES BEFORE TAX, TOTAL TAX, AND GRAND TOTAL
        
        double totalPreTax$; //variable to store the subtotal of all items
        double totalSalesTax$; //variable to store the total sales tax
        double grandTotal$; //variable to store the grand total
        
        totalPreTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        totalSalesTax$=sockSalesTax$+glassSalesTax$+envelopeSalesTax$;
        grandTotal$=totalPreTax$+totalSalesTax$;
        
        // OUTPUT DATA
            //output sock data
            System.out.println("Item: Socks");
            System.out.println("Amount purchased: "+nSocks);
            System.out.println("Cost per unit: $"+sockCost$);
            System.out.println("Sock Total (without tax): $"+totalSockCost$);
            System.out.print("Sales Tax on Socks Purchase: $");
            System.out.printf("%.2f", sockSalesTax$); //prints with only 2 decimal places
            System.out.println("");
            System.out.println("");
            
            //output glass data
            System.out.println("Item: Drinking Glasses");
            System.out.println("Amount purchased: "+nGlasses);
            System.out.println("Cost per unit: $"+glassCost$);
            System.out.println("Sock Total (without tax): $"+totalGlassCost$);
            System.out.print("Sales Tax on Socks Purchase: $");
            System.out.printf("%.2f", glassSalesTax$); //prints with only 2 decimal places
            System.out.println("");
            System.out.println("");
            
            //output envelope data
            System.out.println("Item: Envelopes");
            System.out.println("Amount purchased: "+nEnvelopes);
            System.out.println("Cost per unit: $"+envelopeCost$);
            System.out.println("Sock Total (without tax): $"+totalEnvelopeCost$);
            System.out.print("Sales Tax on Socks Purchase: $");
            System.out.printf("%.2f", envelopeSalesTax$); //prints with only 2 decimal places
            System.out.println("");
            System.out.println("");
            
            //output total data
            System.out.println("Purchases subtotal: $"+totalPreTax$);
            System.out.print("Total sales tax: $");
            System.out.printf("%.2f", totalSalesTax$);
            System.out.println("");
            System.out.print("Grand total: $");
            System.out.printf("%.2f", grandTotal$);
            System.out.println("");
    }
}