package org.example;

import org.example.Patterns.FirstDuck.Duck;
import org.example.Patterns.FirstDuck.MallardDuck;

public class Main {
    public static void main(String[] args) {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.convert(args);
//        System.out.println("Hello world!");
        Duck mallard = new MallardDuck();
        mallard.preformQuack();
        mallard.preformFly();
    }
}