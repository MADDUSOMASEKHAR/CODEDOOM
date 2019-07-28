package world;

import java.util.Scanner;

public class Temperature {
	public double CelstoFar(double a)
	{
		double res= (a*1.8)+32;
		return res;
	}
	public double FartoCels(double b)
	{
		double res= ((b-32)*5/9);
		return res;
	}
	public static void main(String[] args)
	{
		Scanner a= new Scanner(System.in);
		double c,d;
		Temperature temp= new Temperature();
		System.out.println("Enter the Celsius Temperature");
		c=a.nextDouble();
		System.out.println("Conversion of Celsius to Fahrenheit is "+temp.CelstoFar(c));
		System.out.println("Enter the Fahrenheit Temperature");
		d=a.nextDouble();
		System.out.println("Conversion of Fahrenheit to Celsius is "+temp.FartoCels(d));
	}

}
