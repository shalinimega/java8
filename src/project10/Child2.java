package project10;

public class Child2 extends Parent{
	int cost;
	public Child2(String name,int price,int cost)
	{
		super(name,price);
		this.cost=cost;
	}
	public String toString()
	{
		return super.toString()+","+cost;
	}

}
