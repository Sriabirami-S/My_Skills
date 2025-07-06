import java.util.Scanner;
class find{
    public static void main(String args[])
    {
        System.out.print("Enter a no: ");
        Scanner obj1 = new Scanner(System.in);
        int num=obj1.nextInt();
        find obj2=new find();
        obj2.evenorodd(num);
    }
    void evenorodd(int num)
    {
        if(num%2 == 0)
        System.out.println("no is even");
        else
        System.out.print("no is odd");

    }


}