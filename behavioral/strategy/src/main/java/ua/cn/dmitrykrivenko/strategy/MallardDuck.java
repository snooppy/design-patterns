package ua.cn.dmitrykrivenko.strategy;

import ua.cn.dmitrykrivenko.strategy.fly.FlyWithWings;
import ua.cn.dmitrykrivenko.strategy.quack.Squeak;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Squeak());
    }

    @Override
    public String display() {
        String display = "I'm a real Mallard Duck!";
        System.out.println(display);
        return display;
    }
}
