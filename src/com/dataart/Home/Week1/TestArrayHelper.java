package com.dataart.Home.Week1;

import java.util.Scanner;
import static com.dataart.Home.Week1.ArrayHelper.*;

/**
 * Created by Oleg on 20.01.2016.
 */
public class TestArrayHelper {
    public static void main(String[] args) {
        //int[] mas={256,-45,56,45,-87,53,89,88};
        int[] mas = newmas30();
        print(mas);
        //1
        getMinMaxValue(mas);
        //2
        replaceminmax(mas);
        print(mas);
        //3
        int[] newmas = newmas30();
        System.out.println("newmassiv");
        print(newmas);
        copyMasByElement(mas, newmas);
        System.out.println("new mas replaced by elements of previous one");
        print(newmas);
        //4
        System.out.println("input number to count how many times it will apear in last massive");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        System.out.println(countnumverinMassive(newmas, number) + " times");
        //5
        masspecificfill(newmas);
        print(newmas);
        //6
        System.out.println(avaragenum(newmas));
        //7
        printmaxpartavarage(newmas);
        //8
        print(mas);
        print(newmas);
        summaswithsamelength(mas, newmas);

        //9parnix chisel???
        //10
        print(splitArray(newmas, 4, 15));
    }
}
