package finalProject;

public class Hitting {
	private int atBat;
	private double battingAverage;
	private int baseOnBalls;
	private int caughtStealing;
	private int doubles;
	private int hits;
	private int hitByPitch;
	private int homeRuns;
	private double onBasePercentage;
	private int plateAppearences;
	private int runs;
	private int runsBattedIn;
	private int sacrifices;
	private int stolenBases;
	private int strikeOuts;
	private int triples;
	
	Hitting(){
		
	}
	
	Hitting(int newAtBat, double newBattingAverage, int newBaseOnBalls, int newCaughtStealing, int newDoubles, 
			int newHits, int newHitByPitch, int newHomeRuns, double newOnBasePercentage, int newPlateAppearences,
			int newRuns, int newRunsBattedIn, int newSacrifices, int newStolenBases, int newStrikeOuts, int newTriples){
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

	public int getAtBat() {
		return atBat;
	}

	public void setAtBat(int atBat) {
		this.atBat = atBat;
	}

	public double getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(double battingAverage) {
		this.battingAverage = battingAverage;
	}

	public int getBaseOnBalls() {
		return baseOnBalls;
	}

	public void setBaseOnBalls(int baseOnBalls) {
		this.baseOnBalls = baseOnBalls;
	}

	public int getCaughtStealing() {
		return caughtStealing;
	}

	public void setCaughtStealing(int caughtStealing) {
		this.caughtStealing = caughtStealing;
	}

	public int getDoubles() {
		return doubles;
	}

	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getHitByPitch() {
		return hitByPitch;
	}

	public void setHitByPitch(int hitByPitch) {
		this.hitByPitch = hitByPitch;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}

	public double getOnBasePercentage() {
		return onBasePercentage;
	}

	public void setOnBasePercentage(double onBasePercentage) {
		this.onBasePercentage = onBasePercentage;
	}

	public int getPlateAppearences() {
		return plateAppearences;
	}

	public void setPlateAppearences(int plateAppearences) {
		this.plateAppearences = plateAppearences;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getRunsBattedIn() {
		return runsBattedIn;
	}

	public void setRunsBattedIn(int runsBattedIn) {
		this.runsBattedIn = runsBattedIn;
	}

	public int getSacrifices() {
		return sacrifices;
	}

	public void setSacrifices(int sacrifices) {
		this.sacrifices = sacrifices;
	}

	public int getStolenBases() {
		return stolenBases;
	}

	public void setStolenBases(int stolenBases) {
		this.stolenBases = stolenBases;
	}

	public int getStrikeOuts() {
		return strikeOuts;
	}

	public void setStrikeOuts(int strikeOuts) {
		this.strikeOuts = strikeOuts;
	}

	public int getTriples() {
		return triples;
	}

	public void setTriples(int triples) {
		this.triples = triples;
	}

	@Override
	public String toString() {
		return "Hitting [atBat=" + atBat + ", battingAverage=" + battingAverage + ", baseOnBalls=" + baseOnBalls
				+ ", caughtStealing=" + caughtStealing + ", doubles=" + doubles + ", hits=" + hits + ", hitByPitch="
				+ hitByPitch + ", homeRuns=" + homeRuns + ", onBasePercentage=" + onBasePercentage
				+ ", plateAppearences=" + plateAppearences + ", runs=" + runs + ", runsBattedIn=" + runsBattedIn
				+ ", sacrifices=" + sacrifices + ", stolenBases=" + stolenBases + ", strikeOuts=" + strikeOuts
				+ ", triples=" + triples + "]";
	}
	
	
}
