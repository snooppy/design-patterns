package ua.cn.dmitrykrivenko.strategy.quack.impl;

import ua.cn.dmitrykrivenko.strategy.quack.QuackBehavoir;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class MuteQuack implements QuackBehavoir {

    public String quack() {
        String quack = "Silence";
        System.out.println(quack);
        return quack;
    }
}
