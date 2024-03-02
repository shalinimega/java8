package Classquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class adding {
	public static void main(String[] args)
	{
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8);
		String  n=num.stream().map(x->(5-x)+""+x).collect(Collectors.joining(" "));
		System.out.println(n);
		
		
	}

}
