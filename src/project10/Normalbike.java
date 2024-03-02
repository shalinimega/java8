package project10;

public class Normalbike implements Bike {
	public String mileage(int mileage)
	{
		if(mileage>89)
		{
			return "bad";
		}
		else
		{
			return "hello";
		}
	}

}
