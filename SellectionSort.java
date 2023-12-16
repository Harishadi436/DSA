package com.DSA;

import java.util.Scanner;

public class SellectionSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:");
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " element:");
            array[i] = scr.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            int temp = i;

            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[temp]) {
                    temp = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted region
            int tempValue = array[temp];
            array[temp] = array[i];
            array[i] = tempValue;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
