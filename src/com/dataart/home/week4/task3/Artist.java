package com.dataart.home.week4.task3;

/**
 * Created by Oleg on 06.02.2016.
 */
public abstract class Artist {
    protected long salary = 20_000, money;
    private int drink, performsToral;
    private String Name;

    public Artist(String name) {
        Name = name;
    }


    public void perform() {

        System.out.println("I am performing as an " + this.getClass().getSimpleName());
        performsToral++;

    }

    public void drink() {
        System.out.println(this.toString() + " drinking this is my " + (++drink) + "time");
    }

    public void paysalary() {
        money += salary;
        System.out.printf("Paid %d %s job: %s \r\n", salary, getName(), getClass().getSimpleName());
    }

    public String toString() {
        return getName();
    }

    public String getName() {
        return Name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getMoney() {
        return money;

    }

    public int getDrink() {
        return drink;
    }

    public int getPerformsToral() {
        return performsToral;
    }
}
