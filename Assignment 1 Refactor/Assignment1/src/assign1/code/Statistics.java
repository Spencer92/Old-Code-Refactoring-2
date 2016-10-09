// Name:       Spencer Maslen
// Email:      smasl811@mymru.ca
// Course:     COMP 2231
// Instructor: Jason Heard
// Due Date:   September 24, 2014
//
// Source File: Football.java
//
/***************************************************************************/
// Program Name: Statistics.java
//
//
// Purpose:     The purpose is to take the files showing
//				the match-up history of the entire American Football
//				league and store them into an array for easy retrieval and
//				calculation later
//				
//
/***************************************************************************/


package assign1.code;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Statistics 
{
	private int[] year;
	private String[] week;
	private String[] day;
	private String[] home;
	private int[] homeScore;
	private String[] away;
	private int[] awayScore;
	private String[] date;
	private String[] result;
	private int[] homeYard;
	private int[] awayYard;
	private int[] hometurn;
	private int[] awayturn;
	private int totalLines;
	private int totalFiles;
	private String[] allFiles;
	
	
//Class Name:   	process
//
//Purpose:          To take the history of the American Football League
//					and store them into a easily accessible format
//
//Input Arguments: 		none
//
//
//Method Notes:    		The class starts by finding out how many files there are in a folder
//						Once the amount is found out, files not related to the football files
//						are ignored
//
//						The total amount of matches over the years are then found out, 
//						and every part of the match is copied to the appropriate array
//						so further work can be done
//
//
//
//
	public void process()
	{
		int lineCounter;
		int fileCounter;
		File years;
		BufferedReader readFiles;
		String lineToProcess;
		String[] processedLine;
		int storeTo = 0;
		String[] processYear;
		int excessFiles = 5;
		int allFilesCounter;
		int processYearCounter;
		int maxNumFiles;
		int maxNumProcess;
		
		
		this.totalLines = 0;
		years = new File(".");
		processYear = years.list();
		allFiles = new String[processYear.length - excessFiles + 1];
		
		maxNumFiles = allFiles.length;
		maxNumProcess = processYear.length;
		allFilesCounter = 0;
		processYearCounter = 0;
		
		while(allFilesCounter < maxNumFiles && processYearCounter < maxNumProcess)
		{

			this.allFiles[allFilesCounter] = processYear[processYearCounter];
							
			
			if(!this.allFiles[allFilesCounter].equals(".settings")
					&& !this.allFiles[allFilesCounter].equals("bin")
					&& !this.allFiles[allFilesCounter].equals("src")
					&& !this.allFiles[allFilesCounter].equals(".classpath")
					&& !this.allFiles[allFilesCounter].equals(".project"))
			{
				allFilesCounter++;
				//Go to next instance in the array if the file is valid
			}

			processYearCounter++;
			
			
		}
		
		for(allFilesCounter = 0; allFilesCounter < maxNumFiles; allFilesCounter++)
		{
			
			try 
			{
				readFiles = new BufferedReader(new FileReader(this.allFiles[allFilesCounter]));
				while(readFiles.readLine() != null)
				{
					this.totalLines++;
				}
				//find out how many matches where played over the years
				
			} catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
		this.year = new int[this.totalLines];
		this.week = new String[this.totalLines];
		this.day = new String[this.totalLines];
		this.home = new String[this.totalLines];
		this.homeScore = new int[this.totalLines];
		this.away = new String[this.totalLines];
		this.awayScore = new int[this.totalLines];
		this.date = new String[this.totalLines];
		this.result = new String[this.totalLines];
		this.homeYard = new int[this.totalLines];
		this.awayYard = new int[this.totalLines];
		this.hometurn = new int[this.totalLines];
		this.awayturn = new int[this.totalLines];
		
		//once the amount of matches are found, apply the amount in
		//order to ensure all matches are brought in

		lineCounter = 0;

		for(fileCounter = 0; fileCounter < this.allFiles.length; fileCounter++)
		{
			try 
			{
				readFiles = new BufferedReader(new FileReader(this.allFiles[fileCounter]));
				lineToProcess = readFiles.readLine(); 
				//to ignore first line as the first line in the file as it
				//doesn't have useful information
				while((lineToProcess = readFiles.readLine()) != null)
				{
					processedLine = lineToProcess.split(",");
					this.year[lineCounter] = Integer.parseInt(processedLine[storeTo]);
					storeTo++;
					this.week[lineCounter] = processedLine[storeTo];
					storeTo++;
					this.day[lineCounter] = processedLine[storeTo];
					storeTo++;
					this.home[lineCounter] = processedLine[storeTo];
					storeTo++;
					this.homeScore[lineCounter] = Integer.parseInt(processedLine[storeTo]);
					storeTo++;
					this.away[lineCounter] = processedLine[storeTo];
					storeTo++;
					this.awayScore[lineCounter] = Integer.parseInt(processedLine[storeTo]);
					storeTo++;
					this.date[lineCounter] = processedLine[storeTo];
					storeTo++;
					this.result[lineCounter] = processedLine[storeTo];
					storeTo++;
					this.homeYard[lineCounter] = Integer.parseInt(processedLine[storeTo]);
					storeTo++;
					this.awayYard[lineCounter] = Integer.parseInt(processedLine[storeTo]);
					storeTo++;
					this.hometurn[lineCounter] = Integer.parseInt(processedLine[storeTo]);
					storeTo++;
					this.awayturn[lineCounter] = Integer.parseInt(processedLine[storeTo]);
					storeTo = 0;
					lineCounter++;
					//get the line, and store the appropriate value to the
					//appropriate function
				}
			} 
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
	
	
	//Getters and Setters
	
	public int[] getYear() {
		return year;
	}

	public String[] getWeek() {
		return week;
	}

	public String[] getDay() {
		return day;
	}

	public String[] getHome() {
		return home;
	}

	public int[] getHomeScore() {
		return homeScore;
	}

	public String[] getAway() {
		return away;
	}

	public int[] getAwayScore() {
		return awayScore;
	}

	public String[] getDate() {
		return date;
	}

	public String[] getResult() {
		return result;
	}

	public int[] getHomeYard() {
		return homeYard;
	}

	public int[] getAwayYard() {
		return awayYard;
	}

	public int[] getHometurn() {
		return hometurn;
	}

	public int[] getAwayturn() {
		return awayturn;
	}

	public int getTotalLines() {
		return totalLines;
	}

	
}
