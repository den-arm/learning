package com.den.simplefactory;

public class Main {
    public static void main(String[] args) {

        Moveable m = new VehicleFactory().createBroom();
        //Moveable m = new VehicleFactory().createBroom();
        m.go();
    }
}