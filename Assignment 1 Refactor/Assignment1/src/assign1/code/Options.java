package assign1.code;

import java.util.Scanner;

public abstract class Options
{
	abstract String getOption();
	abstract void getInformation(Statistics statistics, Scanner firstTeamInput,
			Scanner secondTeamInput, String firstTeam, String SecondTeam);
	
}
