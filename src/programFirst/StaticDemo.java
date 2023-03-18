package programFirst;

public class StaticDemo {
	
	static
	{
		System.out.println("Hi........This is Static Block");
	}
	public void addNumbers()
	{
		System.out.println("Instance Method : Addition is : " + (20+30));
	}
	
	public static void subNumbers()
	{
		System.out.println("Static Method : Subtraction is : " + (30-20));
	}
	
	
	public static void main(String[] args) {
		
		StaticDemo s = new StaticDemo();
		s.addNumbers();
		StaticDemo.subNumbers();
	}
	

}
