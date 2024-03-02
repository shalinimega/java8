package perpartion;

public class Usemthod {
	public static void main(String[] args)
	{
		String[] names= {"ahslini","empty","hari"};
		Methodreference mm=new Methodreference();
		lamdaexpression ii=mm::message;
		System.out.println(ii.message(names));
				
	}

}
