package ua.cn.dmitrykrivenko.strategy.fly;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public String fly() {
        String fly = "I can't fly";
        System.out.println(fly);
        return fly;
    }
}
