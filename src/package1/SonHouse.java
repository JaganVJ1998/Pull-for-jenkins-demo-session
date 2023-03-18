package package1;

public class SonHouse extends FatherHouse {
	
	public void ktmBike()
	{
		System.out.println("This is Son's KTM Bike");
	}
	
	public void pulsarBike()
	{
		System.out.println("This is Son's PULSAR Bike");
	}
	

	public static void main(String[] args)
	{
		SonHouse s = new SonHouse();
		s.ktmBike();
		s.pulsarBike();
		s.audiCar();
		s.porscheCar();
		s.ambassadorCar();
		
		
		DaughterHouse d = new DaughterHouse();
		
		d.ladyBird();
		d.scootyPep();
		d.audiCar();
		d.porscheCar();
		d.biCycle();
	}
}
