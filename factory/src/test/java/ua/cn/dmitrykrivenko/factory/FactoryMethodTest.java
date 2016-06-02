package ua.cn.dmitrykrivenko.factory;

import org.junit.Assert;
import org.junit.Test;

import ua.cn.dmitrykrivenko.factory.factorymethod.FileWriter;
import ua.cn.dmitrykrivenko.factory.factorymethod.Writer;
import ua.cn.dmitrykrivenko.factory.factorymethod.WriterFactory;
import ua.cn.dmitrykrivenko.factory.factorymethod.XmlWriter;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FactoryMethodTest {

    @Test
    public void testFactoryMethod() {
        WriterFactory factory = new WriterFactory();

        Writer xmlWriter = factory.getWriter("XML");
        Writer fileWriter = factory.getWriter("FILE");

        Assert.assertTrue(xmlWriter instanceof XmlWriter);
        Assert.assertTrue(fileWriter instanceof FileWriter);
    }
}
