package package_one;
final class constantValue{
	final float pi =3.14f;
}
class sub extends constantValue{
	 
}
public class cc63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub s = new sub();
		s.pi=9.8f;
		System.out.println(s.pi);

	}

}
