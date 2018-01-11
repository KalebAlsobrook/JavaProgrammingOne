package Chapter3;

import java.util.*;

/**
 * Program to find certain relations of numbers
 *
 * @author Kaleb Alsobrook
 */
public class C3_26 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) 
    {
        //Creating scanner and variables
        Scanner input = new Scanner(System.in);
        boolean both;
        boolean one;
        boolean oneButNotBoth;
        int number;
        //Asking For number
        System.out.print("Insert a number: ");
        number = input.nextInt();

        //Divisible by
        both = ((number % 5.0 == 0) && (number % 6.0 == 0));
        one = ((number % 5.0 == 0) || (number % 6.0 == 0));
        oneButNotBoth = ((number % 5.0 == 0) ^ (number % 6 == 0));

        //Replying answer
        System.out.println("Is "+ number + " divisible by 5 and 6: " + both);
        System.out.println("Is "+ number + " divisible by 5 OR 6: "+ one);
        System.out.println("Is "+ number + " divisible by 5 OR 6, but not both: "+oneButNotBoth);
    }

}
