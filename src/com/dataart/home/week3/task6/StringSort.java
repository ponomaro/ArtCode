package com.dataart.home.week3.task6;

/**
 * Created by Home on 26.01.2016.
 */
public class StringSort {
    public static void sortStingMasAZ(String[] strmas) {
        String temp;
        for (int j = 0; j < strmas.length - 1; j++) {
            for (int i = 0; i < strmas.length - 1; i++) {
                if (strmas[i].compareTo(strmas[i + 1]) > 0) {
                    temp = strmas[i];
                    strmas[i] = strmas[i + 1];
                    strmas[i + 1] = temp;
                }
            }
        }
    }

    public static void sortStingMasZA(String[] strmas) {
        String temp;
        for (int j = 0; j < strmas.length - 1; j++) {
            for (int i = 0; i < strmas.length - 1; i++) {
                if (strmas[i].compareTo(strmas[i + 1]) < 0) {
                    temp = strmas[i];
                    strmas[i] = strmas[i + 1];
                    strmas[i + 1] = temp;
                }
            }
        }
    }

    public static void printMas(String[] strmas) {
        for (String string : strmas) {
            System.out.println(string);
        }
    }
    public static boolean areMasIdentical(String[] strmas,String[] strmas2) {
        if (strmas.length!=strmas2.length) return false;
        for (int i = 0; i <strmas.length ; i++) {
            if(!strmas[i].equals(strmas2[i]))return false;
        }
        return true;
    }
}
