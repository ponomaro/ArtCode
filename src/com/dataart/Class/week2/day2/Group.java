package com.dataart.Class.week2.day2;

/**
 * Created by serhii on 23.01.16.
 */
public class Group {

    private int freePlace = 0;
    private String groupName;
    private Student[] students = new Student[24];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student greenStudent) {
        students[freePlace] = greenStudent;
        freePlace++;
    }

    public Student deleteLastStudent() {
        freePlace--;
        Student toreturn=students[freePlace];
        students[freePlace] = null;
        return toreturn;
    }

    public Student deleteStudentById(String id) {

        for (int i = 0; i <freePlace ; i++) {
            if(students[i].getIdNum().equals(id)) {
                Student toreturn=students[i];
                for (; i <freePlace-1 ; i++) {
                    students[i]=students[i+1];
                }
                students[freePlace] = null;
                freePlace--;
                return toreturn;
            }
        }

        return null;
    }

    public Student findById(String id) {
        if (id == null) {
            System.out.println("findById not working input value null");
            return null;
        }
        for (int i = 0; i < freePlace; i++) {
            if (students[i].getIdNum().equals(id)) return students[i];
        }
        return null;
    }

    public Student[] filterByName(String name) {
        int count = 0;
        for (int i = 0; i < freePlace; i++) {
            if (students[i].getName().equals(name)) count++;
        }
        if (count > 0) {
            Student[] result = new Student[count];
            for (int i = 0, k = 0; i < freePlace; i++) {
                if (students[i].getName().equals(name)) {
                    result[k] = students[i];
                    k++;
                }

            }
            return result;
        }
        return null;
    }

    public Student[] filterByCity(String city) {
        int count = 0;
        for (int i = 0; i < freePlace; i++) {
            if (students[i].getAddress().getCity().equals(city)) count++;
        }
        if (count > 0) {
            Student[] result = new Student[count];
            for (int i = 0, k = 0; i < freePlace; i++) {
                if (students[i].getAddress().getCity().equals(city)) {
                    result[k] = students[i];
                    k++;
                }

            }
            return result;
        }
        return null;
    }

    public String allStudents() {
        return null;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getSize() {
        return freePlace;
    }
}
