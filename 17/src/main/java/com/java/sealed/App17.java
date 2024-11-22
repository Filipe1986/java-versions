package com.java.sealed;

public class App17 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);
        Car car = new Car();
        System.out.println(car);
        Truck truck = new Truck();
        System.out.println(truck);
        Motorcycle motorcycle = new Motorcycle();
        System.out.println(motorcycle);
        DumpTruck dumpTruck = new DumpTruck();
        System.out.println(dumpTruck);
        PickupTruck pickupTruck = new PickupTruck();
        System.out.println(pickupTruck);

        Boat boat = new Boat();
        System.out.println(boat);
    }




}
