package perpartion;

import java.util.Arrays;
import java.util.List;

public class Samplearry {
	public static void main(String[] args)
	{
		
		 Integer[] a = {1, 2, 3, 4, 5};
//		 List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toCollection(ArrayList::new));
//		 System.out.println(list);
//		 
	     List<Integer> mm =  Arrays.asList(a);
	     System.out.println(mm);		 
		 Integer[] b= mm.toArray(new Integer[mm.size()]);
		 for(Integer kk: b)
		 {
			 System.out.print(kk);
			 
		 }
		 
		 
		 
	}

}
