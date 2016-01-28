package com.dataart.сlass.week1.day1;

/**
 * Created by Oleg on 16.01.2016.
 */

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Input number of groups");
        int groupNumber = read.nextInt();

        String groupName = "", studentName = "", studentPhone = "";
        int studentsInGroup, studentAge;
        Group[] allgroups = new Group[groupNumber];

        for (int i = 0; i < groupNumber; i++) {
            System.out.println("Input " + (i + 1) + " group name");
            do {
                groupName = read.nextLine();
            } while (groupName.isEmpty());

            System.out.println("Input number of students in group");
            studentsInGroup = read.nextInt();
            allgroups[i] = new Group(groupName, studentsInGroup);

            for (int j = 0; j < studentsInGroup; j++) {
                System.out.println("Input " + (j + 1) + " student name");

                do {
                    studentName = read.nextLine();
                } while (studentName.isEmpty());

                System.out.println("Input " + (j + 1) + " student age");
                studentAge = read.nextInt();
                System.out.println("Input " + (j + 1) + " student phone");

                do {
                    studentPhone = read.nextLine();
                } while (studentPhone.isEmpty());

                allgroups[i].addStudent(j, studentName, studentAge, studentPhone);
                studentName = "";
                studentPhone = "";
            }
        }

        for (Group group : allgroups) {
            group.printgroup();
        }

        read.close();

    }
}
