package programFirst;

public class MyFirstProgram {
	
	int var1 = 10;    // Variable
	int var2 = 3;
	
	public void addNumbers()   // Method
	{
		System.out.println("Addition is : " + (var1+var2));
		
	}
	
	public void subNumbers()
	{
		System.out.println("Subtraction is " + (var1-var2));
	}
	
	public static void main(String[] args)     // Main Method
	{
		MyFirstProgram m = new MyFirstProgram();    // Object Creation
		m.addNumbers();           //Method Call
		m.subNumbers();
	}
	

}
