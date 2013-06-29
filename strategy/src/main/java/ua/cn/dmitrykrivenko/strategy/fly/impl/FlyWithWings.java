package ua.cn.dmitrykrivenko.strategy.fly.impl;

import ua.cn.dmitrykrivenko.strategy.fly.FlyBehavior;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FlyWithWings implements FlyBehavior{

    public String fly() {
        String fly = "I'm flying!";
        System.out.println(fly);
        return fly;
    }

}
