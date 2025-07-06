
package KK_Java;
import java.util.Arrays;

public class BinarySearch_2D_Arrays {
//---revision of 2d arrays---------

	/*public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5},{6,7,8}};
		int t=6;
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				if(arr[r][c]==t)
				{
					int[] index= {r,c};
					System.out.println(Arrays.toString(index));
				}
			}
		}
	}*/
	
//------array is sorted row wise and column wise--------
	/*public static void main(String args[])
	{
		int[][] arr= {{1,2,3},{4,5},{6,7,8}};
		int t=6;
		System.out.println(Arrays.toString(bs2d(arr,t)));
	}
	static int[] bs2d(int[][] arr,int t)
	{
		int r=0;
		int c=arr.length-1;
		while(r<arr.length && c>=0)
		{
			if(arr[r][c]==t)
			{
				return new int[] {r,c};
			}
			else if(arr[r][c]>t)
			{
				c--;
			}
			else
			{
				r++;
			}
			
		}
		return new int[] {-1,-1};
	}*/
	
//------search target in a full sorted array----refer the code in the note (with logic and explanation) -------
	

}
