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

package assign1;

public class MatchupHistory 
{
	
	private boolean teamOneExists;
	private boolean teamTwoExists;
	private String[] teamDisplayOne;
	private String[] teamDisplayTwo;
	private int matchesOne;
	private int matchesTwo;


	/***************************************************************************/
// Class Name:   	MatchupHistory
//
// Purpose:         Take two previously defined teams
//					and show the match history between them
//
// Input Arguments: inputTeamOne	: a previously defined team for comparison
//					inputTeamTwo	: a previously defined team for comparison 
//					totalLines  	: the total amount of matches spanning the years
//					homeScore	 	: the score of the home team
//					awayScore		: the score of the away team
//					homeTeam		: a random home team from the list of all matches	
//					awayTeam		: a random away team from the list of all matches
//					year			: the year the match was played
//					week			: the week the match was played
//
//
// Method Notes:    
//					The class starts by setting the parameters needed in
//					case inputTeamOne or inputTeamTwo don't have
//					valid team names
//					Once the parameters are set, the class checks to see if
//					the teams being checked actually exist.
//					if that's determined then the amount of matches between the
//					two teams are calculated
//
//					The class then looks at the history from the two teams (if
//					they are valid) and store's them for later display
	/***************************************************************************/


	public MatchupHistory(String inputTeamOne,
			String inputTeamTwo, int totalLines, 
			int[] homeScore, int[] awayScore,
			String homeTeam[],
			String[] awayTeam, int[] year,
			String[] week)
	{
		int counter;
		int matchCounterOne = 0;
		int matchCounterTwo = 0;
		this.teamOneExists = false;
		this.teamTwoExists = false;
		this.matchesOne = 0;
		this.matchesTwo = 0;
		
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
			
			if(inputTeamOne.equals(homeTeam[counter]) && inputTeamTwo.equals(awayTeam[counter]))
			{
				this.matchesOne++;
			}
			if(inputTeamOne.equals(awayTeam[counter]) && inputTeamTwo.equals(homeTeam[counter]))
			{
				this.matchesTwo++;
			}
		}
		//checks if the teams exist, and if they do find out how many times they've faced each other
		if(this.teamOneExists && this.teamTwoExists)
		{
			this.teamDisplayOne = new String[matchesOne];
			this.teamDisplayTwo = new String[matchesTwo];
			for(counter = 0; counter < totalLines; counter++)
			{
				if(inputTeamOne.equals(homeTeam[counter]) && inputTeamTwo.equals(awayTeam[counter]))
				{
					this.teamDisplayOne[matchCounterOne] = Integer.toString(year[counter]) + " " +
													week[counter] + "\t  " + inputTeamTwo + "  " +
													Integer.toString(awayScore[counter]) + " \t  " +
													inputTeamOne + " \t" + Integer.toString(homeScore[counter]);
					matchCounterOne++;
					//displays the history of the match for when the first team is home
					//and the second team is away
				}
				if(inputTeamOne.equals(awayTeam[counter]) && inputTeamTwo.equals(homeTeam[counter]))
				{
					System.out.println("in input team one");
					this.teamDisplayTwo[matchCounterTwo] = Integer.toString(year[counter]) + " " +
							week[counter] + "\t  " + inputTeamTwo + "  " +
							Integer.toString(awayScore[counter]) + " \t  " +
							inputTeamOne + " \t" + Integer.toString(homeScore[counter]);
					matchCounterTwo++;
					//displays the history of the match for when the first team is away
					//and the second team is home
				}
			}
		}
	}
	


	//Getters and Setters
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

	public int getMatches() {
		return matchesOne;
	}
	
	public int getMatchesTwo() {
		return matchesTwo;
	}


}
