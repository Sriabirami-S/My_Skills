package emcJAVAtutorials;
class vehicle{
	String brand;
	int year;
	void startengine()
	{
		
	}

}
class car extends vehicle{
	String fueltype;
	void startengine()
	{
		System.out.println("car engine starts");
		
	}
	void drive()
	{
		System.out.println("car is driving");
		
	}
}
class truck extends vehicle{
	String loadCapacity;
	void startengine()
	{
		System.out.println("truck engine starts");
	}
	void haul()
	{
		System.out.println("truck is hauling");
	}
}
public class CC52 {

	public static void main(String[] args) {
	car c = new car();
	c.brand = "Rolls Royce";
	System.out.println(c.brand);
	c.year = 7;
	System.out.println(c.year);
	c.fueltype = "petrol";
	System.out.println(c.fueltype);
	c.startengine();
	c.drive();
	truck t = new truck();
	t.brand = "ashok leyland";
	System.out.println(t.brand);
	t.year = 7;
	System.out.println(c.year);
	t.loadCapacity = "100 kg";
	System.out.println(t.loadCapacity);
	t.startengine();
	t.haul();
	}

}
