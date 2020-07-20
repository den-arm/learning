package com.den.factorymethod;

import com.den.simplefactory.Moveable;

/**
 * 在某一单一产品维度进行扩展
 */
public class Main {
    public static void main(String[] args) {
        //Moveable m = new CarFactory().create();
        Moveable m = new BroomFactory().create();
        m.go();
    }
}