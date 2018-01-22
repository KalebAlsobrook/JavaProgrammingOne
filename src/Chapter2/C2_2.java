package Chapter2;

import java.util.*;

/**
 * Program to find area after given inputs
 *
 * @author Kaleb Alsobrook
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Getting variables
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        System.out.print("Input length: ");
        double length = input.nextDouble();

        //Plugging in variables and doing equation
        double area = radius * radius * Math.PI;
        double volume = area * length;

        //Taking volume and area, and then printing answers
        System.out.println("Area is: " + area);
        System.out.println("Volume is: " + volume);

    }
}
