import java.util.Scanner;
class cc21{
    public static void main(String args[])
    {
        System.out.print("Enter the marks: ");
        Scanner obj=new Scanner(System.in);
        double mark=obj.nextDouble();
        if(mark>=35)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}