package project10;

public class MutilChild2 extends MutilChild1{
	String battery;
	public MutilChild2(String name,int  price,String brand,String battery)
	{
		super(name,price,brand);
		this.battery=battery;
	}
	public String toString()
	{
		return super.toString()+","+battery;
	}

}
