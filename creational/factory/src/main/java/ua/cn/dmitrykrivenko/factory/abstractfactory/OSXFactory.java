package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 * Concrete factory.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class OSXFactory implements GUIFactory {

	public Button createButton() {
		return new OSXButton();
	}

	public Input createInput() {
		return new OSXInput();
	}

}
