package com.java.sealed;

public sealed class Truck extends Vehicle permits PickupTruck, DumpTruck {
    @Override
    public String toString() {
        return "Truck";
    }
}
