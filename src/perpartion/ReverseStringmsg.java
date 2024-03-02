package perpartion;

import java.util.Scanner;

public class ReverseStringmsg {
	public static void main(String[] args)
	{
		/*String[] names= {"my name is shalini"};
	    for(int i=0;i<names.length;i++)
	    {
	    	String split1=" ";
	    	for(int j=names[i].length()-1;j>=0;j--)
	    	{
	    		split1=split1+names[i].charAt(j);
	    	}
	    	System.out.print(split1+" ");
	    }*/
		
		
		       /* String[] names = {"my name is shalini"};
		        String sen = names[0];
		        String[] words = sen.split(" ");
		        StringBuilder reversedWords = new StringBuilder();

		        for (int i = words.length - 1; i >= 0; i--) {
		            reversedWords.append(words[i]).append(" ");
		        }

		        System.out.println(reversedWords.toString().trim());*/
		
		        Scanner scanner = new Scanner(System.in);
		        String line = scanner.nextLine();
		        String[] words = line.split("\\s+");
		        String[] reversedWords = new String[words.length];
		        for (int i = 0; i < words.length; i++) {
		            StringBuilder reversed = new StringBuilder(words[i]).reverse();		            
		            reversedWords[i] = reversed.toString();
		        }

		        for (String word : reversedWords) {
		            System.out.print(word + " ");
		        }		       
		
		        
		

	

		

		

		
		
				

	    
	}

}
