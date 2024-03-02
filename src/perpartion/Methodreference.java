package perpartion;

public class Methodreference {
	public int message(String[]mm)
	{
		for(int i=0;i<mm.length;i++)
		{
			if(mm[i].startsWith("s"))
			{
				return 2;
			}
			else
			{
				return 4;
			}
		}
		return 0;

		}
		
	}


