package Chapter4;

import java.util.*;

/**
 * System to calculate and determine who wins in a bidding system
 *
 * @author Kaleb Alsobrook
 */
public class P4 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String bidderOne;
        double oneChargePerHour;
        double costOne;
        int oneHours;
        double twoChargePerHour;
        int twoHours;
        double costTwo;
        
        System.out.print("Insert Bidder One's name: ");
        bidderOne = scan.nextLine();
        System.out.print("Insert " + bidderOne + "'s charge per hour: ");
        oneChargePerHour = scan.nextDouble();
        System.out.print("Insert " + bidderOne + "'s hours of work: ");
        oneHours = scan.nextInt();
        
        System.out.print("Insert Bidder Two's name: ");
        String bidderTwo = scan.next();
        System.out.print("Insert " + bidderTwo + "'s charge per hour: ");
        twoChargePerHour = scan.nextDouble();
        System.out.print("Insert " + bidderTwo + "'s hours of work: ");
        twoHours = scan.nextInt();
        
        costOne = (oneChargePerHour * oneHours);
        costTwo = (twoChargePerHour * twoHours);
        
        if (costOne < costTwo)
        {
            System.out.printf("The Winner is %s with the ammount of %5.2f", bidderOne, costOne);
        }
        if (costTwo < costOne)
        {
            System.out.printf("The Winnder is %s with the ammount of %5.2f", bidderTwo, costTwo);
        }
        if (costOne == costTwo)
        {
            if(oneHours < twoHours)
            {
                System.out.printf("The Winner is %s with the ammount of %5.2f and %d hours", bidderOne, costOne, oneHours);
            }
            else if (twoHours < oneHours)
            {
                System.out.printf("The Winnder is %s with the ammount of %5.2f and %d hours", bidderTwo, costTwo, twoHours);
            }
            else
            {
                System.out.printf("Both bidders %s and %s have identical bids. Both have a total cost of %5.2f, a per hours charge of %5.2f, and a total hours of %d", bidderOne, bidderTwo, costOne, oneChargePerHour, oneHours);
            }
        }  
    }
}
