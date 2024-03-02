package example1;

import java.util.Arrays;
import java.util.Scanner;

public class Dictor {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		char[] c=name.toCharArray();
		Arrays.sort(c);
		String name1=new String(c);
		System.out.println(name1);
		
	}

}
