package package_one;

class counter{
	static int count=0;//when we use static ,the last made change is reflected in every object
	int instanceno=0;//if an object is not static then it is isnitailised every time
	counter()
	{
		count=count+1;
		instanceno=instanceno+1;;
	}
	void display()
	{
		System.out.println("count="+count);
		System.out.println("instanceno="+instanceno);
	}
}
public class CC62 {
	public static void main(String args[])
	{
		counter c1 = new counter();
		
		counter c2 = new counter();
		counter c3 = new counter();
		counter c4 = new counter();
		counter c5 = new counter();
		c2.display();
		c5.display();
	}

}
