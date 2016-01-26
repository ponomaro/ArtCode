package com.dataart.Class.week2.day2;

public class Student {

    private static double monthMoney = 790;
    private static int idCounter = 0;
    private String idNum;
    private String name;
    private int rank;

    private MyDate birthday;
    private Address address;
    private Contact contact;

    private Study study;


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



    public void nonStaticMeth(){
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

    public String toString () {
        return "id: "+idNum+" "+ name+" "+birthday+" "+contact;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }
}
