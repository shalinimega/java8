package Classquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicatehash {
	public static void main(String[] args)
	{
	        String name = "onesoft";
	        char[] mm = name.toCharArray();
	        
	        for (int i = 0; i < mm.length; i++) {
	            boolean isDuplicate = false;
	            int count = 0;
	            
	            for (int j = i + 1; j < mm.length; j++) {
	                if (mm[i] == mm[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            
	            if (!isDuplicate) {
	                count = 1; // If it's not a duplicate, count is 1
	                for (int k = i + 1; k < mm.length; k++) {
	                    if (mm[i] == mm[k]) {
	                        count++; // Increment count for each occurrence of the character
	                    }
	                }
	                System.out.println(mm[i] + "-" + count);
	            }
	        }
	}


}
