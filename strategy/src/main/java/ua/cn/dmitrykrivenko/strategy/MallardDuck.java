package ua.cn.dmitrykrivenko.strategy;

import ua.cn.dmitrykrivenko.strategy.fly.impl.FlyWithWings;
import ua.cn.dmitrykrivenko.strategy.quack.impl.Squeack;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Squeack());
    }

    @Override
    public String display() {
        String display = "I'm a real Mallar Duck!";
        System.out.println(display);
        return display;
    }
}
