package package_one;
class person{
	public String name;
	protected int age;
private int ssn;
	String address;
	person(){}
	person(String name,int age,int ssn,String address)
	
	{
		this.name=name;
		this.age = age;
		this.ssn = ssn;
		this.address =address;
		
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(ssn);
		System.out.println(address);
	}
}
class employee extends person{
employee(String name,int age,int ssn,String address)
{
	super(name,age,ssn,address);
}
}

public class CC61 {

	public static void main(String[] args) {
		employee e1 = new employee("abi",21,33,"wer");
		//person p1 = new person();
		e1.display();
		
	//	System.out.println(p1.ssn);
				
		
	}
}
