package ua.cn.dmitrykrivenko.strategy;

import ua.cn.dmitrykrivenko.strategy.quack.QuackBehavoir;
import ua.cn.dmitrykrivenko.strategy.fly.FlyBehavior;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavoir quackBehavoir;

    public abstract String display();

    public Duck(FlyBehavior flyBehavior, QuackBehavoir quackBehavoir) {
        this.flyBehavior = flyBehavior;
        this.quackBehavoir = quackBehavoir;
    }

    public String swim() {
        String swim = "All ducks float, even decoys!";
        System.out.println(swim);
        return swim;
    }

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavoir.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavoir quackBehavoir) {
        this.quackBehavoir = quackBehavoir;
    }
}
