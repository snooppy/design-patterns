package ua.cn.dmitrykrivenko.factory.abstractfactory.win;

import ua.cn.dmitrykrivenko.factory.abstractfactory.Button;
import ua.cn.dmitrykrivenko.factory.abstractfactory.GUIFactory;
import ua.cn.dmitrykrivenko.factory.abstractfactory.Input;

/**
 * Concrete factory.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class WinFactory implements GUIFactory
{

	public Button createButton() {
		return new WinButton();
	}

	public Input createInput() {
		return new WinInput();
	}

}
