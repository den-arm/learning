package com.den.factorymethod;

import com.den.simplefactory.Moveable;

public class CarFactory {
    public Moveable create(){
        System.out.println("a car created!");
        return new Car();
    }
}
