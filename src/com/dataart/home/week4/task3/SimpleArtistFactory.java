package com.dataart.home.week4.task3;

/**
 * Created by Oleg on 06.02.2016.
 */
public class SimpleArtistFactory {

    public static Artist hireActor(String job, String name) {
        Artist artist = null;

        if (job.equals("acrobat")) {
            artist = new Acrobat(name);
        } else if (job.equals("circusactor")) {
            artist = new CircusActor(name);
        } else if (job.equals("ropewalker")) {
            artist = new RopeWalker(name);
        }
        return artist;
    }
}
