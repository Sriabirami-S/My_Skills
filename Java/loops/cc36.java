import java.util.Scanner;
class cc36{
    public static void main(String args[])
    {
        System.out.println("Enter 5 nos:");
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        int i;
        for(i=0;i<5;i++)
        {
            num[i]=scan.nextInt();
        }
        System.out.println("The entered nos are");
        for(i=0;i<5;i++)
        {
            System.out.println(num[i]);
        }
    }
}