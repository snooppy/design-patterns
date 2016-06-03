package ua.cn.dmitrykrivenko.strategy.fly;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public String fly() {
        String fly = "I'm flying!";
        System.out.println(fly);
        return fly;
    }

}
