//write a program to get input for 3 integer variables:a,b,c.Now multiply all variables and store it in d. Now add all variables and store it in e.Now divide d by e
import java.util.Scanner;
class cc13{
    public static void main(String args[])
    {
        int a,b,c,d,e;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        d=a*b*c;
        System.out.println("The product of three nos is d = "+d);
        e=a+b+c;
        System.out.println("The sum of three nos is e = "+e);
        System.out.print("d/e = "+d/e);

    
    }
}