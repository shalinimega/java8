package Classquestion;

public class NN {
	public static void main(String[] args)
	{
		
    String str="shalini";
	char[] chars = str.toCharArray();
	StringBuilder sb = new StringBuilder();
	boolean repeatedChar;
	for (int i = 0; i < chars.length; i++) {
	    repeatedChar = false;
	    for (int j = i + 1; j < chars.length; j++) {
	        if (chars[i] == chars[j]) {
	            repeatedChar = true;
	            break;
	        }
	    }
	    if (!repeatedChar) {
	        sb.append(chars[i]);
	    }
	}


}
