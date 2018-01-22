package Chapter2;

import java.util.*;

/**
 * Program to display price after gratuity rate
 *
 * @author Kaleb Alsobrook
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Getting gratuity rate and subtotal
        System.out.print("Input subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Input Gratuity rate: ");
        double gratuityrate = input.nextDouble();

        //Creating formula
        double gratuity = (gratuityrate / 100.0) * subtotal;
        double total = subtotal + gratuity;

        //Outputting results
        System.out.println("Your Gratuity is:" + gratuity);
        System.out.println("Your total after gratuity added is: " + total);
    }
}
