package com.programming.java;

import java.util.Queue;
import java.util.Random;

/**
 * Created by prashant on 10/10/16.
 */
public class Producer extends  Thread {

    private Queue<Integer> queue;
    private int maxsize;

    Producer(Queue<Integer> buffer, int maxsize, String name){
        super(name);
        this.queue = buffer;
        this.maxsize = maxsize;

    }

    @Override
    public void run(){
        while (true){
          synchronized (queue){
              //It should not be if condition
              while(queue.size() == maxsize){
                  try {
                      System.out .println("Queue is full, " + "Producer thread waiting for " + "consumer to take something from queue");
                      queue.wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
              Random random = new Random();
              int i = random.nextInt();
              System.out.println("Producing value : " + i);
              queue.add(i);
              queue.notifyAll();
          }


        }
    }
}
