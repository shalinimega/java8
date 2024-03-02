package Interiew2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Duplicate {
	public static void main(String[] args)
	{
		//1. Write a program using Stream. List <Integer>nums. Arrays astist (10,20,20,20); find out the 
		//duplicate value
		List<Integer> nums=Arrays.asList(10,20,20,30,30,78,90);
		List<Integer> names=nums.stream()
				            .filter(x->nums.indexOf(x)!=nums.lastIndexOf(x))
				            .distinct().collect(Collectors.toList());
		names.forEach(x->System.out.println(x));
		
		System.out.println("11111______________________________________________________");
		
		
		// Write a program to count each character using stream and loop
		String str="shalini";
		Map<Character, Long> cha= str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(ii->ii, Collectors.counting()));
		cha.forEach((x,y)->System.out.println(x+"-"+y));
		
		System.out.println("22222______________________________________________________");
		
		
		//6. Write a program to find non-duplicate 1st character using stream & lorp
		//String str1="shalini";
		String str4="shalini";
		Map<Character,Long> without=str4.chars().mapToObj(pp->(char) pp).collect(Collectors.groupingBy(oo->oo,Collectors.counting()));
		char c= '\0';
		without.forEach((t,y)->
		{

			if(y<=1)
			{
				System.out.println(t+"-"+y);

			}
			//System.out.println(c);
		});
		
		System.out.println("3333_________________________________________________________");
		
		
		//15. String Using stroam a- "Nishanthi". Find duplicate
		String str3 = "shalini";
        char[] cc = str3.toCharArray();
        Map<Character, Long> charCounts =new String(cc). chars()
                .mapToObj(b->(char) b) 
                .collect(Collectors.groupingBy(b -> b, Collectors.counting()));
        
        charCounts.forEach((character, count) ->
        {
                if(count>=2)
                {
                	System.out.println(character+"-"+count);
                }

	   });
        System.out.println("_44444__________________________________________________________");
        
        
       //7. List<Integer> li' = Ararys.aslist (10,20,30,6,7,8,9); find the Even number using stream.8. String a = 
       // "capgemini@1238"; Op⇒ @& using stream.
        List<Integer>numbers=Arrays.asList(10,20,30,6,7,8,9);
        int  sum1=numbers.stream().filter(x->x%2==0).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum1);
        System.out.println("55555____________________________________________________________________");
        
        String str5="capgemini@!1238";
        List<Character> special=str5.chars().mapToObj(x->(char) x)
        		                 .filter(ch -> !Character.isLetterOrDigit(ch))
                                  .collect(Collectors.toList());
        System.out.println(special);
        System.out.println("_6666___________________________________________________________________________");
        
        
        //6. Write a program to find non-duplicate 1st character using stream & lorp
        String ra="shalini";
        List<Character> yy=ra.chars().mapToObj(y->(char)y).distinct().limit(1).collect(Collectors.toList());
        System.out.println(yy);
        System.out.println("_777777_______________________________________________________________________________");
        
        
       // 9. String a= "Capgeminii", Using stream find overall character comand repeated count 
        String str6="shaliniarul";
        Map<Character,Long> gg=str6.chars().mapToObj(f->(char)f).collect(Collectors.groupingBy(f->f,Collectors.counting()));
        gg.forEach((dd,ss)->{
        	if(ss>=2)
        	{
        		System.out.println(dd+"-"+ss);
        	}
        });
        System.out.println("888888________________________________________________________________________________");
        
        
        //13. In string remove one particular character using stream
        String str7="dharshinesh";
        char x='h';
        /*String result=str7.replace(String.valueOf(x),"");*/
        String result = str7.chars()
                .filter(p -> p != x) // Filter out the character 'h'
                .mapToObj(p -> String.valueOf((char) p))
                .collect(Collectors.joining());
        System.out.println(result);
        System.out.println("99999____________________________________________________________________________________");
        

        //10 Stream(), parrelstream(), frequency, counting.
        List<String> fuirts=Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "mango");
        fuirts.stream().forEach(System.out::println);
        fuirts.parallelStream().forEach(System.out::println);
        
        Map<String,Long>fuir=fuirts.stream().collect(Collectors.groupingBy(z->z,Collectors.counting()));
        System.out.println(fuir);
        
       System.out.println("101010101____________________________________________________________________________________");
       
       //20 List<Integer) a: Affray: astist (.~~); Find the total of ever nums. and Odd nums Separtely. separtel
       List<Integer> val=Arrays.asList(45,67,23,12,56,88,90);
       int sum2=val.stream().filter(z->z%2==0).collect(Collectors.summingInt(Integer::intValue));
       int sum3=val.stream().filter(y->y%2!=0).collect(Collectors.summingInt(Integer::intValue)); 
       System.out.println(sum2);
       System.out.println(sum3);
       System.out.println("11111111_____________________________________________________________________________________");
       
       
       //19. Program to find the string length in given String array { "Nisha", "Kumal", "Karthi " }; using 
       List<String>arr=Arrays.asList("shalini","arulraji","mega","hari");
       List<Integer>n=arr.stream().map(String::length).collect(Collectors.toList());
       System.out.println(n);
       System.out.println("121212_______________________________________________________________________________________");
       
       
       //18. int [] a = {2,2,4,4,6,6,8,7,103; remove duplicate only and return array[] you can do using stream.
       List<Integer> a=Arrays.asList(2,2,4,4,6,6,8,7,103);
       Map<Integer,Long>kk=a.stream().collect(Collectors.groupingBy(q->q,Collectors.counting()));
       kk.forEach((p,z)->{
    	   if(z==1)
    	   {
    		   System.out.println(p+"-"+z);
    	   }
       });
       System.out.println("131313__________________________________________________________________________________________");
       
       //16. Using stream show me the no. of emp from a particular department.
       Employee e=new Employee(1,"shalini",30000,"csi",34);
       Employee e1=new Employee(2,"arul",45000,"it",56);
       Employee e2=new Employee(3,"hari",50000,"cilvi",23);
       Employee e3=new Employee(14,"mega",28000,"if",67);
       List<Employee>emps=Arrays.asList(e,e1,e2,e3);
       List<Employee> m=emps.stream().filter(xx->xx.getDept().equals("it")).collect(Collectors.toList());
       System.out.println(m);
       System.out.println("141414____________________________________________________________________________________________");
       
       
       //17. Collection of emp in single stream. Salary> 25000, sort in desc age, sort in dese name and find 
       //first record. (This a condition in single stream)
       List<String> epsm = emps.stream()
               .filter(ee -> ee.getSalary() > 25000)
               .sorted(Comparator.comparingInt(Employee::getSalary).reversed()
                                 .thenComparingInt(Employee::getAge).reversed())
               .map(Employee::getName)
               .sorted(Comparator.reverseOrder())
               .limit(1)
               .collect(Collectors.toList());
            
       System.out.println(epsm);
       System.out.println("151515______________________________________________________________________________________________");
       //2. In Employee details write a program to give hike for java developer using stream.
       
       List<Employee>jj=emps.stream().filter(a1->a1.getDept().equals("it")).peek(l->l.setSalary(l.getSalary()+l.getSalary()*23/100))
    		            .collect(Collectors.toList());
       System.out.println(jj);
       System.out.println("161616__________________________________________________________________________________________");
       
       //3. Find second max using stream, foloop and query
       List<Employee>dd=emps.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).skip(1).limit(1)
    		            .collect(Collectors.toList());
       
       System.out.println(dd);
       System.out.println("171717______________________________________________________________________________________");
      // 4. Third max using stream
       List<Employee>d=emps.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).skip(2).limit(1)
	            .collect(Collectors.toList());
       
       System.out.println(d);
       System.out.println("1818181__________________________________________________________________________________");
       //12. Single stream with 4 condition.
       List<Employee> People = emps.stream()
               .filter(person -> person.getAge() > 18)
               .filter(person -> person.getName().equals("arul"))
               .filter(person -> person.getSalary() > 50000)
               .collect(Collectors.toList());
       
       System.out.println(People);
       System.out.println("1919191_____________________________________________________________________________________");
       //14. Fibonacci series using stream.Eye

       
       List<Employee> ma=emps.stream().collect(Collectors.toList());
       ma.forEach(x1->System.out.println(x1));
       
       Map<Integer,Employee> maps=emps.stream().collect(Collectors.toMap(Employee::getId,ee->ee));
       maps.forEach((xx,y)->System.out.println(xx+","+y));
       
       Set<Employee>sets=emps.stream().collect(Collectors.toSet());
       sets.forEach(rr->System.out.println(rr));
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        


}
}
