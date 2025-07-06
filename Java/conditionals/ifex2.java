import java.util.Scanner;
class ifex2{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.print(a==b);//boolean datatypes we get outputs as true or false
        if(a==b)
        {
            System.out.println("a and b are equal");
        
        }
        else
        {
            System.out.println("a not equal to b");
        }
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("b is greater than a");
        }
    
        
    }
}