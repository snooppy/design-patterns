package ua.cn.dmitrykrivenko.strategy.fly.impl;

import ua.cn.dmitrykrivenko.strategy.fly.FlyBehavior;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FlyNoWay implements FlyBehavior {

    public String fly() {
        String fly = "I can't fly";
        System.out.println(fly);
        return fly;
    }
}
