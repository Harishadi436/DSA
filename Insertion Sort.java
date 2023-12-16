package com.DSA;

import java.util.Scanner;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array:");
		Scanner scr = new Scanner(System.in);
		int size = scr.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the "+i+" Element");
			array[i] = scr.nextInt();
		}
		for(int i=1;i<size;i++)
		{
			int key = array[i];
			int j = i - 1;
			while(j>=0 && array[j]>key)
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
		System.out.println("Sorted array:");
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
