package assign1.test;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import assign1.code.*;


public class TestTeamHistory 
{
	Statistics statistics;
	UserInput userInput = new UserInput();
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
		userInput.getTeamHistory(statistics, input2, null);
		TeamHistory team = userInput.getTeamHistoryRaw();
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
		userInput.getTeamHistory(statistics, input2, null);
		TeamHistory team = userInput.getTeamHistoryRaw();
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
		userInput.getTeamHistory(statistics, input2, null);
		TeamHistory team = userInput.getTeamHistoryRaw();
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
		userInput.getTeamHistory(statistics, input2, null);
		TeamHistory team = userInput.getTeamHistoryRaw();
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
		userInput.getTeamHistory(statistics, input2, null);
		TeamHistory team = userInput.getTeamHistoryRaw();
		assertEquals(team.getWins(),323);
		assertEquals(team.getLosses(),380);
		assertEquals(team.getTies(),2);
		assertEquals(team.getMostPoints(),40);
		assertEquals((int)team.getWinPercentage(),45);
		
	}


}
