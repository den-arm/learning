package com.den.strategy;

import java.util.Comparator;

/**
 *
 */
//public class Cat {
//    int weight,height;
//
//    public Cat(int weight,int height){
//        this.weight = weight;
//        this.height = height;
//    }
//
//    public int compareTo(Cat c){
//        if(this.weight < c.weight) return -1;
//        else if(this.weight > c.weight) return 1;
//        else return 0;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "weight=" + weight +
//                ", height=" + height +
//                '}';
//    }
//}

//使用Comparable<T>接口并实现compareTo()抽象方法即可适配不同对象
//public class Cat implements Comparable<Cat>{
//    int weight,height;
//
//    public Cat(int weight,int height){
//        this.weight = weight;
//        this.height = height;
//    }
//
//    public int compareTo(Cat c){
//        if(this.weight < c.weight) return -1;
//        else if(this.weight > c.weight) return 1;
//        else return 0;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "weight=" + weight +
//                ", height=" + height +
//                '}';
//    }
//}

//面向对象设计中的一个原则是对修改关闭，对扩展开发，开闭原则。
//上例只是针对比较对象实现灵活设计，引入比较器Comparator接口，覆写compare()抽象方法,可实现不同的比较策略
public class Cat implements Comparable<Cat>{
    int weight,height;

    public Cat(int weight,int height){
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat c){
        if(this.weight < c.weight) return -1;
        else if(this.weight > c.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}

