package lab10;

public class TV extends Appliance {
	private String screenSize;
	private String brand;
	private String colorRange;
		
	public TV(String screenSize, String brand, String colorRange, double voltage, 
			String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		this.screenSize = screenSize;
		this.brand = brand;
		this.colorRange = colorRange;
	}
	
	TV(){
		super(0, "None", "None", 0);
	}

	public String getScreenSize() {
		return screenSize; 
	}
	
	public String getBrand() {
		return brand;
	}

	public String getColorRange() {
		return colorRange;
	}
	
	@Override
	public String toString() {
		return "The TV screen size: " + screenSize + ", brand: " + brand + ", color range: " + colorRange + ", price " + getPrice();
	}
	
}

