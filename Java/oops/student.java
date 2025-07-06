import java.util.Scanner;
//parameterised constructor
 class student{

    int marks;
    String name;
    student(int a,String b)
    {
        marks=a;
        name= b;
    }
    public static void main(String args[])
    {
       student obj = new student(1,"abi");
       System.out.println(obj.marks);
       System.out.println(obj.name);
    }
}