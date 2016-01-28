package com.dataart.home.week2.Task3;

/**
 * Created by Oleg on 20.01.2016.
 */
public class TestMyFactNumber {
    public static void main(String[] args) {

        MyFractNumber test1= new MyFractNumber(4,5);
        MyFractNumber test2= new MyFractNumber(6,10);

        test1.sum(test2);
        //System.out.println(test1.toString());
        System.out.println("checks sum: "+(test1.getNumber().equals("7/5")));

        MyFractNumber test3= new MyFractNumber(3,10);

        test3.deducte(test2);
        //System.out.println(test3);
        System.out.println("checks deduct: "+(test3.getNumber().equals("-3/10")));

        MyFractNumber test4= new MyFractNumber(5,6);
        MyFractNumber test5= new MyFractNumber(1,3);
        test4.multyply(test5);
        System.out.println("checks multyply: "+(test4.getNumber().equals("5/18"))); // must be added

        MyFractNumber test6= new MyFractNumber(8,3);
        MyFractNumber test7= new MyFractNumber(1,3);
        test6.devid(test7);
        System.out.println("checks devide: "+(test6.getNumber().equals("8/1")));// must be added

        MyFractNumber test8= new MyFractNumber(3,4);
        MyFractNumber test9= new MyFractNumber(6,8);

        System.out.println("checks compare: "+(test8.compare(test9)==0));


    }

}
