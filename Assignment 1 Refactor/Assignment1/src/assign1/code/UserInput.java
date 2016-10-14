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
	

	/*Method Name:   			UserInput
	*
	*Purpose:         			Takes care of the user input
	*
	*
	*
	*Input Arguments: 			input				: The option that is wanted
	*							statistics			: The statistics of every football match
	*							userFirstTeamInput	: The first team that will be selected
	*							userSecondTeamInput	: The second team that will be selected
	*
	**/
	/***************************************************************************/	
	public UserInput(String input, Statistics statistics, Scanner userFirstTeamInput, Scanner userSecondTeamInput)
	{
		setInput(input);
		setStatistics(statistics);
		setUserFirstTeamInput(userFirstTeamInput);
		setUserSecondTeamInput(userSecondTeamInput);
	}
	
	/*Method Name:   			UserInput
	*
	*Purpose:         			Takes care of the user input
	*
	*
	*
	*Input Arguments: 			none
	*
	*
	*Method Notes:
	*							Selecting "T" gives the history of a specific team
	*							Selecting "M" gives the statistics of two teams that
	*							have faced each other
	*							Selecting "H" gives the statistics of each individual 
	*							match between each team
	*							Selecting "Q" quits
	*							Otherwise a notification that the input was wrong
	*							is given.
	*
	**/
	/***************************************************************************/	
	public void start()
	{

		
		switch (getInput())
		{
		case Options.TEAM_HISTORY:
			
			getOptionTeamHistory(homeTeam, statistics);

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
	
	
	
	/*Method Name:   			getOptionTeamHistory
	*
	*Purpose:         			A step needed in order to achieve polymorphism if desired
	*
	*
	*
	*Input Arguments: 			homeTeam	: The team selected
	*							statistics	: The statistics of all football matches
	*
	**/
	/***************************************************************************/	
	
	public void getOptionTeamHistory(String homeTeam, Statistics statistics)
	{
		options = new TeamHistory(userFirstTeamInput, statistics);
		options.getInformation(statistics, homeTeam, null);
	}
	
	/*Method Name:   			getOptionMatchupStatistics
	*
	*Purpose:         			A step needed in order to achieve polymorphism if desired
	*
	*
	*
	*Input Arguments: 			homeTeam	: The first team selected
	*							awayTeam	: The second team selected
	*							statistics	: The statistics of all football matches
	*
	**/
	/***************************************************************************/	
	
	
	public void getOptionMatchupStatistics(String homeTeam,String awayTeam,Statistics statistics)
	{
		options = new MatchupStatistics(userFirstTeamInput, userSecondTeamInput, statistics);
		options.getInformation(statistics, homeTeam, awayTeam);
	}
	
	/*Method Name:   			getOptionMatchupHistory
	*
	*Purpose:         			A step needed in order to achieve polymorphism if desired
	*
	*
	*
	*Input Arguments: 			homeTeam	: The first team selected
	*							awayTeam	: The second team selected
	*							statistics	: The statistics of all football matches
	*
	**/
	/***************************************************************************/	
	
	public void getOptionMatchupHistory(String homeTeam, String awayTeam, Statistics statistics)
	{
		options = new MatchupHistory(userFirstTeamInput, userSecondTeamInput, statistics);
		options.getInformation(statistics, homeTeam, awayTeam);
	}
	
	/*Method Name:   			quit
	*
	*Purpose:         			ends the program
	*
	**/
	/***************************************************************************/	
	
	
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
		//The above is part of the original design specifications.
		//There is nothing wrong with it.
		System.out.println();
		System.exit(0);
		
	}
	
	//Getters and Setters
	
	
	public String getHomeTeam() {
		return homeTeam;
	}


	public String getAwayTeam() {
		return awayTeam;
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
