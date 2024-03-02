package Classquestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stlength {
	public static void main(String[] args)
	{
		/*List<String> names=Arrays.asList("a","c","m","z","b");
		List<String> name=names.stream().sorted(Comparator.comparing(String::valueOf)).collect(Collectors.toList());
		System.out.println(name);*/
		List<String> nn=Arrays.asList("shalini","arul","mega","regina");
		//List<String> m=nn.stream().sorted(Comparator.comparing(String::valueOf)).collect(Collectors.toList());
		//System.out.println(m);
		
		
		List<String> bb=nn.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		System.out.println(bb);
		
		
		
	}

}
