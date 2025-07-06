package KK_Java;
import java.util.Arrays;
import java.util.Arrays;

public class Bubble_sort_algorithm {

	public static void main(String[] args) {
		int[] arr= {5,6,74,-1,0,-9999};
		System.out.println(Arrays.toString(bubble(arr)));

	}
	static int[] bubble(int[] arr)
	{
		boolean is_swapped=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])//swapping program
				{
					is_swapped=true;
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;//till this the code is sorted for unsorted array. What if the array is already sorted? WKT, when j never swaps for a particular value of i, then the array is sorted. so we can end the program
				}
			}
			if(!is_swapped)//!false=true
			{
				break;
			}
		}
		
		return arr;
	}

}
