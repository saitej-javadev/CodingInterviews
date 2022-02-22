package com.zion.oops.controller;

import com.zion.oops.model.Car;
import com.zion.oops.service.Bmw;
import com.zion.oops.service.Cars;
import com.zion.oops.service.Lamborghini;
import com.zion.oops.service.Mercedes;

public class CarMain {
    public static void main(String[] args) {

        new Bmw(new Car("BMW","Z4",12)).drive();


    }
}
