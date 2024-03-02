package example1;

import java.util.Scanner;

public class Isdigit {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		int sum=0;
		char[] string=name.toCharArray();
		for(int i=0;i<string.length;i++)
		{
			if(Character.isDigit(string[i])) {
				int x=Integer.parseInt(String.valueOf(string[i]));
				sum=sum+x;
			
				
			}
		} 
		System.out.println(sum);
		
		
	}

}
