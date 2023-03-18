package programFirst;

public class ConditionalDemos {

	int age = 12;
	
	
	public void ageCheck()
	{
		System.out.println((age>=18)?"Eligible to Vote":"Not Eligible to Vote");
		
	}
	
	public static void main(String[] args) {

		ConditionalDemos c = new ConditionalDemos();
		c.ageCheck();
	} 

	
	
	
}
