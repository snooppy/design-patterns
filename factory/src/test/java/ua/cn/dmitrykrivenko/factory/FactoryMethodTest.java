package ua.cn.dmitrykrivenko.factory;

import org.junit.Assert;
import org.junit.Test;
import ua.cn.dmitrykrivenko.factory.factorymethod.ConcreteCreatorA;
import ua.cn.dmitrykrivenko.factory.factorymethod.ConcreteCreatorB;
import ua.cn.dmitrykrivenko.factory.factorymethod.Creator;
import ua.cn.dmitrykrivenko.factory.factorymethod.Product;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FactoryMethodTest {

    @Test
    public void testFactoryMethod() {
        Creator cA = new ConcreteCreatorA();
        Creator cB = new ConcreteCreatorB();

        Product productA = cA.createProduct("Product A");
        Product productB = cB.createProduct("Product B");

        System.out.println(productA.getName());
        Assert.assertEquals("Concrete Product A", productA.getName());

        System.out.println(productB.getName());
        Assert.assertEquals("Concrete Product B", productB.getName());
    }
}
