//understanding do while loop
import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        //int i=1;
       /* do{
            System.out.println("Abi");
            i++;
        }while(i<=5);*/
        int a=0;
        Scanner obj=new Scanner(System.in);
        do{
            System.out.println("Enter a number>10:");
            a=obj.nextInt();
            a++;
            System.out.println(a);
        }while(a<=10);
         System.out.print("Program stops");
    }
}