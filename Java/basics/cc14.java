//get unput for three variables:name,score, dept. let the user enter the score for 100 marks you convert it to 10 and print it
import java.util.Scanner;
class cc14{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String name=obj.nextLine();
        double score=obj.nextDouble();
        obj.nextLine();
      String dept=obj.nextLine(); 
    double  gpa=score/10;
    System.out.println("My name is "+name);
    System.out.println("My score is "+score);
    System.out.println("My department is "+dept);
        System.out.print("the points out of 10 is "+gpa);


    }
}