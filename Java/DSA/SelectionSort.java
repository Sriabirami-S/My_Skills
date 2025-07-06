package KK_Java;
import java.util.Arrays;
public class SelectionSort {
//-------selection sort kunal kushwaha-------
	public static void main(String[] args)
	{
		int[] arr= {6,4,-999,6,4};
		System.out.println(Arrays.toString(sort(arr)));
	}
	static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int lastIn=arr.length-i-1;
			int maxIn=findMaxIndex(arr,0,lastIn);
			swap(arr,maxIn,lastIn);
		}
		return arr;
	}
	static int findMaxIndex(int[] arr,int s,int e)
	{
		int maxIn=s;
		for(int i=s;i<=e;i++)
		{
			if(arr[maxIn]<arr[i])
			{
				maxIn=i;
			}
		}
		return maxIn;
	}
	static void swap(int[] arr,int f,int s)
	{
		int temp=arr[f];
		arr[f]=arr[s];
		arr[s]=temp;
	}

//-------selection sort code by Brocode---------
	/*
	public static void main(String[] args) {
		int[] arr= {5,6,1,3,4,8};
		System.out.println(Arrays.toString(sort(arr)));
	}
	static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min= i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
min=j;
				}

			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		
		}
		return arr;
		
	}*/
	

}
