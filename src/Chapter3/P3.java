package Chapter3;

import java.util.*;

/**
 * Program to find how two numbers are related
 *
 * @author Kaleb Alsobrook
 */
public class P3 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        //Creating Scanner and variables
        Scanner input = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        
        //Asking for input on variables
        System.out.println("Insert Variable One: ");
        firstNumber = input.nextDouble();
        System.out.println("Insert Variable Two: ");
        secondNumber = input.nextDouble();
        
        //relation of first and second number
        if (firstNumber < secondNumber)
            System.out.println("The First Number is less than the Second");
        if (firstNumber > secondNumber)
            System.out.println("The First number is greater than the second");
        if (firstNumber == secondNumber)
            System.out.println("The First Number is equal to the Second Number");
        if (firstNumber <= secondNumber)
            System.out.println("The first number is less than or equal to the second");
        if (firstNumber != secondNumber)
            System.out.println("The first number is not equal to the second number");
        
        //Dividing first by second
        if (secondNumber == 0)
        {
            System.out.println("Cannot Divide by zero");
        }
        else if (firstNumber / secondNumber < 1)
        {
            System.out.println("Proper Fraction");
        }
        else
        {
            System.out.println("Inproper fraction");
        }
        
        //Grade according to numbers
        if (firstNumber >= 90)
        {
            System.out.println("A");
        }
        else if (firstNumber >= 80)
        {
            System.out.println("B");
        }
        else if (firstNumber >= 70)
        {
            System.out.println("C");
        }
        else if (firstNumber >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
        
        //In range or out of range
        if (secondNumber >= 1 && secondNumber <= 100)
        {
            System.out.println("In Range");
        }
        else
        {
            System.out.println("Out of Range");
        }
    }
}
