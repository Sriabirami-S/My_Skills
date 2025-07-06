import java.util.Scanner;
class cc23{
    public static void main(String args[])
    {
        System.out.print("Enter a number:");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        if((a%3==0)&&(a%5==0))
        {
            System.out.println("The is divisible by both 3 and 5");
        }
        else
        {
            System.out.println("the is not divisible by 3 and 5");
        }
    }
}