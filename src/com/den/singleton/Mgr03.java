package com.den.singleton;

/**
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题。
 * 可以通过synchronized解决，但也带来了效率下降
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03(){};

    public static synchronized Mgr03 getInstance(){
        if(INSTANCE==null){
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
