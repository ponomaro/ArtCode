package com.dataart.home.week3.task4;

/**
 * Created by Home on 26.01.2016.
 */
public class TestParking {
    public static void main(String[] args) {

        Parking parking1 = new Parking(10, "this adress", true);
        Motorcycle moto1 = new Motorcycle("Moto1");
        Motorcycle moto2 = new Motorcycle("Moto2");
        Motorcycle moto3 = new Motorcycle("Moto3");
        Motorcycle moto4Broken = new Motorcycle(true, "Moto4Broken");
        Biker biker1 = new Biker("Biker1");
        Biker biker2 = new Biker("Biker1", moto1);
        Biker biker3 = new Biker("Biker1", moto2);
        Biker biker4 = new Biker("Biker1", moto4Broken);

        biker2.sellMotorcycle();
        System.out.println("test sellMotorcycle " + (biker2.getBike() == null));

        moto4Broken.fixMotorcycle();
        System.out.println("test fixMotorcycle " + (moto4Broken.isBroken() == false));

        biker2.buyMotorcycle(moto3);
        System.out.println("test buyMotorcycle " + ((biker2.getBike() != null)));

        int addMoto = parking1.addMotoOnLastFreePlace(moto1);
        System.out.println("test addMotoOnLastFreePlace " + (addMoto != -1));

        Motorcycle lastMoto = parking1.takeLastMoto();
        System.out.println("test takeLastMoto " + (lastMoto != null));

        int addmotor1 = parking1.addMotoByPlaceNumber(moto4Broken, 4);
        System.out.println("test addMotoByPlaceNumber " + (addmotor1 > 0));

        Motorcycle testTakeMoto = parking1.takeMotoByPlaceNumber(4);
        System.out.println("test takeMotoByPlaceNumber " + (testTakeMoto == moto4Broken));


        parking1.clearGaragePlaces();
        System.out.println("test clearGaragePlaces " + (parking1.availablePlaces() == 10));

        parking1.close();
        System.out.println("test close " + (parking1.isOpen() == false));

        parking1.open();
        System.out.println("test open " + (parking1.isOpen() == true));

        String adressBefore = parking1.getAdress();
        parking1.changeAddress("final address");
        String adressafter = parking1.getAdress();
        System.out.println("test changeAddress " + (!adressafter.equals(adressBefore)));

        parking1.addMotoOnLastFreePlace(moto1);
        int all = parking1.showAllInGarage();
        System.out.println("test showAllInGarage " + (all == 1));


    }
}
