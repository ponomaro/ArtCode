package com.dataart.Home.Week2.Task3;

/**
 * Created by Oleg on 20.01.2016.
 * 3. Написать класс дробь
 * - сложение дробей
 * - вычитание
 * - умножение
 * - деление
 * - приведение к строке
 * - вывод
 * - метод для сравнения с другой дробью
 */
public class MyFractNumber {
    private int above, down = 1;

    public MyFractNumber(int above, int down) {
        this.above = above;
        this.down = down;
        if (down==0) {
            System.out.println("Знаменатель не может быть равен нулю set to default(1)");
            this.down=1;
        }
    }

    public void sum(MyFractNumber anotherNumber) {
        this.toTheSameDelimiter(anotherNumber);
        this.above+=anotherNumber.above;
        this.minimize();
        anotherNumber.minimize();


    }

    public void deducte(MyFractNumber anotherNumber) {
        this.toTheSameDelimiter(anotherNumber);
        this.above-=anotherNumber.above;
        anotherNumber.minimize();
        this.minimize();

    }

    public void multyply(MyFractNumber anotherNumber) {
        this.above*=anotherNumber.above;
        this.down*=anotherNumber.down;
        this.minimize();

    }

    public void devid(MyFractNumber anotherNumber) {
        this.above*=anotherNumber.down;
        this.down*=anotherNumber.above;
        this.minimize();

    }

    public String toString() {

        return above+"/"+down;
    }

    public void Print(MyFractNumber anotherNumber) {
        System.out.println(this.toString());
    }

    public int compare(MyFractNumber anotherNumber) {
        this.toTheSameDelimiter(anotherNumber);
        int result;
        result= this.above>anotherNumber.above?1:this.above==anotherNumber.above?0:-1;
        this.minimize();
        anotherNumber.minimize();
        return result;
    }

    public String getNumber() {
        return this.toString();
    }

    private MyFractNumber toTheSameDelimiter(MyFractNumber anotherNumber) {
        int temp= this.down;
        this.above*=anotherNumber.down;
        this.down*=anotherNumber.down;

        anotherNumber.down*=temp;
        anotherNumber.above*=temp;
        return anotherNumber;

    }
    private void minimize() {
        if (this.down<0) {
            this.above*=-1;
            this.down*=-1;
        }

        for (int i = this.down; i >=1 ; i--) {
            if(this.down%i==0&&this.above%i==0) {
                this.down/=i;
                this.above/=i;
            }
        }
    }

}
