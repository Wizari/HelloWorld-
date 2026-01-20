package org.example.Patterns.FirstDuck;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void preformQuack() {
        flyBehavior.fly();
    }

    public void preformFly() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All duck float, even decoys!");
    }
}
