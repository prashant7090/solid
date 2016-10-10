package com.programming.java.imutable;

/**
 * Created by prashant on 11/10/16.
 */

//Avoid inheritance & polymorphism
public final class  Contact {

    private final String name;
    private final String number;

    Contact(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
