package com.dataart.home.week3.task4;

/**
 * Created by Home on 26.01.2016.
 */
public class Motorcycle {
    private String Tag;
    private boolean isBroken=false;

    public Motorcycle(boolean isBroken, String tag) {
        this.isBroken = isBroken;
        Tag = tag;
    }

    public Motorcycle(String tag) {
        Tag = tag;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void fixMotorcycle() {
        isBroken = false;
    }
}
