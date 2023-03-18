package package1;

public class TwoDimenArrayDemo {
	
	int arr[] = {35,84,78,14,49};
	
	int tarr[][] = {
					{21,22,23},
					{34,35,36},
					{67,68,69}
			
					};
	
	public void printArray()
	{
		
		
		
	
		
		for(int k[] : tarr)
		{
			
			for(int z : k)
			{
				System.out.print(z + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
	
		TwoDimenArrayDemo t = new TwoDimenArrayDemo();
		t.printArray();
	}
	
	
	
	

}
