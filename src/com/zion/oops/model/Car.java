package com.zion.oops.model;

public class Car {
        private String  carName;
        private String  carModel;
        private int  carGears;


        static{
            String  carType= "Luxury cars: ";
            System.out.println(carType);
        }

        public Car() {
        }

        public Car(String carName, String carModel, int carGears ) {
            this.carName = carName;
            this.carModel = carModel;
            this.carGears = carGears;
        }

        public String getCarName() {
            return carName;
        }

        public void setCarName(String carName) {
            this.carName = carName;
        }

        public String getCarModel() {
            return carModel;
        }

        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }

        public int getCarGears() {
            return carGears;
        }

        public void setCarGears(int carGears) {
            this.carGears = carGears;
        }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carGears=" + carGears +
                '}';
    }
}

