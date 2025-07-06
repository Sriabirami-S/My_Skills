package emcJAVAtutorials;
class Animal{
	Animal()
	{
		System.out.println("animal");
	}
}
class dog{
	dog()
	{
		super();
		System.out.println("dog");
	}
}
public class Understanding_Super_Keyword {

	public static void main(String[] args) {
		dog d = new dog();
	}

}
