package package3;

public class SonHouse extends FatherHouse {
	
	public void ktmBike()
	{
		System.out.println("THis is Son's KTM Bike");
	}
	
	public void audiCar()
	{
		System.out.println("THis is Father's Audi Car");
	}
	
	public void balenoCar()
	{
		System.out.println("THis is Father's Baleno Car");
	}
	public static void main(String[] args) {
		
		SonHouse s = new SonHouse();
		s.ktmBike();
		s.audiCar();
		s.balenoCar();
	}

}
