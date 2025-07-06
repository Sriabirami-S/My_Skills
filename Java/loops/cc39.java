import java.util.Scanner;
class cc39{
    public static void main(String args[])
    {
        int i,a,b;
        System.out.print("Enter the length of the array:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[a];
        for(i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        b=(a-1)/2;
        System.out.print("The middle element is "+arr[b]);

    }
}