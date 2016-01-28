package com.dataart.home.week2.Task2;

import java.math.BigInteger;

/**
 * Created by Oleg on 20.01.2016.
 * 2. Написать класс число.
 * - сложение
 * - вычитание
 * - умножение
 * - деление
 * - возведение в степень
 * - вычисление факториала
 * - вычисление остатка от деления
 * - метод который сравнивает два числа
 */
public class MyNumber {
    private final int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public MyNumber sum(MyNumber anotherNumber) {
        return new MyNumber(this.number + anotherNumber.getNumber());

    }

    public MyNumber deduct(MyNumber anotherNumber) {

        return new MyNumber(this.number - anotherNumber.getNumber());
    }

    public MyNumber multipy(MyNumber anotherNumber) {
        return new MyNumber(this.number * anotherNumber.getNumber());
    }

    public MyNumber devid(MyNumber anotherNumber) {
        if (this.number / anotherNumber.getNumber() == 0) {
            System.out.println("arifmetical exeption /0");
        } else {
          return new MyNumber(this.number / anotherNumber.getNumber());
        }
        return null;
    }

    public MyNumber pow(MyNumber anotherNumber) {
        int temp = anotherNumber.getNumber();
        int result=this.number;
        int mult = this.number;
        if (temp < 2) {
            System.out.println("Unable to calculate");
        } else {
            for (int i = 0; i < temp - 1; i++) {
                result *= mult;
            }
        }
        return new MyNumber(result);
    }

    public BigInteger factorial() {
        BigInteger factorial = new BigInteger("" + this.number);
        int temp = this.number - 1;
        if (this.number < 0) {
            return new BigInteger("0");
        }
        if (factorial.toString().equals("1")) return factorial;
        while (temp > 1) {
            factorial = factorial.multiply(new BigInteger("" + temp));
            temp--;
        }

        return factorial;
    }

    public MyNumber remainedOfDevision(MyNumber anotherNumber) {
        if (this.number / anotherNumber.getNumber() == 0) {
            System.out.println("Arifmatical exception /0");
        } else {
            return new MyNumber(this.number % anotherNumber.getNumber());
        }
        return null;
    }

    public int compare(MyNumber anotherNumber) {

        return this.number > anotherNumber.getNumber() ? 1 : this.number == anotherNumber.getNumber()? 0: -1;
    }

    public int getNumber() {
        return number;
    }

}
