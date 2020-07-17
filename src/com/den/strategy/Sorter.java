package com.den.strategy;

import java.util.Comparator;

/**
 *对基本类型数组的比较，需更换参数类型
 */
//public class Sorter {
//
//    public void sort(int[] arr) {
//        for(int i=0;i<arr.length-1;i++){
//            int minPos = i;
//
//            for(int j=i+1;j<arr.length; j++){
//                minPos = arr[j] < arr[minPos] ? j : minPos;
//            }
//
//            swap(arr,i,minPos);
//        }
//    }
//
//    private void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}

//对Cat的比较方法
//public class Sorter {
//
//    public void sort(Cat[] arr) {
//        for(int i=0;i<arr.length-1;i++){
//            int minPos = i;
//
//            for(int j=i+1;j<arr.length; j++){
//                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
//            }
//
//            swap(arr,i,minPos);
//        }
//    }
//
//    private void swap(Cat[] arr, int i, int j) {
//        Cat temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}

//对带有comparable接口的对象进行排序。
//public class Sorter {
//
//    public void sort(Comparable[] arr) {
//        for(int i=0;i<arr.length-1;i++){
//            int minPos = i;
//
//            for(int j=i+1;j<arr.length; j++){
//                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
//            }
//
//            swap(arr,i,minPos);
//        }
//    }
//
//    private void swap(Comparable[] arr, int i, int j) {
//        Comparable temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}

/**
 * 实现对不同对象的不同比较策略
 */
public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;

            for(int j=i+1;j<arr.length; j++){
                minPos = comparator.compare(arr[j],arr[minPos]) == -1 ? j : minPos;
            }

            swap(arr,i,minPos);
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}