package ua.cn.dmitrykrivenko.factory;

import org.junit.Assert;
import org.junit.Test;

import ua.cn.dmitrykrivenko.factory.abstractfactory.Application;
import ua.cn.dmitrykrivenko.factory.abstractfactory.osx.OSXButton;
import ua.cn.dmitrykrivenko.factory.abstractfactory.osx.OSXFactory;
import ua.cn.dmitrykrivenko.factory.abstractfactory.osx.OSXInput;
import ua.cn.dmitrykrivenko.factory.abstractfactory.win.WinButton;
import ua.cn.dmitrykrivenko.factory.abstractfactory.win.WinFactory;
import ua.cn.dmitrykrivenko.factory.abstractfactory.win.WinInput;

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
