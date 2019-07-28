package world;
import java.util.Scanner;

public class helloworld {
	
	public static void main(String[] args)
	{
		helloworld hello= new helloworld();
		System.out.println(hello.getMessage());
	}
	public String getMessage()
	{
		Scanner a=new Scanner(System.in);
		String message= a.nextLine();
		return message;
	}

}
