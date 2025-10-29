package com.campusdual.classroom;

public class Plane implements IMachine{

    private final String name;

    public Plane(String name) {
        this.name = name;
    }

    public void takeOff() {
        System.out.println("Plane is taking off.");
    }

    public void land() {
        System.out.println("Plane is landing.");
    }

    public void fly() {
        System.out.println("Plane is flying.");
    }

    @Override
    public void start() {
        System.out.println("Plane is on.");
    }

    @Override
    public void stop() {
        System.out.println("Plane is off.");
    }

    @Override
    public void maintenance() {
        System.out.println("Plane is receiving maintenance.");
    }
}
