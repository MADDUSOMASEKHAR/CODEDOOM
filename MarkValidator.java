package world;

import java.util.Scanner;

public class MarkValidator {
	public boolean isPass(int mark)
	{
		if(mark>=40)
			return true;
		else 
			return false;
	}
	public String markGrade(int mark)
	{
		if(mark>90)
			return "Grade A";
		else if(mark>75)
			return "Grade B";
		else if(mark>60)
			return "Grade C";
		else
			return "Grade D";
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		MarkValidator mv= new MarkValidator();
		int a;
		System.out.println("Enter the marks");
		a=sc.nextInt();
		System.out.println(mv.isPass(a));
		System.out.println(mv.markGrade(a));
	}

}
