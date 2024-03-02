package Exp1;

public class UseWithdraw {
	public static void main(String[] args)throws Withdraw
	{
		int bal=500;
		if(bal<600)
		{
			throw new Withdraw("less than 500");
		}
		else
		{
			System.out.println("sucessfully return");
		}
	}

}
