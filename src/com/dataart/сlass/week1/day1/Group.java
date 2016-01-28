package com.dataart.сlass.week1.day1;

/**
 * Created by Oleg on 17.01.2016.
 */
public class Group {

    String name;
    Student[] students;

    public Group(String name, int groupCount) {
        this.name = name;
        this.students = new Student[groupCount];
    }

    public void addStudent(int studentnumber, String name, int age, String phone) {
        this.students[studentnumber] = new Student(name, age, phone);
    }

    public void printgroup() {
        System.out.println("Group name is " + name);
        System.out.println("This group has " + students.length + " students they are:");
        for (Student a : students) {
            System.out.println(a.studentToString());
        }
    }
}
