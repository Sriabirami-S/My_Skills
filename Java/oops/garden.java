import java.util.Scanner;
public class garden{
    int apple_price=20;
     int apple_count=5;
    static void total_money()
    {
        garden obj = new garden();
        System.out.print("total amount = "+obj.apple_price*obj.apple_count);
    }
    public static void main(String args[])
    {
        
       total_money(); 
    }
}