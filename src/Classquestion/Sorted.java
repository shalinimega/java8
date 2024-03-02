package Classquestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
	public static void main(String[] args)
	{
		List<Integer> nums=Arrays.asList(0,1,1,0,1,2,2,0);
		List<Integer> name=nums.stream().sorted(Comparator.comparingInt(Integer::intValue)).collect(Collectors.toList());
		System.out.println(name);
		
		
		
		
	}

}
