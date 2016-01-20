package com.dataart.Home.Week2.Task5;


import java.util.Arrays;
import java.util.Random;

/**
 * Created by Oleg on 20.01.2016.
 * <p>
 * 5. Написать класс массив.
 * - нахождение минимального
 * - нахождение максимального
 * - заполнение случайными числами в диапазоне
 * - красивый вывод на экран {2 4 5 6}
 * -* увеличить размер
 * -* сделать сортировку массива
 * -* метод для сравнения с другим массивом
 */
public class MyMassiv {
    private int[] myMas;

    public MyMassiv(int[] myMas) {
        this.myMas = myMas;
    }

    public int min() {
        int min = this.myMas[0];
        for (int a : this.myMas) {
            if (a < min) min = a;
        }

        return min;
    }

    public int max() {
        int max = this.myMas[0];
        for (int a : this.myMas) {
            if (a > max) max = a;
        }
        return max;
    }

    public void fillRand(int start, int end) {
        for (int i = 0; i <this.myMas.length ; i++) {
            this.myMas[i] = randomInt(start, end);
        }

    }

    public int[] getMyMas() {
        return myMas;
    }

    public void extend(int a) {
        int[] newmas = new int[this.myMas.length + a];
        for (int i = 0; i < this.myMas.length; i++) {
            newmas[i] = this.myMas[i];
        }
        this.myMas = newmas;

    }

    public void print() {


        int iMax = this.myMas.length - 1;
        if (iMax == -1)
            System.out.println("{}");

        StringBuilder b = new StringBuilder();
        b.append('{');
        for (int i = 0;i<this.myMas.length ; i++) {
            b.append(this.myMas[i]);
            if (i == iMax)
                System.out.println(b.append('}').toString());
            b.append(" ");
        }

    }

    public void sort() {
        Arrays.sort(this.myMas);
    }

    public int compare(MyMassiv anotherMassiv) {

        return this.myMas.length > anotherMassiv.myMas.length ? 1 : this.myMas.length == anotherMassiv.myMas.length ? 0 : -1;
    }

    public static int randomInt(int start, int end) {
        Random result = new Random();
        return result.nextInt(end - start) + start;
    }
}
