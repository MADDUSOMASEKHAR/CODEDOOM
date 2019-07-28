package world;

import java.util.Scanner;

public class Factorial {
	public double calculateFactorial(int number)
	{
		double res=1;
		for(int i=number;i>0;i--)
			res*=i;
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Factorial fc=new Factorial();
		int a;
		System.out.println("Enter the factorial number");
		a=sc.nextInt();
		System.out.println("The Factorial of "+a+" is "+fc.calculateFactorial(a));
	}
}
