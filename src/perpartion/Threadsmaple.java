package perpartion;

public class Threadsmaple extends Thread{
	public void run()
	{
		synchronized(Threadsmaple.class)
		{
		try
		{
			System.out.println("thread is wating");
			Threadsmaple.class.wait(2000);
			System.out.println("thread is awaked");
		}
		//System.out.println("hello");
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Threadsmaple s=new Threadsmaple();
		s.start();
		Thread.sleep(3000);
		System.out.println("hi");
	}
}
