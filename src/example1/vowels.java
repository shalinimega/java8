package example1;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'|| name.charAt(i)=='e'|| name.charAt(i)=='i' || name.charAt(i)=='o'|| name.charAt(i)=='u')
			{
				count=count+1;
			}
		}
		if(count>=1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
