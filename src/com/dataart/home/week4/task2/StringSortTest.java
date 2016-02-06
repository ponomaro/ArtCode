package com.dataart.home.week4.task2;


import java.util.Arrays;

/**
 * Created by Home on 26.01.2016.
 */
public class StringSortTest {
    public static void main(String[] args) {

        final String[] strmas = {"zoo", "appela", "void", "cron", "appel"};
        String[] test = strmas.clone();

        final String[] SortZA = StringSort.sortStingMasZA(strmas);
        System.out.println();
        StringSort.printMas(SortZA);


        final String[] SortAZ = StringSort.sortStingMasAZ(strmas);
        StringSort.printMas(SortAZ);


        Arrays.sort(test);

        System.out.println("____________________________");
        System.out.println("test sortStingMasAZ: " + StringSort.areMasIdentical(SortAZ, test));

    }
}
