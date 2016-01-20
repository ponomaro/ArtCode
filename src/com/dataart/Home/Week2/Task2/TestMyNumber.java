package com.dataart.Home.Week2.Task2;
import java.math.BigInteger;

import static com.dataart.Home.Week2.Task2.TestMyNumber.*;

/**
 * Created by Oleg on 20.01.2016.
 */
public class TestMyNumber {
    public static void main(String[] args) {

        MyNumber test1= new MyNumber(45);
        MyNumber test2= new MyNumber(59);

        test1.sum(test2);
        System.out.println("sum check: "+(test1.getNumber()==45+59));


        MyNumber test3= new MyNumber(99);

        test2.deduct(test3);
        System.out.println("deduct check: "+(test2.getNumber()==59-99));


        MyNumber test4= new MyNumber(54);

        test3.devid(test4);
        System.out.println("devid check: "+(test3.getNumber()==99/54));


        MyNumber test5= new MyNumber(95);
        MyNumber test6= new MyNumber(38);

        test5.multipy(test6);
        System.out.println("multiply check: "+(test5.getNumber()==38*95));


        MyNumber test7= new MyNumber(2);
        MyNumber test8= new MyNumber(5);

        System.out.println("compare check: "+(test7.compare(test8)==-1));

        test7.pow(test8);
        System.out.println("pow check "+(test7.getNumber()==32));

        MyNumber test9= new MyNumber(3);
        //System.out.println(test9.factorial());
        System.out.println("factorial check: "+(test9.factorial().toString()).equals("6"));


        MyNumber test10= new MyNumber(3);
        MyNumber test11= new MyNumber(11);

        test11.remainedOfDevision(test10);
        System.out.println("remindofdevision check: "+(test11.getNumber()==2));

    }



}
