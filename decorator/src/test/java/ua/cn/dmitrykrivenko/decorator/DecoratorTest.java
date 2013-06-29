package ua.cn.dmitrykrivenko.decorator;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple Decorator.
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        Beverage expresso = new Expresso();
        System.out.println(expresso.getDescription() + " " + expresso.getCost());
        Assert.assertEquals("Expresso", expresso.getDescription());

        expresso = new Milk(expresso);
        System.out.println(expresso.getDescription() + " " + expresso.getCost());
        Assert.assertEquals("Expresso, Milk", expresso.getDescription());

        expresso = new Whip(expresso);
        System.out.println(expresso.getDescription() + " " + expresso.getCost());
        Assert.assertEquals("Expresso, Milk, Whip", expresso.getDescription());
    }
}
