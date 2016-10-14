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
	
	/*Method Name:   			TestMatchupStatistics
	*
	*Purpose:         			To test the MatchupStatistics class
	*
	*
	*Method notes:
	*							Tests the games played, first team wins,
	*							second team wins, and ties.
	*
	**/
	
	
	
	
	Statistics statistics;
	MatchupStatistics matchupStatistics;
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
		MatchupStatistics noVShou = new MatchupStatistics(input1,
				input2, statistics);	
		assertEquals(noVShou.getGamesPlayed(),3);
		assertEquals(noVShou.getTeamOneWins(),2);
		assertEquals(noVShou.getTeamTwoWins(),1);
		assertEquals(noVShou.getTies(),0);
		
	}

	@Test
	public void testNOVSSEAMatchupStatistics()
	{
		input1 = new Scanner("NO");
		input2 = new Scanner("SEA");
		MatchupStatistics noVSsea = new MatchupStatistics(input1,
				input2, statistics);
		assertEquals(noVSsea.getGamesPlayed(),14);
		assertEquals(noVSsea.getTeamOneWins(),6);
		assertEquals(noVSsea.getTeamTwoWins(),8);
		assertEquals(noVSsea.getTies(),0);
		
	}
	
	@Test
	public void testNOVSJACMatchupStatistics()
	{
		input1 = new Scanner("NO");
		input2 = new Scanner("JAC");
		MatchupStatistics noVSjac = new MatchupStatistics(input1,
				input2, statistics);
		assertEquals(noVSjac.getGamesPlayed(),5);
		assertEquals(noVSjac.getTeamOneWins(),3);
		assertEquals(noVSjac.getTeamTwoWins(),2);
		assertEquals(noVSjac.getTies(),0);
		
	}
	
	@Test
	public void testNOVSBUFMatchupStatistics()
	{
		input1 = new Scanner("NO");
		input2 = new Scanner("BUF");
		MatchupStatistics noVSbuf = new MatchupStatistics(input1,
				input2, statistics);
		assertEquals(noVSbuf.getGamesPlayed(),10);
		assertEquals(noVSbuf.getTeamOneWins(),6);
		assertEquals(noVSbuf.getTeamTwoWins(),4);
		assertEquals(noVSbuf.getTies(),0);
		
	}

	@Test
	public void testHOUVSSEAMatchupStatistics()
	{
		input1 = new Scanner("HOU");
		input2 = new Scanner("SEA");
		MatchupStatistics houVSsea = new MatchupStatistics(input1,
				input2, statistics);
		assertEquals(houVSsea.getGamesPlayed(),3);
		assertEquals(houVSsea.getTeamOneWins(),1);
		assertEquals(houVSsea.getTeamTwoWins(),2);
		assertEquals(houVSsea.getTies(),0);
		
	}
	
	@Test
	public void testHOUVSJACMatchupStatistics()
	{
		input1 = new Scanner("HOU");
		input2 = new Scanner("JAC");
		MatchupStatistics houVSjac = new MatchupStatistics(input1,
				input2, statistics);
		assertEquals(houVSjac.getGamesPlayed(),24);
		assertEquals(houVSjac.getTeamOneWins(),13);
		assertEquals(houVSjac.getTeamTwoWins(),11);
		assertEquals(houVSjac.getTies(),0);
		
	}
	
	@Test
	public void testHOUVSBUFMatchupStatistics()
	{
		input1 = new Scanner("HOU");
		input2 = new Scanner("BUF");
		MatchupStatistics houVSbuf = new MatchupStatistics(input1,
				input2, statistics);
		assertEquals(houVSbuf.getGamesPlayed(),6);
		assertEquals(houVSbuf.getTeamOneWins(),3);
		assertEquals(houVSbuf.getTeamTwoWins(),3);
		assertEquals(houVSbuf.getTies(),0);
		
	}
	
	@Test
	public void testSEAVSJACMatchupStatistics()
	{
		input1 = new Scanner("SEA");
		input2 = new Scanner("JAC");
		MatchupStatistics seaVSjac = new MatchupStatistics(input1,
				input2, statistics);
		assertEquals(seaVSjac.getGamesPlayed(),7);
		assertEquals(seaVSjac.getTeamOneWins(),5);
		assertEquals(seaVSjac.getTeamTwoWins(),2);
		assertEquals(seaVSjac.getTies(),0);
		
	}
	
	@Test
	public void testSEAVSBUFMatchupStatistics()
	{
		input1 = new Scanner("SEA");
		input2 = new Scanner("BUF");
		MatchupStatistics seaVSbuf = new MatchupStatistics(input1,
				input2, statistics);
		assertEquals(seaVSbuf.getGamesPlayed(),12);
		assertEquals(seaVSbuf.getTeamOneWins(),7);
		assertEquals(seaVSbuf.getTeamTwoWins(),5);
		assertEquals(seaVSbuf.getTies(),0);
		
	}
	
	@Test
	public void testJACVSBUFMatchupStatistics()
	{
		input1 = new Scanner("JAC");
		input2 = new Scanner("BUF");
		MatchupStatistics jacVSbuf = new MatchupStatistics(input1,
				input2, statistics);
		assertEquals(jacVSbuf.getGamesPlayed(),13);
		assertEquals(jacVSbuf.getTeamOneWins(),6);
		assertEquals(jacVSbuf.getTeamTwoWins(),7);
		assertEquals(jacVSbuf.getTies(),0);
		
	}
	
	
	
}
