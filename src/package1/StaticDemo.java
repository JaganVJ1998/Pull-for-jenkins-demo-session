package package1;

public class StaticDemo {

	static
	{
		System.out.println("This is static Block");
	}
		
	public void addNumbers()
	{
		System.out.println("Addition: Instance Method ");
	}
	
	public static void subNumbers()
	{
		System.out.println("Subtraction: Static Method ");
	}
	
	public static void main(String[] args) {
		
		StaticDemo s = new StaticDemo();
		s.addNumbers();
		StaticDemo.subNumbers();
		
	}

}
