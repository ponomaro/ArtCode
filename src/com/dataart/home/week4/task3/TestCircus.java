package com.dataart.home.week4.task3;

/**
 * Created by Oleg on 06.02.2016.
 */
public class TestCircus {

    public static void main(String[] args) {

        Circus circ = new Circus("centr", "Best");

        Artist artist1 = circ.hireArtist("acrobat", "Scacun");
        Artist artist2 = circ.hireArtist("circusactor", "Fokusnik");
        Artist artist3 = circ.hireArtist("ropewalker", "Kanatohod");
        //list of artists


        //hire new
        int before = circ.getArtists().size();
        Artist artist4 = circ.hireArtist("acrobat", "Psih");
        int after = circ.getArtists().size();
        System.out.println();
        System.out.println("test hire: " + (before + 1 == after));
        System.out.println();

        //fire drink acrobat
        int before2 = circ.getArtists().size();
        artist1.drink();
        artist1.drink();
        artist1.drink();
        artist4.drink();
        circ.fireDrinkAcrobat();
        int after2 = circ.getArtists().size();

        System.out.println();
        System.out.println("test fire drink acrobat: " + (before2 - 1 == after2));
        System.out.println();

        //get number of performance
        artist2.perform();
        artist2.perform();
        artist3.perform();
        artist4.perform();

        System.out.println();
        System.out.println("test Perform: " + (artist2.getPerformsToral() == 2));
        System.out.println();

        //pay sellery
        long selbefore = artist2.getMoney();
        circ.paySallary();
        long selafter = artist2.getMoney();

        System.out.println();
        System.out.println("test Paysallary: " + (selafter - selbefore == artist2.getSalary()));
        System.out.println();

        //list actors + number of berformanct for each
        int actors = circ.listArtists();
        System.out.println();
        System.out.println("list Artist: " + (actors == 3));
        System.out.println();

        //change location
        String adr1 = circ.getAddress();
        circ.changeLocation("maidan");
        String adr2 = circ.getAddress();

        System.out.println();
        System.out.println("Change adress: " + (!adr1.equals(adr2)));
    }


}
