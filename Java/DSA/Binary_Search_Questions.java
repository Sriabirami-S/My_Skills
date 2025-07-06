package KK_Java;
import java.util.Scanner;
import java.util.Arrays;
public class Binary_Search_Questions {
/*
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.print("enter the size of the array: ");
		//int n= scan.nextInt();
		int[] arr= {1,2,3,4,6,7,8};
		//System.out.print("enter an array: ");
		//for(int i=0;i<arr.length;i++)
		//{
		//	arr[i]=scan.nextInt();
		//}
		//System.out.println(Arrays.toString(arr));
		
		//System.out.print("enter the target element: ");

		int target=5;
		int ceil=ceiling(arr,target);
		System.out.println("The ceiling number: "+ceil);

	}
	static int ceiling(int[] arr,int t)
	{
		if(t>arr[arr.length-1])
		{
			return -1;
		}
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int m=s+(e-s)/2;
			if(t>arr[m])
			{
				s=m+1;
			}
			if(t<arr[m])
			{
				e=m-1;
			}
			if(t==arr[m])
			{
				return arr[m];
			}
			
		}
		return arr[s];
	}*/
	//---------flooring of a number-------
	/*public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8};
		int target=0;
		int[] ceil=flooring(arr,target);
		System.out.println("The flooring number: "+Arrays.toString(ceil));

	}
	static int[] flooring(int[] arr,int t)
	{
		
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int m=s+(e-s)/2;
			if(t>arr[m])
			{
				s=m+1;
			}
			if(t<arr[m])
			{
				e=m-1;
			}
			if(t==arr[m])
			{
				return new int[] {arr[m],m};

			}
			
			
		}
		return new int[] {0,e};

		
		
		
		
		
	}*/

//------find a letter grater then target-------
	/*public static void main(String[] args) {
		char[] arr= {'b','c','e'};
		char target='x';
		char ceil=greaterletter(arr,target);
		System.out.println("The ceiling letter: "+ceil);

	}
	static char greaterletter(char[] arr,char t)
	{
		if(t>arr[arr.length-1])
		{
			return arr[0];
		}
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int m=s+(e-s)/2;
			if(t>arr[m])
			{
				s=m+1;
			}
			if(t<arr[m])
			{
				e=m-1;
			}
			
			
			
		}
		return arr[s];

	}*/
	//------FIND THE FIRST AND THE LAST INDEX OF THE TARGET(leetcode problem)---------
		/*public static void main(String[] args)
		{
			int[] arr= {1,2,2,3,4,4,5};
			int target=3;
			int[] index=searchRange(arr,target);
			System.out.println(Arrays.toString(index));
		}
		static int[] searchRange(int[] arr,int t)
		{
			int[] ans = {-1,-1};
			int start=search(arr,t,true);
			int end=search(arr,t,false);
			ans[0]=start;
			ans[1]=end;
			return ans;
		}
		static int search(int[] arr,int t ,boolean toFindStartIndex)
		{
			int ans=-1;
			int s= 0;
			int e=arr.length-1;
			while(s<=e)
			{
				int m=s+(e-s)/2;
				if(t>arr[m])
				{
					s=m+1;
				}
				else if(t<arr[m])
				{
					e=m-1;
				}
				else
				{
					ans=m;
					if(toFindStartIndex)
					{
						e=m-1;
					}
					else {
						s=m+1;
					}
				}
				
			}
			return ans;
		}*/

//--------Find the target in an infinite array-------------
	
	/*public static void main(String[] args)
	{
		int[] arr= {1,2,2,3,4,4,5,6,7,8,9,10,66,99g};
		int target=12;
		int index=infinite(arr,target);
		System.out.println(index);
	}
	static int infinite(int[] arr,int t)
	{
		int s=0;
		int e=1;
		while(t>arr[e])
		{
			int newS=e+1;
			e=e+(e-s+1)*2;
			s=newS;
		}
		return bs(arr,t,s,e);
	}
	static int bs(int[] arr,int t,int s,int e)
	{
		while(s<=e)
		{
			int m=s+(e-s)/2;
			if(t>arr[m])
			{
				s=m+1;
			}
			if(t<arr[m])
			{
				e=m-1;
			}
			if(t==arr[m])
			{
				return m;
			}
			
		}
		return -1;
	}*/
	
//-----Find the peak element in a mountain array ( LEETCODE NO: 852)--------
	/*
	public static void main(String[] args)
	{
		int[] arr= {0,10,5,4,3};
		int peak=peak_elt(arr);
		System.out.println(peak);
	}
	static int peak_elt(int[] arr)
	{
		int s=0;
		int e=arr.length - 1;
		while(s<e)
		{
			int m=s+(e-s)/2;
			if(arr[m]>arr[m+1])
			{
				e=m;
			}
			if(arr[m]<arr[m+1])
			{
				s=m+1;
			}
		}
		return arr[s];
	}*/

//----Find in mountain array ( LEETCODE NO: 1095)------
	/*public static void main(String[] args)
	{
		int[] arr= {1,5,10,15,18,20,22,16,14,12,11,4};
		int target=15;
		int target_index=ans(arr,target);
		System.out.println(target_index);
	}
	static int ans(int[] arr,int t)
	{
		int peak_index=peak_elt(arr);
		int ascsearch_index=bs(arr,t,0,peak_index);
		if(ascsearch_index!=-1)
			{
				return ascsearch_index;
			}
		else
		{
			return bs(arr,t,peak_index+1,arr.length-1);
		}
	
	}
	static int peak_elt(int[] arr)
	{
		int s=0;
		int e=arr.length - 1;
		while(s<e)
		{
			int m=s+(e-s)/2;
			if(arr[m]>arr[m+1])
			{
				e=m;
			}
			if(arr[m]<arr[m+1])
			{
				s=m+1;
			}
		}
		return s;
	}
	static int bs(int[] arr,int t,int s,int e)
	{
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
	}*/
	
//-----find the target in rotated array--------
	/*public static void main(String[] args)
	{
		int[] arr= {3,4,5,6,7,0,1,2};
		int target=0;
		//int pivot=pivot(arr);
		int target_index=ans(arr,target);
		System.out.println("Target index: "+target_index);
	}	
	static int ans(int[] arr,int t)
	{
		int pivot=pivot(arr);
		
		//if the array is not rotated,do normal binary search
		 if (pivot == -1) {
		        return bs(arr, t, 0, arr.length - 1);  // 🟦 Do normal binary search 🟦
		    }
		if(t==arr[pivot]) {
			return pivot;
		}
		if(t>=arr[0]) {
			return bs(arr,t,0,pivot-1);
		}
		else 
		{
			return bs(arr,t,pivot+1,arr.length-1);
		}
		
		
	}
	static int pivot(int[] arr)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int m= s+(e-s)/2;
			if(m<e && arr[m]>arr[m+1])
			{
				return m;
			}
			if(m>s && arr[m]<arr[m-1]) {
				return m-1;
			}
			if(arr[s]>=arr[m])
			{
				e=m-1;
			}
			if(arr[s]<arr[m]) {
				s=m+1;
			}
		}
		return -1;
	}
	static int bs(int[] arr,int t,int s,int e)
	{
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			
			if(t>arr[mid])
			{
				s=mid+1;
			}
			if(t<arr[mid])
			{
				e=mid-1;
			}
			if(t==arr[mid])
			{
				return mid;
			}
		}
		return -1;
	}*/
	
//--------finding pivot element in array with duplicate elements-------
	/*public static void main(String[] args)
	{
		int[] arr= {2,2,2,9,2,2};
		int pivot=pivot(arr);
		System.out.println("Target index: "+pivot);
	}
	static int pivot(int[] arr)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int m= s+(e-s)/2;
			if(m<e && arr[m]>arr[m+1])
			{
				return m;
			}
			if(m>s && arr[m]<arr[m-1]) {
				return m-1;
			}
			if(arr[m]==arr[s] && arr[m]==arr[e])
			{
				if(arr[s]>arr[s+1]) {
					return s;
				}
				s++;
				if(arr[e]<arr[e-1])
				{
					return e-1;
				}
				e--;
			}
			else if(arr[s]<arr[m] || (arr[s]==arr[m] && arr[m]>arr[e]))
			{
				s=m+1;
			}
			else
			{
				e=m-1;
			}
		}
		return -1;
	}*/
	
//----find the rotation count in rotated sorted array------
	/*public static void main(String[] args)
	{
		int[] arr= {1,2,3,4};
		System.out.println("no of rotations = "+count(arr));
	}
	static int count(int[] arr)
	{
		 return pivot(arr)+1;
	}
	static int pivot(int[] arr)
	{
		int count=0;
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			count++;
			int m= s+(e-s)/2;
			if(m<e && arr[m]>arr[m+1])
			{
				
				//count++;
				return m;
			}
			if(m>s && arr[m]<arr[m-1]) {
				//count++;
				return m-1;

			}
			if(arr[s]>=arr[m])
			{
				e=m-1;
			}
			if(arr[s]<arr[m]) {
				s=m+1;
			}
		}
		return -1;
	}*/
	
//-------LEETCODE NO: 410 ----split array largest sum------
	public static void main(String args[])
	{
		int[] arr= {7,2,5,10,8};
		int m=2;
		System.out.println(splitArray(arr,m));
	}
	static int splitArray(int[] arr, int m) {
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++)
        {
        	s=Math.max(s,arr[i]);
        	e=e+arr[i];
        }
        while(s<e)
        {
        	int mid=s+(e-s)/2;
        	int sum =0;
        	int pieces= 1;
        	for(int a:arr)
        	{
        		if(sum+a > mid)//remember this case, if mid = 17 and the elts of on subarray are [7,2,5] and we were not able to add 8 to it i.e.[7,2,5,8]
        		{
        			sum=a;
        			pieces++;
        		}
        		else
        		{
        			sum=sum+a;
        		}
        	}
        	if(pieces>m)
        	{
        		s=mid+1;
        	}
        	else
        	{
        		e=mid;
        	}
        }
    	return s;

    }
}

