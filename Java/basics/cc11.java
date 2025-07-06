//write a program to print name and age as input
import java.util.Scanner;
class cc11{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = obj.nextLine();
        System.out.print("enter your age:");
        int age = obj.nextInt();
        System.out.print("My name is "+name);//we should use +variabe_name to print input along with the line
        System.out.print("\nMy age is "+age); 
    }
}

