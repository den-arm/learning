package com.den.simplefactory;

/**
 * 简单工厂的可扩展性不好
 */
public class VehicleFactory {

    public Car createCar(){
        //增加各种操作
        return new Car();
    }

    public  Broom createBroom(){
        //增加各种操作
        return new Broom();
    }

}
