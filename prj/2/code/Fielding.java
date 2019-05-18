package finalProject;

public class Fielding {
	private int assists;
	private int errors;
	private int putOuts;
	private double fieldingPercentage;
	private int inningsPlayed;
	private int totalChances;

	Fielding(){
		
	}
	
	Fielding(int newAssists, int errors, int newPutOuts, double newFieldingPercentage, int newInningsPlayed, int newTotalChances){
		this.assists = newAssists;
		this.errors = errors;
		this.putOuts = newPutOuts;
		this.fieldingPercentage = newFieldingPercentage;
		this.inningsPlayed = newInningsPlayed;
		this.totalChances = newTotalChances;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	public int getErrors() {
		return errors;
	}

	public void setErrors(int errors) {
		this.errors = errors;
	}

	public int getPutOuts() {
		return putOuts;
	}

	public void setPutOuts(int putOuts) {
		this.putOuts = putOuts;
	}

	public double getFieldingPercentage() {
		return fieldingPercentage;
	}

	public void setFieldingPercentage(double fieldingPercentage) {
		this.fieldingPercentage = fieldingPercentage;
	}

	public int getInningsPlayed() {
		return inningsPlayed;
	}

	public void setInningsPlayed(int inningsPlayed) {
		this.inningsPlayed = inningsPlayed;
	}

	public int getTotalChances() {
		return totalChances;
	}

	public void setTotalChances(int totalChances) {
		this.totalChances = totalChances;
	}

	@Override
	public String toString() {
		return "Fielding [assists=" + assists + ", putOuts=" + putOuts + ", fieldingPercentage=" + fieldingPercentage
				+ ", inningsPlayed=" + inningsPlayed + ", totalChances=" + totalChances + "]";
	}
	
	
}
