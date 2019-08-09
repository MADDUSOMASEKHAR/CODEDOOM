package summation;


public class SumofNumbers {
	
	public int SumofEvenNumbers(int start,int end)
	{
		int result=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			result+=i;
		}
		return result;
	}
	
	public int SumofOddNumbers(int start,int end)
	{
		int result=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			result+=i;
		}
		return result;
	}
}
