package example1;

import java.util.Scanner;

public class Aritcel {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		StringBuilder name1=new StringBuilder();
		String[] names= {"a","an","the"};
		for(int i=0;i<=name.length();i++)
		{
			if(name.equals(names))
			{
				name1.append(name.charAt(i));
			}
		}
		System.out.println(name1);
	}

}
