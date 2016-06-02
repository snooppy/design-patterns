package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 * Concrete factory.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class OSXFactory implements GUIFactory {

	public Button createButton() {
		return new OSXButton();
	}

	public Input creatInput() {
		return new OSXInput();
	}

}
