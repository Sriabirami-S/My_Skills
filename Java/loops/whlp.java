//understanding while loop
import java.util.Random;
class whlp{
    public static void main(String args[])
    {
    Random obj = new Random();
    int rand =0;
    while(rand != 5)
    {
        rand=obj.nextInt(6);
        System.out.println(rand);
        
    }
    }
}