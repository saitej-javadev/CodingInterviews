package com.zion.oops.service;

import com.zion.oops.model.Car;

public class Bmw implements Cars {
    Car car;

    public Bmw(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("Driving in "+car.getCarName()+" " +car.getCarModel()+" model");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("changing gear in BMW");

    }

    @Override
    public void stop() {
        System.out.println("BMW car stopped");

    }
}
