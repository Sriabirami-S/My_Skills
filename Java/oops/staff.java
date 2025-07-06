package emcJAVAtutorials;

public class staff {
	String myname;
	staff()
	{
		System.out.println("hello");
	}
	void setname(String myname)
	{
	this.myname=myname;
	}

	public static void main(String[] args) {
		
		staff s1 = new staff();
		s1.setname("abi");
		System.out.println(s1.myname);

	}

}
