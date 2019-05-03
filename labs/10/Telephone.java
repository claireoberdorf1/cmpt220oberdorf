package lab10;

public class Telephone extends Appliance {
	private String cellProvider;
	private String brand;
	private String storage;
	
	public Telephone(String cellProvider, String brand, String storage, double voltage, 
			String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		this.cellProvider = cellProvider;
		this.brand = brand;
		this.storage = storage;
	}
	
	Telephone(){
		super(0, "None", "None", 0);
	}

	public String getCellService() {
		return cellProvider; 
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getStorage() {
		return storage;
	}
	


	@Override
	public String toString() {
		return "The telephone provider: " + cellProvider + ", brand: " + brand + ", storage: " + storage + ", price: " + getPrice();
	}
	
}


