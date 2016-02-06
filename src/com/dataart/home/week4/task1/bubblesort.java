package com.dataart.home.week4.task1;

/**
 * Created by Oleg on 06.02.2016.
 */
public class BubbleSort {
    public static void sort(int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            // bubble up
            for (int j = 0; j <= i - 1; j++) {
                if (data[j] > data[j + 1])
                    swap(data, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
