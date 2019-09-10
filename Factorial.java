package factorial;

public class Factorial 
{
	public double calculateFactorial(int number)
	{
		if(number>=0)
		{
			double result=1;
			for(int i=number;i>0;i--)
				result*=i;
			return result;
		)
		else
		return -1;
	}
	
}
