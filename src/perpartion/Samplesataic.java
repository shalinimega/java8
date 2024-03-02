package perpartion;

public class Samplesataic {
	 static int a=10;
	 public Samplesataic()
	 {
		 a++;
		 System.out.println(a);
	 }
	 public static String msg()
	 {
		 return "hello";
	 }
	 public static void main(String[] args)
	 {
		 Samplesataic s1=new Samplesataic();
		 Samplesataic  s2=new Samplesataic();
		 Samplesataic s3=new Samplesataic();
		 System.out.println(msg());
	 }
	 static
	 {
		 System.out.println("this is static block");
	 }
}
