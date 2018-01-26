package Chapter4;

import java.util.*;

/**
 * Creates an application according to user input
 *
 * @author Kaleb Alsobrook
 */
public class C4_23 {

    static String name;
    static int hoursWorked;
    static double payRate;
    static double federalHold;
    static double federalHoldUsed;
    static double stateHold;
    static double stateHoldUsed;

    static double grossPay;
    static double federalCost;
    static double stateCost;
    static double totalCost;
    static double netPay;

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert employee's name: ");
        name = scan.next();
        System.out.print("Insert hours worked per week: ");
        hoursWorked = scan.nextInt();
        System.out.print("Insert hourly pay rate: ");
        payRate = scan.nextDouble();
        System.out.print("Insert federal withholding rate: ");
        federalHoldUsed = scan.nextDouble();
        System.out.print("Insert state witholding rate: ");
        stateHoldUsed = scan.nextDouble();

        C4_23.DoMath();
    }

    /**
     * Method to detmine maths according to formulas
     * 
     */
    public static void DoMath() {
        grossPay = (payRate * hoursWorked);
        federalHold = (federalHoldUsed * 100);
        stateHold = (stateHoldUsed * 100);
        federalCost = (grossPay * federalHoldUsed);
        stateCost = (grossPay * stateHoldUsed);
        totalCost = (stateCost + federalCost);
        netPay = (grossPay - totalCost);
        C4_23.CreateApplication();
    }
    /**
     * Takes Static variables to print the total information
     * 
     */
    public static void CreateApplication() {
        System.out.println();
        System.out.println();
        System.out.printf("Employee's name: %s\n", name);
        System.out.printf("Hour's Worked: %d\n", hoursWorked);
        System.out.printf("Pay Rate: %2.2f\n", payRate);
        System.out.printf("Gross pay: %2.2f\n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("\tFederal Withholding (%2.0f): %2.2f\n", federalHold, federalCost);
        System.out.printf("\tState Withholding (%2.0f): %2.2f\n", stateHold, stateCost);
        System.out.printf("\tTotal Cost: %2.2f\n", totalCost);
        System.out.printf("Net Pay: %2.2f\n", netPay);
    }

}
