package Lists1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args)
	{
		Employee e1=new Employee(01,"shalini",32,43000,"tirpuattur",3);
		Employee e2=new Employee(22,"arul",56,49000,"chennai",3);
		Employee e3=new Employee(33,"regina",40,55000,"vellore",6);
		Employee e4=new Employee(4,"raja",23,70000,"banglore",5);
		Employee e5=new Employee(05,"hari",45,23000,"chennai",4);
		List<Employee> names=new ArrayList<>();
		names.add(e1);
		names.add(e2);
		names.add(e3);
		names.add(e4);
		names.add(e5);
		
		//List<Employee> ss=names.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		//ss.forEach(x->System.out.println(x));
		
		//Employee m=names.stream().max(Comparator.comparing(Employee::getSalary)).get();
		//System.out.println(m);
		
		
		//Employee kk=names.stream().min(x,y)->(x.getAge()-y.getAge()).get();
		//System.out.println(kk);
		
		
		//List<Employee> n=names.stream().sorted(Comparator.comparing(Employee::getExp)).limit(1).collect(Collectors.toList());
		//System.out.println(n);
		
		List<Employee> mm=names.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).skip(2).collect(Collectors.toList());
		//mm.forEach(x->System.out.println(x));
		List<Employee> mk=names.stream().sorted((x,y)->Integer.compare(x.getAge(),y.getAge())).collect(Collectors.toList());
		System.out.println(mk);
				
		
		
		/*for(Employee oo:names)
		{
			System.out.println(oo);
		}*/
		/*names.forEach(x->
		{
			System.out.println(x);
			
		});*/
		/*for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}*/
		/*Employee max=e1;
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).getSalary()>max.getSalary())
			{
				max=names.get(i);
			}
		}
		System.out.println(max);*/
		/*Employee aa=e1;
		for(Employee e:names)
		{
			if(e.getAge()>aa.getAge())
			{
				aa=e;
			}
		}
		System.out.println(aa);*/
		/*Employee max =e1; // Assuming there is at least one employee in the list

		names.forEach(x -> {
		    if (x.getAge() > max.get().getAge()) {
		        max = x;
		    }
		});

		System.out.println(max);*/
		
		//Map<Integer,Employee> name=new HashMap<>();
		 
		//Map<Integer,Employee> my=names.stream().collect(Collectors.toMap(x->x.getAge(),y->y));
		//System.out.println(my);
		
		//List<Employee> aa=my.values().stream().collect(Collectors.toList());
		//System.out.println(aa);
		
		/*for(Integer a:my.keySet())
		{
			System.out.println(my.get(a));
		}*/
		/*my.forEach((x,y)->
		{
			System.out.println(y);
		});*/
		/*my.forEach((x,y)->
		{
			name.put(x, y);
		});
		System.out.println(name);*/
		
		
		
		
		
		
		
	}
	
}

