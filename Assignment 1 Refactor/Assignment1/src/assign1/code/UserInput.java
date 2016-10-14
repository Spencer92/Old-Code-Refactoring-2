package assign1.code;

import java.util.Scanner;

public class UserInput 
{
	private Options options;
	private String input;
	private Statistics statistics;
	private Scanner userFirstTeamInput;
	private Scanner userSecondTeamInput;
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
		setUserFirstTeamInput(userInput2);
		setUserSecondTeamInput(userInput3);
	}
	
	
	public void start()
	{

		
		switch (getInput())
		{
		case Options.TEAM_HISTORY:
			
			getOptionTeamHistory(homeTeam, statistics);
			//check to see if the team the user entered is in the database,
			//if so, display the statistics for the team,
			//if not, notify the user and go back to the menu
			break;
			
			
		case Options.MATCHUP_STATISTICS:
			getOptionMatchupStatistics(homeTeam, awayTeam, statistics);
			break;
			
			
		case Options.MATCHUP_HISTORY:
			getOptionMatchupHistory(homeTeam, awayTeam, statistics);
			break;
			
		case Options.QUIT:
			quit();

			
		default:
			System.out.println("Invalid input, please try again!");
			break;
		}
	}
	
	public void getOptionTeamHistory(String homeTeam, Statistics statistics)
	{
		options = new TeamHistory(userFirstTeamInput, statistics);
		options.getInformation(statistics, userFirstTeamInput, userSecondTeamInput, homeTeam, null);
	}
	
	public void getOptionMatchupStatistics(String homeTeam,String awayTeam,Statistics statistics)
	{
		options = new MatchupStatistics(userFirstTeamInput, userSecondTeamInput, statistics);
		options.getInformation(statistics, userFirstTeamInput, userSecondTeamInput, homeTeam, awayTeam);
	}
	
	public void getOptionMatchupHistory(String homeTeam, String awayTeam, Statistics statistics)
	{
		options = new MatchupHistory(userFirstTeamInput, userSecondTeamInput, statistics);
		options.getInformation(statistics, userFirstTeamInput, userSecondTeamInput, homeTeam, awayTeam);
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


	private Scanner getFirstTeamInput() {
		return userFirstTeamInput;
	}


	private void setUserFirstTeamInput(Scanner userInput2) {
		this.userFirstTeamInput = userInput2;
	}


	private Scanner getSecondTeamInput() {
		return userSecondTeamInput;
	}


	private void setUserSecondTeamInput(Scanner userInput3) {
		this.userSecondTeamInput = userInput3;
	}


}
