package example1;

import java.util.Scanner;

public class Split {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int result=0;
		int temp=0;
		while(n!=0)
		{
			result=n%10;
			//result++;
			n=n/10;
		}
		for(int i=result;i>=0;i--)
		{
			System.out.println(i);
		}
	}

}
