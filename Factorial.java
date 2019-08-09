package factorial;

public class Factorial 
{
	public double calculateFactorial(int number)
	{
		double result=1;
		for(int i=number;i>0;i--)
			result*=i;
		return result;
	}
	
}
