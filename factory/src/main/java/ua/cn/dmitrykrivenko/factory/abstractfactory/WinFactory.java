package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 * Concrete factory.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class WinFactory implements GUIFactory {

	public Button createButton() {
		return new WinButton();
	}

	public Input createInput() {
		return new WinInput();
	}

}
