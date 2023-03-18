package programFirst;

public class SonHouses extends FatherHouses {
	

	public void ktmBike()
	{
		System.out.println("This is Son's KTM Bike");
	}
	
	public void audiCar()  
	{
		System.out.println("This is Son's Audi Car");
	}
	
	public static void main(String[] args)
	{
		SonHouses s = new SonHouses();
		s.ktmBike();
		s.porscheCar();
		
		s.audiCar();
		
	}
	
	
	
	
	
	

}
