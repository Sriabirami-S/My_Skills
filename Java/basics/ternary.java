import java.util.Scanner;
class ternary{
    public static void main(String args[])
    {  
        System.out.print("is it raining?");
        Scanner obj=new Scanner(System.in);
        String rain=obj.nextLine();
        
        String result=rain.equals("yes")?"Bring an umbrella":"Enjoy the rain";
        System.out.print(result);
    }
}