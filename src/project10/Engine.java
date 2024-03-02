package project10;

public class Engine {
	private String type;
	private String battery;
	
	public void Type(String type)
	{
		this.type=type;
	}
	public String Type()
	{
		return type;
	}
	public void Battery(String battery)
	{
		this.battery=battery;
	}
	public String Battery()
	{
		return battery;
	}
	public Engine(String type,String battery)
	{
		this.type=type;
		this.battery=battery;
	}
	public String toString()

	{
		return type+","+battery;
	}
}
