package perpartion;

import java.util.Hashtable;

public class SampleHashtable {
	public static void main(String[] args)
	{
		Hashtable<Integer,String> a=new Hashtable<>(10);
		a.put(101, "welcome");
		a.put(102, "thankyou");
		a.put(103, "hello");
		a.put(101, "bye");
		for(Integer x:a.keySet())
		{
			System.out.println(x+","+a.get(x)+","+x.hashCode());
		}
	}

}
