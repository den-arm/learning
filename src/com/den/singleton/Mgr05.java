package com.den.singleton;

public class Mgr05 {
    private static volatile Mgr05 INSTANCE;

    private Mgr05(){};

    public static synchronized Mgr05 getInstance(){
        if(INSTANCE==null){
            //双重判断
            synchronized (Mgr05.class){
                if(INSTANCE==null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr05();
                }
            }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
