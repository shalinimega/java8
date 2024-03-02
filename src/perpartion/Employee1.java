package perpartion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Employee1 {
	public static void main(String[] args)
	{
		Map<Integer,String>names=new ConcurrentHashMap();
		names.put(1, "hello");
		names.put(2, "arul");
		names.put(3, "hi");
		names.put(4, "welcome");
		
		for(Integer x: names.keySet())
		{
			names.put(5, "bye");
		}
		System.out.println(names);
		
	}

}
