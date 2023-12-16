import java.util.Arrays;
import java.util.Scanner;
public class Bubblesort
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the range of array:");
		Scanner scr = new Scanner(System.in);
		int limit = scr.nextInt();
		int array[] = new int [limit];
		int temp = 0;
		for(int i=0;i<limit;i++)
		{
			System.out.println("Enter "+i+" Element:");
			array[i] = scr.nextInt();
		}
		for(int i=0;i<limit;i++) 
		{
			for(int j=0;j<limit-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i=0;i<limit;i++)
		{
			System.out.print(array[i]+" ");
		}
			
	}
}
