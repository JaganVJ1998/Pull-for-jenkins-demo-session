package package2;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		
		
		String s1 = "Oranium";
		String s2 = null;
		try
		{
		System.out.println(s2.length());
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Why are u trying to fetch from empty string?");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		System.out.println(s1.length());
		
		
		
		
		
		
		
		
	}

}
