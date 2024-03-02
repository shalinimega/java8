package Interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicatestream {
	public static void main(String[] args)
	{
		List<Integer> nums=Arrays.asList(10,20,20,30);
		Set<Integer> name=new HashSet<>();
		Set<Integer> dupli=nums.stream()
                .filter(x -> !name.add(x))
                .collect(Collectors.toSet());
		System.out.println(dupli);
		
		
		Employee e1=new Employee(01,"shalini","javadeveloper");
		Employee e2=new Employee(02,"arul","testing");
		Employee e3=new Employee(03,"hari","javadeveloper");
		
		List<Employee> names=new ArrayList<>();
		names.add(e1);
		names.add(e2);
		names.add(e3);
		
		List<Employee> nn=names.stream().filter(x->x.getDesg().equals("javadeveloper")).peek(x->x.setSalary(x.getSalary()+x.getSalary()*10/100)).collect(Collectors.toList());
		System.out.println(nn);
		List<Employee> nums=names.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).limit(1).collect(Collectors.toList());
		System.out.println(nums);
		List<Employee> num=names.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).limit(2).collect(Collectors.toList());
		System.out.println(num);
		
		List<Character> nam=Arrays.asList('a','b','c','a','p');
	    long mm=nam.stream().count();
	    System.out.println(mm);
		
	    
	    List<String> nn=Arrays.asList("shalini");
		long jj=nn.stream().sorted(Comparator.comparingInt(String::length)).mapToInt(String::length).sum();
	    System.out.println(jj);
	    
	
		String name="shalini";
		int[] nums=new int[256];
		for(int i=0;i<name.length();i++)
		{
			nums[name.charAt(i)]++;
		}
		for(int j=0;j<nums.length;j++)
		{           if(nums[j]!=0)
           {
        	   System.out.println((char)j+"-"+nums[j]);
           }
		}
		//duplicatecount
		String n="shaliniarul";
		int[] num1=new int[256];
		for(int i=0;i<n.length();i++)
		{
			num1[n.charAt(i)]++;
	}
		for(int j=0;j<num1.length;j++)
		{
			if(num1[j]>=2 && num1[j]!=0)
			{
				System.out.println((char)j+"-"+num1[j]);
			}
		}
		List<Integer> nums=new ArrayList<>();		nums.add(67);
		nums.add(90);
		nums.add(66);
		nums.add(67);
		
		List<Integer> na=nums.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(na);
		
		List<String> names=new ArrayList<>();
		names.add("shalini");
		names.add("arul");		names.add("mega");
		names.add("hari");
		
		List<String> aa= names.stream().sorted(Comparator.comparingInt(String::length)).
		System.out.println(aa);
         
		String str = "ABCDFCBBA";

       
		
		
		

	    
		
		
	}

}
