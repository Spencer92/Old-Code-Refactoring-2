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
		MatchupStatistics noVShou = new MatchupStatistics("NO",
				"HOU", statistics);	
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
		MatchupStatistics noVSsea = new MatchupStatistics("NO",
				"SEA", statistics);
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
		MatchupStatistics noVSjac = new MatchupStatistics("NO",
				"JAC", statistics);
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
		MatchupStatistics noVSbuf = new MatchupStatistics("NO",
				"BUF", statistics);
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
		MatchupStatistics houVSsea = new MatchupStatistics("HOU",
				"SEA", statistics);
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
		MatchupStatistics houVSjac = new MatchupStatistics("HOU",
				"JAC", statistics);
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
		MatchupStatistics houVSbuf = new MatchupStatistics("HOU",
				"BUF", statistics);
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
		MatchupStatistics seaVSjac = new MatchupStatistics("SEA",
				"JAC", statistics);
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
		MatchupStatistics seaVSbuf = new MatchupStatistics("SEA",
				"BUF", statistics);
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
		MatchupStatistics jacVSbuf = new MatchupStatistics("JAC",
				"BUF", statistics);
		assertEquals(jacVSbuf.getGamesPlayed(),6);
		assertEquals(jacVSbuf.getTeamOneWins(),2);
		assertEquals(jacVSbuf.getTeamTwoWins(),4);
		assertEquals(jacVSbuf.getTies(),0);
		
	}
	
	
	
}
