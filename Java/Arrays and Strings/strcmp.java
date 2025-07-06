//emc yt channel video no 09
//learning about the comparison of two strings
import java.util.Scanner;
class strcmp{
    public static void main(String args[])
    {
        String g1=new String("abi");
        String g2="abi";
        System.out.println(g1==g2);//this checks the reference of g1 and g2 but not their contents so we get o/p as false
        //if  we need to compare their contents and not their address we need to give like this-->
        System.out.println(g1.equals(g2));//this equals is used to check the content

    //question 1
        System.out.print("Enter win if rcb wins ipl or lost if rcb looses:");
        Scanner obj=new Scanner(System.in);
        String rcb=obj.nextLine();
        String a1="win";
        String a2=new String("loose");
        if(rcb.equals("win"))//we can also give "if(rcb.equals(a1));"
        {
            System.out.println("Ee sala cup namdhey");
        }
        else
        {
            System.out.println("cup illa");
        }

        //question 2
        System.out.print("Is meghana alive:");
        Scanner obj2=new Scanner(System.in);
        String meghana = obj2.nextLine();
        if(meghana.equals("no"))
        {
            System.out.println("Surya meets ramya");
        }
        else
        {
            System.out.println("surya weds meghana");
        }
    }
}