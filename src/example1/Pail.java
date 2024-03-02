package example1;

public class Pail {
	public static void main(String[] args)
	{
		String name="lappal";
		String cc="";
		for(int i=name.length()-1;i>=0;i--)
		{
			 cc=cc+name.charAt(i);
		}
			if(name.equals(cc))
			{
				System.out.println("palirome");
			}
			else
			{
				System.out.println("no");
			}
	}

}
