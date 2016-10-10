package com.programming.java.singleton;

/**
 * Created by prashant on 11/10/16.
 */
public enum SingletonUsingEnum {

    INSTANCE;

    public void show(){
        System.out.printf("Simplest singleton using enum!");
    }

    public static void main(String args[]){
        SingletonUsingEnum.INSTANCE.show();
    }

}
