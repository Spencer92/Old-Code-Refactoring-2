// Name:       Spencer Maslen
// Email:      smasl811@mymru.ca
// Course:     COMP 2231
// Instructor: Jason Heard
// Due Date:   September 24, 2014
//
// Source File: Football.java
//
/***************************************************************************/
// Program Name: MatchupStatistics.java
// Purpose:     The purpose is to display the statistics of two teams
//				in a match-up with each other
//				
//
/***************************************************************************/
package assign1;



public class MatchupStatistics 
{
	private boolean teamOneExists;
	private boolean teamTwoExists;
	

	private int teamOneWins;
	private int teamTwoWins;
	private int ties;
	private int gamesPlayed;
	
	
//Class Name:   	MatchupStatistics
//
//Purpose:         Take two previously defined teams
//						and show the match history between them
//
//Input Arguments: 		inputTeamOne	: a previously defined team for comparison
//						inputTeamTwo	: a previously defined team for comparison 
//						totalLines  	: the total amount of matches spanning the years
//						homeScore	 	: the score of the home team
//						awayScore		: the score of the away team
//						homeTeam		: a random home team from the list of all matches	
//						awayTeam		: a random away team from the list of all matches
//
//
//Method Notes:    
//						The class starts by setting the parameters needed in
//						case inputTeamOne or inputTeamTwo don't have
//						valid team names
//						Once the parameters are set, the class checks to see if
//						the teams being checked actually exist.
//						if that's determined then how the teams faired against
//						each other are determined, as well as how much
//						games were played between each other
//
	/***************************************************************************/
	public MatchupStatistics(String inputTeamOne,
			String inputTeamTwo, int totalLines, 
			int[] homeScore, int[] awayScore,
			String homeTeam[],
			String[] awayTeam)
	{
		this.teamOneExists = false;
		this.teamTwoExists = false;
		this.teamTwoWins = 0;
		this.teamOneWins = 0;
		this.ties = 0;
		this.gamesPlayed = 0;
		
		int counter;
		
		for(counter = 0; counter < totalLines; counter++)
		{
			if(inputTeamOne.equals(homeTeam[counter]))
			{
				this.teamOneExists = true;
			}
			if(inputTeamTwo.equals(awayTeam[counter]))
			{
				this.teamTwoExists = true;
			}
			//find out if teams exist
			if(inputTeamOne.equals(homeTeam[counter]) && inputTeamTwo.equals(awayTeam[counter]))
			{
				if(homeScore[counter] > awayScore[counter])
				{
					this.teamOneWins++;
				}
				else if(homeScore[counter] < awayScore[counter])
				{
					this.teamTwoWins++;
				}
				else
				{
					this.ties++;
				}
				this.gamesPlayed++;
				//find out which team beat which, and add the appropriate win to the correct
				//team
			}
		}
		
	}


	//Getters and Setters
	public boolean isTeamOneExists() {
		return teamOneExists;
	}

	public boolean isTeamTwoExists() {
		return teamTwoExists;
	}
	
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public int getTeamOneWins() {
		return teamOneWins;
	}

	public int getTeamTwoWins() {
		return teamTwoWins;
	}

	public int getTies() {
		return ties;
	}

}
