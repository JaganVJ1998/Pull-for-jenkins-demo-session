package package1;

public class CalculatorDemo {
	
	public void addNumbers()
	{
		System.out.println("Public : THIS IS ADDITION");
	}
	
	protected void subNumbers()
	{
		System.out.println("Protected: This is Subtraction");
	}
	
	private void mulNumbers()
	{
		System.out.println("Private: This is Multiplication");
	}
	
	void divNumbers()
	{
		System.out.println("Default : This is Division");
	}
	
	public static void main(String[] args) {
		
		CalculatorDemo c = new CalculatorDemo();
		c.addNumbers();
		c.subNumbers();
		c.mulNumbers();
		c.divNumbers();
		
		
	}
}
