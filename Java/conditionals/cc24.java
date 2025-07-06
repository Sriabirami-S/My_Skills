//even or odd
import java.util.Scanner;
class cc24{
    public static void main(String args[])
    {
        System.out.print("Enter a number:");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a%2==0)
        {
            System.out.print("The no is even");
        }
        else
        {
            System.out.print("THE no is odd");
        }
    }
}