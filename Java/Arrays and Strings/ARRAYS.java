
package KK_Java;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class ARRAYS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//---------------2D Array----------------
		
		/*
		int a[][] = new int[3][];
		System.out.println(a.length);
		for(int row=0;row<a.length;row++)
		{
		for(int j=0;j<a[row].length;j++)
		 {
			 a[row][j]=scan.nextInt();
		 }
		}
		//using enhanced for loop to print 
		for(int[] x : a)
		{
			System.out.println(Arrays.toString(x));

	}*/
		
//------------1D Array------------
		
		/*
		int a[] = new int[3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(a));*/
		
//----------ArrayList----------
/*
		
		ArrayList<Integer> list = new ArrayList<>(1);

		list.add(1);		//add items function
		list.add(45);
		list.add(567);
		list.add(1234567890);
		System.out.println("adding items:");//any number of items can be added even more than the initial capacity
		System.out.println(list);
	
		System.out.println("Removing  item at 1st index:");	//remove function
		list.remove(1);
		System.out.println(list);
		System.out.println("Setting value at 3rd index to 0");
		list.set(2, 0);
		System.out.println(list     );
		System.out.println("Checking if an item exists ");
		System.out.println(list.contains(567));
		System.out.println(list.contains(567678));
		System.out.println("getting a value at a particular index");
		System.out.println(list.get(0));*/
		
//------------swapping nos at last  two indices-------
		
		/*System.out.println("enter the size of the array:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements of the array:");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
	
		System.out.println("before swapping: "+Arrays.toString(arr));
		swap(arr,arr.length - 1,arr.length-2);
		
		 System.out.println("After swapping "+Arrays.toString(arr));*/
		
//----------maximum element in an array----------
		/*
		System.out.println("enter the size of the array:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements of the array:");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int max=arr[0];
		for(int i =1;i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
					
		}
		System.out.println(max);*/
		
//----------reversing an array (method 1)---------
		/*
		System.out.println("enter the size of the array:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements of the array:");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));*/
		
		//----------reversing an array (method 2)---------

		/*System.out.println("enter the size of the array:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements of the array:");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i =arr.length-1;i>=0;i--)
		{
		System.out.println(arr[i]+" ");	
		}*/
		
		
}
	/*static void swap(int[] a,int index1,int index2)
	{
		int temp = a[index1];
		 a[index1]= a[index2];
		 a[index2]=temp;

		 
		}*/
}