package com.den.abstractfactory;

public class MagicFactory extends Abstactfactory{
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    Vechicle createVechicle() {
        return new Broom();
    }
}
