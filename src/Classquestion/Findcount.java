package Classquestion;

import java.util.Arrays;
import java.util.List;

public class Findcount {
	public static void main(String[] args)
	{
		List<Integer> name= Arrays.asList(4,4,5,3);
		for(int i=0;i<name.size();i++)
		{
			int sum=0;
			boolean is=false;
			for(int j=i+1;j<name.size();j++)
			{
				if(name.get(i)==name.get(j))
				{
					sum=name.get(i)+name.get(i);
					is=true;
				}
			}
			if(is)

				{System.out.println(name.get(i)+","+sum);}
		}
	}

}
