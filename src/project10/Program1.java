package project10;

import java.io.File;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] atgs)
	{
		//FileReader f2=new FileReader("\\C:\\Users\\MEGANATHAN\\Downloads\\hello welcome.txt\\");
		//System.out.println("Hello word");

		try
		{
			File f1=new File("\\C:\\Users\\MEGANATHAN\\Downloads\\hello welcome.txt\\");
		    Scanner r=new Scanner(f1);
		    while(r.hasNextLine())
		    {
		    	System.out.println(r.nextLine());
		    }
		}
		catch(Exception e)
		{
			System.out.println(e);

		}

	}

}
