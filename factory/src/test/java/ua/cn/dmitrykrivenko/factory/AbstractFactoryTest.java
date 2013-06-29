package ua.cn.dmitrykrivenko.factory;

import org.junit.Test;
import org.junit.Assert;
import ua.cn.dmitrykrivenko.factory.abstractfactory.Client;
import ua.cn.dmitrykrivenko.factory.abstractfactory.ConcreteClient1;
import ua.cn.dmitrykrivenko.factory.abstractfactory.ConcreteClient2;
import ua.cn.dmitrykrivenko.factory.abstractfactory.ConcreteFactory1;
import ua.cn.dmitrykrivenko.factory.abstractfactory.ConcreteFactory2;
import ua.cn.dmitrykrivenko.factory.abstractfactory.ProductA1;
import ua.cn.dmitrykrivenko.factory.abstractfactory.ProductA2;
import ua.cn.dmitrykrivenko.factory.abstractfactory.ProductB1;
import ua.cn.dmitrykrivenko.factory.abstractfactory.ProductB2;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory() {
        Client client1 = new ConcreteClient1(new ConcreteFactory1());
        Client client2 = new ConcreteClient2(new ConcreteFactory2());
        client1.createProducts();
        client2.createProducts();

        Assert.assertEquals(ProductA1.class, client1.getAbstractProductA().getClass());
        Assert.assertEquals(ProductA2.class, client2.getAbstractProductA().getClass());
        Assert.assertEquals(ProductB1.class, client1.getAbstractProductB().getClass());
        Assert.assertEquals(ProductB2.class, client2.getAbstractProductB().getClass());
    }
}
