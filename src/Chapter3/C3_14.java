package Chapter3;

import java.util.*;

/**
 * Program to flip a coin
 *
 * @author Kaleb Alsobrook
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Flipping Coin and setting up input
        Scanner input = new Scanner(System.in);
        int coinFlip = (int) (Math.random() * 2);

        //Asking User to guess heads or tails
        System.out.println("Heads(1) Tails(0): ");
        int guessedSide = input.nextInt();

        //Telling user if correct or incorrect
        if (guessedSide == coinFlip) {
            System.out.println("Correct Guess!");
        } else {
            System.out.println("Incorrect Guess");
        }
    }

}
