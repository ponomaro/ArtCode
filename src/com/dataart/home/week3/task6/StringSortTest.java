package com.dataart.home.week3.task6;


import java.util.Arrays;

/**
 * Created by Home on 26.01.2016.
 */
public class StringSortTest {
    public static void main(String[] args) {

        String[] strmas = {"zoo", "appela", "void", "cron", "appel"};
        String[] test=strmas.clone();

        StringSort.sortStingMasZA(strmas);
        System.out.println();
        StringSort.printMas(strmas);


        StringSort.sortStingMasAZ(strmas);
        StringSort.printMas(strmas);


        Arrays.sort(test);

        System.out.println("____________________________");
        System.out.println("test sortStingMasAZ: "+StringSort.areMasIdentical(strmas,test));

    }
}
