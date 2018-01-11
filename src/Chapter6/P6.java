package Chapter6;

import java.util.*;

/**
 * Converts Currency usign given rates
 *
 * @author kaleb alsobrook
 */
public class P6 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double exchangeYen, exchangePound, exchangeEuro;
        boolean keepGoing = true;
        String currentExchange;
        double howManySpent;
        double finalPrice;
        String keepGoingString;
        
        System.out.print("How many Euros will 1USD buy: ");
        exchangeEuro = scan.nextDouble();
        System.out.print("How many Pounds will 1USD buy: ");
        exchangePound = scan.nextDouble();
        System.out.print("How many Yen will 1USD buy: ");
        exchangeYen = scan.nextDouble();
        
        while (keepGoing == true)
        {
            System.out.print("currentcy exchange: Euro(E), Pound (P) or Yen(Y). ");
            currentExchange = scan.next();
            System.out.print("Insert how much USD using to buy: ");
            howManySpent = scan.nextDouble();
            
            if (null == currentExchange)
            {
                continue;
            }
            else switch (currentExchange) {
                case "Y":
                    finalPrice = exchangeRate(howManySpent, exchangeYen);
                    break;
                case "E":
                    finalPrice = exchangeRate(howManySpent, exchangeEuro);
                    break;
                case "P":
                    finalPrice = exchangeRate(howManySpent, exchangePound);
                    break;
                default:
                    continue;
            }
            
            System.out.printf("%.2f USD when converted is %.2f", howManySpent, finalPrice);
            while (1 == 1)
            {
                System.out.print("\nContinue? (yes) or (no)? ");
                keepGoingString = scan.next();
                if ("yes".equals(keepGoingString))
                {
                    break;
                }
                else if ("no".equals(keepGoingString))
                {
                    keepGoing = false;
                    break;
                }
            }
        }
    }
    
    public static double exchangeRate(double givenUSD, double exchangeRate)
    {
        double returnPrice;
        if (givenUSD > 100.00)
        {
            givenUSD = givenUSD - (givenUSD * 0.05);
        }
        else
        {
            givenUSD = givenUSD - (givenUSD * 0.1);
        }
        
        returnPrice = givenUSD * exchangeRate;
        return returnPrice;
    }
}
