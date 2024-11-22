package com.java.sealed;

/**
 *
 Boat can not extend Vehicle because Vehicle is sealed and Boat is not listed in permitted.

 */
public class Boat //extends Vehicle
{
    @Override
    public String toString() {
        return "Boat";
    }
}
