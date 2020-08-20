package com.example.app5;

public class Vehicle {

    private int speed;
    private final boolean hasBreakingSystem;
    private int numberOfWheels;

    private int rideSpeed;

    public Vehicle(int speed, boolean hasBreakingSystem, int numberOfWheels) {

        this.speed = speed;
        this.hasBreakingSystem = hasBreakingSystem;
        this.numberOfWheels = numberOfWheels;


    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getHasBreakingSystem() {
        return hasBreakingSystem;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getRideSpeed() {
        return rideSpeed;
    }

    public void ride() {
        int result = getSpeed() * getNumberOfWheels();
        rideSpeed = result;
    }

    @Override
    public String toString() {

        return String.format("%s: %d %s: %b %s: %d %s: %d", "Speed", getSpeed(), "\nHas Brakes", getHasBreakingSystem(), "\nNumber of Wheels", getNumberOfWheels(), "\nRide Speed", getRideSpeed());
    }
}
