package assign1.code;

import java.util.Scanner;

public abstract class Options
{
	static final String TEAM_HISTORY = "T";
	static final String MATCHUP_HISTORY = "H";
	static final String MATCHUP_STATISTICS = "M";
	static final String QUIT = "Q";
	
	
	abstract String getOption();
	abstract void getInformation(Statistics statistics, String firstTeam, String SecondTeam);
	
	
	
	//A step for replace conditional with polymorphism,
	//currently unused
	public void start(UserInput input)
	{


		
		switch (getOption())
		{
		case Options.TEAM_HISTORY:
			
			input.getOptionTeamHistory(input.getHomeTeam(), input.getStatistics());

			//check to see if the team the user entered is in the database,
			//if so, display the statistics for the team,
			//if not, notify the user and go back to the menu
			break;
			
			
		case Options.MATCHUP_STATISTICS:
			input.getOptionMatchupStatistics(input.getHomeTeam(),input.getAwayTeam(),input.getStatistics());

			break;
			
			
		case Options.MATCHUP_HISTORY:
			input.getOptionMatchupHistory(input.getHomeTeam(),input.getAwayTeam(),input.getStatistics());

			break;
			
		case Options.QUIT:
			input.quit();

			
		default:
			System.out.println("Invalid input, please try again!");
			break;
		}
	}
	
	
}
