package com.dataart.Class.week2.day2;

public class Student {

    private static double monthMoney = 790;
    private static int idCounter = 0;
    private String idNum;
    private String name;
    private int rank;

    private int[][] study = new int[8][3];//student can study only 8 subjects at same time and will have 3 fileds (idsubject/hourscompleted/examen(mark))
    private int countLessons = 1;// starting from one as int array will be inisialized with 0 not null
    private MyDate birthday;
    private Address address;
    private Contact contact;


    public Student(String name, int rank) {
        this.idNum = String.valueOf(idCounter);
        idCounter++;
        this.name = name;
        this.rank = rank;
    }

    public Student(String name, MyDate birthday,
                   Address address, Contact contact) {
        this.idNum = String.valueOf(idCounter);
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.contact = contact;
        idCounter++;
    }

    public static double getMonthMoney() {
        return monthMoney;
    }


    public void nonStaticMeth() {
        monthMoney++;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }


    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String toString() {
        return "id: " + idNum + " " + name + " " + birthday + " " + contact;
    }


    public int addSubjectForStudent(Subject subject) {
        study[countLessons][0] = subject.getIdOfSubject();
        countLessons++;
        return countLessons - 1;// returns number of classes stuent attend

    }

    public int removeSubjectForStudentLast() {
        countLessons--;
        study[countLessons][0] = 0;
        study[countLessons][1] = 0;
        study[countLessons][2] = 0;
        return countLessons;
    }

    public int study(Subject subject, int hours) {
        int subjectID=subject.getIdOfSubject();
        for (int i = 1; i < countLessons; i++) {
            if (study[i][0]== subjectID){
                study[i][1] += hours;
            return i;}

        }
        return -1;
    }

    public int hoursCompletedBySubject(Subject subject) {

        for (int i = 1; i < countLessons; i++) {
            if (study[i][0] == subject.getIdOfSubject())
                return study[i][1];
        }
        return -1;
    }

    public double averageMark() {
        int sum = 0;
        for (int i = 1; i < countLessons; i++) {
            sum += study[i][2];
        }
        return (double) sum / (countLessons - 1);
    }

    public int exam(Subject subject, int mark) {
        for (int i = 1; i < countLessons; i++) {
            if (study[i][0] == subject.getIdOfSubject()) {
                study[i][2] = mark;
                return 1;
            }
        }
        return -1;
    }

    public int getMarkSubject(Subject subject) {
        for (int i = 1; i < countLessons; i++) {
            if (study[i][0] == subject.getIdOfSubject()) {
                return study[i][2];
            }
        }
        return -1;
    }
    public int showAllStudy(){
        Subject subject=new Subject();
        for (int i = 1; i < countLessons; i++) {
            subject=subject.getSubjectbyid(i);

            System.out.printf("%s hours completed: %d: planned hours: %d mark %d \n",
                    subject.getName(),study[i][1],subject.getHoursBySemestr(),study[i][2]);
            //System.out.println();

        }
        return countLessons-1;
    }

}
