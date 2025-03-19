package ua.cn.dmitrykrivenko.factory;

import org.junit.Assert;
import org.junit.Test;

import ua.cn.dmitrykrivenko.factory.abstractfactory.Application;
import ua.cn.dmitrykrivenko.factory.abstractfactory.OSXButton;
import ua.cn.dmitrykrivenko.factory.abstractfactory.OSXFactory;
import ua.cn.dmitrykrivenko.factory.abstractfactory.OSXInput;
import ua.cn.dmitrykrivenko.factory.abstractfactory.WinButton;
import ua.cn.dmitrykrivenko.factory.abstractfactory.WinFactory;
import ua.cn.dmitrykrivenko.factory.abstractfactory.WinInput;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class AbstractFactoryTest {

	@Test
	public void testAbstractFactory() {
		Application winApplication = new Application(new WinFactory());
		Application osxApplication = new Application(new OSXFactory());
		winApplication.createElements();
		osxApplication.createElements();

		Assert.assertTrue(winApplication.getButton() instanceof WinButton);
		Assert.assertTrue(winApplication.getInput() instanceof WinInput);
		Assert.assertTrue(osxApplication.getButton() instanceof OSXButton);
		Assert.assertTrue(osxApplication.getInput() instanceof OSXInput);
	}
}
