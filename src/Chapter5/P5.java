package Chapter5;

import java.util.Scanner;

/**
 * Keeps track of a voting system
 *
 * @author kaleb alsobrook
 */
public class P5 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        long yesVotes = 0;
        long noVotes = 0;
        char userInput;
        boolean keepVoting = true;
        Scanner scan = new Scanner(System.in);
        
        while(keepVoting == true)
        {
            System.out.println("\nInsert vote: (Y or y for yes) (N or n for no) (Q or q to quit): ");
            userInput = scan.next().charAt(0);
            
            userInput = Character.toUpperCase(userInput);
            
            switch (userInput) {
                case 'Y':
                    yesVotes += 1;
                    break;
                case 'N':
                    noVotes += 1;
                    break;
                case 'Q':
                    keepVoting = false;
                    break;
                default:
                    System.out.print("INVALID INPUT:");
                    break;
            }
        }
        
        System.out.print("\n\nTOTAL VOTES");
        System.out.print("\n   YES: "+ yesVotes);
        System.out.print("\n   NO: "+ noVotes);
        
        if (yesVotes > noVotes)
        {
            System.out.print("\n YES WINS");
        }
        else if (yesVotes < noVotes)
        {
            System.out.print("\n NO WINS");
        }
        else
        {
            System.out.print("\n TIE");
        }
    }
}
