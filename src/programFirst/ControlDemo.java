package programFirst;

public class ControlDemo {
	
	int num = 16;
	
	public void ageCheck()
	{
		
		if(num%2==0)
		{
			System.out.println(num + " is divisble by 2");
			if(num%4==0)
			{
				System.out.println(num + " is also divisible by 4");
			}
		}
		
	}
	
	public static void main(String[] args) {
	
		ControlDemo c = new ControlDemo();
		c.ageCheck();
	}
	
	
	
	

}
