/*pattern printing 
*
* *
* * *
* * * *
* * * * * 
*/import java.util.Scanner;
class pp{
    public static void main(String args[])
    {
     Scanner scan  = new Scanner(System.in);
     int lines;
     System.out.print("Enter the no of lines:");
     lines = scan.nextInt();
     
     for(int i=1;i<=lines;i++)
     {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
     }

    }
    
}