package perpartion;

public class Runtherad  implements Runnable{
	public void run()
	{
		System.out.println("hello");
	}
	public void main(String[] args)
	{
		Runtherad s=new Runtherad();
		Thread tt=new Thread();
		tt.start();
		System.out.println("hi");
 	}

}
