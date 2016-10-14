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
	

	
	
}
