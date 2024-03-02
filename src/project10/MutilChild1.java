package project10;

public class MutilChild1 extends Mutiple {
	String brand;
	public MutilChild1(String name,int price,String brand)
	{
		super(name,price);
		this.brand=brand;	
	}
	public String toString()
	{
		return super.toString()+","+brand;
	}

}
