package marks;


public class MarkValidator {
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
			if(mark>90)
				return "Grade A";
			else if(mark>75)
				return "Grade B";
			else if(mark>60)
				return "Grade C";
			else
				return "Grade D";
		}
	}
	else 
		return -1;
}
