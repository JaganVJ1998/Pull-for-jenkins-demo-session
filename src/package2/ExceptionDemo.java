package package2;

import java.util.Scanner;

public class ExceptionDemo {
	
public static void main(String[] args) {
		
		int var1; 
		int var2;
		
		Scanner s = new Scanner(System.in);
		
		var1 = s.nextInt();
		var2 = s.nextInt();
		
		try
		{
		System.out.println("Division is : " + (var1/var2));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
		System.out.println("**************Calculation is OVER***********");
		}
		
		
		System.out.println("Addition is : " + (var1+var2));
		
		System.out.println("Modulo is : "  + (var1%var2));
		
		System.out.println("Subtraction is : " + (var1-var2));
		
		
	}
	
	

}
	
	
	


