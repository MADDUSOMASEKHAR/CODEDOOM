package world;

import java.util.Scanner;

public class SumofNumbers {
	public int SumofEven(int a,int b)
	{
		int res=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			res+=i;
		}
		return res;
	}
	
	public int SumofOdd(int a,int b)
	{
		int res=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2!=0)
			res+=i;
		}
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		SumofNumbers sum= new SumofNumbers();
		int a,b;
		System.out.print("Start with ");
		a=sc.nextInt();
		System.out.print("\nEnd with ");
		b=sc.nextInt();
		System.out.println("\nSum of Even Numbers is "+sum.SumofEven(a, b));
		System.out.println("\nSum of Odd Numbers is "+sum.SumofOdd(a, b));
	}
}
