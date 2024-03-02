package perpartion;

public class SampleFinalize {
	@Override
	public void finalize() {
		System.out.println("collected");
	}
	public static void main(String[] args)
	{
		SampleFinalize s1=new SampleFinalize();
		System.out.println(s1.hashCode());
		s1=new SampleFinalize();
		System.out.println(s1.hashCode());
		System.gc();
	}

}
