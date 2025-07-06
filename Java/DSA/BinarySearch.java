package KK_Java;

public class BinarySearch {
/*
	public static void main(String[] args) {
		int[] arr= {9,8,7,6,5,4,1};
		int target=4;
		int index= bs(arr,target);
		System.out.println(index);
	}
	static int bs(int[] arr,int t)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			System.out.println(mid);
			if(t>arr[mid])
			{
				e=mid-1;
			}
			if(t<arr[mid])
			{
				s=mid+1;
			}
			if(t==arr[mid])
			{
				return mid;
			}
			
		}
		return -1;
	}
*/
//-----Order Agnostic binary search------
	public static void main(String args[])
	{
		int[] arr= {9,8,7,6,5,4,1};
		System.out.println("array 1");
		int target=4;
		int index=orderAgnosticBinarySearch (arr,target);
		System.out.println(index);

		int[] arr1= {2,4,5,6,45};
		target=5;
		 index=orderAgnosticBinarySearch (arr1,target);
			System.out.println("array 2");


		System.out.println(index);
	}
	static int orderAgnosticBinarySearch(int[] arr,int t)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			boolean isasc = arr[s]<arr[e];
			if(isasc)
			{
				
				int mid=s+(e-s)/2;
		
				if(t>arr[mid])
				{
					e=mid-1;
				}
				if(t<arr[mid])
				{
					s=mid+1;
				}
				if(t==arr[mid])
				{
					return mid;
				}
			}
			else
			{
				int mid=s+(e-s)/2;
				
				if(t<arr[mid])
				{
					s=mid+1;
				}
				if(t>arr[mid])
				{
					e=mid-1;
				}
				if(t==arr[mid])
				{
					return mid;
				}
			}
		}
		return -1;
	}
	
}
