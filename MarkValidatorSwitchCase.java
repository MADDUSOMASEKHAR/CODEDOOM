package markswitchcase;

public class MarkValidatorSwitchCase {
	if(mark<0)
	{
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
	}
	else 
		return -1;
}
