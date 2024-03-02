package example1;

public class Prime {
	public static void main(String[] args) {
	for(int i=2;i<=20;i++)
	{
		boolean is_prime=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				is_prime=false;
				break;
			}
		}
		if(is_prime)
		{
			System.out.println(i);

		}
	}

}
}
