//Write a program to get input for variables name,age and address
import java.util.Scanner;
class cc12{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=obj.nextLine();
        System.out.print("Enter your age:");
        int age=obj.nextInt();
        System.out.print("Enter your address:"); 
        obj.nextLine();
        String address=obj.nextLine();
        System.out.println("the name is "+name);//we use println to print the next line in new line
        System.out.println("the age is "+age);
        System.out.print("The address is "+address);//we cannot enter the lines using one System.out.print("the name is "+name"The age is "+age); like this.We need to use seperate System.out.print commands
    }
}


