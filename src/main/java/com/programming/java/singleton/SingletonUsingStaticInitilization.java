package com.programming.java.singleton;

/**
 * Created by prashant on 11/10/16.
 */
public class SingletonUsingStaticInitilization {

    //at class loading, not lazy one
    private static  final  SingletonUsingStaticInitilization instance = new SingletonUsingStaticInitilization();

    // avoid creation of another instance
    private SingletonUsingStaticInitilization(){

    }

    //getter
    public SingletonUsingStaticInitilization getInstance(){
        return instance;
    }

    public static void main(String a[]){
        SingletonUsingStaticInitilization.instance.getInstance();
    }

}
