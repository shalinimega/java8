package example1;

import java.util.Scanner;

public class Asciivalue {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		int sum=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'|| name.charAt(i)=='o'|| name.charAt(i)=='u'|| name.charAt(i)=='i')
			{
				sum=sum+(name.charAt(i));
				System.out.println(sum);
			}
		}
		System.out.println(sum);
		
	}

}
