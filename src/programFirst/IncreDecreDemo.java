package programFirst;

public class IncreDecreDemo {
	
	int var1 = 10;
	int var2 = 3;
	
	public void incDec()
	{
		
		 var1+=var2;                       //var1 = var1+var2;
		System.out.println(var1);
		
	}
	
	public static void main(String[] args)
	{
		IncreDecreDemo i = new IncreDecreDemo();
		i.incDec();
	}
	
	
	
	
	
	

}
