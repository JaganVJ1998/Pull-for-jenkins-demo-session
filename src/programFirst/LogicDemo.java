package programFirst;

public class LogicDemo {
	
	int var1 = 10;
	int var2 = 3;
	
	public void compareNumbers()
	{
		System.out.println((var1>var2)&&(var1!=var2));   // t
		System.out.println((var1<var2)&&(var1!=var2));   // f
		System.out.println((var1>var2)&&(var1==var2));  //f
		System.out.println((var1<=var2)&&(var1==var2));  //f
		
		System.out.println((var1>var2)||(var1!=var2));   // t
		System.out.println((var1<var2)||(var1!=var2));   //t
		System.out.println((var1>var2)||(var1==var2));  //t
		System.out.println((var1<=var2)||(var1==var2));  //f
		
		System.out.println(!(var1<=var2));  //t
		System.out.println(!(var1>=var2));   //f
		
	}
	
	public static void main(String[] args)
	{
		LogicDemo  l = new LogicDemo();
		l.compareNumbers();
	}
	
	
	

}
