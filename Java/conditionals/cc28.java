import java.util.Scanner;
class cc28{
    public static void main(String args[])
    {
        System.out.println("Enter salary and age: ");
        Scanner obj=new Scanner(System.in);
        int salary=obj.nextInt();
        int age=obj.nextInt();
        if(salary>=20000 || age<=25)
        {
            System.out.print("enter loan amount: ");
            int amt=obj.nextInt();
            if(amt<=50000)
            {
                System.out.println("you are eligible for loan");
            }
            else
            {
                System.out.println("Maximum loan amount is 50000");
            }
               
        }
        else 
        {
            System.out.println("you are not eligible for loan");
        }
    }
}