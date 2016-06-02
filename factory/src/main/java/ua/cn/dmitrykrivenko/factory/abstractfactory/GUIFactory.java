package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 * Abstract factory.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public interface GUIFactory {
	
	Button createButton();
	
	Input creatInput();

}
