package com.den.factorymethod;

import com.den.simplefactory.Moveable;

public class Broom implements Moveable {
    public void go(){
        System.out.println("a Broom created!");
    }
}
