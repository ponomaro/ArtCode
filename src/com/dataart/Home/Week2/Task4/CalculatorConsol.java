package com.dataart.home.week2.Task4;


import java.util.Scanner;

/**
 * Created by Oleg on 20.01.2016.
 * <p/>
 * 4. Написать калькулятор в виде консольного меню
 * - сложение двух чисел
 * - вычитание двух чисел
 * - умножение двух чисел
 * - деление двух чисел
 */
public class CalculatorConsol {
    public static void Calculator() {

        Scanner read = new Scanner(System.in);
        int operation, a, b, result = 0;
        while (true) {
            System.out.println("Выберите операцию которую хотите сделать (введите ее соответсвующий номер)");
            System.out.println("1-ложение двух чисел");
            System.out.println("2-вычитание двух чисел");
            System.out.println("3-умножение двух чисел");
            System.out.println("4-деление двух чисел");
            System.out.println("5-выход");
            try {
                operation = read.nextInt();
                if (operation == 5) break;
                if (operation > 5 || operation < 0) {
                    System.out.println("Выбрано не поддерживаемое действие");
                    continue;
                }
                System.out.println("введите первое число");
                a = read.nextInt();
                System.out.println("введите второе число");
                b = read.nextInt();
                switch (operation) {
                    case 1:
                        result = sum(a, b);
                        break;
                    case 2:
                        result = deduct(a, b);
                        break;
                    case 3:
                        result = multyply(a, b);
                        break;
                    case 4:
                        result = devide(a, b);
                        break;

                }
                System.out.println("Результат: " + result);
            }
            catch(Exception e)
            {
                System.out.println("при вводе используються только int значения иначе программа завершаеться");
                break;
            }
        }

    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int deduct(int a, int b) {
        return a - b;
    }

    public static int multyply(int a, int b) {
        return a * b;
    }

    public static int devide(int a, int b) {
        return a / b;
    }

}
