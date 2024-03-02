package perpartion;

public class Mobile {
	 String brand;
	 int price;
     Battery bb;
	public Mobile(String brand,int price,Battery bb)
	{
		this.brand=brand;
		this.price=price;
		this.bb=bb;
	}
	public String toString()
	{
		return brand+","+price+","+bb;
	}

}
