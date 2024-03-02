package example1;

import java.util.Scanner;

public class Digit {
	public static void main(String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		String n=input.nextLine();
		char[] m=n.toCharArray();
		int sum=0;
		StringBuilder nn=new StringBuilder();
		for(int i=0;i<m.length;i++)
		{
            if (Character.isDigit(m[i])) {

				sum=sum+Character.getNumericValue(m[i]);
			}
			else
			{
				nn.append(m[i]);
			}
		}
		System.out.println(nn.toString()+sum);
		
	}

}
