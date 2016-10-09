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
		final String teamStatistics = "T";
		final String getMatchupStatistics = "M";
		final String showMatchupHistory = "H";
		final String quit = "Q";
		String homeTeam;
		String awayTeam;
		String input = "\0";
		int counter;
		Statistics statistics = new Statistics();
		Scanner userInput1;
		Scanner userInput2;
		Scanner userInput3;
		MatchupStatistics matchupStatistics;
		TeamHistory teamHistory;
		MatchupHistory matchupHistory;

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
			input = userInput1.next();
			switch (input)
			{
			case teamStatistics:
				
				System.out.print("Please Enter a team (in all caps): ");
				userInput2 = new Scanner(System.in);
				homeTeam = userInput2.next();
				
				teamHistory = new TeamHistory(homeTeam, statistics.getTotalLines(), 
						statistics.getHomeScore(), statistics.getAwayScore(),
						statistics.getHome(),
						statistics.getAway());
				if(teamHistory.isTeamExists())
				{
					System.out.println("Stats for " + homeTeam + ":");
					System.out.println("Wins:\t\t" + teamHistory.getWins());
					System.out.println("Losses:\t\t" + teamHistory.getLosses());
					System.out.println("Ties:\t\t" + teamHistory.getTies());
					System.out.println("Most Points:\t" + teamHistory.getMostPoints());
					System.out.println("Win percentage:\t" + (int)teamHistory.getWinPercentage() + "%");
				}
				else
				{
					System.out.println(homeTeam + " is not a valid team name");
				}
				//check to see if the team the user entered is in the database,
				//if so, display the statistics for the team,
				//if not, notify the user and go back to the menu
				break;
				
				
			case getMatchupStatistics:
				System.out.print("Please enter first team (in all caps): ");
				userInput2 = new Scanner(System.in);
				homeTeam = userInput2.next();
				System.out.print("Please enter second team (in all caps): ");
				userInput3 = new Scanner(System.in);
				awayTeam = userInput3.next();
				
				
				matchupStatistics = new MatchupStatistics(homeTeam,
						awayTeam, statistics.getTotalLines(), 
						statistics.getHomeScore(), statistics.getAwayScore(),
						statistics.getHome(),
						statistics.getAway());
				if(matchupStatistics.isTeamOneExists() && matchupStatistics.isTeamTwoExists()
						&& matchupStatistics.getGamesPlayed() != 0)
				{
					System.out.println("Games Played:\t" + matchupStatistics.getGamesPlayed());
					System.out.println(homeTeam + " Won:\t" + matchupStatistics.getTeamOneWins());
					System.out.println(awayTeam + " Won:\t" + matchupStatistics.getTeamTwoWins());
					System.out.println("Ties:\t\t" + matchupStatistics.getTies());
					if(matchupStatistics.getTeamOneWins() > matchupStatistics.getTeamTwoWins())
					{
						System.out.println("Matchup favours " + homeTeam);
					}
					else if(matchupStatistics.getTeamOneWins() < matchupStatistics.getTeamTwoWins())
					{
						System.out.println("Matchup favours " + awayTeam);
					}
					else
					{
						System.out.println("Matchup favours no one");
					}
					//if the teams exist display the match-up statistics for both teams
				}
				else if(!matchupStatistics.isTeamOneExists())
				{
					System.out.println(homeTeam + " is not a valid team name");
				}
				else if(!matchupStatistics.isTeamTwoExists())
				{
					System.out.println(awayTeam + " is not a valid team name");
				}
				else if(matchupStatistics.getGamesPlayed() == 0)
				{
					System.out.println(homeTeam + " and " + awayTeam + " have never faced each other");
				}
				//if one of the teams don't exist or never faced each other notify 
				//the user
				break;
				
				
			case showMatchupHistory:
				System.out.print("Please enter the home team (in all caps): ");
				userInput2 = new Scanner(System.in);
				homeTeam = userInput2.next();
				System.out.print("Please enter the away team (in all caps): ");
				userInput2 = new Scanner(System.in);
				awayTeam = userInput2.next();
				
				matchupHistory = new MatchupHistory(homeTeam,
						awayTeam, statistics.getTotalLines(), 
						statistics.getHomeScore(), statistics.getAwayScore(),
						statistics.getHome(),
						statistics.getAway(), statistics.getYear(),
						statistics.getWeek());
				if(!matchupHistory.isTeamOneExists())
				{
					System.out.println(homeTeam + " is not a valid team name");
				}
				else if(!matchupHistory.isTeamTwoExists())
				{
					System.out.println(awayTeam + " is not a valid team name");
				}
				else
				{
					System.out.println("History of " + homeTeam + " VS " + awayTeam);
					System.out.println("Year Week Away Away Score Home Home Score");
					System.out.println("-----------------------------------------");
					for(counter = 0; counter < matchupHistory.getMatches(); counter++)
					{
						System.out.println(matchupHistory.getTeamDisplayOne()[counter]);
					}
					
					//if the team names are valid, display the history between the two teams
					//otherwise if one or more of the teams don't exist notify the user and
					//return to the menu
				}
				break;
				
			case quit:
				System.out.println("They're going to exit the program");
				System.out.println("and then they're going to exit me");
				System.out.print("oh my gooooooooooooooooooooooooooooooooooooooooo");
				for(counter = 0; counter < 100; counter++)
				{
					System.out.print("ooooooooooooooooooooooooooooooooo");
				}
				System.out.println();
				System.exit(0);
				
			default:
			System.out.println("Invalid input, please try again!");
			break;
			
			}
			
		}
		
	}
}
