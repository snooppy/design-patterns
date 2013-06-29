package ua.cn.dmitrykrivenko.strategy.quack.impl;

import ua.cn.dmitrykrivenko.strategy.quack.QuackBehavoir;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Squeack implements QuackBehavoir {

    public String quack() {
        String quack = "Squeack";
        System.out.println(quack);
        return quack;
    }
}
