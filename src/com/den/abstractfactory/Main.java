package com.den.abstractfactory;

/**
 * 对产品一族（多个不同类的合集）进行扩展比较方便
 */
public class Main {
    public static void main(String[] args) {

//        Car c = new Car();
//        c.go();
//        AK47 w = new AK47();
//        w.shoot();
//        Bread b = new Bread();
//        b.printName();

        //需修改部分，只是对象变更而已
        Abstactfactory f = new ModenFactory();
        //Abstactfactory f = new MagicFactory();

        //固定不变部分
        Vechicle c = f.createVechicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();

    }
}