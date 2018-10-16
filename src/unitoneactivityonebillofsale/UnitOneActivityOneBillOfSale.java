/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unitoneactivityonebillofsale;

/**
 *Jacob Lacey
 *18 Sept 2018
 *To Calculate and Output/Print a Bill of Sale
 */

//Bring in a text format
import java.text.*;

public class UnitOneActivityOneBillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //purchase price
        double purPrice = 12.49;
        //bill used
        double payWith = 20.00;
        //13% tax
        double taxPercent = 0.13;
        //applied tax
        double taxTotal = 0.00;
        //total cost
        double cost = 0.00;
        //total change
        double change = 0.00;
        
        //algorithm for taxes
        taxTotal = taxPercent*purPrice;
        //algorithm for total cost
        cost = purPrice+taxTotal;
        //algorithm for total change
        change = payWith-purPrice-taxTotal;
        
        //Declare Decimal Format
        DecimalFormat money = new DecimalFormat ("$###.##CAN");
        
        //print bill of sale
        System.out.println("\t~BILL OF SALE~\n");
        System.out.println("1. Blue T-Shirt: $"+money.format(purPrice));
        System.out.println("\tTax ~ 13%: "+ money.format(taxTotal) +"\n");
        System.out.println("TOTAL: "+ money.format(cost));
        System.out.println("Change: "+ money.format(change));
        
    }
    
}
