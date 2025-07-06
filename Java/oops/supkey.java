import java.lang.System;
class Animal{
	Animal()
	{
		System.out.println("animal");
	}
}
class dog extends Animal{
	dog()
	{
		
		System.out.println("dog");
	}
}
public class supkey
{//understanding super keyword

	public static void main(String args[])
	{
		dog d = new dog();
	}
}


