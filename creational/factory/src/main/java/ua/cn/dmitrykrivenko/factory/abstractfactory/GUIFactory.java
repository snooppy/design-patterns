package ua.cn.dmitrykrivenko.factory.abstractfactory;

/**
 * Abstract factory.
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface GUIFactory {
	
	Button createButton();
	
	Input createInput();

}
