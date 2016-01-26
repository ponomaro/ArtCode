package com.dataart.Class.week2.day2;

/**
 * Created by Oleg on 24.01.2016.
 */
public class TestSubject {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(1990,7,12);
        Subject Subject1 = new Subject("Math",80);
        Subject Subject2 = new Subject("Liturature",80);
        Subject Subject3 = new Subject("Music",10);

        Student student1 =
                new Student("Oleg", myDate,
                        new Address("UA","Kiev","peremogy sqr", 34),
                        new Contact("+343434334", null));
        Student student2 =
                new Student("Oleg", myDate,
                        new Address("UA","Odessa","derebasovskaya st", 2),
                        new Contact("+34300000", null));

        Group group = new Group("ACO-11");

        group.addStudent(student1);
        group.addStudent(student2);

        Study study1 = new Study(Subject1);
        Study study2 = new Study(Subject2);


        student1.setStudy(study1);
        student2.setStudy(study2);


        System.out.println("addSubjectForStudent");
        System.out.println("removeSubjectForStudentLast");
        System.out.println("study");
        System.out.println("hoursCompletedBySubject");
        System.out.println("averageMark");
        System.out.println("exam");
        System.out.println("exam");

    }



}
