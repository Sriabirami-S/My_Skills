import java.util.Scanner;
class school{
    public static void main(String args[])
    {
        System.out.print("Enter the total marks:");
        Scanner obj1=new Scanner(System.in);
        double mark=obj1.nextDouble();
        school obj2=new school();
        String result = obj2.passorfail(mark);
        System.out.print(result);
            
        
    }
    String passorfail(double mark)
    {
        if(mark>=200)
        return "pass";
        else 
        return "fail";
    }
}