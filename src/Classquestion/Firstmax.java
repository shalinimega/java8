package Classquestion;

public class Firstmax {
	public static void main(String[] args)
	{
		int[] nums= {67,89,34,56,12};
		int max=0;
		int max1=0;
		for(int i=0;i<nums.length;i++)
		{
				if(nums[i]>max)
				{
					max=nums[i];
				}
				
		}
		for(int j=0;j<nums.length;j++)
		{
			if(nums[j]>max1 && max>nums[j])
			{
				max1=nums[j];
			}
		}
		System.out.println(max1);
		
	}

}
