package project10;

public class Program2 {
	private String name;
	private int price;
	
	public void  Name(String name)
	{
		this.name=name;
	}
	public String Name()
	{
		return name;
	}
	public void Price(int price)
	{
		this.price=price;
	}
	public int price()
	{
		return price;
	}
	public Program2(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		return name+","+price;
	}

}
