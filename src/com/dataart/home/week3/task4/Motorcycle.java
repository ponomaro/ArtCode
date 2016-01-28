package com.dataart.home.week3.task4;

/**
 * Created by Home on 26.01.2016.
 */
public class Motorcycle {
    private String tag;
    private boolean isBroken = false;

    public Motorcycle(boolean isBroken, String tag) {
        this.isBroken = isBroken;
        this.tag = tag;
    }

    public Motorcycle(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void fixMotorcycle() {
        isBroken = false;
    }
}
