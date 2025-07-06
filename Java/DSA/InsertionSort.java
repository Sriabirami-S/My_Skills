package KK_Java;
import java.util.Arrays;
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {5,4,3,1,-5,0};
		System.out.println(Arrays.toString(sort(arr)));
	}
	static int[] sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					swap(a,j,j-1);
				}
				else
				{
					break;
				}
			}
		}
		return a;
	}
	static void swap(int[] a,int f,int s)
	{
		int temp=a[f];
		a[f]=a[s];
		a[s]=temp;
	}

}
