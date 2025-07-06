import java.util.Scanner;
class cc26{
    public static void main(String args[])
    {   
        System.out.println("Enter 5 subjects marks:");
        double m1,m2,m3,m4,m5;
        Scanner obj=new Scanner(System.in);
        m1=obj.nextDouble();
        m2=obj.nextDouble();
        m3=obj.nextDouble();
        m4=obj.nextDouble();
        m5=obj.nextDouble();
        double sum=m1+m2+m3+m4+m5;
        double avg=sum/5;
        System.out.println("the sum of maks: "+sum);
        System.out.println("average= "+avg);
        if(avg<=35)
        {
            System.out.print("Additional classes are required");
        }
        else
        {
            System.out.println("you are good to go");
        
        }
    }
}