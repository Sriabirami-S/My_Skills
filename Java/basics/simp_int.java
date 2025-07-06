import java.util.Scanner;
class sim_int{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        double p,n,r,si;
        System.out.print("Enter p,n,r: ");
        p=obj.nextInt();
        n=obj.nextInt();
        r=obj.nextDouble();
        si=p*n*r/100;
        System.out.print("The simple interest is: "+si);

    }
}