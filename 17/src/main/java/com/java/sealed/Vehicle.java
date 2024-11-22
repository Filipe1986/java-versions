package com.java.sealed;

public sealed class Vehicle permits Car, Truck, Motorcycle  {
    @Override
    public String toString() {
        return "Vehicle";
    }
}
