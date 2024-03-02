package Exp1;

public class Arra {
	public static void main(String[] args)
	{
		String name=null;
		try
		{
			String names=name.concat(name);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
