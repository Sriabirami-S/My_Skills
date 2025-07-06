//combined concepts

package package_one;
abstract class vehicle
{
	static String vehicletype;
	vehicle(String name)
	{
		vehicletype=name;
	}
	static String getVehicleType()
	{
		return "t";
	}
	/*void drive()
	{
		System.out.println("vehicle moves");
	}*/
	abstract void drive();
	final void startengine()
	{
		System.out.println("engine started");
	}
}
class car extends vehicle{
	car(String name)
	{
		super(name);
	}
	void drive()
	{
		System.out.println("car is driving");
	}
	
}
class motorcycle extends vehicle{
	motorcycle(String name)
	{
		super(name);
	}
	void drive()
	{
		System.out.println("motorcycle is wheeling");
	}
}
public class cc65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car c = new car("car");
motorcycle m = new motorcycle("moto");

String name = c.getVehicleType();
System.out.println("car");
System.out.println(name);
c.startengine();
c.drive();
String name2 = vehicle.getVehicleType();
System.out.println("moto");
System.out.println(name2);
m.startengine();
m.drive();



	}

}
