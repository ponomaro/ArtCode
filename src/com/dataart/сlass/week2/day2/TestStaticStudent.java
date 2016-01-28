package com.dataart.сlass.week2.day2;

/**
 * Created by serhii on 23.01.16.
 */
public class TestStaticStudent {


    public static void main(String[] args) {
        Student student1 = new Student("Kolia", 5);
        Student student2 = new Student("Vasia", 4);

        double money = Student.getMonthMoney();


    }
}
