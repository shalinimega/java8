package Classquestion;

public class Fabi {
	public static void main(String[] args)
	{
		int a=0,b=1,c=0;
		for(int i=0;i<=5;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}
