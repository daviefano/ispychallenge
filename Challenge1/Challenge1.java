import java.util.*;

class Challenge1
{
	public static void main(String[] args)
	{
		int total = 0;
	
		for(int i = 1; i <= 1000-1; i++)
		{
			if(i%3==0)
			total = total + i;
			
			if(i%5==0)
			total = total + i;
		}
		System.out.print("TOTAL IS: " +total);
	}
	
}