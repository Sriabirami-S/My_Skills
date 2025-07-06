//understanding classes and objects
public class laptop{
    String name="";
    String proc="";
    int ram=0;
    int price=0;
    public static void main(String args[])
    {
        laptop lap1 = new laptop();
        lap1.name="hp";
        lap1.proc="i5";
        lap1.ram=5;
        lap1.price=20000;

        laptop lap2=new laptop();
       
        System.out.println(lap2.name);
        System.out.println(lap2.ram);
    }
}