package com.dataart.Class.week2.day2;

/**
 * Created by Oleg on 24.01.2016.
 */
public class Subject {
    private static final int maxSubject=100;// not more than 100 subjects
    private static Subject[] subjects = new Subject[maxSubject]; //allsubjects
    private static int count=1;
    private String name;
    private int hoursBySemestr;
    Subject(){}


    public Subject(String name, int hoursBySemestr) {
        this.name = name;
        this.hoursBySemestr = hoursBySemestr;
    }

    public String toString() {
        return null;
    }
    public int addSubjectToList(){
        subjects[count]=this;
        count++;
        return count-1;// returns number of added subject
    }
    public int removeLastSubjectFromList(){
        subjects[count-1]=null;
        count--;
        return count;// returns id of removed subject
    }
    public int getIdOfSubject(){
        for (int i = 1; i <count ; i++) {
            if(subjects[i].equals(this))return i;
        }
        return -1;
    }
    public Subject getSubjectbyid(int i){
        return subjects[i];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursBySemestr() {
        return hoursBySemestr;
    }

    public void setHoursBySemestr(int hoursBySemestr) {
        this.hoursBySemestr = hoursBySemestr;
    }
}
