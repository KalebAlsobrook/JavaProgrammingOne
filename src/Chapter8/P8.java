package Chapter8;

import java.util.Scanner;

/**
 * Program array of salesman with user input
 *
 * @author Raymond Luong
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char employee;
        String answer = "";
        String ID = "";
        String Day = "";

        double list[][] = new double[4][5];
        do {
            do {//asking for salesman
                System.out.println("Enter the salesman ID as A,B,C,or D:");
                ID = input.next().toUpperCase();
            } while (!(ID.equals("A")) && (!(ID.equals("B"))) && (!(ID.equals("C"))) && (!(ID.equals("D"))));
            do {//asking for day 
                System.out.println("Enter the day as M, T, W, H, or F:");
                Day = input.next().toUpperCase();
            } while (!(Day.equals("M")) && (!(Day.equals("T"))) && (!(Day.equals("W"))) && (!(Day.equals("H"))) && (!(Day.equals("F"))));
            System.out.println("Enter the amount of the sale for A on W:");
            double sale = input.nextDouble();
            //sorting day to put sale in
            switch (ID) {
                case "A":
                    switch (Day) {
                        case "M":
                            list[0][0] += sale;
                            break;
                        case "T":
                            list[0][1] += sale;
                            break;
                        case "W":
                            list[0][2] += sale;
                            break;
                        case "H":
                            list[0][3] += sale;
                            break;
                        case "F":
                            list[0][4] += sale;
                            break;
                    }
                    break;
                case "B":
                    switch (Day) {
                        case "M":
                            list[1][0] += sale;
                            break;
                        case "T":
                            list[1][1] += sale;
                            break;
                        case "W":
                            list[1][2] += sale;
                            break;
                        case "H":
                            list[1][3] += sale;
                            break;
                        case "F":
                            list[1][4] += sale;
                            break;
                    }
                    break;
                case "C":
                    switch (Day) {
                        case "M":
                            list[2][0] += sale;
                            break;
                        case "T":
                            list[2][1] += sale;
                            break;
                        case "W":
                            list[2][2] += sale;
                            break;
                        case "H":
                            list[2][3] += sale;
                            break;
                        case "F":
                            list[2][4] += sale;
                            break;
                    }
                    break;
                case "D":
                    switch (Day) {
                        case "M":
                            list[3][0] += sale;
                            break;
                        case "T":
                            list[3][1] += sale;
                            break;
                        case "W":
                            list[3][2] += sale;
                            break;
                        case "H":
                            list[3][3] += sale;
                            break;
                        case "F":
                            list[3][4] += sale;
                            break;
                    }
                    break;
            }
            //continue?
            do {
                System.out.println("More data? Enter Y for more or N to stop:");
                answer = input.next().toUpperCase();
            } while (!(answer.equals("Y")) && (!(answer.equals("N"))));

        } while (answer.equals("Y"));
        // making array
        System.out.println("Salesman M  T  W  H  F  ");
        employee = 'A';
        for (int row = 0; row < list.length; row++) {
            System.out.print(employee + " ");
            for (int column = 0; column < list[row].length; column++) {
                System.out.print(list[row][column] + " ");
            }
            System.out.println();
            employee++;
        }
    }
}
