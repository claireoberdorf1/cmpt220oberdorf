package finalProject;

public class Pitching {
	private int baseOnBalls;
	private int completeGames;
	private int earnedRuns; 
	private double earnedRunAverage;
	private double inningsPitched;
	private int losses;
	private double opponentBattingAverage;
	private int strikeOuts;
	private int saveOpportunites;
	private int wins;
	private int hitsAgainst;
	
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

	public int getBaseOnBalls() {
		return baseOnBalls;
	}

	public void setBaseOnBalls(int baseOnBalls) {
		this.baseOnBalls = baseOnBalls;
	}

	public int getCompleteGames() {
		return completeGames;
	}

	public void setCompleteGames(int completeGames) {
		this.completeGames = completeGames;
	}

	public int getEarnedRuns() {
		return earnedRuns;
	}

	public void setEarnedRuns(int earnedRuns) {
		this.earnedRuns = earnedRuns;
	}

	public double getEarnedRunAverage() {
		return earnedRunAverage;
	}

	public void setEarnedRunAverage(double earnedRunAverage) {
		this.earnedRunAverage = earnedRunAverage;
	}

	public double getInningsPitched() {
		return inningsPitched;
	}

	public void setInningsPitched(double inningsPitched) {
		this.inningsPitched = inningsPitched;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public double getOpponentBattingAverage() {
		return opponentBattingAverage;
	}

	public void setOpponentBattingAverage(double opponentBattingAverage) {
		this.opponentBattingAverage = opponentBattingAverage;
	}

	public int getStrikeOuts() {
		return strikeOuts;
	}

	public void setStrikeOuts(int strikeOuts) {
		this.strikeOuts = strikeOuts;
	}

	public int getSaveOpportunites() {
		return saveOpportunites;
	}

	public void setSaveOpportunites(int saveOpportunites) {
		this.saveOpportunites = saveOpportunites;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getHitsAgainst() {
		return hitsAgainst;
	}

	public void setHitsAgainst(int hitsAgainst) {
		this.hitsAgainst = hitsAgainst;
	}

	@Override
	public String toString() {
		return "Pitching [baseOnBalls=" + baseOnBalls + ", completeGames=" + completeGames + ", earnedRuns="
				+ earnedRuns + ", earnedRunAverage=" + earnedRunAverage + ", inningsPitched=" + inningsPitched
				+ ", losses=" + losses + ", opponentBattingAverage=" + opponentBattingAverage + ", strikeOuts="
				+ strikeOuts + ", saveOpportunites=" + saveOpportunites + ", wins=" + wins + ", hitsAgainst="
				+ hitsAgainst + "]";
	}
	
	
}
