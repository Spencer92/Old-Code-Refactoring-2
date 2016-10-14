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
	

	
	/*
	 * Class Name	:		main
	 * 
	 * Purpose   	:		The statistics of all football games, from 1922 to 2013, are taken from its 
	 * 						raw form, and converted into general information about the teams.
	 * 
	 * Method Notes	:		There are three options to choose from:
	 * 							If "T" is selected, the individuals team history is shown, with its
	 * 							wins, losses, ties, highest score, and win percentage.
	 * 
	 * 							If "M" is selected, statistics of games between two teams is shown,
	 * 							Which includes the general results between the two teams, and 
	 * 							what team in favoured in the matchup
	 * 
	 * 							IF "H" is selected, the results of every game between the two teams
	 * 							are displayed, including the year it was played, the week it was
	 * 							played, and the score for each team.	
	 * 
	 */
	
	public static void main(String[] args)
	{
		String input = "\0";
		Statistics statistics = new Statistics();
		Scanner userInput;
		Scanner userFirstTeamInput;
		Scanner userSecondTeamInput;
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
			
			userInput = new Scanner(System.in);
			userFirstTeamInput = new Scanner(System.in);
			userSecondTeamInput = new Scanner(System.in);
			input = userInput.next();
			options = new UserInput(input, statistics, userFirstTeamInput, userSecondTeamInput);
			options.start();
			
			
		}
		
	}
}
