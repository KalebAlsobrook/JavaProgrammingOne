package Chapter3;

import java.util.*;

/**
 * Program comparing two items
 *
 * @author Kaleb Aslobrook
 */
public class C3_33 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) 
    {
        //Starting Scanner and variables
        Scanner input = new Scanner(System.in);
        int weightOne;
        int weightTwo;
        double priceOne;
        double priceTwo;
        double pricePerWeightOne;
        double pricePerWeightTwo;
        //Asking for weight
        System.out.print("Insert Weight of pack one (Whole Number): ");
        weightOne = input.nextInt();
        System.out.print("Insert weight of pack two (Whole number): ");
        weightTwo = input.nextInt();
        //Asking for Price
        System.out.print("Insert price of pack one (decimal): ");
        priceOne = input.nextDouble();
        System.out.print("Insert price of pack two (decimal): ");
        priceTwo = input.nextDouble();
        //Creating price-per-Weight
        pricePerWeightOne = (priceOne / weightOne);
        pricePerWeightTwo = (priceTwo / weightTwo);
        //Replying which is efficient
        if(pricePerWeightOne < pricePerWeightTwo)
        {
            System.out.println("Package 1 has a better price");
        }
        else if (pricePerWeightTwo < pricePerWeightOne)
        {
            System.out.println("Package 2 has a better price");
        }
        else
        {
            System.out.println("They are equal in price efficiency");
        }
    }

}
