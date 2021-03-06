package Chapter7;

import java.util.*;

/**
 * Asks for an array from user and finds average
 *
 * @author kaleb alsobrook
 */
public class P7 {

    static Scanner scan = new Scanner(System.in);

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int average;

        System.out.print("Insert Array: ");
        int numbers[] = new int[scan.nextInt()];
        P7.fillArray(numbers);
        average = findAverage(numbers);
        System.out.print("\n The Average is: " + average + "\n");
        P7.printArray(numbers);
    }

    /**
     * Method takes user input and fills array
     *
     * @param list Array that is taken to be filled
     */
    public static void fillArray(int list[]) {
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }
    }

    /**
     * Finds the Average of given array
     *
     * @param list array to be averaging
     * @return returns the average of the given array
     */
    public static int findAverage(int list[]) {
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total = total + list[i];
        }
        total = total / (list.length);
        return total;
    }

    /**
     * Prints array
     *
     * @param list array to be printed
     */
    public static void printArray(int list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
