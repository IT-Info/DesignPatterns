package com.rdsolutions;

import com.rdsolutions.creational.Singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = null; // new Singleton(); initialization will give you error because constructor is private
        singleton = Singleton.getInstance(); // correct way
        System.out.println(singleton);
        singleton = Singleton.getInstance(); // correct way
        System.out.println(singleton);
    }
}
