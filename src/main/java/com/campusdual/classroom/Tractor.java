package com.campusdual.classroom;

public class Tractor implements  IMachine{

    protected int horsePower = 0;

    public Tractor(int hp) {
        this.horsePower = hp;
    }

    public void forward() {
        System.out.println("Tractor is moving forward.");
    }

    public void backward() {
        System.out.println("Tractor is moving backwards.");
    }

    @Override
    public void start() {
        System.out.println("The tractor is on.");
    }

    @Override
    public void stop() {
        System.out.println("The tractor is off.");
    }

    @Override
    public void maintenance() {
        System.out.println("The tractor is receiving maintenance.");
    }
}
