import java.util.Scanner;
class recall{
    public static void main(String args[])
    {
        System.out.println("Enter a character:");
        Scanner obj = new Scanner(System.in);
        String no = obj.nextLine();
        if(no=="0")
        System.out.println("positive");
        else if(no=="0")
        System.out.println("negative");
        else
        System.out.println("zero");

    }
}