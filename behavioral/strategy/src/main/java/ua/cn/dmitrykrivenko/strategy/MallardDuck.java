package ua.cn.dmitrykrivenko.strategy;

import ua.cn.dmitrykrivenko.strategy.fly.FlyWithWings;
import ua.cn.dmitrykrivenko.strategy.quack.Squeack;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Squeack());
    }

    @Override
    public String display() {
        String display = "I'm a real Mallar Duck!";
        System.out.println(display);
        return display;
    }
}
