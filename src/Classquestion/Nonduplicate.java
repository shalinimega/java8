package Classquestion;

public class Nonduplicate {
	public static void main(String[] args)
	{
		String name="onesoft";
		char[] mm=name.toCharArray();
		//String names="";
		
		for(int i=0;i<mm.length;i++)
		{
			boolean is=false;
			int count=1;
			for(int j=i+1;j<mm.length;j++)
			{
				if(mm[i]==mm[j])
				{
					is=true;
					count++;
					
				}
			}
			if(is)
			{
				System.out.println(mm[i]+"-"+count);
			}
		}
	}

}
