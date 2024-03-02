package perpartion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args)
	{
		Student m=new Student(01,"shalini",32,"female","csi");
		Student m1=new Student(02,"arul",60,"male","cilvi");
		Student m2=new Student(03,"mega",35,"male","it");
		Student m3=new Student(04,"raji",58,"female","cooking");
		Student m4=new Student(05,"hari",22,"male","cilvi");

		List<Student> name=new ArrayList<>();
		name.add(m);
		name.add(m1);
		name.add(m2);
		name.add(m3);
		name.add(m4);
		//name.forEach(x->System.out.println(x));
		
//		Long a=name.stream().count();
//		System.out.println(a);
//		
//		List<Student> aa=name.stream().filter(x->x.getGender().equals("female")).collect(Collectors.toList());
//		aa.forEach(x->System.out.println(x));
		
//		List<String> mm=name.stream().map(x->x.getDept()).collect(Collectors.toList());
//		mm.forEach(x->System.out.println(x));

//		 Student oo=name.stream().max(Comparator.comparingInt(Student::getAge)).get();
//		 System.out.println(oo);
		
		List<Student> pp=name.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).skip(1).limit(1).collect(Collectors.toList());
	    pp.forEach(x->System.out.println(x));
//		
//		Student names=name.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).findFirst()
//                            .get();
//		System.out.println(names);
		
		
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//		Optional<Integer> firstEvenNumber = numbers.stream()
//		                                          .filter(n -> n % 2 == 0) // Filter even numbers
//		                                          .findFirst();              // Find the first even number
//
//		if (firstEvenNumber.isPresent()) {
//		    System.out.println("First even number: " + firstEvenNumber.get());
//		} else {
//		    System.out.println("No even numbers found.");
//		}
		
//        boolean mm=name.stream().anyMatch(x->x.getGender().equals("arul"));
//        System.out.println(mm);
//		
	    
//		int yy=name.stream().collect(Collectors.summingInt(Student::getAge));
//		System.out.println(yy);
//		
//		
//		Map<String, List<Student>> ww=name.stream().collect(Collectors.groupingBy(Student::getGender));
//		ww.forEach((x,y)->System.out.println(x));
//		
//		
//		
//		
//		List<List<Integer>> nestedList = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5, 6),
//                Arrays.asList(7, 8, 9)
//        );
//
//        List<Integer> flat = nestedList.stream()
//                .flatMap(List::stream) // flatten the list of lists
//                .map(num -> num * 2)    // double each element
//                .collect(Collectors.toList());
//
//        System.out.println(flat);
	}
}
