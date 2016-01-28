package com.dataart.сlass.week2.day2;

/**
 * Created by Oleg on 24.01.2016.
 */
public class TestSubject {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(1990, 7, 12);
        Subject Subject1 = new Subject("Math", 80);
        Subject Subject2 = new Subject("Liturature", 80);
        Subject Subject3 = new Subject("Music", 10);
        Subject1.addSubjectToList();
        Subject2.addSubjectToList();
        Subject3.addSubjectToList();


        Student student1 =
                new Student("Oleg", myDate,
                        new Address("UA", "Kiev", "peremogy sqr", 34),
                        new Contact("+343434334", null));
        Student student2 =
                new Student("Oleg", myDate,
                        new Address("UA", "Odessa", "derebasovskaya st", 2),
                        new Contact("+34300000", null));

        Group group = new Group("ACO-11");

        group.addStudent(student1);
        group.addStudent(student2);


        student1.addSubjectForStudent(Subject1);
        student1.addSubjectForStudent(Subject2);
        student1.addSubjectForStudent(Subject3);
        student2.addSubjectForStudent(Subject1);
        int add = student2.addSubjectForStudent(Subject2);
        int nextadd = student2.addSubjectForStudent(Subject3);


        System.out.println("addSubjectForStudent " + ((add - nextadd) == -1));

        int remove = student2.removeSubjectForStudentLast();
        System.out.println("removeSubjectFromStudentLast " + ((nextadd - remove) == 0));

        int study = student2.study(Subject1, 8);
        System.out.println("study " + (study != -1));

        int hoursCompleted = student2.hoursCompletedBySubject(Subject1);
        System.out.println("hoursCompletedBySubject " + (hoursCompleted == 8));

        int exam1 = student1.exam(Subject1, 4);
        System.out.println("exam " + (exam1 != -1));

        student1.exam(Subject2, 3);
        student1.exam(Subject3, 5);

        double averagemark = student1.averageMark();
        System.out.println("averageMark " + (averagemark == 4));


        int getmark = student1.getMarkSubject(Subject2);
        System.out.println("getMarkSubject " + (getmark == 3));

        int showall = student1.showAllStudy();
        System.out.println("showAllStudy " + (showall == 3));

    }


}
