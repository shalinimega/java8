package example1;

public class reverse {
	public static void main(String[] args)
	{
		String name="shalini";
		/*for(int i=name.length()-1;i>=0;i--)
		{
			System.out.println(name.charAt(i));
		}*/
		StringBuilder re=new StringBuilder(name);
		System.out.println(re.reverse());
	}

}
