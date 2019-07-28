package world;

import java.util.Scanner;

public class MarkValidatorSwitchCase {
	
	public boolean isPass(int mark)
	{
		if(mark>=40)
			return true;
		else 
			return false;
	}
	
	public String markGrade(int mark)
	{
		int n=0;
		if(mark>90)
			n=1;
		else if(mark>75)
			n=2;
		else if(mark>60)
			n=3;
		
		switch(n)
		{
			case 1:
				return "Grade A";
			case 2:
				return "Grade B";
			case 3:
				return "Grade C";
			default:
				return "Grade D";
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		MarkValidatorSwitchCase msc= new MarkValidatorSwitchCase();
		int a;
		System.out.println("Enter the marks");
		a=sc.nextInt();
		System.out.println(msc.isPass(a));
		System.out.println(msc.markGrade(a));
	}

}
