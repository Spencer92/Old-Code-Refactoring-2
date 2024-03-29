// Name:       Spencer Maslen
// Email:      smasl811@mymru.ca
// Course:     COMP 2231
// Instructor: Jason Heard
// Due Date:   September 24, 2014
//
// Source File: Football.java
//
/***************************************************************************/
// Program Name: MatchupHistory.java
// Purpose:     The purpose is to display the match-up history between two teams
//				(week played, year played, score for both teams, who the teams are)
//				
//
// Limitations: The match history will not be displayed in numeric order.
//
//
//
/***************************************************************************/

package assign1.code;

import java.util.Scanner;

public class MatchupHistory extends Options
{
	
	private boolean teamOneExists;
	private boolean teamTwoExists;
	private String[] teamDisplayOne;
	private String[] teamDisplayTwo;
	private int matchesOne;
	private int matchesTwo;
	private String firstTeam;
	private String secondTeam;

	private int[] yearTeamOne;
	private int[] yearTeamTwo;




	/***************************************************************************/
/* Class Name		: 	MatchupHistory
*
* Purpose			:   Take two previously defined teams
*						and show the match history between them
*
* Input Arguments	: 	inputTeamOne	: The first team a user asked about
*						inputTeamTwo	: The second team that the user wanted to compare
*										  the first team to. 
*						statistics		: The statistics of all matches played
*
* Method Notes		:    
*						The class starts by setting the parameters needed in
*						case inputTeamOne or inputTeamTwo don't have
*						valid team names
*						Once the parameters are set, the class checks to see if
*						the teams being checked actually exist.
*						if that's determined then the amount of matches between the
*						two teams are calculated
*
*						The class then looks at the history from the two teams (if
*						they are valid) and store's them for later display
*
**/
	/***************************************************************************/


	public MatchupHistory(Scanner inputTeamOne,
			Scanner inputTeamTwo, Statistics statistics)
	{
		int counter;
		int matchCounterOne = 0;
		int matchCounterTwo = 0;
		int totalLines = statistics.getTotalLines();
		int homeScore[] = statistics.getHomeScore();
		int awayScore[] = statistics.getAwayScore();
		int year[] = statistics.getYear();
		String week[] = statistics.getWeek();
		String homeTeam[] = statistics.getHome();
		String awayTeam[] = statistics.getAway();
		this.teamOneExists = false;
		this.teamTwoExists = false;
		this.matchesOne = 0;
		this.matchesTwo = 0;


		System.out.print("Please enter the home team (in all caps): ");
		firstTeam = inputTeamOne.next();
		System.out.print("Please enter the away team (in all caps): ");
		secondTeam = inputTeamTwo.next();		
		
		
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
			
			if(firstTeam.equals(homeTeam[counter]) && secondTeam.equals(awayTeam[counter]))
			{
				this.matchesOne++;
			}
			if(firstTeam.equals(awayTeam[counter]) && secondTeam.equals(homeTeam[counter]))
			{
				this.matchesTwo++;
			}
		}

		//checks if the teams exist, and if they do find out how many times they've faced each other
		if(this.teamOneExists && this.teamTwoExists)
		{
			this.yearTeamOne = new int[this.matchesOne];
			this.yearTeamTwo = new int[this.matchesTwo];			
			this.teamDisplayOne = new String[matchesOne];
			this.teamDisplayTwo = new String[matchesTwo];
			for(counter = 0; counter < totalLines; counter++)
			{
				if(firstTeam.equals(homeTeam[counter]) && secondTeam.equals(awayTeam[counter]))
				{
					this.teamDisplayOne[matchCounterOne] = Integer.toString(year[counter]) + " " +
													week[counter] + "\t  " + secondTeam + "  " +
													Integer.toString(awayScore[counter]) + " \t  " +
													firstTeam + " \t" + Integer.toString(homeScore[counter]);
					this.yearTeamOne[matchCounterOne] = year[counter];
					matchCounterOne++;
					//displays the history of the match for when the first team is home
					//and the second team is away
				}
				else if(firstTeam.equals(awayTeam[counter]) && secondTeam.equals(homeTeam[counter]))
				{

					this.teamDisplayTwo[matchCounterTwo] = Integer.toString(year[counter]) + " " +
							week[counter] + "\t  " + firstTeam + "  " +
							Integer.toString(awayScore[counter]) + " \t  " +
							secondTeam + " \t" + Integer.toString(homeScore[counter]);
					this.yearTeamTwo[matchCounterTwo] = year[counter];
					matchCounterTwo++;
					//displays the history of the match for when the first team is away
					//and the second team is home					
				}
			}
		}
	}
	
	/***************************************************************************/
/* Class Name		: 	getInformation
*
* Purpose			:   Take two previously defined teams
*						and show the match history between them
*
* Input Arguments	: 	inputTeamOne	: The first team a user asked about
*						inputTeamTwo	: The second team that the user wanted to compare
*										  the first team to. 
*						statistics		: The statistics of all matches played
*
* Method Notes		:    
*						The class starts by setting the parameters needed in
*						case inputTeamOne or inputTeamTwo don't have
*						valid team names
*						Once the parameters are set, the class checks to see if
*						the teams being checked actually exist.
*						if that's determined then the amount of matches between the
*						two teams are calculated
*
*						The class then looks at the history from the two teams (if
*						they are valid) and store's them for later display
*
**/
	/***************************************************************************/	
	
	@Override
	public void getInformation(Statistics statistics, String teamOne, String teamTwo)
	{
		int counter;
		int counterFirstTeam = 0;
		int counterSecondTeam = 0;

		if(!isTeamOneExists())
		{
			System.out.println(firstTeam + " is not a valid team name");
		}
		else if(!isTeamTwoExists())
		{
			System.out.println(secondTeam + " is not a valid team name");
		}
		else
		{
			System.out.println("History of " + firstTeam + " VS " + secondTeam);
			System.out.println("Year Week Away Away Score Home Home Score");
			System.out.println("-----------------------------------------");
			for(counter = 0; counter < getMatchesOne() + getMatchesTwo(); counter++)
			{
				if(counterFirstTeam < getMatchesOne() && counterSecondTeam < getMatchesTwo()
						&& getTeamOne().equals(firstTeam)
						&& getYearTeamOne()[counterFirstTeam] <= 
						getYearTeamTwo()[counterSecondTeam])
				{
					System.out.println(getTeamDisplayOne()[counterFirstTeam]);
					counterFirstTeam++;
					//If at the current year the first team was home and the second team is away,
					//and it's the currently earliest match between them, then display the
					//first team as home and the second team as away
				}
				else if(counterSecondTeam < getMatchesTwo() && counterFirstTeam < getMatchesOne()
						&& getTeamTwo().equals(secondTeam)
						&& getYearTeamTwo()[counterSecondTeam] < getYearTeamOne()[counterFirstTeam] )
				{
					System.out.println(getTeamDisplayTwo()[counterSecondTeam]);
					counterSecondTeam++;
					//If at the current year the second team was home and the first team is away,
					//and it's the currently earliest match between them, then display the
					//second team as home and the first team as away
					
				}
				else if(counterFirstTeam >= getMatchesOne() && counterSecondTeam < getMatchesTwo())
				{
					System.out.println(getTeamDisplayTwo()[counterSecondTeam]);
					counterSecondTeam++;	
					//If there aren't any more matches where the first team was the home team
					//finish writing the rest of the matches
				}
				else if(counterSecondTeam >= getMatchesTwo() && counterFirstTeam < getMatchesOne())
				{
					System.out.println(getTeamDisplayOne()[counterFirstTeam]);
					counterFirstTeam++;
					//If there aren't any more matches where the second team was the home team
					//finish writing the rest of the matches
					
				}
			}

			//if the team names are valid, display the history between the two teams
			//otherwise if one or more of the teams don't exist notify the user and
			//return to the menu
		}
	}
	

	
	//Getters and Setters
	
	public int[] getYearTeamOne() {
		return yearTeamOne;
	}



	public int[] getYearTeamTwo() {
		return yearTeamTwo;
	}

	
	public String[] getTeamDisplayTwo() {
		return teamDisplayTwo;
	}

	public boolean isTeamOneExists() {
		return teamOneExists;
	}


	public boolean isTeamTwoExists() {
		return teamTwoExists;
	}


	public String[] getTeamDisplayOne() {
		return teamDisplayOne;
	}

	public int getMatchesOne() {
		return matchesOne;
	}
	
	public int getMatchesTwo() {
		return matchesTwo;
	}

	public String getTeamOne()
	{
		return this.firstTeam;
	}
	
	public String getTeamTwo()
	{
		return this.secondTeam;
	}
	
	public MatchupHistory getMatchupHistoryRaw()
	{
		return this;
	}

	@Override
	String getOption() 
	{
		return "H";
	}



}
