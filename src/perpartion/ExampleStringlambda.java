package perpartion;

public class ExampleStringlambda {
	public static void main(String[] args)
	{
		String[] names= {"shalini","arul","hello","hari"};
		lamdaexpression ll=(a)->
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i].length()>7)
				{
					return a[i].length();
				}
				else
				{
					return a[i].length();
				}
		
			}
			return 0;
					};
		System.out.println(ll.message(names));
	}

}
