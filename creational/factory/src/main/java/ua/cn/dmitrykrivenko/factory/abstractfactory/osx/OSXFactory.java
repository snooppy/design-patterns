package ua.cn.dmitrykrivenko.factory.abstractfactory.osx;

import ua.cn.dmitrykrivenko.factory.abstractfactory.Button;
import ua.cn.dmitrykrivenko.factory.abstractfactory.GUIFactory;
import ua.cn.dmitrykrivenko.factory.abstractfactory.Input;

/**
 * Concrete factory.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class OSXFactory implements GUIFactory
{

	public Button createButton() {
		return new OSXButton();
	}

	public Input createInput() {
		return new OSXInput();
	}

}
