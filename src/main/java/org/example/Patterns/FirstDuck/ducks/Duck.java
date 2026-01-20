package org.example.Patterns.FirstDuck.ducks;

import org.example.Patterns.FirstDuck.behaviors.fly.FlyBehavior;
import org.example.Patterns.FirstDuck.behaviors.quack.QuackBehavior;

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

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
