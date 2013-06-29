package ua.cn.dmitrykrivenko.strategy;

import ua.cn.dmitrykrivenko.strategy.fly.impl.FlyNoWay;
import ua.cn.dmitrykrivenko.strategy.quack.impl.MuteQuack;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test Strategy design pattern.
 */
public class StrategyTest {

    @Test
    public void testStrategy() {
        Duck mallardDuck = new MallardDuck();
        Assert.assertEquals("I'm a real Mallar Duck!", mallardDuck.display());

        Assert.assertEquals("I'm flying!", mallardDuck.performFly());
        Assert.assertEquals("Squeack", mallardDuck.performQuack());

        Assert.assertEquals("All ducks float, even decoys!", mallardDuck.swim());

        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new MuteQuack());

        Assert.assertEquals("I can't fly", mallardDuck.performFly());
        Assert.assertEquals("Silence", mallardDuck.performQuack());
    }
}
