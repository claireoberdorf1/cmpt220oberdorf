package lab10;

public class Toaster extends Appliance {
	private String capacity;
	private String brand;
	private String material;
	
	public Toaster(String capacity, String brand, String material, double voltage, 
			String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		this.capacity = capacity;
		this.brand = brand;
		this.material = material;
	}
	
	Toaster(){
		super(0, "None", "None", 0);
	}

	public String getCapacity() {
		return capacity; 
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getMaterial() {
		return material;
	}
	

	@Override
	public String toString() {
		return "The toaster capacity: " + capacity + ", brand: " + brand + ", material: " + material + ", price: " + getPrice();
	}
	
}

