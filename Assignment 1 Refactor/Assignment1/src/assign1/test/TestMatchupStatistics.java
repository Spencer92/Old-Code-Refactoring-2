package assign1.test;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import assign1.*;
import assign1.code.MatchupStatistics;
import assign1.code.Statistics;
import assign1.code.UserInput;


public class TestMatchupStatistics 
{
	Statistics statistics;
	UserInput userInput = new UserInput();
	Scanner input1;
	Scanner input2;
	Scanner input3;
	public TestMatchupStatistics()
	{
		statistics = new Statistics();
		statistics.process();
	}
	
	@Test
	public void testNOVSHOUMatchupStatistics()
	{
		input1 = new Scanner("NO");
		input2 = new Scanner("HOU");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics noVShou = userInput.getMatchupStatisticsRaw();
		assertEquals(noVShou.getGamesPlayed(),2);
		assertEquals(noVShou.getTeamOneWins(),2);
		assertEquals(noVShou.getTeamTwoWins(),0);
		assertEquals(noVShou.getTies(),0);
		
	}

	@Test
	public void testNOVSSEAMatchupStatistics()
	{
		input1 = new Scanner("NO");
		input2 = new Scanner("SEA");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics noVSsea = userInput.getMatchupStatisticsRaw();
		assertEquals(noVSsea.getGamesPlayed(),5);
		assertEquals(noVSsea.getTeamOneWins(),3);
		assertEquals(noVSsea.getTeamTwoWins(),2);
		assertEquals(noVSsea.getTies(),0);
		
	}
	
	@Test
	public void testNOVSJACMatchupStatistics()
	{
		input1 = new Scanner("NO");
		input2 = new Scanner("JAC");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics noVSjac = userInput.getMatchupStatisticsRaw();
		assertEquals(noVSjac.getGamesPlayed(),2);
		assertEquals(noVSjac.getTeamOneWins(),2);
		assertEquals(noVSjac.getTeamTwoWins(),0);
		assertEquals(noVSjac.getTies(),0);
		
	}
	
	@Test
	public void testNOVSBUFMatchupStatistics()
	{
		input1 = new Scanner("NO");
		input2 = new Scanner("BUF");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics noVSbuf = userInput.getMatchupStatisticsRaw();
		assertEquals(noVSbuf.getGamesPlayed(),6);
		assertEquals(noVSbuf.getTeamOneWins(),3);
		assertEquals(noVSbuf.getTeamTwoWins(),3);
		assertEquals(noVSbuf.getTies(),0);
		
	}
	
	@Test
	public void testHOUVSSEAMatchupStatistics()
	{
		input1 = new Scanner("HOU");
		input2 = new Scanner("SEA");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics houVSsea = userInput.getMatchupStatisticsRaw();
		assertEquals(houVSsea.getGamesPlayed(),2);
		assertEquals(houVSsea.getTeamOneWins(),1);
		assertEquals(houVSsea.getTeamTwoWins(),1);
		assertEquals(houVSsea.getTies(),0);
		
	}
	
	@Test
	public void testHOUVSJACMatchupStatistics()
	{
		input1 = new Scanner("HOU");
		input2 = new Scanner("JAC");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics houVSjac = userInput.getMatchupStatisticsRaw();
		assertEquals(houVSjac.getGamesPlayed(),12);
		assertEquals(houVSjac.getTeamOneWins(),8);
		assertEquals(houVSjac.getTeamTwoWins(),4);
		assertEquals(houVSjac.getTies(),0);
		
	}
	
	@Test
	public void testHOUVSBUFMatchupStatistics()
	{
		input1 = new Scanner("HOU");
		input2 = new Scanner("BUF");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics houVSbuf = userInput.getMatchupStatisticsRaw();
		assertEquals(houVSbuf.getGamesPlayed(),3);
		assertEquals(houVSbuf.getTeamOneWins(),1);
		assertEquals(houVSbuf.getTeamTwoWins(),2);
		assertEquals(houVSbuf.getTies(),0);
		
	}
	
	@Test
	public void testSEAVSJACMatchupStatistics()
	{
		input1 = new Scanner("SEA");
		input2 = new Scanner("JAC");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics seaVSjac = userInput.getMatchupStatisticsRaw();
		assertEquals(seaVSjac.getGamesPlayed(),3);
		assertEquals(seaVSjac.getTeamOneWins(),3);
		assertEquals(seaVSjac.getTeamTwoWins(),0);
		assertEquals(seaVSjac.getTies(),0);
		
	}
	
	@Test
	public void testSEAVSBUFMatchupStatistics()
	{
		input1 = new Scanner("SEA");
		input2 = new Scanner("BUF");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics seaVSbuf = userInput.getMatchupStatisticsRaw();
		assertEquals(seaVSbuf.getGamesPlayed(),8);
		assertEquals(seaVSbuf.getTeamOneWins(),5);
		assertEquals(seaVSbuf.getTeamTwoWins(),3);
		assertEquals(seaVSbuf.getTies(),0);
		
	}
	
	@Test
	public void testJACVSBUFMatchupStatistics()
	{
		input1 = new Scanner("JAC");
		input2 = new Scanner("BUF");
		userInput.getMatchupStatistics(statistics, input1, input2, null, null);
		MatchupStatistics jacVSbuf = userInput.getMatchupStatisticsRaw();
		assertEquals(jacVSbuf.getGamesPlayed(),6);
		assertEquals(jacVSbuf.getTeamOneWins(),2);
		assertEquals(jacVSbuf.getTeamTwoWins(),4);
		assertEquals(jacVSbuf.getTies(),0);
		
	}
	
	
	
}
