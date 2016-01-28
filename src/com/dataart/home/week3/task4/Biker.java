package com.dataart.home.week3.task4;

/**
 * Created by Home on 26.01.2016.
 */
public class Biker {
    private String name;
    private Motorcycle bike;

    public Biker(String name) {
        this.name = name;
    }

    public Biker(String name, Motorcycle bike) {
        this.name = name;
        this.bike = bike;
    }

    public void buyMotorcycle(Motorcycle bike) {
        if (this.bike == null) {
            this.bike = bike;
        } else {
            System.err.println("This biker already has bike");
        }

    }

    public void sellMotorcycle() {
        if (this.bike == null) {
            System.err.println(name + " has no bike to sell");
        } else {
            this.bike = null;
        }
    }

    public Motorcycle getBike() {
        return bike;
    }

    public String getName() {
        return name;
    }
}
