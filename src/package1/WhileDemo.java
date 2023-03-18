package package1;

public class WhileDemo {
	
	int num = 1;
	
	public void printNumbers()
	{
		
		while(num<=100000)
		{
				System.out.println(num);
				num++;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		WhileDemo w = new WhileDemo();
		w.printNumbers();
		
	}
	
	
	

}
