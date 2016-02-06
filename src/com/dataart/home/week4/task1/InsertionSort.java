package com.dataart.home.week4.task1;

/**
 * Created by Oleg on 06.02.2016.
 */
public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;

            for (j = i; j > 0; j--) {
                if (arr[j - 1] < tmp)
                    break;
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }
    }

}
