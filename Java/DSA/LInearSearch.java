package KK_Java;
import java.util.Scanner;
import java.util.Arrays;

public class LInearSearch {
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
//---------searching an element ina n array and returning the index in which the element is present-------
	/*
	System.out.println("enter an array:");
	int[] a = new int[5];
	for(int i=0;i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	System.out.println(Arrays.toString(a));
	System.out.println("enter the element to be found: ");
	int t = scan.nextInt();
	int index = basicsearch(a,t);
	if(index!=-1)
	{
	System.out.println("the index at ehich the given element present is: "+index);
	}
	else
	{
		System.out.println("element not found");
	}
	}
	static int basicsearch(int[] a,int tar)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==tar)
			{
				return i;
			}
		}
		return -1;
		*/
//-----checking if a character is present in a string-------
	/*
	String str= new String();
	System.out.println("enter a word: ");
	str=scan.next();
	System.out.println(Arrays.toString(str.toCharArray()));
	System.out.println("enter the character to be found: ");
	char target = scan.next().charAt(0);

	boolean res = search(str,target);
	System.out.println(res);
	
	}
	static boolean search(String s,char t)
	{
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c==t)
			{
				System.out.println(i);
				return true;
			}
			
		}
		return false;
	}*/
//--------search within a given range-------
	/*System.out.println("enter an array:");
	int[] a = new int[5];
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	int start,end;
	System.out.println("enter the limit: ");
	start = scan.nextInt();
	end = scan.nextInt();
	System.out.println(Arrays.toString(a));
	System.out.println("enter the element to be found: ");
	int t = scan.nextInt();
	int index = basicsearch(a,t,start,end);
	if(index!=-1)
	{
	System.out.println("the index at ehich the given element present is: "+index);
	}
	else
	{
		System.out.println("element not found");
	}
	}
	static int basicsearch(int[] a,int tar,int start,int end)
	{
		if((start<0)&&(end>a.length))
		{
			return -1;
		}
		for(int i=start;i<=end;i++)
		{
			if(a[i]==tar)
			{
				return i;
			}
		}
		return -1;
	}*/
//--------finding minimum number---------
	/*
	System.out.println("enter an array:");
	int[] a = new int[5];
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	System.out.println(Arrays.toString(a));
	int min = minimum(a);
	System.out.println(min);
	}*/
	/*static int minimum(int[] arr)
	{
		int m =arr[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			
				if(arr[i]<m)
				{
					m = arr[i];
				}
			
			
		}
		return m;
	}*/
//-----searching and returning the index in 2d arrays----------
	/*int[][] arr = new int[][]{{1,2,3},{0,0,0},{4,5,6}};
	System.out.println("enter target: ");
	int target=scan.nextInt();
	int[] ans = search(arr,target);
	System.out.println(Arrays.toString(ans));
	}
	static int[] search(int[][] arr,int t)
	{
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c =0;c<arr[r].length;c++)
			{
				if(arr[r][c]==t)
				{
					int[] res = {r,c};
					return res;
				}
			}
		}
		return new int[] {0,0};
	
	}*/
	
//------LEETCODE PROBLEM 1295 - FIND THE NUMBER OF ELEMENTS IN AN ARRAY THAT CONTAIN EVEN NO OF DIGITS-----------
	
	/*int[] arr = {1,67,556565,3,33,2223};
	int res = ans(arr);
	System.out.println(res);
	}
	static int ans(int[] num)
	{
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			int digits= finding_digits(num[i]);
			if((digits%2)==0)
			{
				count++;
			}
		}
		return count;
	}
	static int finding_digits(int n)
	{
		int c=0;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		return c;
	}*/
	
//---------------RICHEST CUSTOMER WEALTH---------

	
		int[][] acc= {{2,3,14},{6,15},{12,1}};
		int max=0;
		for(int per=0;per<acc.length;per++)
		{
			int per_sum=0;
			for(int peracc=0;peracc<acc[per].length;peracc++)
			{
				per_sum=per_sum+acc[per][peracc];
			}
			if(per_sum>max)
			{
				max= per_sum;
			}
		}
		System.out.println(max);
	}
	
}
