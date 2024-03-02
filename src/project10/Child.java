package project10;

public class Child extends Single{
	String brand;
	public Child(String name,int price,String brand)
	{
		super(name,price);
		this.brand=brand;
	}
	public String toString()
	{
		return super.toString()+brand;
	}

}
