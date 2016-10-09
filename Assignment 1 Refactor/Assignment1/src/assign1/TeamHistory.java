// Name:       Spencer Maslen
// Email:      smasl811@mymru.ca
// Course:     COMP 2231
// Instructor: Jason Heard
// Due Date:   September 24, 2014
//
// Source File: Football.java
//
/***************************************************************************/
// Program Name: TeamHistory.java
// Purpose:     The purpose is to display the history of a single team
//				
//
/***************************************************************************/
package assign1;

public class TeamHistory
{
	private int wins;
	private int losses;
	private int ties;
	private boolean teamExists;
	private int mostPoints;
	private double winPercentage;



//Class Name:   	TeamHistory
//
//Purpose:         Take two previously defined teams
//							and show the match history between them
//
//Input Arguments: 			inputTeam	: a previously defined team for comparison
//							totalLines  	: the total amount of matches spanning the years
//							homeScore	 	: the score of the home team
//							awayScore		: the score of the away team
//							homeTeam		: a random home team from the list of all matches	
//							awayTeam		: a random away team from the list of all matches
//
//
//Method Notes:    
//							The class starts by setting the parameters needed in
//							case inputTeam doesn't have a valid team name
//							Once the parameters are set, the class checks to see if
//							the team being checked actually exists.
//							If that's determined then the class checks and looks
//							at the total wins, losses, ties, the most points,
//							and the percentage of wins.
		/***************************************************************************/
	
	public TeamHistory(String inputTeam, int totalLines, 
						int[] homeScore, int[] awayScore,
						String homeTeam[],
						String[] awayTeam)
	{
		int counter;
		
		wins = 0;
		losses = 0;
		ties = 0;
		teamExists = false;
		int score = 0;
		double winsDouble;
		double lossesDouble;
		double tiesDouble;
		
		for(counter = 0; counter < totalLines; counter++)
		{
			if(inputTeam.equals(homeTeam[counter]))
			{
				System.out.println(homeTeam[counter]);
				this.teamExists = true;
				if(homeScore[counter] < awayScore[counter])
				{
					
					this.losses++;
				}
				else if(homeScore[counter] > awayScore[counter])
				{
					this.wins++;
				}
				else
				{
					this.ties++;
				}
				if(homeScore[counter] > score)
				{
					score = homeScore[counter];
				}
				//if the team exists and is at home, cycle through the years
				//in order to find out the wins, losses, ties, and
				//highest score
			}
			else if(inputTeam.equals(awayTeam[counter]))
			{
				this.teamExists = true;
				if(homeScore[counter] > awayScore[counter])
				{
					this.losses++;
				}
				else if(homeScore[counter] < awayScore[counter])
				{
					this.wins++;
				}
				else
				{
					this.ties++;
				}
				if(awayScore[counter] > score)
				{
					score = homeScore[counter];
				}
				//if the team exists and away from home, cycle through the years
				//in order to find out the wins, losses, ties, and
				//highest score
			}
		}
		if(teamExists)
		{
			winsDouble = wins;
			lossesDouble = losses;
			tiesDouble = ties;
			this.winPercentage = (winsDouble / (winsDouble + lossesDouble + tiesDouble)) * 100;
			this.mostPoints = score;
			//if the team exists then find out the win percentage
		}
	}

	
	//Getters and Setters
	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getTies() {
		return ties;
	}
	public boolean isTeamExists() {
		return teamExists;
	}
	public int getMostPoints() {
		return mostPoints;
	}

	public double getWinPercentage() {
		return winPercentage;
	}
}
