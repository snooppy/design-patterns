package ua.cn.dmitrykrivenko.strategy.fly;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public String fly() {
        String fly = "I can't fly";
        System.out.println(fly);
        return fly;
    }
}
