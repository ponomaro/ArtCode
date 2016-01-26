package com.dataart.Class.week2.day2;

/**
 * Created by Oleg on 24.01.2016.
 */
/*
поля:

   		Предметы

   	методы:
   		учиться+
   		добавить предмет+
   		удалить предмет из списка последний+
   		показать всю информацию о предметах+
   		получить средний бал за все предметы+

   		количество проработанных часов студентом+
   		оценка студента за предмет+

   	методы:
   		сдать экзамен+
   		показать информацию о предмете+
   		получить оценку студента за предмет


 */
public class Study {

    private static final int maxSubject=8;// one student can not study for more than 8 subjects at the same time


    private Subject[] subjects = new Subject[maxSubject];
    //int[] marks;
    private int[] hoursCompleted = new int[maxSubject];
    private int[] examen = new int[maxSubject];

    public Study(Subject subjects) {


    }

    public void addSubjectForStudent(Subject subject) {

    }
    public void removeSubjectForStudentLast(Subject subject) {

    }

    public void study(Subject subject,int hours) {

    }
    public String[] hoursCompletedBySubject (){

        return null;
    }

    public double averageMark () {
        return 0;
    }

    public void exam(Subject subject,int mark) {

    }
    public int getMartSubject(Subject subject) {
        return 0;
    }


}
