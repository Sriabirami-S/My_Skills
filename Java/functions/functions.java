package KK_Java;
import java.util.Scanner;

import java.util.Arrays;
public class functions {

/*	public static void main(String[] args) {
		//1. SWAPPING
		
Scanner scan = new Scanner(System.in);
System.out.print("Enter two nos: ");
int a = scan.nextInt();
int b= scan.nextInt();
swap(a,b);
		
	}
static void swap(int x,int y)
{
	int temp;
	temp = x;
	x=y;
	y=temp;
	System.out.print(x+" "+y);
	
}*/
	/*	public static void main(String args[])
		{
			int a,b,c;
			 a=10;
			 {
				 a= 34;
				 int d = 45;
				 System.out.println(d);

				 
			 }
			System.out.println(a);
		}*/
/*public static void main(String args[])
{
	fun(1,"abi");
}
static void fun(int a,String v)
{
	System.out.println(a);
	System.out.println(v);
}*/
	public static void main(String args[])
	{
	for(int i=100;i<1000;i++)
	{
		if(armstrong(i))
		{
			System.out.println(i);
		}

	}
	}
	static boolean armstrong(int no)
	{
		int n=no;
		int arm =0;
		
		while(n>0)
		{
			
		
		int r = n%10;
	
		arm= (r*r*r)+arm;
		n=n/10;
		}
		if(arm==no)
		{
			return true;
		}
		return false;
	}
	

}
