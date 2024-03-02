package project10;

import java.util.HashMap;
import java.util.Iterator;

public class UseVechical {
	public static void main(String[] args)
	{
		Vechical v1=new Vechical("baja",50);
		Vechical v2=new Vechical("Rs100",30);
		Vechical v3=new Vechical("Xl50",67);
		
		HashMap<Integer,Vechical>vec=new HashMap<>();
		HashMap<String,Vechical>vec1=new HashMap<>();
		vec.put(1, v1);
		vec.put(2, v2);
		vec.put(3, v3);
		
		
		/*for(Vechical aa:vec.values())
		{
			if(aa.getMileage()>45)
			{
				aa.setMileage(aa.getMileage()+aa.getMileage()*10/100);
				vec1.put(aa.getBrand(), aa);
             }
		}
		for(Vechical cc:vec1.values())
		{
			System.out.println(cc);
		}*/
		Iterator<Vechical> remvechical=vec.values().iterator();
		while(remvechical.hasNext())
		{
			if(remvechical.next().getMileage()<45)
			{
				remvechical.remove();
			}
			
		}
		vec.forEach((x,y)->System.out.println(y));
	}
}
	
		

		
	


