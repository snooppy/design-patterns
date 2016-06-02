package ua.cn.dmitrykrivenko.factory;

import org.junit.Test;
import org.junit.Assert;
import ua.cn.dmitrykrivenko.factory.abstractfactory.Client;
import ua.cn.dmitrykrivenko.factory.abstractfactory.ConcreteClient;
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
        Client client1 = new ConcreteClient(new ConcreteFactory1());
        Client client2 = new ConcreteClient(new ConcreteFactory2());
        client1.createProducts();
        client2.createProducts();

        Assert.assertTrue(client1.getAbstractProductA() instanceof ProductA1);
        Assert.assertTrue(client2.getAbstractProductA() instanceof ProductA2);
        Assert.assertTrue(client1.getAbstractProductB() instanceof ProductB1);
        Assert.assertTrue(client2.getAbstractProductB() instanceof ProductB2);
    }
}
