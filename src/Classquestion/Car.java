package Classquestion;

public class Car {
	private int id;
	private String brand;
	private int price;
	private Eninge eg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public Car(Eninge eg) {
		super();
		this.eg = eg;
	}
	public Eninge getEg() {
		return eg;
	}
	public void setEg(Eninge eg) {
		this.eg = eg;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public Car(int id, String brand, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

}
