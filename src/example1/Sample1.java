package example1;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {
	public static void main(String[] args)
	{
		String name="shalini";
		String name1="arul";
		/*StringBuilder le =new StringBuilder(name);
		le.append(name1);
		System.out.println(le);*/
		//System.out.println(name+name1);
		/*int a=name.indexOf('i');
		System.out.println(a);*/
		/*System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());*/
		//System.out.println(name.tocharArray());
		/*for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}*/
		List<Integer>odd=new ArrayList<>();
		List<Integer>even=new ArrayList<>();

		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
			    odd.add(i);
			}
			else
			{
				even.add(i);
			}
		}
		odd.forEach(x->{
			System.out.println("odd numbers"+x);
		});
		System.out.println("*********************");

		even.forEach(x->{
			System.out.println("even numbers"+x);
		});


}}