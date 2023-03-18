package package2;

public class SonHouse implements FatherHouse, MotherHouse {
	
	public void ktmBike()
	{
	System.out.println("This is Son's KTM Bike");
	}
	
	public void audiCar()
	{
		System.out.println("THis is Audi Car");
	}
	
	public void porscheCar()
	{
		System.out.println("THis is Father's Porsche Car");
	}
	
	public void jewels()
	{
		System.out.println("This is Mother's Jewel");
	}


	public static void main(String[] args)
	{
	SonHouse s = new SonHouse();
	s.ktmBike();
	s.audiCar();
	s.porscheCar();
	s.jewels();

	}


}
