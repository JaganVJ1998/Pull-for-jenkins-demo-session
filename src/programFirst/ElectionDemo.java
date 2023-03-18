package programFirst;

public class ElectionDemo {
	
	int num = 7;
	
	
	public void evenCheck()
	{
		
		if(num%2==0)
		{
			System.out.println(num + " is an Even number");
		}
		else
		{
			System.out.println(num + " is an ODD Number");
		}
		
		
	}
	
	
	public static void main(String[] args) {
	
		ElectionDemo e = new ElectionDemo();
		
		e.evenCheck();
		
		
		
		
	}
		
	
	

}
