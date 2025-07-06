package KK_Java;
import java.util.Arrays;
public class cyclic_sort {

	/*public static void main(String[] args) {
		int[] arr= {10,34,22,56,5};
		sort(arr);
		
	}
	static void sort(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int correctIn = arr[i]-1; 
			if(i==correctIn)
			{
				i++;
			}
			else {
				int temp=arr[i];
				arr[i]=arr[correctIn];
				arr[correctIn]=temp;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	*/




//---------cyclic sort questions--------

	public static void main(String[] args)
	{
		int[] arr= {2,4,1,0,5,6,7};
		findMissingNo(arr);
		
	}
	static void findMissingNo(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int correctIn = arr[i]-1;
			if(i==correctIn)
			{
				i++;
			}
			else {
				int temp=arr[i];
				arr[i]=arr[correctIn];
				arr[correctIn]=temp;
				
			}
			
		}
		System.out.println((Arrays.toString(arr)));	
		

}
}






