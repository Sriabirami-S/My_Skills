import java.util.Scanner;
class cc27{
    public static void main(String args[])
    {
        System.out.println("What is the colour of the traffic light?");//println is used to print the next statement in next line
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        if(a.equals("red"))
        {
            System.out.print("Stop");
        }
        else if(a.equals("yellow"))
        {
            System.out.print("Get ready");
        }
        else if(a.equals("green"))
        {
            System.out.print("Go");
        }
        else 
        {
            System.out.print("wrong entry");
        }
    }
}