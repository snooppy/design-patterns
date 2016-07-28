package ua.cn.dmitrykrivenko.factory;

import org.junit.Assert;
import org.junit.Test;

import ua.cn.dmitrykrivenko.factory.factorymethod.FileWriter;
import ua.cn.dmitrykrivenko.factory.factorymethod.FileWriterCreator;
import ua.cn.dmitrykrivenko.factory.factorymethod.Writer;
import ua.cn.dmitrykrivenko.factory.factorymethod.WriterCreator;
import ua.cn.dmitrykrivenko.factory.factorymethod.XmlWriter;
import ua.cn.dmitrykrivenko.factory.factorymethod.XmlWriterCreator;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class FactoryMethodTest {

	@Test
	public void testFactoryMethod() {
		WriterCreator xmlWriterCreator = new XmlWriterCreator();
		WriterCreator fileWriterCreator = new FileWriterCreator();

		Writer xmlWriter = xmlWriterCreator.createWriter();
		Writer fileWriter = fileWriterCreator.createWriter();

		Assert.assertTrue(xmlWriter instanceof XmlWriter);
		Assert.assertTrue(fileWriter instanceof FileWriter);
	}
}
