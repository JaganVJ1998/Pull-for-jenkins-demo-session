package package2;

public class WrapperDemo {
	
	int var1 = 10;
	Integer obj1 = 20;
	int var2;
	Integer obj2;
	
	public void printData()
	{
		
		System.out.println(var1);
		System.out.println(obj1);
		var2 = obj1; // Converting the wrapper class object into primitive type variable  --> Auto UnBoxing
		System.out.println(var2);
		obj2 = var1; // Converting the primitive type variable into wrapper class object --> Auto Boxing
		System.out.println(obj2);
		
	}
	
	public static void main(String[] args) {
		
		WrapperDemo w = new WrapperDemo();
		w.printData();
	}
	

}
