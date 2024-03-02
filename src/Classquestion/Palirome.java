package Classquestion;

public class Palirome {
	public static void main(String[] args)
	{
		String name="mam";
		String names="";
		for(int i=name.length()-1;i>=0;i--)
		{
			names=names+name.charAt(i);
		}
		if(name.equals(names))
		{
			System.out.println("pali");
		}
		else
		{
			System.out.println("not");
		}
	}

}
