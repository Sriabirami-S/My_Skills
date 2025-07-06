import java.util.Scanner;
class cc22
{
    public static void main(String args[])
    {
        int income;
        System.out.print("Enter the income of the student:");
        Scanner obj=new Scanner(System.in);
        income=obj.nextInt();
        if(income>7000)
        {
            System.out.print("Eligible");
        
        }
        else
        {
            System.out.print("not eligible");
        }
    }
}