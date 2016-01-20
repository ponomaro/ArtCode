package com.dataart.Home.Week2.Task5;

import static com.dataart.Home.Week2.Task5.MyMassiv.*;

/**
 * Created by Oleg on 20.01.2016.
 */
public class TestMyMassiv {
    public static void main(String[] args) {


        MyMassiv test1 = new MyMassiv(new int[]{4, 5, 9, 8, 7});

        System.out.println("check min: " + (test1.min() == 4));
        System.out.println("check max: " + (test1.max() == 9));


        MyMassiv test2 = new MyMassiv(new int[15]);
        //test2.print();
        test2.fillRand(15, 25);
        //test2.print();

        System.out.println("rand check: " + (test2.getMyMas()[0] >= 15 && test2.getMyMas()[0] < 25));


        MyMassiv test3 = new MyMassiv(new int[15]);

        test2.extend(3);


        System.out.println("extend check: " + (test2.getMyMas().length - test3.getMyMas().length == 3));
        System.out.println("compare check: " + (test2.compare(test3) == 1));
        System.out.println("sort test manual before:");

        test2.print();
        test2.sort();
        System.out.println("sort test manual after:");
        test2.print();
    }

}
