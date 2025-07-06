import java.util.Scanner;
class cc31{
    public static void main(String args[])
    {   
        System.out.println("Enter two nos:");
        Scanner obj=new Scanner(System.in);
        int a,b,i;
        a = obj.nextInt();
        b=obj.nextInt();
        System.out.println("the nos from a to b are");
        for(i=a;i<=b;i++)
        {
            System.out.println(i);
        }

    }
}