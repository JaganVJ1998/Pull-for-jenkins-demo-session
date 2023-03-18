package programFirst;

public class DivisibleCheck {
	
	
	int num = 26;
	
	public void divisibleNums()
	{
		
		if(num%2==0)
		{
			System.out.println(num + " is divisble by 2");
			if(num%4==0)
			{
				System.out.println(num + " is also divisble by 4");
			}
			
			
		}
		
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		DivisibleCheck d = new DivisibleCheck();
		d.divisibleNums();
	}
	
	
	
	

}
