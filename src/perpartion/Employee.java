package perpartion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Employee {
	public static void main(String[] args)
	{
		List<Integer> nums=new CopyOnWriteArrayList<>();
		nums.add(66);
		nums.add(77);
		nums.add(23);
		nums.add(45);
		
		for(Integer x: nums)
		{
			nums.remove(23);
		}
		System.out.println(nums);
		
		
	}

}
