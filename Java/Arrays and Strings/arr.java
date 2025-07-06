// understanding array 
import java.util.Scanner;
class arr{
    public static void main(String args[])
    {
        
      System.out.print("Enter 5 nos:");
      Scanner obj=new Scanner(System.in);
     int[] num=new int[5];
      num[0]=obj.nextInt();//dont forget the syntax to get run time input var_name=object_name.nextInt();
      num[1]=obj.nextInt();
      num[2]=obj.nextInt();
      num[3]=obj.nextInt();
      num[4]=obj.nextInt();
      int sum=num[0]+num[1]+num[2]+num[3]+num[4];
      System.out.print("total= "+sum);
      
      

    }
}