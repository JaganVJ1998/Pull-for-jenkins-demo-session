package programFirst;

public class SonHouse extends FatherHouse {
	
	public void audiCar()
	{
		System.out.println("This is Son's Audi Car");
	}
	
	public void ktmBike()
	{
		System.out.println("This is Son's KTM Bike");
	}
	
	public static void main(String[] args) {
		
		SonHouse  s = new SonHouse();
		s.ktmBike();   //Son
		s.balenoCar(); //Father
		s.audiCar();    // Son
		
		FatherHouse f = new FatherHouse();
		f.balenoCar();  //Father
		f.audiCar();  //Father
		
		FatherHouse f1 = new SonHouse();   // Upcasting --> Converting child's object into Parent's Object
		f1.balenoCar();    //Father
		//f1.ktmBike(); 
		f1.audiCar();    //Son
		
		
		
		
	}

}
