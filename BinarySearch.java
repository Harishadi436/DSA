import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Range of Array:");
		Scanner scr = new Scanner(System.in);
		int range = scr.nextInt();
		int[] array = new int [range];
		for(int i=0;i<range;i++)
		{
			System.out.println("Enter the "+i+" Element:");
			array[i] = scr.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Enter the target element:");
		int target = scr.nextInt();
		
			int left = 0;
			int right = array.length-1;
			
			while(left<=right)
			{
				int mid = (left + right)/2;
				
				if(array[mid] == target) 
				{
					System.out.println(mid);
					break;
				}
				if(array[mid]>target)
				{
					right = mid-1;
				}
				if(array[mid]<target)
				{
					left = mid+1;
				}
			}
		}
}
