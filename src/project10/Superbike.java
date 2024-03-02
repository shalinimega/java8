package project10;

public class Superbike implements Bike{
	public String mileage(int meileage)
	{
		if(meileage>45)
		{
			return "goodcondition";
		}
		else
		{
			return "no";
		}
	}

}
