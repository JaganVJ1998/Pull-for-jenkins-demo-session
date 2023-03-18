package package1;

public class StudentsDB {
	
	String sname;
	int sid;
	static String cname;
	
	static   // --> Assign the values to static variable. 
	{
	  cname = "SRM";
	}
	
	public void printDetails(String a, int b)
	{
		sname = a;
		sid = b;
		
		
		System.out.println("Students Name: " + sname);
		System.out.println("Students ID: " + sid);
		System.out.println("College Name: " + cname);
		
		System.out.println("*********************************************");
	}
	
	
	public static void main(String[] args) {
	
		StudentsDB s = new StudentsDB();
		
		s.printDetails("Vinay", 1001);  //14 byte
		s.printDetails("Raghu", 1002);  //14
		s.printDetails("Guna", 1003);  //14
		s.printDetails("Rogesh", 1004);  //14
		
	}
	
	
	

}
