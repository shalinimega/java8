package perpartion;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)
	{
		Scanner name =new Scanner(System.in);
		String name1=name.nextLine();
		//System.out.println("Enter the name:")
		for(int i=name1.length()-1;i>=0;i--)
		{
			System.out.print(name1.charAt(i));
		}
		
	}

}

