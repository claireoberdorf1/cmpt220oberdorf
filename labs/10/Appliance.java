package lab10;

public abstract class Appliance implements Comparable<Appliance> {
	private double voltage;
	private String color;
	private String madeIn;
	private double price;
	
	Appliance(double voltage, String color, String madeIn, double price){
		super();
		this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}

	public double getVoltage() {
		return voltage;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMadeIn() {
		return madeIn;
	}
	
	public double getPrice() {
		return price;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Appliance arg0) {
		if (this.getPrice() < arg0.getPrice())
			return -1;
		else if (this.getPrice() > arg0.getPrice())
			return 1;
		else
			return 0;
	}
	
	@Override 
	public String toString() {
		return "Appliance voltage: " + voltage + " color: " + color + " made in: " + madeIn + " price: " + price;
	}
	
}
