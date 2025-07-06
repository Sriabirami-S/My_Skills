package emcJAVAtutorials;
class animal{
	String name;
	int age;
	void makesound()
	{
		System.out.println("Animal makes sound");
	}
}
class dog extends animal{
	String breed;
	void makesound()
	{
		System.out.println("dog barks");
	}
	void fetch()
	{
		System.out.println("dog is fetching");
	}
}
class cat extends animal{
	String colour;
	void makesound()
	{
		System.out.println("cat meows");
	}
	void climb()
	{
		System.out.println("cat is climbing");
	}
}

public class CC51 {

	public static void main(String[] args) {
		dog d = new dog();
		System.out.println("___DOG___");
		d.name="timmy";
		System.out.println("Name:"+d.name);
		d.age=5;
		System.out.println("Age:"+d.age);
		d.breed = "shitzu";
		System.out.println("Breed:"+d.breed);
		d.makesound();
		d.fetch();
		System.out.println("\n___CAT___");
		cat c = new cat();
		c.name="azhagi";
		System.out.println("Name:"+c.name);
		c.age = 5;
		System.out.println("Age:"+c.age);
		c.colour = "brown";
		System.out.println("colour:"+c.colour);
		c.makesound();
		c.climb();
		

	}
	

}
