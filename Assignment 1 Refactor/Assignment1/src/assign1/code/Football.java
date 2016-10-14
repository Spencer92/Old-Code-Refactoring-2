// Name:       Spencer Maslen
// Email:      smasl811@mymru.ca
// Course:     COMP 2231
// Instructor: Jason Heard
// Due Date:   September 24, 2014
//
// Source File: Football.java
//
/***************************************************************************/
// Program Name: Football.java
// Purpose:     The purpose is to find out about teams based on defined criteria:
//				Statistics for a single team
//				Statistics for a match between two teams
//				The history of matches between two teams
//
// Limitations: The match history will not be displayed in numeric order.
//				Some match-ups may not be properly aligned
//
//
//

package assign1.code;
import java.util.Scanner;

public class Football 
{
	
//Class Name:   			main
//
//Purpose:        			Take two previously defined teams
//							and show the match history between them
//
//
//Method Notes:    
//							Once the user makes a selection:
//							
//							Get team statistics:
//								Once the user enters the team and the team is real,
//								The wins, losses, ties, highest score, and win
//								percentage are displayed
//								otherwise the user is notified that the team is invalid
//								and goes back to the menu
//							Get matchup statistics:
//								Once the user enters the two teams and the teams are real,
//								The games played, the home team wins, the away team wins,
//								the games ties, and the team favour are displayed
//								if one or more of the teams are invalid, or the teams
//								never faced each other, then the user is notified and
//								brought back to the menu
//							Show matchup history:
//								Once the user enters the two teams and the teams are real,
//								the matches, results, when the match was done, the final
//								score between teams are displayed
//								if one or more team names are not correct, then the user
//								is notified and brought back to the menu
//
//
	
	public static void main(String[] args)
	{
		String input = "\0";
		Statistics statistics = new Statistics();
		Scanner userInput1;
		Scanner userInput2;
		Scanner userInput3;
		UserInput options;

		statistics.process();
		while(input != "Q")
		{
			System.out.println("Available Options");
			System.out.println("T - Get team statistics");
			System.out.println("M - Get matchup statistics");
			System.out.println("H - Show matchup history");
			System.out.println("Q - Quit");
			System.out.print("Please enter your choice (in all caps): ");
			
			userInput1 = new Scanner(System.in);
			userInput2 = new Scanner(System.in);
			userInput3 = new Scanner(System.in);
			input = userInput1.next();
			options = new UserInput(input, statistics, userInput2, userInput3);
			options.start();
			
			
		}
		
	}
}
