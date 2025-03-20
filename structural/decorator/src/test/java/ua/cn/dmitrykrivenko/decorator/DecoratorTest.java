package ua.cn.dmitrykrivenko.decorator;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple Decorator.
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " " + espresso.getCost());
        Assert.assertEquals("Espresso", espresso.getDescription());

        Beverage espressoWithMilk = new Milk(espresso);
        System.out.println(espressoWithMilk.getDescription() + " " + espressoWithMilk.getCost());
        Assert.assertEquals("Espresso, Milk", espressoWithMilk.getDescription());

        Beverage whipEspressoWithMilk = new Whip(espressoWithMilk);
        System.out.println(whipEspressoWithMilk.getDescription() + " " + whipEspressoWithMilk.getCost());
        Assert.assertEquals("Espresso, Milk, Whip", whipEspressoWithMilk.getDescription());
    }
}
