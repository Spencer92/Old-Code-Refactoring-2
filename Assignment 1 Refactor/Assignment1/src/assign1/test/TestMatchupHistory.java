package assign1.test;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import assign1.code.*;
import static org.junit.Assert.*;

public class TestMatchupHistory 
{
	Statistics statistics;
	MatchupHistory history;
	Scanner input1;
	Scanner input2;
	Scanner input3;
	
	public TestMatchupHistory()
	{
		statistics = new Statistics();
		statistics.process();
	}
	
	@Test
	public void testNOVSHOUmatchupHistory()
	{
		input1 = new Scanner("NO");
		input2 = new Scanner("HOU");
		history = new MatchupHistory("NO",
				"HOU", statistics.getTotalLines(), 
				statistics.getHomeScore(), statistics.getAwayScore(),
				statistics.getHome(),
				statistics.getAway(), statistics.getYear(),
				statistics.getWeek());
		history.showMatchupHistory(statistics, input1, input2, null, null);
		String[] teamOne = history.getTeamDisplayOne();
		String[] teamTwo = history.getTeamDisplayTwo();
		
		assertArrayEquals(new String[]{
				"2003 2\t  HOU  10 \t  NO \t31",
		"2011 3\t  HOU  33 \t  NO \t40"	},teamOne);
		
		assertArrayEquals(new String[]{
				"2007 11\t  NO  10 \t  HOU \t23"},teamTwo);
		
		
	}
	
	@Test
	public void testHOUVSSEAmatchupHistory()
	{
		input1 = new Scanner("HOU");
		input2 = new Scanner("SEA");
		history = new MatchupHistory("HOU",
				"SEA", statistics.getTotalLines(), 
				statistics.getHomeScore(), statistics.getAwayScore(),
				statistics.getHome(),
				statistics.getAway(), statistics.getYear(),
				statistics.getWeek());
//		MatchupHistory history = userInput.getMatchupHistoryRaw();
		String[] teamOne = history.getTeamDisplayOne();
		String[] teamTwo = history.getTeamDisplayTwo();
		
		assertArrayEquals(new String[]{
				"2009 14\t  SEA  7 \t  HOU \t34",
		"2013 4\t  SEA  23 \t  HOU \t20"},teamOne);
		


		assertArrayEquals(new String[]{
		"2005 6	  HOU  10 	  SEA 	42"},teamTwo);
		
		
	}

	
	@Test
	public void testSEAVSJACmatchupHistory()
	{
		input1 = new Scanner("SEA");
		input2 = new Scanner("JAC");
		history = new MatchupHistory("SEA",
				"JAC", statistics.getTotalLines(), 
				statistics.getHomeScore(), statistics.getAwayScore(),
				statistics.getHome(),
				statistics.getAway(), statistics.getYear(),
				statistics.getWeek());
		String[] teamOne = history.getTeamDisplayOne();
		String[] teamTwo = history.getTeamDisplayTwo();
		
		assertArrayEquals(new String[]{
				"2001 4	  JAC  15 	  SEA 	24",
		"2009 5	  JAC  0 	  SEA 	41",
		"2013 3	  JAC  17 	  SEA 	45"},teamOne);
		
		assertArrayEquals(new String[]{
				"1995 11	  SEA  47 	  JAC 	30",
				"1996 16	  SEA  13 	  JAC 	20",
				"2000 11	  SEA  28 	  JAC 	21",
				"2005 1	  SEA  14 	  JAC 	26",},teamTwo);
		
		
	}
	
	@Test
	public void testJACVSBUFmatchupHistory()
	{
		input1 = new Scanner("JAC");
		input2 = new Scanner("BUF");
		history = new MatchupHistory("JAC",
				"BUF", statistics.getTotalLines(), 
				statistics.getHomeScore(), statistics.getAwayScore(),
				statistics.getHome(),
				statistics.getAway(), statistics.getYear(),
				statistics.getWeek());
		String[] teamOne = history.getTeamDisplayOne();
		String[] teamTwo = history.getTeamDisplayTwo();
		
		assertArrayEquals(new String[]{
				"2001 6	  BUF  13 	  JAC 	10",
		"2003 2	  BUF  38 	  JAC 	17",
		"2007 12	  BUF  14 	  JAC 	36",
		"2008 2	  BUF  20 	  JAC 	16",
		"2009 11	  BUF  15 	  JAC 	18",
		"2013 15	  BUF  27 	  JAC 	20"},teamOne);
		
		assertArrayEquals(new String[]{
				"1996 WildCard	  JAC  30 	  BUF 	27",
				"1997 16	  JAC  20 	  BUF 	14",
				"1998 7	  JAC  16 	  BUF 	17",
				"2004 1	  JAC  13 	  BUF 	10",
				"2006 12	  JAC  24 	  BUF 	27",
				"2010 5	  JAC  36 	  BUF 	26",
				"2012 13	  JAC  18 	  BUF 	34"},teamTwo);
		
		
	}
	
}
