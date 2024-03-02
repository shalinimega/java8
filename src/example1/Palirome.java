package example1;

import java.util.Scanner;

public class Palirome {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		//String name1=input.nextLine();
		StringBuilder le=new StringBuilder(name);
		String name1=le.reverse().toString();
		if(name.equals(name1))
		{
			System.out.println("palirome");

		}
		else
		{
			System.out.println("palirome not");

		}
		
	}

}
