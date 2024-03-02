package perpartion;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SampleOfFunction {
	public static void main(String[] args)
	{
		Function<Integer,String>a=(x)->"The nums is"+(x+100);
		System.out.println(a.apply(200));
		Consumer<Integer> b=(y)->System.out.println(y+100);
		 b.accept(200);
		 Supplier<String> c=()->"hello";
		 System.out.println(c.get());
		 Predicate<Integer> d=(x)->x>100;
		 System.out.println(d.test(200));
	}

}
