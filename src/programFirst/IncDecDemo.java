package programFirst;

public class IncDecDemo {
	
	int var1 = 10;
	
	
	public void incDec()
	{
		System.out.println(var1);   // 10
		System.out.println(var1++);  //Post Increment //
		System.out.println(var1);   //11
		
		
		System.out.println(var1);   // 11
		System.out.println(++var1);  //Pre Increment //12
		System.out.println(var1);   //12
		
		System.out.println(var1);   // 12
		System.out.println(var1--);  //Post Decrement //12
		System.out.println(var1);   //11
		
		
		System.out.println(var1);   // 11
		System.out.println(--var1);  //Pre Decrement //10
		System.out.println(var1);   //10
	}
	
	public static void main(String[] args)
	{
		IncDecDemo i = new IncDecDemo();
		i.incDec();
	}
	
	
	

}
