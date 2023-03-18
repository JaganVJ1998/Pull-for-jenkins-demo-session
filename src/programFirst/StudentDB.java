package programFirst;

public class StudentDB {
	
	String sname;
	int sid;
	static String cname;
	
	static
	{
		cname = "SRM";
	}
	
	public void printDetails(String a, int b)
	{
		sname = a;
		sid = b;
		
		System.out.println("Student name is : " + sname);
		System.out.println("Student id is : " + sid);
		System.out.println("College name is : " + cname);
		
		System.out.println("***************************************************");
	}
	
	public static void main(String[] args) {
		
		StudentDB s = new StudentDB();
		
		s.printDetails("Yokesh", 1001);  // 24   //14
		s.printDetails("Yuvraj", 1002);  //24  //14
		s.printDetails("Joseph", 1003); //24   //14
		s.printDetails("Ganesh", 1004); //24  //14
		
		
	}
	

}
