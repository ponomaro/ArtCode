package com.dataart.home.week4.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

/**
 * Created by Oleg on 06.02.2016.
 */
public class TestSort {
    public static void main(String[] args) {


        int[] mas2 = new int[5000];
        Random k = new Random(10000);
        for (int i = 0; i < 5000; i++) {
            mas2[i] = k.nextInt();
        }
        int[] test1 = mas2.clone();
        int[] test2 = mas2.clone();
        int[] test3 = mas2.clone();
        int[] test4 = mas2.clone();

        Date start = new Date();
        SelectionSort.sort(test1);
        Date end = new Date();
        System.out.println("Select Sort runs " + (end.getTime() - start.getTime()) + " miliseconds for 5000 el");

        start = new Date();
        InsertionSort.sort(test2);
        end = new Date();

        System.out.println("InsertionSort runs " + (end.getTime() - start.getTime()) + " miliseconds for 5000 el");

        start = new Date();
        BubbleSort.sort(test3);
        end = new Date();

        System.out.println("BubbleSort runs " + (end.getTime() - start.getTime()) + " miliseconds for 5000 el");


        start = new Date();
        Arrays.sort(test4);

        end = new Date();

        System.out.println("Native Sort runs " + (end.getTime() - start.getTime()) + " miliseconds for 5000 el");

    }
}
