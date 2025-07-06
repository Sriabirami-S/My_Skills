 import java.util.Scanner;
 class reverse{
	public static void main(String args[])
	{
		int num,rev,n,rem;
		System.out.println("enter a number:");
		Scanner scan = new Scanner(System.in);
		
		num=scan.nextInt();
		n=num;
		rev=0;
		while(n>=0)
		{
			rem=n%10;
			rev=rem+rev*10;
			n=n/10;
		}
		System.out.println("reversed number:"+rev);
		if(rev==num)
		{
			System.out.println("palindrome");
		}
		else
		 {
			System.out.println("not a palindrome");
		}
			
		
	}
}