package programFirst;

public class ConditionalDemo {
	
	int age = 12;
	
	public void ageCheck()
	{
		System.out.println((age>=18)?"Eligible to vote":"Not Eligible to Vote");
		
	}
	
	public static void main(String[] args)
	{
		ConditionalDemo c = new ConditionalDemo();
		c.ageCheck();
	}
	
	

}
