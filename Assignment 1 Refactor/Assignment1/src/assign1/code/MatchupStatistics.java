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
package assign1.code;

import java.util.Scanner;

public class MatchupStatistics extends Options
{
	private boolean teamOneExists;
	private boolean teamTwoExists;
	

	private int teamOneWins;
	private int teamTwoWins;
	private int ties;
	private int gamesPlayed;
	private String firstTeam;
	private String secondTeam;
	
	
/*Class Name:   		MatchupStatistics
*
*Purpose:         		Take two previously defined teams
*						and show the match history between them
*
*Input Arguments: 		firstTeamInput	: a previously defined team for comparison
*						secondTeamInput	: a previously defined team for comparison
*						statistics		: the statistics of all the matches in the football league
*
*Method Notes:    
*						The class starts by setting the parameters needed in
*						case the first team or the second team don't have
*						valid team names
*						Once the parameters are set, the class checks to see if
*						the teams being checked actually exist.
*						if that's determined then how the teams faired against
*						each other are determined, as well as how much
*						games were played between each other
**/
	/***************************************************************************/
	public MatchupStatistics(Scanner firstTeamInput,
			Scanner secondTeamInput, Statistics statistics)
	{
		
		int totalLines = statistics.getTotalLines();
		int homeScore[] = statistics.getHomeScore();
		int awayScore[] = statistics.getAwayScore();
		String homeTeam[] = statistics.getHome();
		String awayTeam[] = statistics.getAway();
		
		this.teamOneExists = false;
		this.teamTwoExists = false;
		this.teamTwoWins = 0;
		this.teamOneWins = 0;
		this.ties = 0;
		this.gamesPlayed = 0;
		
		int counter;
		System.out.print("Please enter first team (in all caps): ");
		firstTeam = firstTeamInput.next();
		System.out.print("Please enter second team (in all caps): ");
		secondTeam = secondTeamInput.next();
		
		
		for(counter = 0; counter < totalLines; counter++)
		{
			if(firstTeam.equals(homeTeam[counter]))
			{
				this.teamOneExists = true;
			}
			if(secondTeam.equals(awayTeam[counter]))
			{
				this.teamTwoExists = true;
			}
			//find out if teams exist
			if(firstTeam.equals(homeTeam[counter]) && secondTeam.equals(awayTeam[counter]))
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
			else if(firstTeam.equals(awayTeam[counter]) && secondTeam.equals(homeTeam[counter]))
			{
				if(homeScore[counter] > awayScore[counter])
				{
					this.teamTwoWins++;
				}
				else if(homeScore[counter] < awayScore[counter])
				{
					this.teamOneWins++;
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

	
	/*Class Name:   		getInformation
	*
	*Purpose:         		Take two previously defined teams
	*						and show the match history between them
	*
	*Input Arguments: 		statistics		: the statistics of all the matches in the football league
	*						firstTeam		: The first user selected team
	*						secondTeam		: The second user selected team
	*
	*Method Notes:    
	*						The existence of the two teams are checked, and
	*						if they do exist the information of their history will
	*						be displayed. There will be a notification if one of 
	*						the teams do not exist.
	*/
		/***************************************************************************/
	
	
	@Override
	public void getInformation(Statistics statistics, String firstTeam, String secondTeam)
	{
		firstTeam = this.firstTeam;
		secondTeam = this.secondTeam;
		
		if(isTeamOneExists() && isTeamTwoExists()
				&& getGamesPlayed() != 0)
		{
			System.out.println("Games Played:\t" + getGamesPlayed());
			System.out.println(firstTeam + " Won:\t" + getTeamOneWins());
			System.out.println(secondTeam + " Won:\t" + getTeamTwoWins());
			System.out.println("Ties:\t\t" + getTies());
			if(getTeamOneWins() > getTeamTwoWins())
			{
				System.out.println("Matchup favours " + firstTeam);
			}
			else if(getTeamOneWins() < getTeamTwoWins())
			{
				System.out.println("Matchup favours " + secondTeam);
			}
			else
			{
				System.out.println("Matchup favours no one");
			}
			//if the teams exist display the match-up statistics for both teams
		}
		else if(!isTeamOneExists())
		{
			System.out.println(firstTeam + " is not a valid team name");
		}
		else if(!isTeamTwoExists())
		{
			System.out.println(secondTeam + " is not a valid team name");
		}
		else if(getGamesPlayed() == 0)
		{
			System.out.println(firstTeam + " and " + secondTeam + " have never faced each other");
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

	@Override
	String getOption() 
	{
		return "M";
	}

}
