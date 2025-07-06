package package_one;

public class Pattern_printngifromyoutubeChannel_ChiragKhimani {
	static void pp1()
	{
		//video no 34
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	static void pp2()
	{
		//video no 35
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	static void pp3()
	{
		//video no 36
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void pp4()//video 37
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	static void pp5()//video 38
	
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pp6()//video 39
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int s=1;s<=5-i+1;s++)
			{
				System.out.print(" ");
			}
		}
	}
	
		public static void main(String args[])
	{
		pp1();
		System.out.println();
		pp2();
		System.out.println();
		pp3();
		System.out.println();
		pp4();
		System.out.println();
		pp5();
		System.out.println();
		pp6();

}
}
