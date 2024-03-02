package example1;

public class Odd1 {
	public static void main(String[] args)
	{
		String name="shalini";
		String g="";
		String g1="";
		for(int i=0;i<name.length();i++)
		{
			if(i%2==0)
			{
				g=g+name.charAt(i);
			}
			else
			{
				g1=g1+name.charAt(i);
			}
		}
		System.out.println(g+" "+g1);
	}

}
