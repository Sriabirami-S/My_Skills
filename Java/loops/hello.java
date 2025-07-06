// nested for loop
import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        //teacher 1
        //teacher 2
        //teacher 3
       /*int teacher,j;
       for(teacher=1;teacher<=3;teacher++)
       {
        for(j=1;j<=5;j++)
        {
            System.out.println(j+")john");
        }
        System.out.println("");
       }*/
      int[] arr=new int[3];
      Scanner obj = new Scanner(System.in);
      System.out.println("enter no:");
      for(int i=0;i<3;i++)
      {
        arr[i]=obj.nextInt();
      }
      System.out.println("the entered nos are:");
      for(int var:arr)
      {
        System.out.println(var);
      }
    }
}
               