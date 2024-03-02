package Exp1;

public class Numberformatt {
	public static void main(String[] args)
	{
		String name="name";
		try
		{
			int c=Integer.parseInt(name);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());	}
	}

}
