package com.programming.java;

/**
 * Created by prashant on 10/10/16.
 */
public class VolatileDemo implements  Runnable{

    private static volatile VolatileDemo instance;

    public static VolatileDemo getInstance() {
        if (instance == null) {
            synchronized (VolatileDemo.class) {
                if (instance == null) instance = new VolatileDemo();
            }
        }

        return instance;
    }

    @Override
    public void run(){
        System.out.println("Thread " + getInstance());
    }

    public static void main(String args[]){
        VolatileDemo v1 = new VolatileDemo();
        VolatileDemo v2 = new VolatileDemo();
        VolatileDemo v3 = new VolatileDemo();

            Thread r1 = new Thread(v1);
            Thread r2 = new Thread(v2);
            Thread r3 = new Thread(v3);
            r1.start();
            r2.start();
            r3.start();
    }
    //Volatile makes atomic, Reading of long, double is not atomic
    //Reording, caching can be avoided
}
