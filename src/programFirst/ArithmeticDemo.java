package programFirst;

public class ArithmeticDemo {
	
	int var1 = 10;
	int var2 = 3;
	
	public void calculateNumbers()
	{
		System.out.println("Addition is : " + (var1+var2));
		System.out.println("Subtraction is : " + (var1-var2));
		System.out.println("Multiplication is : " + (var1*var2));
		System.out.println("Division is : " + (var1/var2));
		System.out.println("Remainder is : " + (var1%var2));
		
	}
	
	public static void main(String[] args)
	{
		ArithmeticDemo a = new ArithmeticDemo();
		a.calculateNumbers();
	}
	
	

}
