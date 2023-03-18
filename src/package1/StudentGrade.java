package package1;

public class StudentGrade {
	
	
	int mark = 12;
	
	public void printGrade()
	{
		
		if((mark>80)&&(mark<=100))
		{
			System.out.println("GRADE A");
		}
		else if(mark>60 && mark<=80)
		{
			System.out.println("GRADE B");
		}
		else if(mark>40 && mark<=60)
		{
			System.out.println("GRADE C");
		}
		else if(mark>20 && mark<=40)
		{
			System.out.println("GRADE D");
		}
		else
		{
			System.out.println("FAILED");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		StudentGrade s = new StudentGrade();
		s.printGrade();
	}
	
	
	
	
	

}
