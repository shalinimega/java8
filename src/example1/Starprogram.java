package example1;

import java.util.Scanner;

public class Starprogram {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		String name1="";
		if(name.length()%2==0)
		{
			int mod=name.length()/2;
			name1=name.substring(0,mod-1)+"**"+name.substring(mod);		
		}
		else
		{
			int mod=name.length()/2;
			name1=name.substring(0,mod)+"*"+name.substring(mod+1);
		}
		System.out.println(name1);
	}

}
