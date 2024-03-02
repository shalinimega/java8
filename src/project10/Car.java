package project10;

public class Car {
	private String brand;
	private int price;
	Engine engine;
	public void Brand(String brand)
	{
		this.brand=brand;
	}
	public String Brand()
	{
		return brand;
	}
	public void Price(int price)
	{
		this.price=price;
	}
	public int Price()
	{
		return price;
	}
	public Car(String brand,int price,Engine engine)
	{
		this.brand=brand;
		this.price=price;
		this.engine=engine;
	}
	public String toString()
	{
		return brand+","+price;
	}

}
