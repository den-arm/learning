package com.den.abstractfactory;

public class ModenFactory extends Abstactfactory{
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Vechicle createVechicle() {
        return new Car();
    }
}
