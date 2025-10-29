package com.campusdual.classroom;

public class Exercise {

    public static void main(String[] args) {
        Plane plane = new Plane("Boeing");
        Tractor tractor = new Tractor(3500);
        IMachine plane1 = new Plane("Concord");
        IMachine tractor1 = new Tractor(5000);

        plane.start();
        tractor.start();
        plane1.stop();
        tractor1.maintenance();

        plane.fly();
        tractor.forward();
        ((Plane)plane1).takeOff();
        ((Plane)plane1).land();
        ((Tractor) tractor1).backward();

    }
}