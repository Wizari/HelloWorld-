package org.example.Patterns.FirstDuck.ducks;

import org.example.Patterns.FirstDuck.behaviors.fly.FlyNoWay;
import org.example.Patterns.FirstDuck.behaviors.quack.Quack;

public class ModelDuck extends  Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
