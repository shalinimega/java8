package Exp1;

import java.io.FileReader;

public class FF {
	public static void main(String[] args)
	{
		File r=new File("c");
		FileReader mm=new FileReader(r);
		int temp=0;
		while((temp=mm.read())!=-1)
		{
			System.out.println((temp)(char));
		}
	}

}
