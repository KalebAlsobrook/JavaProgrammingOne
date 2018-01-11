package Chapter4;

import java.util.*;

/**
 * Descerning major type according to the user input
 *
 * @author Kaleb Alsobrook
 */
public class C4_18 
{
    static char majorLetter;
    static char majorNumber;
    static String fullMajor;
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String fullMajorCode;
        
        System.out.print("Insert Two didget Code: ");
        fullMajorCode = scan.next();
        
        fullMajorCode = fullMajorCode.toUpperCase();
        
        majorLetter = fullMajorCode.charAt(0);
        majorNumber = fullMajorCode.charAt(1);
       
        
        switch (majorLetter)
        {
            case 'M':
                fullMajor = "Mathematics ";
                C4_18.Years();
                break;
            case 'C':
                fullMajor = "Computer Science ";
                C4_18.Years();
                break;
            case 'I':
                fullMajor = "Information Technology ";
                C4_18.Years();
                break;
            default:
                System.out.println("Invalid Input ");
                System.exit(0);
                break;
        }
    }
    
    public static void Years()
    {
        switch(majorNumber)
        {
            case '1':
                fullMajor = fullMajor + "Freshman";
                break;
            case '2':
                fullMajor = fullMajor + "Sophmore";
                break;
            case '3':
                fullMajor = fullMajor + "Junior";
                break;
            case '4':
                fullMajor = fullMajor + "Senior";
                break;
            default:
                System.out.println("Invalid Input");
                System.exit(0);
                break;
        }
        System.out.println(fullMajor);
    }
}
