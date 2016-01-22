package com.dataart.Home.Week2.Task6;

/**
 * Created by Oleg on 20.01.2016.
 * 6*. Написать класс строка
 * - создание на основе массива символов
 * - вывод на экран
 * - конкатенация
 * - понижение регистра
 * - повышение регистра
 * - поиск подстроки
 * - выделение подстроки
 * - удаление пробелов
 * - метод для сравнения с другой строкой
 */
public class MyString {
    private char[] myStringArray;

    public MyString(String input) {
        myStringArray = input.toCharArray();
    }

    private MyString(char[] myStringArray) {
        this.myStringArray = myStringArray;
    }

    public String tostring() {
        StringBuffer string = new StringBuffer("");
        for (char a : myStringArray) {
            string.append(a);
        }
        return string.toString();
    }

    public void print() {
        System.out.println(tostring());
    }

    public void concat(MyString anotherString) {
        int myLength = myStringArray.length;
        int anotherLength = anotherString.myStringArray.length;
        char[] result = new char[myLength + anotherLength];

        for (int i = 0; i < myLength; i++) {
            result[i] = myStringArray[i];
        }

        for (int i = myLength, k = 0; i < myLength + anotherLength; i++, k++) {
            result[i] = anotherString.myStringArray[k];
        }
        this.myStringArray = result;
    }

    public void toUpper() {
        for (int i = 0; i < myStringArray.length; i++) {
            myStringArray[i] = Character.toUpperCase(myStringArray[i]);
        }
    }

    public void toLower() {
        for (int i = 0; i < myStringArray.length; i++) {
            myStringArray[i] = Character.toLowerCase(myStringArray[i]);
        }
    }

    public int indexSubstring(MyString anotherString) {
        int id = -1;
        int substrL = anotherString.myStringArray.length;

        for (int i = 0, k = 0; i < myStringArray.length; i++) {
            if (myStringArray[i] == anotherString.myStringArray[k]) {
                if (k == substrL - 1) {
                    id = i - k;
                    break;
                }
                k++;
            } else k = 0;

        }

        return id;
    }

    public MyString Substring(int start, int end) {
        if (end < start || end > this.myStringArray.length || start < 0) {
            System.out.println("Подстрока не существует");
            return new MyString("");
        }
        char[] result = new char[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = myStringArray[i];

        }
        return new MyString(result);
    }

    public void removeBlackSpace() {
        int counter = 0;
        for (char c : myStringArray) {
            if (Character.isSpaceChar(c)) counter++;
        }
        char[] result = new char[myStringArray.length - counter];
        for (int i = 0, k = 0; i < result.length; i++, k++) {

            if (Character.isSpaceChar(myStringArray[k])) {
                i--;
                continue;
            }
            result[i] = myStringArray[k];
        }
        this.myStringArray = result;
    }

    public int compare(MyString anotherString) {
        int myLength = myStringArray.length;
        int anotherLength = anotherString.myStringArray.length;
        int min = myLength < anotherLength ? myLength : anotherLength;
        for (int i = 0; i < min; i++) {
            if (myStringArray[i] > anotherString.myStringArray[i]) return 1;
            if (myStringArray[i] < anotherString.myStringArray[i]) return -1;
        }
        return myLength > anotherLength ? 1 : myLength == anotherLength ? 0 : -1;
    }
}
