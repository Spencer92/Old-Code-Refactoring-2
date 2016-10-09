package assign1.code;

import java.util.Scanner;

public class UserInput 
{

	private TeamHistory teamHistory;

	
	public void start(String input, Statistics statistics, Scanner userInput2, Scanner userInput3)
	{
		final String teamStatistics = "T";
		final String getMatchupStatistics = "M";
		final String showMatchupHistory = "H";
		final String quit = "Q";
		String homeTeam = null;
		String awayTeam;
		int counter;
		Scanner userInput1;
//		Scanner userInput2;
//		Scanner userInput3;
		MatchupStatistics matchupStatistics;
//		TeamHistory teamHistory = null;
		MatchupHistory matchupHistory;

		
		switch (input)
		{
		case teamStatistics:
			
			getTeamHistory(statistics, userInput2, homeTeam);
/*			System.out.print("Please Enter a team (in all caps): ");
//			userInput2 = new Scanner(System.in);
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
			}*/
			//check to see if the team the user entered is in the database,
			//if so, display the statistics for the team,
			//if not, notify the user and go back to the menu
			break;
			
			
		case getMatchupStatistics:

//			userInput2 = new Scanner(System.in);
//			userInput3 = new Scanner(System.in);
			System.out.print("Please enter first team (in all caps): ");
//			userInput2 = new Scanner(System.in);
			homeTeam = userInput2.next();
			System.out.print("Please enter second team (in all caps): ");
//			userInput3 = new Scanner(System.in);
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
//			userInput2 = new Scanner(System.in);
			homeTeam = userInput2.next();
			System.out.print("Please enter the away team (in all caps): ");
//			userInput3 = new Scanner(System.in);
			awayTeam = userInput3.next();
			
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
	
	public void getTeamHistory(Statistics statistics, Scanner input,String team) 
	{
		System.out.print("Please Enter a team (in all caps): ");
//		userInput2 = new Scanner(System.in);
		team = input.next();
		
		teamHistory = new TeamHistory(team, statistics.getTotalLines(), 
				statistics.getHomeScore(), statistics.getAwayScore(),
				statistics.getHome(),
				statistics.getAway());
		if(teamHistory.isTeamExists())
		{
			System.out.println("Stats for " + team + ":");
			System.out.println("Wins:\t\t" + teamHistory.getWins());
			System.out.println("Losses:\t\t" + teamHistory.getLosses());
			System.out.println("Ties:\t\t" + teamHistory.getTies());
			System.out.println("Most Points:\t" + teamHistory.getMostPoints());
			System.out.println("Win percentage:\t" + (int)teamHistory.getWinPercentage() + "%");
		}
		else
		{
			System.out.println(team + " is not a valid team name");
		}
	}
	
	public TeamHistory getTeamHistoryRaw()
	{
		return this.teamHistory;
	}
	
}
