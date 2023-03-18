package programFirst;

public class CalculatorDemo {
	
	public void addNumbers(int a, int b)
	{
		System.out.println("Two Para: Addition is : " + (a+b));
	}
	
	public void addNumbers(int a, int b, int c)
	{
		System.out.println("Three Para: Addition is : " + (a+b+c));
	}
	
	public void addNumbers(int a, double b)
	{
		System.out.println("One int One Double Para: Addition is : " + (a+b));
	}

	public void addNumbers(double a, int b)
	{
		System.out.println("One double One int Para: Addition is : " + (a+b));
	}
	public static void main(String[] args) {
		
		CalculatorDemo c = new CalculatorDemo();
		c.addNumbers(20, 30);
		c.addNumbers(12, 13, 15);
		c.addNumbers(12, 18.5);
		c.addNumbers(13.5, 15);
		
	}
	
	

}
