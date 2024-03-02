package project10;

public class UseCar {
	public static void main(String[] args)
	{
		Engine ee=new Engine("aaa","good");
		Car c1=new Car("lg",67890,ee);
		System.out.println(c1+","+c1.engine);
	}

}
