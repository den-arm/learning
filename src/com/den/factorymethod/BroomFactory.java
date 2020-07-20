package com.den.factorymethod;

import com.den.simplefactory.Moveable;

public class BroomFactory {
    public Moveable create(){
        System.out.println("a Broom created!");
        return new Broom();
    }
}
