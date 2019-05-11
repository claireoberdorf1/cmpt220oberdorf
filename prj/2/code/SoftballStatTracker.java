package finalProject;

import java.util.Date;

public class SoftballStatTracker {
	Date startTime;
	Date endTime;
	String location;
	String team;
	Player players[];
	Fielding fieldingStats[];
	Hitting hittingStats[];
	Pitching pitchingStats[];
	int playerCounter;
	
	
	SoftballStatTracker(){
		startTime = endTime = null;
		location = null;
		team = null;  
		players = new Player[20];
		fieldingStats = new Fielding[0];
		hittingStats = new Hitting[0];
		pitchingStats = new Pitching[0];
		playerCounter = 0;
		
		for (int i = 0; i < 9; i++) {
			players[i] = new Player();
		}
		
		for (int i = 0; i < 9; i++) {
			fieldingStats[i] = new Fielding();
		}
		
		for (int i = 0; i < 9; i++) {
			hittingStats[i] = new Hitting();
		}
		
		for (int i = 0; i < 9; i++) {
			pitchingStats[i] = new Pitching();
		}
	}
	
	SoftballStatTracker(Date startTime, Date endTime, String location) {
		this();
		
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location; 
	}
	
	public void addPlayer(Player player) {
		players[playerCounter++] = player;
	}
	
	Fielding(){
		
	}
	
	Fielding(int assists, int errors, int putOuts, double fieldingPercentage, int inningsPlayed, int totalChances) {
		this();
		
		this.assists = assists;
		this.errors = errors;
		this.putOuts = putOuts;
		this.fieldingPercentage = fieldingPercentage;
		this.inningsPlayed = inningsPlayed;
		this.totalChances = totalChances;
	}
	
	Hitting(){
		
	}
	
	Hitting(int atBat, double battingAverage, int baseOnBalls, int caughtStealing, int doubles, int hits, int hitByPitch, int homeRuns, double onBasePercentage,
			int plateAppearences, int runs, int runsBattedIn, int sacrifices, int stolenBases, int strikeOuts, int triples){
		this();
		
		this.atBat = newAtBat;
		this.battingAverage = newBattingAverage; 
		this.baseOnBalls = newBaseOnBalls;
		this.caughtStealing = newCaughtStealing;
		this.doubles = newDoubles;
		this.hits = newHits;
		this.hitByPitch = newHitByPitch;
		this.homeRuns = newHomeRuns;
		this.onBasePercentage = newOnBasePercentage;
		this.plateAppearences = newPlateAppearences;
		this.runs = newRuns;
		this.runsBattedIn = newRunsBattedIn;
		this.sacrifices = newSacrifices;
		this.stolenBases = newStolenBases;
		this.strikeOuts = newStrikeOuts;
		this.triples = newTriples;
		
	}
	
	Pitching(){
		
	}
	
	Pitching(int newBaseOnBalls, int newCompleteGames, int newEarnedRuns, double newEarnedRunAverage, 
			double newInningsPitched, int newLosses, double newOpponentBattingAverage, int newStrikeOuts, 
			int newSaveOpportunites, int newWins, int newHitsAgainst){
		this.baseOnBalls = newBaseOnBalls;
		this.completeGames = newCompleteGames;
		this.earnedRuns = newEarnedRuns;
		this.earnedRunAverage = newEarnedRunAverage;
		this.inningsPitched = newInningsPitched;
		this.losses = newLosses;
		this.opponentBattingAverage = newOpponentBattingAverage;
		this.strikeOuts = newStrikeOuts;
		this.saveOpportunites = newSaveOpportunites;
		this.wins = newWins;
		this.hitsAgainst = newHitsAgainst;
	}
	
}