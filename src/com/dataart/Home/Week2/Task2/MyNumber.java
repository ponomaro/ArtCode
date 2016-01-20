package com.dataart.Home.Week2.Task2;

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
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public void sum(MyNumber anotherNumber) {
        this.number += anotherNumber.getNumber();

    }

    public void deduct(MyNumber anotherNumber) {
        this.number -= anotherNumber.getNumber();
    }

    public void multipy(MyNumber anotherNumber) {
        this.number *= anotherNumber.getNumber();
    }

    public void devid(MyNumber anotherNumber) {
        if (this.number / anotherNumber.getNumber() == 0) {
            System.out.println("arifmetical exeption /0");
        } else {
            this.number = this.number / anotherNumber.getNumber();
        }

    }

    public void pow(MyNumber anotherNumber) {
        int temp = anotherNumber.getNumber();
        int mult = this.number;
        if (temp < 2) {
            System.out.println("Unable to calculate");
        } else {
            for (int i = 0; i < temp - 1; i++) {
                this.number *= mult;
            }
        }

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

    public void remainedOfDevision(MyNumber anotherNumber) {
        if (this.number / anotherNumber.getNumber() == 0) {
            System.out.println("Arifmatical exception /0");
        } else {
            this.number = this.number % anotherNumber.getNumber();
        }

    }

    public int compare(MyNumber anotherNumber) {

        return this.number > anotherNumber.getNumber() ? 1 : this.number == anotherNumber.getNumber()? 0: -1;
    }

    public int getNumber() {
        return number;
    }
}
