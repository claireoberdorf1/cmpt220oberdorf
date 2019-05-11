package finalProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestSoftballStatTracker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//set constant variables
		String gameendTime = null;
		String gamelocation = null;
		String gamestartTime = null;
		
		
		SoftballStatTracker SST = new SoftballStatTracker(gameendTime, gamelocation, gamestartTime);
		Player newPlayer = new Player();
		
		//prompt user for start time
		System.out.println("Set Start Time: ");
		SST.startTime = scan.nextLine().toString();
		
		//prompt user for game location
		System.out.println("Set Game Location");
		SST.location = scan.nextLine().toString();
		System.out.println(SST.startTime + "   " + SST.location );
		 
		//have user enter starting lineup
		for (int i=1; i<10; i++) {

		String Player = "";
		System.out.println(" \n Add Player " + i + " (First, Last, Number, Position, Starter): ");
			Player = scan.nextLine();
		List<String> commaSeperated = new ArrayList<String>(Arrays.asList(Player.split(", ")));
		
		int Jersey = Integer.parseInt(commaSeperated.get(2));
		
		newPlayer.setFirstName(commaSeperated.get(0));
		newPlayer.setLastName(commaSeperated.get(1));
		newPlayer.setJerseyNumber(Jersey);
		newPlayer.setPosition(commaSeperated.get(3));
		newPlayer.setStarter(commaSeperated.get(4));
		
		//test output
		System.out.print(newPlayer.getFirstName() + " ");
		System.out.print(newPlayer.getLastName() + " ");
		System.out.print(newPlayer.getJerseyNumber() + " ");
		System.out.print(newPlayer.getPosition() + " ");
		System.out.print(newPlayer.getStarter() + " ");
			
		}


		//Enter Pitcher
		System.out.println(" \n Enter Starting pitcher: ");
			Player = scan.nextLine();
		List<String> commaSeperated = new ArrayList<String>(Arrays.asList(Player.split(", ")));
		
		int Jersey = Integer.parseInt(commaSeperated.get(2));
		
		newPlayer.setFirstName(commaSeperated.get(0));
		newPlayer.setLastName(commaSeperated.get(1));
		newPlayer.setJerseyNumber(Jersey);
		newPlayer.setPosition(commaSeperated.get(3));
		newPlayer.setStarter(commaSeperated.get(4));
		
	//test output
		System.out.print(newPlayer.getFirstName() + " ");
		System.out.print(newPlayer.getLastName() + " ");
		System.out.print(newPlayer.getJerseyNumber() + " ");
		System.out.print(newPlayer.getPosition() + " ");
		System.out.print(newPlayer.getStarter() + " ");
			
		}

	//Fielding Stats
	Fielding fieldingStats[];
	int assists = 0;
	int putOuts= 0;
	double fieldingPercentage = 0;
	int inningsPlayed = 0;
	int totalChances = 0;
		
	Fielding field = new Fielding(assists, putOuts, fieldingPercentage, inningsPlayed, totalChances);
	Fielding newFielding = new Fielding();
	
	
	//Hitting Stats
	Hitting hittingStats[];
	 int atBat = 0;
	 double battingAverage = 0;
	 int baseOnBalls = 0;
	 int caughtStealing = 0;
	 int doubles = 0;
	 int hits = 0;
	 int hitByPitch = 0;
	 int homeRuns = 0;
	 double onBasePercentage = 0;
	 int plateAppearences = 0;
	 int runs = 0;
	 int runsBattedIn = 0;
	 int sacrifices = 0;
	 int stolenBases = 0;
	 int strikeOuts = 0;
	 int triples = 0;
	
	Hitting hit = new Hitting(atBat, battingAverage, baseOnBalls, caughtStealing, doubles, hits, hitByPitch, homeRuns, onBasePercentage,
		plateAppearences, runs, runsBattedIn, sacrifices, stolenBases, strikeOuts, triples);
	Hitting newHitting = new Hitting();
	 
	//Pitching Stats
	Pitching pitchingStats[];
		 int baseOnBalls2 = 0;
	   	 int completeGames = 0;
		 int earnedRuns = 0; 
		 double earnedRunAverage = 0;
		 double inningsPitched = 0;
		 int losses = 0;
		 double opponentBattingAverage = 0;
		 int strikeOuts2 = 0;
		 int saveOpportunites = 0;
		 int wins = 0;
		 int hitsAgainst = 0;
		 
	Pitching pitch = new Pitching(baseOnBalls2, completeGames, earnedRuns, earnedRunAverage, inningsPitched, losses, 
			opponentBattingAverage, strikeOuts2, saveOpportunites, wins, hitsAgainst);
	Pitching newPitching = new Pitching();
	
	}


	
	
