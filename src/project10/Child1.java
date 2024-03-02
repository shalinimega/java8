package project10;

public class Child1 extends Parent{
	String brand;
	public Child1(String name,int price,String brand)
	{
		super(name,price);
		this.brand=brand;
	}
	public String toString()
	{
		return super.toString()+","+brand;
	}

}
