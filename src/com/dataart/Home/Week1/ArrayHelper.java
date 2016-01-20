package com.dataart.Home.Week1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Oleg on 16.01.2016.
 */
public class ArrayHelper {


    public static void getMinMaxValue(int[] mas) {
        int min = mas[0];
        int max = min;
        for (int i = 1; i < mas.length; i++) {
            if (min > mas[i]) min = mas[i];
            if (max < mas[i]) max = mas[i];
        }

        System.out.println("min value = " + min + " max value = " + max);
    }

    public static int[] newmas30() {
        int[] mas = new int[30];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 50) + 25;
        }

        return mas;
    }

    public static void print(int[] mas) {
        System.out.println(Arrays.toString(mas));
    }

    public static void replaceminmax(int[] mas) {
        int minind = 0;
        int maxind = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[minind] > mas[i]) minind = i;
            if (mas[maxind] < mas[i]) maxind = i;
        }
        int temp;
        temp = mas[minind];
        mas[minind] = mas[maxind];
        mas[maxind] = temp;

    }

    public static void copyMasByElement(int[] mas, int[] mas2) {
        if (mas.length != mas2.length) {
            System.out.println("massives have different length copy will not be provided");
            return;
        }

        for (int i = 0; i < mas.length; i++) {
            mas2[i] = mas[i];
        }

    }

    public static int countnumverinMassive(int[] mas, int number) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == number) count++;
        }
        return count;
    }

    public static void masspecificfill(int[] mas) {
        int randomnum;
        for (int i = 0; i < mas.length; i++) {
            randomnum = (int) (Math.random() * 5000);
            if (i % 2 == 0) {
                if (randomnum % 2 == 0) mas[i] = randomnum;
                else mas[i] = randomnum + 1;
            } else {
                if (randomnum % 2 != 0) mas[i] = randomnum;
                else mas[i] = randomnum + 1;
            }
        }
    }

    public static double avaragenum(int[] mas) {
        Double avarage = 0.0;
        for (int c : mas) {
            avarage += c;
        }
        return avarage / mas.length;
    }

    public static void printmaxpartavarage(int[] mas) {
        long part1 = 0, part2 = 0;

        for (int i = 0; i < mas.length / 2 + 1; i++) {
            part1 += mas[i];
            part2 += mas[mas.length - i - 1];
        }

        for (int i = 0; i < mas.length / 2 + 1; i++) {
            if (part1 > part2) System.out.print(mas[i] + " ");
            if (part1 < part2) System.out.print(mas[i + (mas.length / 2)] + " ");

        }
        System.out.println();
    }

    public static void summaswithsamelength(int[] mas, int[] mas2) {
        if (mas.length == mas2.length) {
            int[] result = new int[mas.length];
            for (int i = 0; i < mas.length; i++)
                result[i] = mas[i] + mas2[i];
            print(result);
        } else System.out.println("ERROR elements have different length");
    }

    public static int[] splitArray(int[] arr, int start, int end) {
        int[] result = new int[end - start + 1];
        for (int i = 0; i < result.length; i++)
            result[i] = arr[i + start];
        return result;
    }
}

