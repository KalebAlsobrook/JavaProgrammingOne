package Chapter2;

import java.util.*;

/**
 * Program to determine final price after tax
 *
 * @author Kaleb Alsobrook
 */
public class P2 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        //Initilizing Scanner
        Scanner input = new Scanner(System.in);
        
        //Getting prices and creating variables
        System.out.print("Input price of Food: ");
        double foodPrice = input.nextDouble();
        System.out.print("input price of Drinks: ");
        double drinkPrice = input.nextDouble();
        System.out.print("Input price of Dessert: ");
        double dessertPrice = input.nextDouble();
        
        /**Adding all prices to get prices before taxes
         * Adding taxes to above price in new variable
         * Adding tip cost to the above taxed total
         */
        double priceAddedUp = (foodPrice + drinkPrice + dessertPrice);
        double totalTaxes = (priceAddedUp * .10);
        double totalTip = ((priceAddedUp + totalTaxes) * .15);
        
        //Displaying taxes, tips, and then adding them up to display final price
        System.out.println("Your initial price is: " + priceAddedUp);
        System.out.println("Your tax: " + (totalTaxes));
        System.out.println("Your tip: " + (totalTip));
        System.out.println("Your price after taxes is: " + (priceAddedUp + totalTaxes));
        System.out.println("Your price after taxes and tip is: " + (priceAddedUp +totalTip + totalTaxes));
    }
}
