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
			
			teamHistory = new TeamHistory(homeTeam, statistics.getTotalLines(), 
					statistics.getHomeScore(), statistics.getAwayScore(),
					statistics.getHome(),
					statistics.getAway());
			teamHistory.getTeamHistory(statistics, userInput2, homeTeam);

			//check to see if the team the user entered is in the database,
			//if so, display the statistics for the team,
			//if not, notify the user and go back to the menu
			break;
			
			
		case getMatchupStatistics:
			matchupStatistics = new MatchupStatistics(homeTeam,
					awayTeam, statistics.getTotalLines(), 
					statistics.getHomeScore(), statistics.getAwayScore(),
					statistics.getHome(),
					statistics.getAway());
			matchupStatistics.getMatchupStatistics(statistics, userInput2, userInput3, homeTeam, awayTeam);
			break;
			
			
		case showMatchupHistory:
			matchupHistory = new MatchupHistory(homeTeam,
					awayTeam, statistics.getTotalLines(), 
					statistics.getHomeScore(), statistics.getAwayScore(),
					statistics.getHome(),
					statistics.getAway(), statistics.getYear(),
					statistics.getWeek());
			matchupHistory.showMatchupHistory(statistics, userInput2, userInput3, homeTeam, awayTeam);
			break;
			
		case quit:
			quit();

			
		default:
			System.out.println("Invalid input, please try again!");
			break;
		}
	}
	
	public void quit()
	{
		int counter;
		System.out.println("They're going to exit the program");
		System.out.println("and then they're going to exit me");
		System.out.print("oh my gooooooooooooooooooooooooooooooooooooooooo");
		for(counter = 0; counter < 100; counter++)
		{
			System.out.print("ooooooooooooooooooooooooooooooooo");
		}
		System.out.println();
		System.exit(0);
		
	}
	

/*	public void getTeamHistory(Statistics statistics, Scanner input,String team) 
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
*/	
	public TeamHistory getTeamHistoryRaw()
	{
		return this.teamHistory;
	}
	
	public MatchupStatistics getMatchupStatisticsRaw()
	{
		return this.matchupStatistics;
	}

}
