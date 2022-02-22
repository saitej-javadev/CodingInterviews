package com.zion.oops.service;

import com.zion.oops.model.Car;

public class Mercedes implements Cars {
    Car car;
    @Override
    public void drive() {
        System.out.println("Driving in Mercedes");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Mercedes running in " +gear+"th gear");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes car stopped");

    }
}
