package com.dataart.home.week2.Task2;

/**
 * Created by Oleg on 20.01.2016.
 */
public class TestMyNumber {
    public static void main(String[] args) {

        MyNumber test1= new MyNumber(45);
        MyNumber test2= new MyNumber(59);
        MyNumber result1,result2,result3,result4,result5,result6;
        result1=test1.sum(test2);
        System.out.println("sum check: "+(result1.getNumber()==45+59));


        MyNumber test3= new MyNumber(99);

        result2=test2.deduct(test3);
        System.out.println("deduct check: "+(result2.getNumber()==59-99));


        MyNumber test4= new MyNumber(54);

        result3=test3.devid(test4);
        System.out.println("devid check: "+(result3.getNumber()==99/54));


        MyNumber test5= new MyNumber(95);
        MyNumber test6= new MyNumber(38);

        result4=test5.multipy(test6);
        System.out.println("multiply check: "+(result4.getNumber()==38*95));


        MyNumber test7= new MyNumber(2);
        MyNumber test8= new MyNumber(5);

        System.out.println("compare check: "+(test7.compare(test8)==-1));

        result5=test7.pow(test8);
        System.out.println("pow check "+(result5.getNumber()==32));

        MyNumber test9= new MyNumber(3);
        //System.out.println(test9.factorial());
        System.out.println("factorial check: "+(test9.factorial().toString()).equals("6"));


        MyNumber test10= new MyNumber(3);
        MyNumber test11= new MyNumber(11);

        result6=test11.remainedOfDevision(test10);
        System.out.println("remindofdevision check: "+(result6.getNumber()==2));



    }



}
