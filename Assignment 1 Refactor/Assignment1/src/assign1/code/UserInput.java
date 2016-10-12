package assign1.code;

import java.util.Scanner;

public class UserInput 
{

	private TeamHistory teamHistory;
	private MatchupStatistics matchupStatistics;
	private MatchupHistory matchupHistory;

	
	public void start(String input, Statistics statistics, Scanner userInput2, Scanner userInput3)
	{
		final String teamStatistics = "T";
		final String getMatchupStatistics = "M";
		final String showMatchupHistory = "H";
		final String quit = "Q";
		String homeTeam = null;
		String awayTeam = null;
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

			//check to see if the team the user entered is in the database,
			//if so, display the statistics for the team,
			//if not, notify the user and go back to the menu
			break;
			
			
		case getMatchupStatistics:

			getMatchupStatistics(statistics, userInput2, userInput3, homeTeam, awayTeam);
			break;
			
			
		case showMatchupHistory:
			showMatchupHistory(statistics, userInput2, userInput3, homeTeam, awayTeam);
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
	
	public void getMatchupStatistics(Statistics statistics, Scanner teamOneInput, Scanner teamTwoInput,
			String teamOne, String teamTwo)
	{
//		userInput2 = new Scanner(System.in);
//		userInput3 = new Scanner(System.in);
		System.out.print("Please enter first team (in all caps): ");
//		userInput2 = new Scanner(System.in);
		teamOne = teamOneInput.next();
		System.out.print("Please enter second team (in all caps): ");
//		userInput3 = new Scanner(System.in);
		teamTwo = teamTwoInput.next();
		
		
		matchupStatistics = new MatchupStatistics(teamOne,
				teamTwo, statistics.getTotalLines(), 
				statistics.getHomeScore(), statistics.getAwayScore(),
				statistics.getHome(),
				statistics.getAway());
		if(matchupStatistics.isTeamOneExists() && matchupStatistics.isTeamTwoExists()
				&& matchupStatistics.getGamesPlayed() != 0)
		{
			System.out.println("Games Played:\t" + matchupStatistics.getGamesPlayed());
			System.out.println(teamOne + " Won:\t" + matchupStatistics.getTeamOneWins());
			System.out.println(teamTwo + " Won:\t" + matchupStatistics.getTeamTwoWins());
			System.out.println("Ties:\t\t" + matchupStatistics.getTies());
			if(matchupStatistics.getTeamOneWins() > matchupStatistics.getTeamTwoWins())
			{
				System.out.println("Matchup favours " + teamOne);
			}
			else if(matchupStatistics.getTeamOneWins() < matchupStatistics.getTeamTwoWins())
			{
				System.out.println("Matchup favours " + teamTwo);
			}
			else
			{
				System.out.println("Matchup favours no one");
			}
			//if the teams exist display the match-up statistics for both teams
		}
		else if(!matchupStatistics.isTeamOneExists())
		{
			System.out.println(teamOne + " is not a valid team name");
		}
		else if(!matchupStatistics.isTeamTwoExists())
		{
			System.out.println(teamTwo + " is not a valid team name");
		}
		else if(matchupStatistics.getGamesPlayed() == 0)
		{
			System.out.println(teamOne + " and " + teamTwo + " have never faced each other");
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
	
	public void showMatchupHistory(Statistics statistics, Scanner firstTeamInput, Scanner secondTeamInput,
			String firstTeam, String secondTeam)
	{
		int counter;
		int counterFirstTeam = 0;
		int counterSecondTeam = 0;
		System.out.print("Please enter the home team (in all caps): ");
//		userInput2 = new Scanner(System.in);
		firstTeam = firstTeamInput.next();
		System.out.print("Please enter the away team (in all caps): ");
//		userInput3 = new Scanner(System.in);
		secondTeam = secondTeamInput.next();
		
		matchupHistory = new MatchupHistory(firstTeam,
				secondTeam, statistics.getTotalLines(), 
				statistics.getHomeScore(), statistics.getAwayScore(),
				statistics.getHome(),
				statistics.getAway(), statistics.getYear(),
				statistics.getWeek());
		if(!matchupHistory.isTeamOneExists())
		{
			System.out.println(firstTeam + " is not a valid team name");
		}
		else if(!matchupHistory.isTeamTwoExists())
		{
			System.out.println(secondTeam + " is not a valid team name");
		}
		else
		{
			System.out.println("History of " + firstTeam + " VS " + secondTeam);
			System.out.println("Year Week Away Away Score Home Home Score");
			System.out.println("-----------------------------------------");
			for(counter = 0; counter < matchupHistory.getMatchesOne() + matchupHistory.getMatchesTwo(); counter++)
			{
				if(counterFirstTeam < matchupHistory.getMatchesOne() && counterSecondTeam < matchupHistory.getMatchesTwo()
						&& matchupHistory.getTeamOne().equals(firstTeam)
						&& matchupHistory.getYearTeamOne()[counterFirstTeam] <= 
						matchupHistory.getYearTeamTwo()[counterSecondTeam])
				{
					System.out.println(matchupHistory.getTeamDisplayOne()[counterFirstTeam]);
					counterFirstTeam++;
				}
				else if(counterSecondTeam < matchupHistory.getMatchesTwo() && counterFirstTeam < matchupHistory.getMatchesOne()
						&& matchupHistory.getTeamTwo().equals(secondTeam)
						&& matchupHistory.getYearTeamTwo()[counterSecondTeam] < matchupHistory.getYearTeamOne()[counterFirstTeam] )
				{
					System.out.println(matchupHistory.getTeamDisplayTwo()[counterSecondTeam]);
					counterSecondTeam++;
				}
				else if(counterFirstTeam >= matchupHistory.getMatchesOne() && counterSecondTeam < matchupHistory.getMatchesTwo())
				{
					System.out.println(matchupHistory.getTeamDisplayTwo()[counterSecondTeam]);
					counterSecondTeam++;					
				}
				else if(counterSecondTeam >= matchupHistory.getMatchesTwo() && counterFirstTeam < matchupHistory.getMatchesOne())
				{
					System.out.println(matchupHistory.getTeamDisplayOne()[counterFirstTeam]);
					counterFirstTeam++;
				}
			}/*
			for(counter = 0; counter < matchupHistory.getMatchesOne(); counter++)
			{
				System.out.println(matchupHistory.getTeamDisplayOne()[counter]);
			}
			for(counter = 0; counter < matchupHistory.getMatchesTwo(); counter++)
			{
				System.out.println(matchupHistory.getTeamDisplayTwo()[counter]);
			}
			*/
			//if the team names are valid, display the history between the two teams
			//otherwise if one or more of the teams don't exist notify the user and
			//return to the menu
		}
	}
	
	public TeamHistory getTeamHistoryRaw()
	{
		return this.teamHistory;
	}
	
	public MatchupStatistics getMatchupStatisticsRaw()
	{
		return this.matchupStatistics;
	}
	
	public MatchupHistory getMatchupHistoryRaw()
	{
		return this.matchupHistory;
	}
	
}
