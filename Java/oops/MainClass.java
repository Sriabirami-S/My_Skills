package package_one;
class A{
	final void disp()
	{
System.out.println("class A");
}
}
class B extends A{
	void disp()
	{
		System.out.println("class B");
	}
}
public class MainClass {

	public static void main(String[] args) {
		B b= new B();
		b.disp();
		}

}
