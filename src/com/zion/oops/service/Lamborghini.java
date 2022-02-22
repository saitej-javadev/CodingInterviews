package com.zion.oops.service;

import com.zion.oops.model.Car;

public class Lamborghini implements Cars {
    Car car;

    public Lamborghini(Car car) {
        this.car = car;
    }


    @Override
    public void drive() {
        System.out.println("Driving in "+car.getCarName());
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Lamborghini running in "+car.getCarGears()+"gear");

    }

    @Override
    public void stop() {
        System.out.println(car.getCarName()+" car stopped");

    }
}
