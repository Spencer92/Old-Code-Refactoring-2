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
package assign1.code;

import java.util.Scanner;

public class TeamHistory extends Options
{
	private int wins;
	private int losses;
	private int ties;
	private boolean teamExists;
	private int mostPoints;
	private double winPercentage;
	private String team;



/*Class Name:   	TeamHistory
*
*Purpose:         Take two previously defined teams
*							and show the match history between them
*
*Input Arguments: 			teamInput	: a user defined team that will be checked for its
*										  statistics
*							statistics	: The entire statistics of the football history
*							
*
*
*Method Notes:    
*							The class starts by setting the parameters needed in
*							case teamInput doesn't have a valid team name
*							Once the parameters are set, the class checks to see if
*							the team being checked actually exists.
*							If that's determined then the class checks and looks
*							at the total wins, losses, ties, the most points,
*							and the percentage of wins.
**/
/***************************************************************************/
	
	public TeamHistory(Scanner teamInput, Statistics statistics)
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
		int totalLines = statistics.getTotalLines();
		int homeScore[] = statistics.getHomeScore();
		int awayScore[] = statistics.getAwayScore();
		String homeTeam[] = statistics.getHome();
		String awayTeam[] = statistics.getAway();
		
		System.out.print("Please Enter a team (in all caps): ");
		team = teamInput.next();		
		
		for(counter = 0; counter < totalLines; counter++)
		{
			if(team.equals(homeTeam[counter]))
			{
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
			else if(team.equals(awayTeam[counter]))
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

	
	/*Method Name:   		getInformation
	*
	*Purpose:         		Displays the information of the team to the screen
	*
	*
	*
	*Input Arguments: 			statistics	: The statistics of all the matches
	*							firstTeam	: The team that the user wants the information
	*										  from
	*							secondTeam	: unused but required due to it overriding another method
	*
	*
	*Method Notes:    
	*							Displays the team statistics to the user if the
	*							team exists. A notification is displayed if the
	*							team doesn't exist.
	**/
	/***************************************************************************/	
	
	
	
	@Override
	public void getInformation(Statistics statistics, String firstTeam, String secondTeam) 
	{
		firstTeam = this.team;
		if(isTeamExists())
		{
			System.out.println("Stats for " + firstTeam + ":");
			System.out.println("Wins:\t\t" + getWins());
			System.out.println("Losses:\t\t" + getLosses());
			System.out.println("Ties:\t\t" + getTies());
			System.out.println("Most Points:\t" + getMostPoints());
			System.out.println("Win percentage:\t" + (int)getWinPercentage() + "%");
		}
		else
		{
			System.out.println(firstTeam + " is not a valid team name");
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


	@Override
	String getOption() 
	{
		return "T";
	}
}
