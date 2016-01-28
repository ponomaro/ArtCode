package com.dataart.home.week2.Task6;

/**
 * Created by Oleg on 20.01.2016.
 */
public class TestMyString {
    public static void main(String[] args) {

        MyString test1 = new MyString("HelloWorld");

        //test1.print();
        System.out.println("check to screen:" + (test1.tostring().equals("HelloWorld")));

        MyString test2 = new MyString("Hello");
        MyString test3 = new MyString("World");

        test2.concat(test3);
        System.out.println("check concat:" + (test2.tostring().equals("HelloWorld")));

        test2.toLower();
        System.out.println("check to lower: " + (test2.tostring().equals("helloworld")));

        test2.toUpper();
        System.out.println("check to upper: " + (test2.tostring().equals("HELLOWORLD")));


        MyString test4 = new MyString("Test Runs As Expected");

        test4.removeBlackSpace();
        System.out.println("check removeBlackSpace: " + (test4.tostring().equals("TestRunsAsExpected")));

        MyString test5;

        test5 = test4.Substring(5, 9);
        System.out.println("check substring: " + (test5.tostring().equals("unsA")));

        MyString test6 = new MyString("TestRunsAsExpected");
        MyString test7 = new MyString("uns");

        System.out.println("check substringindex: " + (test6.indexSubstring(test7) == 5));

        MyString test8 = new MyString("hello");
        MyString test9 = new MyString("hellq");

        System.out.println("check compare: " + (test8.compare(test9) == -1));

    }
}
