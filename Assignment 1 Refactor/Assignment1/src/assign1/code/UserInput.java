package assign1.code;

import java.util.Scanner;

public class UserInput 
{
	private Options options;
	private TeamHistory teamHistory;
	private MatchupStatistics matchupStatistics;
	private MatchupHistory matchupHistory;
	private String input;
	private Statistics statistics;
	private Scanner userInput2;
	private Scanner userInput3;
	private String homeTeam = null;
	private String awayTeam = null;
	
	public String getHomeTeam() {
		return homeTeam;
	}


	public String getAwayTeam() {
		return awayTeam;
	}


	public UserInput(String input, Statistics statistics, Scanner userInput2, Scanner userInput3)
	{
		setInput(input);
		setStatistics(statistics);
		setUserInput2(userInput2);
		setUserInput3(userInput3);
	}
	
	
	public void start()
	{
		options.start(this);
/*		final String teamStatistics = "T";
		final String getMatchupStatistics = "M";
		final String showMatchupHistory = "H";
		final String quit = "Q";
//		String homeTeam = null;
//		String awayTeam = null;
		int counter;
		Scanner userInput1;
//		Scanner userInput2;
//		Scanner userInput3;
		MatchupStatistics matchupStatistics;
//		TeamHistory teamHistory = null;
		MatchupHistory matchupHistory;

		
		switch (getInput())
		{
		case Options.TEAM_HISTORY:
			
			getOptionTeamHistory(homeTeam, statistics);
//			options = new TeamHistory(homeTeam, statistics);
//			options.getInformation(statistics, userInput2, userInput3, homeTeam, awayTeam);

			//check to see if the team the user entered is in the database,
			//if so, display the statistics for the team,
			//if not, notify the user and go back to the menu
			break;
			
			
		case Options.MATCHUP_STATISTICS:
			getOptionMatchupStatistics(homeTeam, awayTeam, statistics);
//			options = new MatchupStatistics(homeTeam,awayTeam, statistics);
//			options.getInformation(statistics, userInput2, userInput3, homeTeam, awayTeam);
			break;
			
			
		case Options.MATCHUP_HISTORY:
			getOptionMatchupHistory(homeTeam, awayTeam, statistics);
//			options = new MatchupHistory(homeTeam, awayTeam, statistics);
//			options.getInformation(statistics, userInput2, userInput3, homeTeam, awayTeam);
			break;
			
		case Options.QUIT:
			quit();

			
		default:
			System.out.println("Invalid input, please try again!");
			break;
		}*/
	}
	
	public void getOptionTeamHistory(String homeTeam, Statistics statistics)
	{
		options = new TeamHistory(homeTeam, statistics);
		options.getInformation(statistics, userInput2, userInput3, homeTeam, null);
	}
	
	public void getOptionMatchupStatistics(String homeTeam,String awayTeam,Statistics statistics)
	{
		options = new MatchupStatistics(homeTeam,awayTeam, statistics);
		options.getInformation(statistics, userInput2, userInput3, homeTeam, awayTeam);
	}
	
	public void getOptionMatchupHistory(String homeTeam, String awayTeam, Statistics statistics)
	{
		options = new MatchupHistory(homeTeam, awayTeam, statistics);
		options.getInformation(statistics, userInput2, userInput3, homeTeam, awayTeam);
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
	
	private void setInput(String input)
	{
		this.input = input;
	}
	
	private String getInput()
	{
		return this.input;
	} 
	
	public Statistics getStatistics()
	{
		return this.statistics;
	}
	
	private void setStatistics(Statistics statistics)
	{
		this.statistics = statistics;
	}


	private Scanner getUserInput2() {
		return userInput2;
	}


	private void setUserInput2(Scanner userInput2) {
		this.userInput2 = userInput2;
	}


	private Scanner getUserInput3() {
		return userInput3;
	}


	private void setUserInput3(Scanner userInput3) {
		this.userInput3 = userInput3;
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

}
