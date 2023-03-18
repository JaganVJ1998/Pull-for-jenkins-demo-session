package programFirst;

import java.util.Scanner;

public class ArithmeticPractice {
	
	String var1;
	String var2;
	
	public void getUsetInput()
	{
		Scanner s = new Scanner(System.in);
		
		var1 = s.nextLine();
		var2 = s.nextLine();
		
		System.out.println("Addition is : " +(var1+var2));
		
	}
	
	public static void main(String[] args) {
	
		ArithmeticPractice a = new ArithmeticPractice();
		a.getUsetInput();
	}
	
	

}
