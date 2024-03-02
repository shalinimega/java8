package perpartion;

public class ImmutableString {
	public static void main(String[] args)
	{
		String name="shalini";
		System.out.println(name.hashCode());
		String name1="arul".concat(name);
		System.out.println(name1.hashCode());
		
		
		
		StringBuffer sb=new  StringBuffer();
		System.out.println(sb.hashCode());
		sb=sb.append("hello");
		System.out.println(sb.hashCode());
		System.out.println(sb.reverse());
		
	}

}
