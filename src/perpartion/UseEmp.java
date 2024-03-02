package perpartion;

import java.util.HashMap;
import java.util.Map;

public class UseEmp {
	public static void main(String[] args)
	{
		Emp e1=new Emp(666,"shalini",32,"banglore");
		Emp e2=new Emp(102,"arul",60,"chennai");
		Emp e3=new Emp(103,"mega",35,"vellore");
		Emp e4=new Emp(666,"sathish",34,"tirupattur");
		Emp e5=new Emp(104,"mini",32,"banglore");
		Map<Integer,Emp> names=new HashMap<>();
		names.put(e1.getId(), e1);
		names.put(e2.getId(),e2);
		names.put(e3.getId(), e3);
		names.put(e4.getId(), e4);
		names.put(e4.getId(), e5);
		
		
			System.out.println(names);
			}
}

