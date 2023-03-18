package programFirst;

public class Calculators{
	
	int var1;
	int var2;
	
	Calculators()  // Non Parameterized Constructor
	{
		var1 = 10;
		var2 = 3;
		System.out.println("Addition is : " + (var1+var2));
	
	}
	 
	Calculators(int a, int b)  // Parameterized Constructor
	{
		System.out.println("TWO INT PARA: Addition is : " + (a+b));
	
	}
	
	Calculators(int a, double b)
	{
		System.out.println("ONE INT ONE DOUBLE PARA: Addition is : " + (a+b));
	
	}
	
	Calculators(double a, int b)
	{
		System.out.println("ONE DOUBLE ONE INT PARA: Addition is : " + (a+b));
	
	}
	
	public static void main(String[] args) {
		
		Calculators c = new Calculators();
		Calculators c1 = new Calculators(200,250);
		Calculators c2 = new Calculators(200,2.5);
		Calculators c3 = new Calculators(2.5, 300);
	}
	

}
