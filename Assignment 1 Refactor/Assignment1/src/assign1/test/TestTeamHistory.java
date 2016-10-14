package assign1.test;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import assign1.code.*;


public class TestTeamHistory 
{
	
	/*Method Name:   			TestTeamHistory
	*
	*Purpose:         			To test the TeamHistory class
	*
	*Method Notes:
	*							Checks the wins, losses, ties, most points in a game,
	*							and the win percentage 
	*
	**/
	/***************************************************************************/	
	Statistics statistics;
	TeamHistory team;
	Scanner input1;
	Scanner input2;
	Scanner input3;
	public TestTeamHistory()
	{
		statistics = new Statistics();
		statistics.process();
	}
	@Test
	public void testNOTeamStatistics()
	{
		
		input2 = new Scanner("NO");
		team = new TeamHistory(input2, statistics);
		assertEquals(team.getWins(),324);
		assertEquals(team.getLosses(),409);
		assertEquals(team.getTies(),5);
		assertEquals(team.getMostPoints(),62);
		assertEquals((int)team.getWinPercentage(),43);
		
	}

	@Test
	public void testHOUTeamStatistics()
	{
		
		input2 = new Scanner("HOU");
		team = new TeamHistory(input2, statistics);
		assertEquals(team.getWins(),81);
		assertEquals(team.getLosses(),115);
		assertEquals(team.getTies(),0);
		assertEquals(team.getMostPoints(),43);
		assertEquals((int)team.getWinPercentage(),41);
		
	}
	
	@Test
	public void testSEATeamStatistics()
	{
		
		input2 = new Scanner("SEA");
		team = new TeamHistory(input2, statistics);
		assertEquals(team.getWins(),305);
		assertEquals(team.getLosses(),315);
		assertEquals(team.getTies(),0);
		assertEquals(team.getMostPoints(),58);
		assertEquals((int)team.getWinPercentage(),49);
		
	}
	
	@Test
	public void testJACTeamStatistics()
	{
		
		input2 = new Scanner("JAC");
		team = new TeamHistory(input2, statistics);
		assertEquals(team.getWins(),149);
		assertEquals(team.getLosses(),166);
		assertEquals(team.getTies(),0);
		assertEquals(team.getMostPoints(),62);
		assertEquals((int)team.getWinPercentage(),47);
		
	}
	
	@Test
	public void testBUFTeamStatistics()
	{
		
		input2 = new Scanner("BUF");
		team = new TeamHistory(input2, statistics);
		assertEquals(team.getWins(),323);
		assertEquals(team.getLosses(),380);
		assertEquals(team.getTies(),2);
		assertEquals(team.getMostPoints(),40);
		assertEquals((int)team.getWinPercentage(),45);
		
	}


}
