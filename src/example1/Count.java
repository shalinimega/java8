package example1;

public class Count {
	public static void main(String[] atgs)
	{
		String name="mississipie";
		for(int i=0;i<name.length();i++)
		{
			int count=0;
			//char c=name.charAt(i);
			for(int j=0;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					count=count+1;
				}
			}
			if(count==1)
			{
				System.out.print(name.charAt(i));
			}
		}
		
	}

}
