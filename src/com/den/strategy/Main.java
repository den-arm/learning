package com.den.strategy;

import java.util.Arrays;

/**
 * writing tests first!
 * extreme programming
 */
public class Main {
    public static void main(String[] args) {
        //int[] a= {9,2,3,5,7,1,4};
//        Cat[] a = {new Cat(3,3),new Cat(1,1),new Cat(5,5)};
//        Sorter sorter= new Sorter();
//        sorter.sort(a);
//        System.out.println(Arrays.toString(a));

          Cat[] a = {new Cat(3,7),new Cat(5,5),new Cat(1,2)};
          Sorter<Cat> sorter= new Sorter<Cat>();
          sorter.sort(a,new CatWeightComparator());
          System.out.println(Arrays.toString(a));
          sorter.sort(a,new CatHeightComparator());
          System.out.println(Arrays.toString(a));
    }
}
