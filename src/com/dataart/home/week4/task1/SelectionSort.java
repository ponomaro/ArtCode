package com.dataart.home.week4.task1;

/**
 * Created by Oleg on 06.02.2016.
 */
public class SelectionSort {
    public static void sort(int[] arr)
    {
        // find the smallest element starting from position i
        for (int i = 0; i < arr.length - 1; i++)
        {
            int min = i;  // record the position of the smallest
            for (int j = i + 1; j < arr.length; j++)
            {
                // update min when finding a smaller element
                if (arr[j] < arr[min])
                    min = j;
            }

            // put the smallest element at position i
            swap(arr, i, min);
        }
    }
    private static void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
