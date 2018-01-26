package Chapter7;

import java.util.*;

/**
 * Determines if two strings are identical
 *
 * @author kaleb alsobrook
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1:");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2:");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    /**
     * Method to determine if two arrays are identical
     *
     * @param list1 first array to compare
     * @param list2 second array to compare
     * @return returns if the two arrays are identical
     */
    public static boolean equals(int[] list1, int[] list2) {

        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list2.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;

    }
}
