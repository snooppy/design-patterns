package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 * Concrete factory.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class WinFactory implements GUIFactory {

	public Button createButton() {
		return new WinButton();
	}

	public Input createInput() {
		return new WinInput();
	}

}
