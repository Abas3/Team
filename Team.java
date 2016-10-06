import java.util.ArrayList;
import java.util.Collections;
import java.awt.List;
import java.util.Arrays;


/**
 * This program allows you to store players names and split them up evenly between two
 * teams accroding to which tier they are located in.
 * 
 * @author (Abas3) <--GitHub 
 * @version (10/6/2016)
 */

public class Team
{
    public static void main(String[] args)
    {
   
         //top tier: Change the strings/players with the names you desire
         ArrayList<String> tierOne = new ArrayList<String>(Arrays.asList("Lebron James","Kobe Bryant","Chris Paul","Jimmy Butler"));
        //tier two: Change the strings/players with the names you desire
        ArrayList<String> tierTwo = new ArrayList<String>(Arrays.asList("Kevin Durant","Steph Curry","Carmelo Anthony","Magic Johnson"));
       //tier three:Change the strings/players with the names you desire
       ArrayList<String> tierThree = new ArrayList<String>(Arrays.asList("Blake Griffen","James Harden","Damian Lillard","Abas Sheikh(G.O.A.T)"));

        // randomize the three list
        Collections.shuffle(tierOne);
        Collections.shuffle(tierTwo);
        Collections.shuffle(tierThree);
        
       // instantiate two arraylists for the 2 TEAMS
        ArrayList<String> teamRed = new ArrayList<String>();
        ArrayList<String> teamBlue = new ArrayList<String>();

       // add the first half of players to teamRed FROM TIER ONE
        teamRed.addAll(tierOne.subList(0, tierOne.size() / 2 + tierOne.size()%2));
       // and the second half to teamBlue
        teamBlue.addAll(tierOne.subList(tierOne.size() / 2 + tierOne.size()%2, tierOne.size()));

       // add the first half of players to teamRed FROM TIER TWO
       teamRed.addAll(tierTwo.subList(0, tierTwo.size() / 2 + tierTwo.size()%2));
       // and the second half to teamBlue
        teamBlue.addAll(tierTwo.subList(tierTwo.size() / 2 + tierTwo.size()%2, tierTwo.size()));

      // add the first half of players to teamRed FROM TIER THREE
        teamRed.addAll(tierThree.subList(0, tierThree.size() / 2 + tierThree.size()%2));
      // and the second half to teamBlue
         teamBlue.addAll(tierThree.subList(tierThree.size() / 2 + tierThree.size()%2, tierThree.size()));

         // Rrint out the results
        System.out.printf( "%-15s %15s %n","Team One: " + teamBlue,  "\n-----VS------VS------VS-------VS-----VS----\n" + "Team Two: " + teamRed);
        
       //Spacing purposes :)
         System.out.println();
          System.out.println();
           System.out.println();
        
               
    }

   
}
