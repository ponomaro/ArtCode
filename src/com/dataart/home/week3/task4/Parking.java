package com.dataart.home.week3.task4;

/**
 * Created by Home on 26.01.2016.
 */
public class Parking {
    Motorcycle[] garage;
    String Adress;
    boolean isOpen = true;

    public Parking(int garage, String adress, boolean isOpen) {
        this.garage = new Motorcycle[garage];
        Adress = adress;
        this.isOpen = isOpen;
    }

    public int addMotoOnLastFreePlace(Motorcycle moto) {
        if(!isOpen){
            System.err.println("Parking is closed");
            return -1;
        }
        if (availablePlaces() > 0) {
            int idLastOcupied=-1;
            for (int i = garage.length - 1; i >= 0; i--) {
                if (garage[i] == null) {
                    idLastOcupied=i;
                    break;
                }
            }
            if (idLastOcupied!=-1)garage[idLastOcupied]=moto;
            return idLastOcupied;
        } else return -1;
    }

    public Motorcycle takeLastMoto() {
        if(!isOpen){
            System.err.println("Parking is closed");
            return null;
        }
        for (int i = garage.length - 1; i >= 0; i--) {
            if (garage[i] != null) {
                return garage[i];
            }

        }
        return null;
    }

    public int addMotoByPlaceNumber(Motorcycle moto, int place) {
        if(!isOpen){
            System.err.println("Parking is closed");
            return -1;
        }
        if (garage[place] == null) {
            garage[place] = moto;
            return 1;
        }
        return -1;
    }

    public Motorcycle takeMotoByPlaceNumber(int placeNumber) {
        if(!isOpen){
            System.err.println("Parking is closed");
            return null;
        }
        if (garage[placeNumber] != null) return garage[placeNumber];
        System.err.println("There is no bike at this place");
        return null;
    }

    public void clearGaragePlaces() {
        if(!isOpen){
            System.err.println("Can not remove bikes from closed parking");
            return;
        }
        for (int i = 0; i < garage.length; i++) {
            garage[i] = null;
        }

    }

    public boolean isOpen() {
        return isOpen;
    }

    public int open() {
        if (isOpen==false){
            isOpen=true;
            return 1;
        }
        else {
            System.err.println("Parking already opened");
        return -1;}
    }

    public int close() {
        if (isOpen==true){
            isOpen=false;
            return 1;
        }
        else {
            System.err.println("Parking already closed");
            return -1;}
    }

    public void changeAddress(String newAdress) {
        this.Adress = newAdress;
    }

    public int showAllInGarage() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null) System.out.println("Bike with tag :" + garage[i].getTag() + "located at place:" + i);
        }
        return garage.length-availablePlaces();//returns number of bikes in garage
    }

    public int availablePlaces() {
        int count = 0;
        for (Motorcycle moto : garage) {
            if (moto != null) count++;
        }
        return garage.length-count;
    }

    public String getAdress() {
        return Adress;
    }
}
