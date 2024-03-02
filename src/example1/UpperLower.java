package example1;

import java.util.ArrayList;
import java.util.List;

public class UpperLower {
	public static void main(String[] args)
	{
		List<String> name=new ArrayList<>();
		name.add("shalini");
		name.add("mega");
		name.add("arul");
		name.add("hari");
		StringBuilder names=new StringBuilder();
		for (int i = 0; i < name.size(); i++) {
            if (i % 2 == 0) {
                names.append(name.get(i).toUpperCase());
            } else {
                names.append(name.get(i).toLowerCase());
            }
        }

        System.out.println(names.toString());
		
	
	}

}
