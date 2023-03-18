package programFirst;

public class ShortHandDemo {
	
	int var1 = 10;
	int var2 = 3;

	
	public void addNumbers()
	{
		var1+=var2;						//var1 = var1+var2;
		System.out.println(var1);
		
	}
	
	public static void main(String[] args) 
	{
		ShortHandDemo s = new ShortHandDemo();
		s.addNumbers();
	}
	
	
	
	

}
