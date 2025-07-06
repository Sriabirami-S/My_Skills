package package_one;
abstract class animal{
	abstract void makeSound();
	String name;
	animal(String name)
	{
		this.name = name;
	}
	
}
class dog extends animal{
	dog()
	{
		super("timmy");
	}
	 void makeSound()
	 {
		 System.out.println("dog barks");
	 }
	
}
class cat extends animal{
	cat(String name)
	{
		super(name);
	}	
	void makeSound()
	{
		System.out.println("cat meows");
	}
}
public class CC64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cat c = new cat("kutty");
dog d = new dog();
d.makeSound();
	}

}
