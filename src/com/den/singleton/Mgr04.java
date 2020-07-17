package com.den.singleton;

/**
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来了线程不安全的问题。
 * 可以通过synchronized解决，但也带来了效率下降
 *
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04(){};

    public static Mgr04 getInstance(){
        if(INSTANCE==null){
            //妄图通过减小同步代码块的方式提高效率，然而不可行
            //如果第一线程执行完if语句，被第二个线程打断，第二个线程执行getInstance并获取到对象，
            // 然后第一个线程接着执行，扔可以获取到锁，而有创建一个新的对象了。
            synchronized (Mgr04.class){
                try{
                    Thread.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                INSTANCE = new Mgr04();
            }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
