package example1;

import java.util.Scanner;

public class Funtionproigram {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		Funtionproigram obj=new Funtionproigram();
		obj.add(name);
	}
		 void add(String name)
		{
			System.out.println(name+name);
		}
	}


