package com.dataart.home.week4.task3;

import com.dataart.сlass.week2.day2.Address;

import java.util.ArrayList;

/**
 * Created by Oleg on 06.02.2016.
 */
public class Circus {

    private String address, name;
    private ArrayList<Artist> artists = new ArrayList<>();

    public Circus(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void changeLocation(String address) {
        this.address = address;
    }

    public Artist hireArtist(String job, String name) {
        Artist temp = SimpleArtistFactory.hireActor(job, name);
        if (temp == null) return null;
        artists.add(temp);
        return temp;
    }

    public ArrayList<Artist> getArtists() {
        return artists;
    }

    public boolean fireDrinkAcrobat() {
        ArrayList<Acrobat> acrob = new ArrayList<>();
        int max = 0;
        for (Artist a : artists) {
            if (a instanceof Acrobat) {
                acrob.add((Acrobat) a);
                if (a.getDrink() > max) max = a.getDrink();
            }
        }
        if (max == 0) return false;
        for (Artist a : acrob) {
            if (a.getDrink() == max) {
                artists.remove(a);
                //        System.out.println(a);
            }
            ;
        }

        return true;
    }

    public void paySallary() {
        for (Artist a : artists) {
            a.paysalary();
        }
    }

    public int listArtists() {
        for (Artist a : artists) {
            System.out.println(a.getName() + " " + a.getClass().getSimpleName() + " performancr total:" + a.getPerformsToral());
        }
        return artists.size();
    }
}
