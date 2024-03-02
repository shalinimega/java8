package project10;

public class Vechical {
	String brand;
	@Override
	public String toString() {
		return brand+","+Mileage;
	}
	public Vechical(String brand, int mileage) {
		super();
		this.brand = brand;
		Mileage = mileage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	int Mileage;

}
