package com.dataart.Class.week1.day1;

/**
 * Created by Oleg on 16.01.2016.
 */
public class Student {

    public String name;
    public int age;
    public String phone;

    public Student(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public String studentToString()
    {
        return name+" "+age+" years old his phone nuber is \""+phone+"\"";

    }

}
