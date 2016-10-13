package assign1.code;

import java.util.Scanner;

public abstract class Options
{
	static final String TEAM_HISTORY = "T";
	static final String MATCHUP_HISTORY = "H";
	static final String MATCHUP_STATISTICS = "M";
	static final String QUIT = "Q";
	
	
	abstract String getOption();
	abstract void getInformation(Statistics statistics, Scanner firstTeamInput,
			Scanner secondTeamInput, String firstTeam, String SecondTeam);
	
	public void start(UserInput input)
	{
//		final String teamStatistics = "T";
//		final String getMatchupStatistics = "M";
//		final String showMatchupHistory = "H";
//		final String quit = "Q";
//		String homeTeam = null;
//		String awayTeam = null;
//		int counter;
//		Scanner userInput1;
//		Scanner userInput2;
//		Scanner userInput3;
//		MatchupStatistics matchupStatistics;
//		TeamHistory teamHistory = null;
//		MatchupHistory matchupHistory;

		
		switch (getOption())
		{
		case Options.TEAM_HISTORY:
			
			input.getOptionTeamHistory(input.getHomeTeam(), input.getStatistics());
//			options = new TeamHistory(homeTeam, statistics);
//			options.getInformation(statistics, userInput2, userInput3, homeTeam, awayTeam);

			//check to see if the team the user entered is in the database,
			//if so, display the statistics for the team,
			//if not, notify the user and go back to the menu
			break;
			
			
		case Options.MATCHUP_STATISTICS:
			input.getOptionMatchupStatistics(input.getHomeTeam(),input.getAwayTeam(),input.getStatistics());
//			options = new MatchupStatistics(homeTeam,awayTeam, statistics);
//			options.getInformation(statistics, userInput2, userInput3, homeTeam, awayTeam);
			break;
			
			
		case Options.MATCHUP_HISTORY:
			input.getOptionMatchupHistory(input.getHomeTeam(),input.getAwayTeam(),input.getStatistics());
//			options = new MatchupHistory(homeTeam, awayTeam, statistics);
//			options.getInformation(statistics, userInput2, userInput3, homeTeam, awayTeam);
			break;
			
		case Options.QUIT:
			input.quit();

			
		default:
			System.out.println("Invalid input, please try again!");
			break;
		}
	}
	
	
}
