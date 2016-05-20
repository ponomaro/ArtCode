package com.dataart.home.week3.task6;


import java.util.Arrays;

/**
 * Created by Home on 26.01.2016.
 */
public class StringSortTest {
    public static void main(String[] args) {

        String[] strmas = {"zoo", "appela", "void", "cron", "appel"};
        String[] test=strmas.clone();

        com.dataart.home.week4.task2.StringSort.sortStingMasZA(strmas);
        System.out.println();
        com.dataart.home.week4.task2.StringSort.printMas(strmas);


        com.dataart.home.week4.task2.StringSort.sortStingMasAZ(strmas);
        com.dataart.home.week4.task2.StringSort.printMas(strmas);


        Arrays.sort(test);

        System.out.println("____________________________");
        System.out.println("test sortStingMasAZ: "+ com.dataart.home.week4.task2.StringSort.areMasIdentical(strmas,test));

    }
}
